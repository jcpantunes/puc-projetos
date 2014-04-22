package puc.pf.portal;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import puc.pf.portal.dto.AlunoDTO;
import puc.pf.portal.dto.ExcecaoCapturadaDTO;

@WebService(name="iserviceportal", targetNamespace="http://localhost:8080/jaxws")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,use=SOAPBinding.Use.LITERAL,parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public interface IServicePortal { 
	//http://localhost:8080/portal-servicos/IServicePortal?wsdl

	@WebMethod(operationName="ConsultarListaAluno", action="http://localhost:8080/jaxws/consultarListaAluno")
	@WebResult(name="ListaAluno", targetNamespace="http://localhost:8080/jaxws/dominio/Aluno")
	public List<AlunoDTO> consultarListaAluno();

	@WebMethod(operationName="ConsultarListaExcecao", action="http://localhost:8080/jaxws/consultarListaExcecao")
	@WebResult(name="ExcecaoCapturada", targetNamespace="http://localhost:8080/jaxws/dominio/ExcecaoCapturada")
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
