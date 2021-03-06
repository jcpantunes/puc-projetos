package org.apache.camel.example.cxf;

import org.apache.camel.test.junit4.CamelTestSupport;
import org.apache.cxf.frontend.ClientProxyFactoryBean;
import org.junit.Test;

import puc.pf.portal.service.ConsultarExcecaoResponse;
import puc.pf.portal.service.ConsultarListaExcecaoResponse;

public class CamelRouteServiceTest extends CamelTestSupport {
	
	private CamelService createCXFClient() {
		ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
		factory.setServiceClass(CamelService.class);
		factory.setAddress(CamelConstantes.URL);
		return (CamelService) factory.create();
	}

	@Test
	public void runTesteRecuperarRespostaTeste() throws Exception {
		CamelService client = createCXFClient();
		//ExcecaoCapturada str = client.consultarExcecao(16l);
		ConsultarExcecaoResponse excecao = client.consultarExcecao(16l);
		System.out.println("RESPOSTA1 ===> " + excecao.getExcecaoCapturada().getTicket());
		ConsultarListaExcecaoResponse lista = client.consultarListaExcecao();
		System.out.println("RESPOSTA2 ===> " + lista.getListaExcecaoCapturada().size());
	}

}
