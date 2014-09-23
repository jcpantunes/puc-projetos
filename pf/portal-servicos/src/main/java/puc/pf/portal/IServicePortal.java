package puc.pf.portal;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import puc.pf.portal.dto.ExcecaoDTO;
import puc.pf.portal.dto.FuncionarioDTO;
import puc.pf.portal.util.PortalConstantes;

@WebService(name="iserviceportal", targetNamespace=PortalConstantes.NAMESPACE)
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,use=SOAPBinding.Use.LITERAL,parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public interface IServicePortal { 

	@WebMethod(operationName=PortalConstantes.OPERACAO_CONSULTAR_LISTA_FUNCIONARIO,
			action=PortalConstantes.NAMESPACE + "/" + PortalConstantes.OPERACAO_CONSULTAR_LISTA_FUNCIONARIO)
	@WebResult(name="ListaFuncionario", targetNamespace=PortalConstantes.NAMESPACE + PortalConstantes.DOMINIO_FUNCIONARIO)
	public List<FuncionarioDTO> consultarListaFuncionario();

	@WebMethod(operationName=PortalConstantes.OPERACAO_CONSULTAR_FUNCIONARIO,
			action=PortalConstantes.NAMESPACE + "/" + PortalConstantes.OPERACAO_CONSULTAR_FUNCIONARIO)
	@WebResult(name="Funcionario", targetNamespace=PortalConstantes.NAMESPACE + PortalConstantes.DOMINIO_FUNCIONARIO)
	public FuncionarioDTO consultarFuncionario(Long codigoFuncionario);
	
	@WebMethod(operationName=PortalConstantes.OPERACAO_CONSULTAR_LISTA_EXCECAO, 
			action=PortalConstantes.NAMESPACE + "/" + PortalConstantes.OPERACAO_CONSULTAR_LISTA_EXCECAO)
	@WebResult(name="ListaExcecaoCapturada", targetNamespace=PortalConstantes.NAMESPACE + PortalConstantes.DOMINIO_EXCECAO)
	public List<ExcecaoDTO> consultarListaExcecao();
	
	@WebMethod(operationName=PortalConstantes.OPERACAO_CONSULTAR_LISTA_EXCECAO_MAIOR_ID, 
			action=PortalConstantes.NAMESPACE + "/" + PortalConstantes.OPERACAO_CONSULTAR_LISTA_EXCECAO_MAIOR_ID)
	@WebResult(name="ListaExcecaoCapturadaMaiorId", targetNamespace=PortalConstantes.NAMESPACE + PortalConstantes.DOMINIO_EXCECAO)
	public List<ExcecaoDTO> consultarListaExcecaoMaiorId(Long codigoExcecao);
	
	@WebMethod(operationName=PortalConstantes.OPERACAO_CONSULTAR_EXCECAO, 
			action=PortalConstantes.NAMESPACE + "/" + PortalConstantes.OPERACAO_CONSULTAR_EXCECAO)
	@WebResult(name="ExcecaoCapturada", targetNamespace=PortalConstantes.NAMESPACE + PortalConstantes.DOMINIO_EXCECAO)
	public ExcecaoDTO consultarExcecao(Long codigoExcecao);

}
