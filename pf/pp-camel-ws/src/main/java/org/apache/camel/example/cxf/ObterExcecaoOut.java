package org.apache.camel.example.cxf;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ObterExcecaoOut implements Processor {

	@Override
	public void process(Exchange e) throws Exception {
		String resultado = e.getIn().getBody(String.class).toString();
		e.getOut().setBody(resultado);
	}

}
