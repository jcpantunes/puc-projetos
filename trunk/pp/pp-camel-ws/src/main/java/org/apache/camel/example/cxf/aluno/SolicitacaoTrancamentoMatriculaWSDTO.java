package org.apache.camel.example.cxf.aluno;

import java.io.Serializable;

public class SolicitacaoTrancamentoMatriculaWSDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	protected String solicitacaoValida;
	
	protected String protocoloSolicitacao;

	public SolicitacaoTrancamentoMatriculaWSDTO() {
	}

	public SolicitacaoTrancamentoMatriculaWSDTO(String solicitacaoValida,
			String protocoloSolicitacao) {
		super();
		this.solicitacaoValida = solicitacaoValida;
		this.protocoloSolicitacao = protocoloSolicitacao;
	}

	public String getSolicitacaoValida() {
		return solicitacaoValida;
	}

	public void setSolicitacaoValida(String solicitacaoValida) {
		this.solicitacaoValida = solicitacaoValida;
	}

	public String getProtocoloSolicitacao() {
		return protocoloSolicitacao;
	}

	public void setProtocoloSolicitacao(String protocoloSolicitacao) {
		this.protocoloSolicitacao = protocoloSolicitacao;
	}
	
}
