package com.puc.acn.client;

import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.puc.acn.client.dominio.Pessoa;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface AcnServiceAsync {
	
	void ordernarSequencia(Integer num1, Integer num2, AsyncCallback<Integer[]> callback) throws Exception;
	
	void recuperarListaPessoa(int quantidade, AsyncCallback<Map<String, List<Pessoa>>> callback);
	
}
