package org.apache.camel.example.cxf;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;

public class ObterListaExcecaoOut implements Processor {

	@Override
	public void process(Exchange e) throws Exception {
		Message message = e.getIn();
    	// MessageContentsList lista = (MessageContentsList) message.getBody();
    	
		String resultado = e.getIn().getBody(String.class).toString();
		System.out.println("===> " + resultado);
	}

}
