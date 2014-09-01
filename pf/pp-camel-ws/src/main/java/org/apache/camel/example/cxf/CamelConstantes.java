package org.apache.camel.example.cxf;

public interface CamelConstantes {
	
	public static final String URI = "http://192.168.0.106:8080";
	// public static final String URI = "http://10.32.49.26:8080";
	
	public static final String NAMESPACE = URI + "/camel";
	
	public static final String CONTEXTO = "pp-camel-ws/webservices/camel";
	
	public static final String URL = URI + "/" + CONTEXTO;
	
	public static final String OPERACAO_CONSULTAR_LISTA_EXCECAO = "consultarListaExcecao";
	
	public static final String OPERACAO_CONSULTAR_EXCECAO = "consultarExcecao";


}
