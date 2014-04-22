package org.apache.camel.example.cxf;

import java.util.List;

import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;


public class ProducerTemplateTest {

    private static final String URL = "http://localhost:8080/pp-camel-ws/webservices/camel";
    
    public static DefaultCamelContext camelContext;
    
    public static void main(String[] args) throws Exception {
    	ProducerTemplateTest teste = new ProducerTemplateTest();
    	teste.testeCamel2();
    }
    
    private void testeCamel2() throws Exception {
		if (camelContext == null) {
			camelContext = new DefaultCamelContext();
			camelContext.addRoutes(new RouteBuilder() {
				public void configure() {
					from("direct:recuperarAlunoPorMatricula")
					.to("spring-ws:http://localhost:8080/pp-cobol-mock-ws/myService?soapAction=http://pp.puc.org/recuperarAlunoPorMatricula")
						.convertBodyTo(String.class);
				}

			});
		}
		
		camelContext.start();
		ProducerTemplate cliente = camelContext.createProducerTemplate();
		
    	String xml = "<recuperarAlunoPorMatricula>" +
    			"<arg0>0111</arg0>" +
    	"</recuperarAlunoPorMatricula>";
    	
        Object o = cliente.requestBody("direct:recuperarAlunoPorMatricula", xml);
        
        List<String[]> valores = XmlUtil.recuperarValor(o.toString());
        for (String[] valor : valores) {
        	String email = valor[0];
        	String matricula = valor[1];
        	String nome = valor[2];
        	System.out.println("==================> " + matricula + " / " + nome);
        }
    	
    	camelContext.stop();
    }
    
    private void testeCamel() throws Exception {
		if (camelContext == null) {
			camelContext = new DefaultCamelContext();
			camelContext.addRoutes(new RouteBuilder() {
				public void configure() {
					from("direct:recuperarNomeAlunoPorMatricula")
					.to("spring-ws:http://localhost:8080/pp-cobol-mock-ws/myService?soapAction=http://pp.puc.org/recuperarAlunoPorMatricula")
						.convertBodyTo(String.class);
				}

			});
		}
		
		camelContext.start();
		ProducerTemplate cliente = camelContext.createProducerTemplate();
		
    	String xml = "<recuperarNomeAlunoPorMatricula>" +
    			"<arg0>0111</arg0>" +
    	"</recuperarNomeAlunoPorMatricula>";
    	
        Object o = cliente.requestBody("direct:recuperarAlunoPorMatricula", xml);
        
        List<String[]> valores = XmlUtil.recuperarValor(o.toString());
        String matricula = valores.size() > 0 ? valores.get(0)[0] : "";
    	System.out.println("==================" + matricula);
    	
    	camelContext.stop();
    }
    
}


