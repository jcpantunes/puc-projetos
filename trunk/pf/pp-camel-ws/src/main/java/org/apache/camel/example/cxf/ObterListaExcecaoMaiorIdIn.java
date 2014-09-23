package org.apache.camel.example.cxf;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import puc.pf.portal.service.ConsultarListaExcecaoMaiorIdResponse;
import puc.pf.portal.service.Excecao;
import puc.pf.portal.service.IServicePortal;
import puc.pf.portal.service.Iserviceportal;

public class ObterListaExcecaoMaiorIdIn implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String id = exchange.getIn().getBody(String.class).toString();
		
        IServicePortal service = new IServicePortal();
		Iserviceportal port = service.getIServicePortalPort();
		List<Excecao> lista = port.consultarListaExcecaoMaiorId(Long.parseLong(id));
		lista = (lista == null) ? lista = new ArrayList<Excecao>() : lista;
		
		ConsultarListaExcecaoMaiorIdResponse resposta = new ConsultarListaExcecaoMaiorIdResponse();
		resposta.getListaExcecaoCapturadaMaiorId().addAll(lista);
		exchange.getOut().setBody(resposta);
	}

}
