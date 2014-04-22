import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;


public class ProducerTemplateTest {
	
	public static ProducerTemplate clienteIntegrador;
	public static DefaultCamelContext camelContext;
	
	public static void main(String args[]) throws Exception {
		
		
		
		ProducerTemplate clienteIntegrador;
        
        ProducerTemplate cliente = ProducerTemplateTest.geraIntegrador();
        //cliente.requestBody("//http://localhost:9898/test", "<hello>world!</hello>");
        cliente.sendBody("direct:funcGravaNota", "<hello>world!</hello>");
        camelContext.stop();
	}
	
	public static ProducerTemplate geraIntegrador() throws Exception {
		
		if(camelContext == null) {
			camelContext = new DefaultCamelContext();
			camelContext.addRoutes(new RouteBuilder() {
			    public void configure() {
			        from("direct:funcGravaNota").to("file://gravaNotaDir");
			    }
			    
			});
			camelContext.start();
			clienteIntegrador = camelContext.createProducerTemplate();
		}
		
		return clienteIntegrador;
	}
}
