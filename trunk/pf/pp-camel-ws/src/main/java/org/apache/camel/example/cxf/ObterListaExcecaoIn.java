package org.apache.camel.example.cxf;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import puc.pf.portal.service.IServicePortal;
import puc.pf.portal.service.Iserviceportal;
import _106._0._168._192._8080.jaxws.ConsultarListaExcecaoResponse;
import _106._0._168._192._8080.jaxws.dominio.excecaocapturada.ExcecaoCapturada;

public class ObterListaExcecaoIn implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
//    	Source source = new DOMSource();
//		e.getOut().setBody(source);
		
        IServicePortal service = new IServicePortal();
		Iserviceportal port = service.getIServicePortalPort();
		List<ExcecaoCapturada> lista = port.consultarListaExcecao();
		lista = (lista == null) ? lista = new ArrayList<ExcecaoCapturada>() : lista;
		
		ConsultarListaExcecaoResponse resposta = new ConsultarListaExcecaoResponse();
		resposta.getListaExcecaoCapturada().addAll(lista);
		exchange.getOut().setBody(resposta);
	}

}
