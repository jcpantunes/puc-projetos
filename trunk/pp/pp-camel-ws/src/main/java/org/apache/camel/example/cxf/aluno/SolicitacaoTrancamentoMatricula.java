package org.apache.camel.example.cxf.aluno;

public class SolicitacaoTrancamentoMatricula {

	public SolicitacaoTrancamentoMatricula(String matriculaAluno,
			String codigoDisciplina) {
		super();
		this.matriculaAluno = matriculaAluno;
		this.codigoDisciplina = codigoDisciplina;
		this.status = StatusSolicitacaoTrancamentoMatricula.ENCAMINHADA;
	}
	
	String matriculaAluno;
	
	String codigoDisciplina;
	
	StatusSolicitacaoTrancamentoMatricula status;

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

	public StatusSolicitacaoTrancamentoMatricula getStatus() {
		return status;
	}

	public void setStatus(StatusSolicitacaoTrancamentoMatricula status) {
		this.status = status;
	}

}
