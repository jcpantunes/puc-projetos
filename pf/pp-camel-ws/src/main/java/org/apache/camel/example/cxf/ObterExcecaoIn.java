package org.apache.camel.example.cxf;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

public class ObterExcecaoIn implements Processor {

	@Override
	public void process(Exchange e) throws Exception {
		//Source source = new DOMSource();
		//e.getOut().setBody(source);
		
		String matricula = e.getIn().getBody(String.class).toString();
		String xml = "<consultarExcecao><arg0>" + matricula + "</arg0></consultarExcecao>";
//        xml = "<body><consultarExcecao><arg0>16</arg0></consultarExcecao></body>";

		xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:jax=\"http://10.32.49.26:8080/jaxws\">"
		+ "<soapenv:Header/>"
		+ "<soapenv:Body>"
		+ "   <jax:consultarExcecao>"
		+ "      <arg0>16</arg0>"
		+ "   </jax:consultarExcecao>"
		+ "</soapenv:Body>"
		+ "</soapenv:Envelope>";
		
      	DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
  	    Document document = parser.parse( new InputSource(new StringReader(xml)) );
  	    Source source = new DOMSource( document );
  	    
  	    e.getIn().setBody(source);
	
	}

}
