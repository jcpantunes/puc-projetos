package com.example.monitorapp.dto;

import java.util.Date;

import org.ksoap2.serialization.SoapObject;

import android.database.Cursor;

import com.example.monitorapp.provider.MonitorProvider;

public class ExcecaoCapturadaDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	
	private Integer idExcecao;
	
	private String tipoExcecao;
	
	private String stacktrace;
	
	private String ticket;
	
    protected Date dataExcecao;
	
	public ExcecaoCapturadaDTO() {
		super();
	}
	
	public ExcecaoCapturadaDTO(Integer id, Integer idExcecao, String tipoExcecao, 
			String stacktrace, String ticket, String dataExcecao) {
		this.setId(id);
		this.setIdExcecao(idExcecao);
		this.tipoExcecao = tipoExcecao;
		this.stacktrace = stacktrace;
		this.ticket = ticket;
		this.dataExcecao = retornaDataDate(dataExcecao);
	}
	
	public Integer getIdExcecao() {
		return idExcecao;
	}
	
	public void setIdExcecao(Integer idExcecao) {
		this.idExcecao = idExcecao;
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
		
		dto.setId(Integer.parseInt(object.getProperty(0).toString()));
    	dto.setTipoExcecao(object.getProperty(1).toString());
    	dto.setStacktrace(object.getProperty(2).toString());
    	dto.setTicket(object.getProperty(3).toString());
    	dto.setDataExcecao(object.getProperty(4).toString());
    	
    	return dto;
	}
	
	public static ExcecaoCapturadaDTO parseFromCursor(Cursor mCursor) {
		ExcecaoCapturadaDTO dto = new ExcecaoCapturadaDTO();
		dto.setId(mCursor.getInt(mCursor.getColumnIndex(MonitorProvider.Excecao.EXCECAO_ID)));
		dto.setIdExcecao(mCursor.getInt(mCursor.getColumnIndex(MonitorProvider.Excecao.EXCECAO_ID_EXCECAO)));
		dto.setTipoExcecao(mCursor.getString(mCursor.getColumnIndex(MonitorProvider.Excecao.EXCECAO_TIPO)));
		dto.setStacktrace(mCursor.getString(mCursor.getColumnIndex(MonitorProvider.Excecao.EXCECAO_TIPO)));
		dto.setTicket(mCursor.getString(mCursor.getColumnIndex(MonitorProvider.Excecao.EXCECAO_TICKET)));
		dto.setDataExcecao(mCursor.getString(mCursor.getColumnIndex(MonitorProvider.Excecao.EXCECAO_DATA)));
		return dto;
	}
}