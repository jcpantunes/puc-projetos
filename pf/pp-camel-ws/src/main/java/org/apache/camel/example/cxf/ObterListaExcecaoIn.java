package org.apache.camel.example.cxf;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ObterListaExcecaoIn implements Processor {

	@Override
	public void process(Exchange e) throws Exception {
		String resultado = e.getIn().getBody(String.class);
		System.out.println("===> " + resultado);
		// String xml = "<consultarListaExcecao></consultarListaExcecao>";
		String xml = "<consultarListaExcecao />";
		e.getOut().setBody(xml);
	}

}
