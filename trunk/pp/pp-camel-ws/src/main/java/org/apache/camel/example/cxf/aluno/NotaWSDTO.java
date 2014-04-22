package org.apache.camel.example.cxf.aluno;

import java.io.Serializable;

public class NotaWSDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String aluno;
	
	private String disciplina;
	
	private String nota;
	
	private String semestre;
	
	public NotaWSDTO() {
	}

	public NotaWSDTO(String aluno, String disciplina, String nota, String semestre) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota = nota;
		this.semestre = semestre;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}
	
	public String getSemestre() {
		return semestre;
	}
	
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
}
