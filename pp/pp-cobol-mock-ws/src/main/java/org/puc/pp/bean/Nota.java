package org.puc.pp.bean;

import java.util.ArrayList;
import java.util.List;

import org.puc.pp.bean.dto.NotaDTO;

public class Nota extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	private String nota;
	
	private String matriculaAluno;
	
	private String codigoDisciplina;
	
	private String semestre;
	
	public Nota() {
	}
	
	public Nota(String nota, String matriculaAluno, String codigoDisciplina, String semestre) {
		this.nota = nota;
		this.matriculaAluno = matriculaAluno;
		this.codigoDisciplina = codigoDisciplina;
		this.semestre = semestre;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}
	
	public String getSemestre() {
		return semestre;
	}
	
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	private  static List<Nota> criarNotas() {
		List<Nota> lista = new ArrayList<Nota>();
		lista.add(new Nota("90", "0111", "01", "1"));
		lista.add(new Nota("85", "0111", "02", "1"));
		lista.add(new Nota("95", "0111", "03", "2"));
		
		lista.add(new Nota("86", "0112", "01", "1"));
		lista.add(new Nota("79", "0112", "02", "2"));
		lista.add(new Nota("88", "0112", "03", "2"));

		return lista;
	}
	
	public static List<NotaDTO> recuperarNotaAluno (String matriculaAluno, String codigoDisciplina) {
		List<NotaDTO> lista = new ArrayList<NotaDTO>();
		for (Nota nota : criarNotas()) {
			if (nota.getMatriculaAluno().equals(matriculaAluno) && nota.getCodigoDisciplina().equals(codigoDisciplina)) {
				lista.add(new NotaDTO(Aluno.recuperarNomeAlunoPorMatricula(nota.getMatriculaAluno()), 
						Disciplina.recuperarNomeDisciplinaPorCodigo(nota.getCodigoDisciplina()), 
						nota.getNota(), nota.getSemestre()));
			}
		}
		return lista;
	}
	
	public static List<NotaDTO> recuperarHistoricoAluno (String matricula) {
		List<NotaDTO> lista = new ArrayList<NotaDTO>();
		for (Nota nota : criarNotas()) {
			if (nota.getMatriculaAluno().equals(matricula)) {
				lista.add(new NotaDTO(Aluno.recuperarNomeAlunoPorMatricula(nota.getMatriculaAluno()), 
						Disciplina.recuperarNomeDisciplinaPorCodigo(nota.getCodigoDisciplina()), 
						nota.getNota(), nota.getSemestre()));
			}
		}
		return lista;
	}
	
	
}



