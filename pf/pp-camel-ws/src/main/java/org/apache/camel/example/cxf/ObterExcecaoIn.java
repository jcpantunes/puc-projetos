package org.apache.camel.example.cxf;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import puc.pf.portal.service.ConsultarExcecaoResponse;
import puc.pf.portal.service.Excecao;
import puc.pf.portal.service.IServicePortal;
import puc.pf.portal.service.Iserviceportal;

public class ObterExcecaoIn implements Processor {
	
	@Override
	public void process(Exchange exchange) throws Exception {
		String id = exchange.getIn().getBody(String.class).toString();

//		String xml = "<consultarExcecao><arg0>" + id + "</arg0></consultarExcecao>";
//		
//      DocumentBuilder parser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//  	Document document = parser.parse( new InputSource(new StringReader(xml)) );
//  	Source source = new DOMSource( document );
//		exchange.getIn().setBody(xml);
		
//		ExcecaoCapturada resultado = exchange.getIn().getBody(ExcecaoCapturada.class);
//		XStream xstream= new XStream();
//		String xml = xstream.toXML(resultado);
//		exchange.getOut().setBody(xml);

        IServicePortal service = new IServicePortal();
		Iserviceportal port = service.getIServicePortalPort();
		Excecao dto = port.consultarExcecao(Long.parseLong(id));
		dto = dto.getID() == null ? dto = new Excecao() : dto;

		ConsultarExcecaoResponse resposta = new ConsultarExcecaoResponse();
		resposta.setExcecaoCapturada(dto);
		exchange.getOut().setBody(resposta);
	}
}
