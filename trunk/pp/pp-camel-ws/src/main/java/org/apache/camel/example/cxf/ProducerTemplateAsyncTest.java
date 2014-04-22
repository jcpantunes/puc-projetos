package org.apache.camel.example.cxf;

import org.apache.camel.example.cxf.aluno.CamelService;
import org.apache.camel.example.cxf.aluno.ListaNotaWSDTO;
import org.apache.camel.example.cxf.aluno.NotaWSDTO;
import org.apache.cxf.frontend.ClientProxyFactoryBean;


public class ProducerTemplateAsyncTest {
	
	private static final String URL = "http://localhost:8080/pp-camel-ws/webservices/camel";

	protected static CamelService createCXFClient() {
		// we use CXF to create a client for us as its easier than JAXWS and
		// works
		ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
		factory.setServiceClass(CamelService.class);
		factory.setAddress(URL);
		return (CamelService) factory.create();
	}

	public static void main(String[] args) throws Exception {
		ProducerTemplateAsyncTest client = new ProducerTemplateAsyncTest();
		client.runTest();
	}

	protected void runTest() throws Exception {
		
	}
    
	class AsyncCall implements Runnable {
	
		public void startProcess() {
			Thread t = new Thread(this);
			t.start();
		}
		
		public void run() {
			CamelService client = createCXFClient();
			ListaNotaWSDTO lista = client.recuperarHistoricoAluno("0111");
			for (NotaWSDTO nota : lista.getLista()) {
				System.out.println(nota.getAluno() + " : " + nota.getDisciplina()
						+ " : " + nota.getNota());
			}
		}
	}
}


	