package org.puc.pp.bean.dto;

import java.io.Serializable;

public class TrancamentoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Boolean ativo;
	
	private String protocolo;
	
	public TrancamentoDTO() {
	}
	
	public TrancamentoDTO(Boolean ativo, String protocolo) {
		this.ativo = ativo;
		this.protocolo = protocolo;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
}
