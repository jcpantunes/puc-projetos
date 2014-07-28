package org.apache.camel.example.cxf;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ObterResposta  implements Processor {

	@Override
	public void process(Exchange e) throws Exception {
		 Thread.sleep(1000);
		 e.getIn().setBody("Teste de resposta do Web Service");
	}

}
