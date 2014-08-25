package org.apache.camel.example.cxf;

import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ObterListaExcecaoIn implements Processor {

	@Override
	public void process(Exchange e) throws Exception {
    	Source source = new DOMSource();
		e.getOut().setBody(source);
	}

}
