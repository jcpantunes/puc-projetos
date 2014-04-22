package com.puc.persistencia;

import java.util.ArrayList;
import java.util.List;

import com.puc.dominio.Funcionario;
import com.puc.dominio.Tarefa;


public class Teste {
	
	public static void main(String[] args) {
		Teste teste = new Teste();
		teste.testarSalvar();
		teste.testarFuncionario();
		teste.testarTarefa();
	}

	private void testarSalvar() {
		FuncionarioDAO daoF = new FuncionarioDAO();

		List<Funcionario> lf = preencherListaFuncionario();
		for (Funcionario f : lf) {
			daoF.salvar(f);
		}

		TarefaDAO daoT = new TarefaDAO();
		List<Tarefa> lt = preencherListaTarefa();
		for (Tarefa t : lt) {
			daoT.salvar(t);
		}
	}

	private void testarTarefa() {
		TarefaDAO dao = new TarefaDAO();

		List<Tarefa> lista = dao.listar();
		for (Tarefa t : lista) {
			System.out.println(t.getId() + " / " + t.getNome());
		}

		Tarefa t1 = dao.listarPorCodigo(101);
		System.out.println(t1.getId() + " / " + t1.getNome());

		t1 = dao.listarPorCodigo(103);
		System.out.println(t1.getId() + " / " + t1.getNome());
	}

	private void testarFuncionario() {
		FuncionarioDAO dao = new FuncionarioDAO();

		List<Funcionario> lista = dao.listar();
		for (Funcionario f : lista) {
			System.out.println(f.getId() + " / " + f.getNome());
		}

		Funcionario f1 = dao.listarPorCodigo(200);
		System.out.println(f1.getId() + " / " + f1.getNome());

		f1 = dao.listarPorCodigo(300);
		System.out.println(f1.getId() + " / " + f1.getNome());
	}

	private List<Tarefa> preencherListaTarefa() {
		List<Tarefa> lista = new ArrayList<Tarefa>();
		FuncionarioDAO daoF = new FuncionarioDAO();
		lista.add(new Tarefa(101, "Implementar Camada View", "01/09/2013", daoF
				.listarPorCodigo(100)));
		lista.add(new Tarefa(102, "Implementar Camada Controle", "02/09/2013",
				daoF.listarPorCodigo(200)));
		lista.add(new Tarefa(103, "Implementar Camada Negocio", "03/09/2013",
				daoF.listarPorCodigo(300)));
		lista.add(new Tarefa(104, "Implementar Camada DAO", "04/09/2013", daoF
				.listarPorCodigo(100)));
		return lista;
	}

	private List<Funcionario> preencherListaFuncionario() {
		List<Funcionario> lista = new ArrayList<Funcionario>();
		lista.add(new Funcionario(100, "Julio"));
		lista.add(new Funcionario(200, "Adriano"));
		lista.add(new Funcionario(300, "Thiago"));
		return lista;
	}

}
