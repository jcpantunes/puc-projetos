package org.puc.pp.bean;

import java.util.ArrayList;
import java.util.List;

public class Disciplina extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	private String codigo;
	
	private String nome;

	public Disciplina() {
	}
	
	public Disciplina(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	private static List<Disciplina> criarDisciplinas() {
		List<Disciplina> lista = new ArrayList<Disciplina>();
		lista.add(new Disciplina("01", "Padroes de Projeto"));
		lista.add(new Disciplina("02", "Introducao a Arquitetura de SW"));
		lista.add(new Disciplina("03", "Gerencia de Projetos"));
		lista.add(new Disciplina("04", "EAI"));
		return lista;
	}
	
	public static List<Disciplina> recuperarDisciplinas() {
		return criarDisciplinas();
	}
	
	public static Disciplina recuperarDisciplinaPorCodigo(String codigo) {
		for(Disciplina disciplina : criarDisciplinas()) {
    		if (disciplina.getCodigo().equals(codigo)) {
    			return disciplina;
    		}
    	}
		return null;
	}
	
	public static String recuperarNomeDisciplinaPorCodigo(String codigo) {
		for(Disciplina disciplina : criarDisciplinas()) {
    		if (disciplina.getCodigo().equals(codigo)) {
    			return disciplina.getNome();
    		}
    	}
		return "";
	}
	
}
