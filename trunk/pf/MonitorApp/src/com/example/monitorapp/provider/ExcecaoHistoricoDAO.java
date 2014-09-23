package com.example.monitorapp.provider;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.example.monitorapp.dto.ExcecaoHistoricoDTO;

public class ExcecaoHistoricoDAO {
	
	public List<ExcecaoHistoricoDTO> listar(Context context) {
		List<ExcecaoHistoricoDTO> lista = new ArrayList<ExcecaoHistoricoDTO>();
		
		Cursor mCursor = context.getContentResolver().query(
				MonitorProvider.ExcecaoHistorico.CONTENT_URI, null, null, null, 
				MonitorProvider.ExcecaoHistorico.EXCECAO_HISTORICO_TICKET + " DESC ");
		
		if (mCursor != null) {
    		while (mCursor.moveToNext()) {
    			ExcecaoHistoricoDTO excecaoHistorico = ExcecaoHistoricoDTO.parseFromCursor(mCursor);
    			lista.add(excecaoHistorico);
    		}
    	}
		return lista;
	}
	
	public ExcecaoHistoricoDTO listar (Context context, Integer id) {
		List<ExcecaoHistoricoDTO> lista = listar(context);
		for (ExcecaoHistoricoDTO dto : lista) {
			if(dto.getIdExcecao() == id) {
				return dto;
			}
		}
		return null;
	}
	
	public ExcecaoHistoricoDTO listarUltimo (Context context) {
		List<ExcecaoHistoricoDTO> lista = listar(context);
		if(lista.size() > 0) {
			return lista.get(0);
		}
		return null;
	}
	
	public void inserir (Context context, ExcecaoHistoricoDTO erro) {
		ContentValues values = new ContentValues();
		values.put(MonitorProvider.ExcecaoHistorico.EXCECAO_HISTORICO_ID_EXCECAO, erro.getIdExcecao().intValue());
		values.put(MonitorProvider.ExcecaoHistorico.EXCECAO_HISTORICO_TICKET, erro.getTicket());
		context.getContentResolver().insert(MonitorProvider.ExcecaoHistorico.CONTENT_URI, values);
	}
	
	public void delete (Context context) {
		context.getContentResolver().delete(MonitorProvider.ExcecaoHistorico.CONTENT_URI, null, null);
	}
	
	public void delete(List<ExcecaoHistoricoDTO> lista) {
		
	}

}
