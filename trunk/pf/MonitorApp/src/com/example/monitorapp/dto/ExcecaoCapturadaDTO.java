package com.example.monitorapp.dto;

import java.util.Date;

import org.ksoap2.serialization.SoapObject;

public class ExcecaoCapturadaDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	
	private String tipoExcecao;
	
	private String stacktrace;
	
	private String ticket;
	
    protected Date dataExcecao;
	
	public ExcecaoCapturadaDTO() {
		super();
	}
	
	public ExcecaoCapturadaDTO(Long id, String tipoExcecao, String stacktrace, String ticket, String dataExcecao) {
		this.setId(id);
		this.tipoExcecao = tipoExcecao;
		this.stacktrace = stacktrace;
		this.ticket = ticket;
		this.dataExcecao = retornaDataDate(dataExcecao);
	}
	
	public String getTipoExcecao() {
		return tipoExcecao;
	}
	
	public void setTipoExcecao(String tipoExcecao) {
		this.tipoExcecao = tipoExcecao;
	}
	
	public String getStacktrace() {
		return stacktrace;
	}
	
	public void setStacktrace(String stacktrace) {
		this.stacktrace = stacktrace;
	}
	
	public String getTicket() {
		return ticket;
	}
	
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	
	public Date getDataExcecao() {
		return dataExcecao;
	}
	
	public void setDataExcecao(Date data) {
		this.dataExcecao = data;
	}
	
	public void setDataExcecao(String data) {
		this.dataExcecao = retornaDataDate(data);
	}
	
	public static ExcecaoCapturadaDTO parseFromSoapObject(SoapObject object) {
		ExcecaoCapturadaDTO dto = new ExcecaoCapturadaDTO();
		dto.setId(Long.parseLong(object.getProperty(0).toString()));
    	dto.setTipoExcecao(object.getProperty(1).toString());
    	dto.setStacktrace(object.getProperty(2).toString());
    	dto.setTicket(object.getProperty(3).toString());
    	dto.setDataExcecao(object.getProperty(4).toString());
    	return dto;
	}
}