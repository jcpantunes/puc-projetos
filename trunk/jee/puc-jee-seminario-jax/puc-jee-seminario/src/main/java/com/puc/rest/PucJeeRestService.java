package com.puc.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.puc.dominio.Funcionario;
import com.puc.dominio.Tarefa;
import com.puc.dto.FuncionarioDTO;
import com.puc.dto.TarefaDTO;
import com.puc.persistencia.FuncionarioDAO;
import com.puc.persistencia.TarefaDAO;

@Path("pucjeerest")
@Produces(MediaType.APPLICATION_XML)
public class PucJeeRestService {
	
	@GET
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String principal() {
    	return "Web Services desenvolvido para seminário sobre JAX-RS " +
    			"Consultas Disponiveis: " +
    			"http://localhost:8080/puc-jee-seminario/pucjeerest/consultarListaFuncionario/" +
    			"http://localhost:8080/puc-jee-seminario/pucjeerest/consultarFuncionario/100" +
    			"http://localhost:8080/puc-jee-seminario/pucjeerest/consultarListaTarefa/" +
    			"http://localhost:8080/puc-jee-seminario/pucjeerest/consultarTarefa/100" +
    			"http://localhost:8080/puc-jee-seminario/consultarTarefasFuncionario/";
    }
    
	@GET
	@Path("consultarListaFuncionario/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FuncionarioDTO> consultarListaFuncionario() {
    	FuncionarioDAO dao = new FuncionarioDAO();
    	return FuncionarioDTO.parserFromFuncionario(dao.listar());
    }
    
    @GET
	@Path("consultarFuncionario/{codigoFuncionario}")
	@Produces(MediaType.APPLICATION_JSON)
    public FuncionarioDTO consultarFuncionario(@PathParam("codigoFuncionario") final Integer codigoFuncionario) {
    	FuncionarioDAO dao = new FuncionarioDAO();
    	Funcionario f = dao.listarPorCodigo(codigoFuncionario);
    	if (f != null) {
    		return FuncionarioDTO.parserFromFuncionario(f);
    	}
    	return (new FuncionarioDTO());
    }
    
	@GET
	@Path("consultarListaTarefa/")
	public List<TarefaDTO> consultarListaTarefa() {
    	TarefaDAO dao = new TarefaDAO();
    	List<Tarefa> lista = dao.listar();
    	return TarefaDTO.parserFromTarefa(lista);
    }
    
    @GET
	@Path("consultarTarefa/{codigoTarefa}")
	public TarefaDTO consultarTarefa(@PathParam("codigoTarefa") final int codigoTarefa) {
    	TarefaDAO dao = new TarefaDAO();
    	Tarefa t = dao.listarPorCodigo(codigoTarefa);
    	if (t != null) {
    		return TarefaDTO.parserFromTarefa(t);
    	}
    	return (new TarefaDTO());
	}
    
    @GET
	@Path("consultarTarefasFuncionario/{codigoFuncionario}")
	public List<TarefaDTO> consultarTarefasFuncionario(@PathParam("codigoFuncionario") Integer codigoFuncionario) {
    	FuncionarioDAO dao = new FuncionarioDAO();
    	Funcionario f = dao.listarPorCodigo(codigoFuncionario);
    	if (f != null) {
    		return TarefaDTO.parserFromTarefa(f.getListaTarefa());
    	}
    	return new ArrayList<TarefaDTO>();	
    }
	
	
}
