package com.puc.persistencia;

import java.util.List;

import com.puc.dominio.Funcionario;

public class FuncionarioDAO extends BaseDAOUtil<Funcionario> {
	
	public FuncionarioDAO() {
	}
	
	public void salvar(Funcionario funcionario) {
		super.salvar(funcionario);
	}
	
	public List<Funcionario> listar() {
		return super.listar(FUNCIONARIO);
	}
	
	public Funcionario listar(int id) {
		return super.listar(id, FUNCIONARIO);
	}
	
	public Funcionario listarPorCodigo(int codigo) {
		return super.listarPorCodigo(codigo, FUNCIONARIO);
	}
}
