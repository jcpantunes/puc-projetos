package com.example.monitorapp.util;

public class Constantes {

	public static final String CONTEXTO = "portal-servicos";
	
	public static final String CONTEXTO_REST = "serviceportalrest";
	
	// public static final String URI = "http://10.200.108.167:8080";
	public static final String URI = "http://192.168.0.104:8080";
	// public static final String URI = "http://10.32.49.26:8080";
	// public static final String URI = "http://0.0.0.0:8080";
	// public static final String URI = "http://localhost:8080";
	
	public static final String URL_WSDL = URI + "/portal-servicos/IServicePortal?wsdl";
	
	public static final String NAMESPACE = URI + "/jaxws";
	
	public static final String OPERACAO_CONSULTAR_LISTA_ALUNO = "consultarListaAluno";
	
	public static final String OPERACAO_CONSULTAR_LISTA_EXCECAO = "consultarListaExcecao";
	
	public static final String OPERACAO_CONSULTAR_EXCECAO = "consultarExcecao";

	public static final String BASEBEAN = "BaseBean";
	
	public static final String DOMINIO_BASEBEAN = "/dominio/basebean";
	
	public static final String ALUNO = "Aluno";
	
	public static final String DOMINIO_ALUNO = "/dominio/aluno";
	
	public static final String EXCECAO_CAPTURADA = "ExcecaoCapturada";
	
	public static final String DOMINIO_EXCECAO_CAPTURADA ="/dominio/excecaocapturada";
	
	public static final String MONITOR_SERVICE_PATH = "com.example.monitorapp.util.MonitorService";
}
