package com.puc.acn.client;

import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.puc.acn.client.dominio.Pessoa;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("acn")
public interface AcnService extends RemoteService {
	
	Integer[] ordernarSequencia(Integer num1, Integer num2) throws Exception;
	
	Map<String, List<Pessoa>> recuperarListaPessoa(int quantidade);
	
}
