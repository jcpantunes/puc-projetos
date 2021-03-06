package puc.pf.portal.util;

public class PortalConstantes {

	public static final String CONTEXTO = "portal-servicos";
	
	public static final String CONTEXTO_REST = "serviceportalrest";
	
	// public static final String URI = "http://10.200.108.167:8080";
	// public static final String URI = "http://0.0.0.0:8080";
	// public static final String URI = "http://10.32.49.26:8080";
	public static final String URI = "http://192.168.0.106:8080";
	// public static final String URI = "http://localhost:8080";
	
	public static final String URL_WSDL = URI + "/portal-servicos/IServicePortal?wsdl";
	
	public static final String NAMESPACE = URI + "/jaxws";
	
	public static final String OPERACAO_CONSULTAR_LISTA_FUNCIONARIO = "consultarListaFuncionario";
	
	public static final String OPERACAO_CONSULTAR_FUNCIONARIO = "consultarFuncionario";
	
	public static final String OPERACAO_CONSULTAR_LISTA_EXCECAO = "consultarListaExcecao";
	
	public static final String OPERACAO_CONSULTAR_LISTA_EXCECAO_MAIOR_ID = "consultarListaExcecaoMaiorId";
	
	public static final String OPERACAO_CONSULTAR_EXCECAO = "consultarExcecao";

	public static final String BASEBEAN = "BaseBean";
	
	public static final String DOMINIO_BASEBEAN = "/dominio/basebean";
	
	public static final String FUNCIONARIO = "Funcionario";
	
	public static final String DOMINIO_FUNCIONARIO = "/dominio/funcionario";
	
	public static final String EXCECAO = "Excecao";
	
	public static final String LISTA_EXCECAO = "ListaExcecao";
	
	public static final String DOMINIO_EXCECAO ="/dominio/excecao";
	
	public static final String DOMINIO_LISTA_EXCECAO ="/dominio/listaexcecao";

}
