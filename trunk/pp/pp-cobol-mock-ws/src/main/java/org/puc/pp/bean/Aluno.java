package org.puc.pp.bean;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	private String matricula;
	
	private String nome;
	
	private String email;
	
	public Aluno() {
	}
	
	public Aluno (String matricula, String nome, String email) {
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	private static List<Aluno> criarAlunos() {
		List<Aluno> lista = new ArrayList<Aluno>();
		lista.add(new Aluno("0111", "Julio", "julio@pucminas.br"));
		lista.add(new Aluno("0112", "Marcus", "marcus@pucminas.br"));
		lista.add(new Aluno("0113", "Renan", "renan@pucminas.br"));
		lista.add(new Aluno("0114", "Adriano", "adriano@pucminas.br"));
		lista.add(new Aluno("0115", "Thiago", "thiago@pucminas.br"));
		lista.add(new Aluno("0116", "Pedro", "pedro@pucminas.br"));
		lista.add(new Aluno("0117", "Hudson", "hudson@pucminas.br"));
		return lista;
	}
	
	public static List<Aluno> recuperarAlunos() {
		return criarAlunos();
	}
	
	public static Aluno recuperarAlunoPorMatricula(String matricula) {
		for(Aluno aluno : criarAlunos()) {
    		if (aluno.getMatricula().equals(matricula)) {
    			return aluno;
    		}
    	}
		return null;
	}
	
	public static String recuperarNomeAlunoPorMatricula(String matricula) {
		for(Aluno aluno : criarAlunos()) {
    		if (aluno.getMatricula().equals(matricula)) {
    			return aluno.getNome();
    		}
    	}
		return "";
	}
}
