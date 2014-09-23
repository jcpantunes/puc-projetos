package com.example.monitorapp.dto;

import org.ksoap2.serialization.SoapObject;

import android.database.Cursor;

import com.example.monitorapp.provider.MonitorProvider;

public class ExcecaoHistoricoDTO extends BaseDTO {

	private static final long serialVersionUID = 1L;
	
	private Integer idExcecao;
	
	private String ticket;
	
	public ExcecaoHistoricoDTO() {
		super();
	}
	
	public ExcecaoHistoricoDTO(Integer id, Integer idExcecao, String tipoExcecao, 
			String stacktrace, String ticket, String dataExcecao) {
		this.setId(id);
		this.setIdExcecao(idExcecao);
		this.ticket = ticket;
	}
	
	public Integer getIdExcecao() {
		return idExcecao;
	}
	
	public void setIdExcecao(Integer idExcecao) {
		this.idExcecao = idExcecao;
	}
	
	public String getTicket() {
		return ticket;
	}
	
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	
	public static ExcecaoHistoricoDTO parseFromSoapObject(SoapObject object) {
		ExcecaoHistoricoDTO dto = new ExcecaoHistoricoDTO();
		dto.setId(Integer.parseInt(object.getProperty(0).toString()));
    	dto.setTicket(object.getProperty(1).toString());
    	return dto;
	}
	
	public static ExcecaoHistoricoDTO parseFromCursor(Cursor mCursor) {
		ExcecaoHistoricoDTO dto = new ExcecaoHistoricoDTO();
		dto.setId(mCursor.getInt(mCursor.getColumnIndex(MonitorProvider.ExcecaoHistorico.EXCECAO_HISTORICO_ID)));
		dto.setIdExcecao(mCursor.getInt(mCursor.getColumnIndex(MonitorProvider.ExcecaoHistorico.EXCECAO_HISTORICO_ID_EXCECAO)));
		dto.setTicket(mCursor.getString(mCursor.getColumnIndex(MonitorProvider.ExcecaoHistorico.EXCECAO_HISTORICO_TICKET)));
		return dto;
	}
	
	public static ExcecaoHistoricoDTO parseFromExcecaoDTO(ExcecaoDTO excecaoDTO) {
		ExcecaoHistoricoDTO dto = new ExcecaoHistoricoDTO();
		dto.setId(excecaoDTO.getId());
		dto.setIdExcecao(excecaoDTO.getIdExcecao());
		dto.setTicket(excecaoDTO.getTicket());
		return dto;
	}
}