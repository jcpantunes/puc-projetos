package com.puc.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.puc.IPucJeeService;
import com.puc.dominio.Funcionario;
import com.puc.dominio.Tarefa;
import com.puc.dto.FuncionarioDTO;
import com.puc.dto.TarefaDTO;
import com.puc.persistencia.FuncionarioDAO;
import com.puc.persistencia.TarefaDAO;
import com.sun.xml.ws.developer.SchemaValidation;

@SchemaValidation
@WebService(endpointInterface="com.puc.IPucJeeService", portName="IPucJeeServicePort",  serviceName="IPucJeeService")
public class PucJeeService implements IPucJeeService {
	
	public List<FuncionarioDTO> consultarListaFuncionario() {
    	FuncionarioDAO dao = new FuncionarioDAO();
    	return FuncionarioDTO.parserFromFuncionario(dao.listar());
    }
    
    public FuncionarioDTO consultarFuncionario(Integer codigoFuncionario) {
    	FuncionarioDAO dao = new FuncionarioDAO();
    	Funcionario f = dao.listarPorCodigo(codigoFuncionario);
    	if (f != null) {
    		return FuncionarioDTO.parserFromFuncionario(f);
    	}
    	return (new FuncionarioDTO());
    }
    
    public List<TarefaDTO> consultarListaTarefa() {
    	TarefaDAO dao = new TarefaDAO();
    	return TarefaDTO.parserFromTarefa(dao.listar());
    }
    
    public TarefaDTO consultarTarefa(Integer codigoTarefa) {
    	TarefaDAO dao = new TarefaDAO();
    	Tarefa t = dao.listarPorCodigo(codigoTarefa);
    	if (t != null) {
    		return TarefaDTO.parserFromTarefa(t);
    	}
    	return (new TarefaDTO());
    }
    
    public List<TarefaDTO> consultarTarefasFuncionario(Integer codigoFuncionario) {
    	FuncionarioDAO dao = new FuncionarioDAO();
    	Funcionario f = dao.listarPorCodigo(codigoFuncionario);
    	if (f != null) {
    		return TarefaDTO.parserFromTarefa(f.getListaTarefa());
    	}
    	return new ArrayList<TarefaDTO>();	
    }
}
