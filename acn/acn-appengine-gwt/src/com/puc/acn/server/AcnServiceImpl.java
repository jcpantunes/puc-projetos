package com.puc.acn.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.puc.acn.client.AcnService;
import com.puc.acn.client.dominio.Pessoa;
import com.puc.acn.server.negocio.OrdenarSequenciaBC;
import com.puc.acn.server.persistencia.PessoaDAO;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class AcnServiceImpl extends RemoteServiceServlet implements AcnService {
	
	public Integer[] ordernarSequencia(Integer num1, Integer num2) throws Exception {
		OrdenarSequenciaBC ordenarBc = new OrdenarSequenciaBC();
		return ordenarBc.ordenarSequencia(num1, num2);
	}
	
	public Map<String, List<Pessoa>> recuperarListaPessoa(int quantidade) {
		PessoaDAO dao = new PessoaDAO();
		dao.preencherTabela(quantidade);
		
		List<Pessoa> lista = dao.recuperar();
		
		OrdenarSequenciaBC ordenarBC = new OrdenarSequenciaBC();
		ordenarBC.ordenarListaPessoas(lista);
		
		Map<String, List<Pessoa>> map = new HashMap<String, List<Pessoa>>();
		map.put(dao.getTempoInsert() + ":" + dao.getTempoSelect() + ":" + ordenarBC.getTempoOrdenacao(), lista);
		
		return map;
	}

}
