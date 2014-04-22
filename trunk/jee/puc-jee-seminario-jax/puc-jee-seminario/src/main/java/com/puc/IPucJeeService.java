package com.puc;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.puc.dto.FuncionarioDTO;
import com.puc.dto.TarefaDTO;

@WebService(name="ipucjeeservice", targetNamespace="http://localhost:8080/jaxws")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT,use=SOAPBinding.Use.LITERAL,parameterStyle=SOAPBinding.ParameterStyle.WRAPPED)
public interface IPucJeeService {

	@WebMethod(operationName="ConsultarListaFuncionario", action="http://localhost:8080/jaxws/consultarListaFuncionario")
	@WebResult(name="ListaFuncionario", targetNamespace="http://localhost:8080/jaxws/dominio/Funcionario")
	public List<FuncionarioDTO> consultarListaFuncionario();

	@WebMethod(operationName="ConsultarFuncionario", action="http://localhost:8080/jaxws/consultarFuncioanrio")
    // @RequestWrapper(targetNamespace="http://localhost:8080/type", className="java.lang.Integer")
	// @ResponseWrapper(targetNamespace="http://localhost:8080/jaxws/dominio/Funcionario", className="com.puc.dominio.Funcionario")
	@WebResult(name="Funcionario", targetNamespace="http://localhost:8080/jaxws/dominio/Funcionario")
	public FuncionarioDTO consultarFuncionario(Integer codigoFuncionario);

	@WebMethod(operationName="ConsultarListaTarefa", action="http://localhost:8080/jaxws/ConsultarListaTarefa")
    @WebResult(name="ListaTarefa", targetNamespace="http://localhost:8080/jaxws/dominio/Tarefa")
    public List<TarefaDTO> consultarListaTarefa();

	@WebMethod(operationName="ConsultarTarefa", action="http://localhost:8080/jaxws/consultarTarefa")
    @WebResult(name="Tarefa", targetNamespace="http://localhost:8080/jaxws/dominio/Tarefa")
    public TarefaDTO consultarTarefa(Integer codigoTarefa);

	@WebMethod(operationName="ConsultarTarefasFuncionario", action="http://localhost:8080/jaxws/consultarTarefasFuncionario")
    @WebResult(name="Tarefa", targetNamespace="http://localhost:8080/jaxws/dominio/Tarefa")
    public List<TarefaDTO> consultarTarefasFuncionario(Integer codigoFuncionario);

}
