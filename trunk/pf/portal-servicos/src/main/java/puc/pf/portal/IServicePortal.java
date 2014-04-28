package puc.pf.portal;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import puc.pf.portal.dto.ExcecaoCapturadaDTO;
import puc.pf.portal.dto.FuncionarioDTO;
import puc.pf.portal.util.Constantes;

@WebService(name="iserviceportal", targetNamespace=Constantes.NAMESPACE)
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,use=SOAPBinding.Use.LITERAL,parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public interface IServicePortal { 

	@WebMethod(operationName=Constantes.OPERACAO_CONSULTAR_LISTA_FUNCIONARIO,
			action=Constantes.NAMESPACE + "/" + Constantes.OPERACAO_CONSULTAR_LISTA_FUNCIONARIO)
	@WebResult(name="ListaFuncionario", targetNamespace=Constantes.NAMESPACE + Constantes.DOMINIO_FUNCIONARIO)
	public List<FuncionarioDTO> consultarListaFuncionario();

	@WebMethod(operationName=Constantes.OPERACAO_CONSULTAR_FUNCIONARIO,
			action=Constantes.NAMESPACE + "/" + Constantes.OPERACAO_CONSULTAR_FUNCIONARIO)
	@WebResult(name="Funcionario", targetNamespace=Constantes.NAMESPACE + Constantes.DOMINIO_FUNCIONARIO)
	public FuncionarioDTO consultarFuncionario(Long codigoFuncionario);
	
	@WebMethod(operationName=Constantes.OPERACAO_CONSULTAR_LISTA_EXCECAO, 
			action=Constantes.NAMESPACE + "/" + Constantes.OPERACAO_CONSULTAR_LISTA_EXCECAO)
	@WebResult(name="ListaExcecaoCapturada", targetNamespace=Constantes.NAMESPACE + Constantes.DOMINIO_EXCECAO_CAPTURADA)
	public List<ExcecaoCapturadaDTO> consultarListaExcecao();
	
	
	
	
	
	

//	@WebMethod(operationName="ConsultarListaTarefa", action="http://localhost:8080/jaxws/ConsultarListaTarefa")
//    @WebResult(name="ListaTarefa", targetNamespace="http://localhost:8080/jaxws/dominio/Tarefa")
//    public List<TarefaDTO> consultarListaTarefa();
//
//	@WebMethod(operationName="ConsultarTarefa", action="http://localhost:8080/jaxws/consultarTarefa")
//    @WebResult(name="Tarefa", targetNamespace="http://localhost:8080/jaxws/dominio/Tarefa")
//    public TarefaDTO consultarTarefa(Integer codigoTarefa);
//
//	@WebMethod(operationName="ConsultarTarefasFuncionario", action="http://localhost:8080/jaxws/consultarTarefasFuncionario")
//    @WebResult(name="Tarefa", targetNamespace="http://localhost:8080/jaxws/dominio/Tarefa")
//    public List<TarefaDTO> consultarTarefasFuncionario(Integer codigoFuncionario);

}
