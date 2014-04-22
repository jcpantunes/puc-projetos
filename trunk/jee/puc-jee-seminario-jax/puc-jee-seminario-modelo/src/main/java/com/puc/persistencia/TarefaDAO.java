package com.puc.persistencia;

import java.util.List;

import com.puc.dominio.Tarefa;

public class TarefaDAO extends BaseDAOUtil<Tarefa> {
	
	public TarefaDAO() {
	}
	
	public void salvar(Tarefa tarefa) {
		super.salvar(tarefa);
	}
	
	public List<Tarefa> listar() {
		return super.listar(TAREFA);
	}
	
	public Tarefa listar(int id) {
		return super.listar(id, TAREFA);
	}
	
	public Tarefa listarPorCodigo(int codigo) {
		return super.listarPorCodigo(codigo, TAREFA);
	}
	
}
