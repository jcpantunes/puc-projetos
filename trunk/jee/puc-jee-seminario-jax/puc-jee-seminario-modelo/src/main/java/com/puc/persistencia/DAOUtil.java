package com.puc.persistencia;

import java.util.ArrayList;
import java.util.List;

import com.puc.dominio.BaseBean;
import com.puc.dominio.Funcionario;
import com.puc.dominio.Tarefa;

public abstract class DAOUtil<T extends BaseBean> {

	protected final String FUNCIONARIO = "FUNC";
	protected final String TAREFA = "TAREFA";
	
	public DAOUtil() {
	}
	
	@SuppressWarnings("unchecked")
	private List<T> preencherLista(String tipo) {
		if (tipo.equals(FUNCIONARIO)) {
			return (List<T>) preencherListaFuncionario();
		} else if (tipo.equals(TAREFA)) {
			return (List<T>) preencherListaTarefa();
		}
		return new ArrayList<T>();
	}
	
	protected List<T> listar(String tipo) {
		List<T> lista = new ArrayList<T>();
		lista = preencherLista(tipo);
		return lista;
	}
	
	protected T listar(int id, String tipo) {
		List<T> lista = preencherLista(tipo);
		for (T t : lista) {
			if (t.getId() == id) {
				return t;
			}
		}
		return null;
	}
	
	private List<Tarefa> preencherListaTarefa() {
		Funcionario f = new Funcionario(1, "Julio");
		List<Tarefa> lista = new ArrayList<Tarefa>();
		lista.add(new Tarefa(101, "Implementar Camada View", "01/09/2013", f));
		lista.add(new Tarefa(102, "Implementar Camada Controle", "02/09/2013", f));
		lista.add(new Tarefa(103, "Implementar Camada Negocio", "03/09/2013", f));
		lista.add(new Tarefa(104, "Implementar Camada DAO", "04/09/2013", f));
		return lista;
	}
	
	private List<Funcionario> preencherListaFuncionario() {
		List<Funcionario> lista = new ArrayList<Funcionario>();
		lista.add(new Funcionario(1, "Julio"));
		lista.add(new Funcionario(2, "Adriano"));
		lista.add(new Funcionario(3, "Thiago"));
		return lista;
	}
	

}
