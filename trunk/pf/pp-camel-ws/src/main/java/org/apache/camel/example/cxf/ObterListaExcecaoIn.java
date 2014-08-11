package org.apache.camel.example.cxf;

import java.util.ArrayList;

import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;

public class ObterListaExcecaoIn implements Processor {

	@Override
	public void process(Exchange e) throws Exception {
		Message message = e.getIn();
    	MessageContentsList lista = (MessageContentsList) message.getBody();
    	
    	Source source = new DOMSource();
		String resultado = e.getIn().getBody(String.class);
		System.out.println("===> " + resultado);
		String xml = "";
		// xml = "<consultarListaExcecao />";
		// e.getIn().setBody(source);
		e.getOut().setBody(new ArrayList());
	}

}
