package org.apache.camel.example.cxf;

import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Assert;
import org.junit.Test;

public class TesteCamel extends CamelTestSupport {

	@Produce(uri = "http://localhost:9898/test")
	protected ProducerTemplate template;

	@EndpointInject(uri = "mock:end")
	protected MockEndpoint mockEndpoint;

	@Test
	public void testEnvioSimples() throws Exception {
		template.sendBody("<doc><param>1</param></doc>");
		mockEndpoint.expectedMessageCount(1);
		mockEndpoint.assertIsSatisfied();
		List<Exchange> exchanges = mockEndpoint.getExchanges();
		Assert.assertTrue("Mensagem Inspecionada", exchanges.get(0).getIn()
				.getHeader("OK", Boolean.class));
		;
	}

	@Test
	public void testEnvioSimplesNaoSuportado() throws Exception {
		template.sendBody("<doc><param>2</param></doc>");
		mockEndpoint.expectedMessageCount(0);
		mockEndpoint.assertIsSatisfied();
	}
	
	protected RouteBuilder createRouteBuilder() {
		return new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				from("jetty://http://localhost:9898/test").filter()
						.xpath("/doc/param='1'").process(new Processor() {
							public void process(Exchange exchange)
									throws Exception {
								exchange.getIn().setHeader("OK", Boolean.TRUE);
							}

						}).to("mock:end").end();
				
			}

		};
	}
}
