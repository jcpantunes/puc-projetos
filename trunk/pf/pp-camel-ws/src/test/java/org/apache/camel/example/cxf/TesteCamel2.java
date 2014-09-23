package org.apache.camel.example.cxf;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import puc.pf.portal.service.Excecao;

public class TesteCamel2 extends CamelTestSupport {
	
	//@EndpointInject(uri = "direct:wsConsultarExcecao")
	// @Produce(uri="direct:wsConsultarExcecao")
	// protected ProducerTemplate template;
	
	// @Consume(uri=WS_URI)
	// protected ConsumerTemplate consumer;
	
	// @Test
	public void testBackupArquivo() throws Exception {
		CamelContext contexto = new DefaultCamelContext();
		contexto.addRoutes(new RouteBuilder() {
			public void configure() {
				from("file:/home/julio/workspace-pf/teste-camel/src/test/java/org/camel/teste/entrada?noop=true")
				.to("file:/home/julio/workspace-pf/teste-camel/src/test/java/org/camel/teste/saida");
			}
		});
		contexto.start();
		Thread.sleep(1000);
		contexto.stop();
	}
	
	@Test
	public void testWS() {

		// final String WS_URI = "spring-ws:http://192.168.0.106:8080/portal-servicos/IServicePortal?soapAction=http://192.168.0.106:8080/jaxws/consultarExcecao";
		// final String WS_URI = "spring-ws:http://192.168.0.106:8080/portal-servicos/IServicePortal?soapAction={http://192.168.0.106:8080/jaxws}consultarExcecao";
		final String WS_URI = "spring-ws:rootqname:{{http://192.168.0.106:8080/jaxws}consultarExcecao?endpointMapping=#endpointMapping";
		
		final JaxbDataFormat jaxb = new JaxbDataFormat(Excecao.class.getPackage().getName());
		
//		final String WS_URI = "cxf:http://192.168.0.106:8080/portal-servicos/IServicePortal?"
//				+ "serviceClass=puc.pf.portal.service.IServicePortal"
//				// + "serviceClass=_106._0._168._192._8080.jaxws.ConsultarExcecao&"
//				+ "&serviceName={http://192.168.0.106:8080/jaxws}consultarExcecao"
//				//+ "serviceName=consultarExcecao"
//				+ "&dataFormat=POJO";		
		
		try {
			CamelContext contexto = new DefaultCamelContext();
			contexto.addRoutes(new RouteBuilder() {
				public void configure() {
					from("direct:wsConsultarExcecao")
						.process(new Processor() {
			                public void process(Exchange exchange) throws Exception {
			                	String xml = "<consultarExcecao><arg0>16</arg0></consultarExcecao>";
			                	// Long xml = 16l;
			                	// xml = "<{http://192.168.0.106:8080/jaxws}consultarExcecao><arg0>16</arg0></{http://192.168.0.106:8080/jaxws}consultarExcecao>";
			                    exchange.getOut().setBody(xml);
			                }
						})
					.to(WS_URI)
						.unmarshal(jaxb)
		            	.process(new Processor() {
			                public void process(Exchange exchange) throws Exception {
			                	String str = exchange.getIn().getBody(String.class).toString();
			                	System.out.println("====> " + str);
			                }
						})
						.marshal(jaxb);
					;
				}
			});
			contexto.start();
			
			ProducerTemplate template = contexto.createProducerTemplate();
			template.requestBody(contexto.getEndpoint("direct:wsConsultarExcecao"), "");

			Thread.sleep(1000);
			contexto.stop();
		} 
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
