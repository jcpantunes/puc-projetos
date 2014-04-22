package org.apache.camel.example.cxf.aluno;

import java.io.Serializable;

public class ResultadoTrancamentoMatriculaWSDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	protected ResultadoTrancamentoMatriculaWSDTO() {
	}
	
	public ResultadoTrancamentoMatriculaWSDTO(String protocoloSolicitacao,
			String resultadoTrancamento) {
		super();
		this.protocoloSolicitacao = protocoloSolicitacao;
		this.resultadoTrancamento = resultadoTrancamento;
	}

	protected String protocoloSolicitacao;
	
	protected String resultadoTrancamento;

	public String getProtocoloSolicitacao() {
		return protocoloSolicitacao;
	}

	public void setProtocoloSolicitacao(String protocoloSolicitacao) {
		this.protocoloSolicitacao = protocoloSolicitacao;
	}

	public String getResultadoTrancamento() {
		return resultadoTrancamento;
	}

	public void setResultadoTrancamento(String resultadoTrancamento) {
		this.resultadoTrancamento = resultadoTrancamento;
	}
	
}
