package com.example.monitorapp.provider;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

import com.example.monitorapp.R;
import com.example.monitorapp.dto.BaseDTO;
import com.example.monitorapp.dto.ExcecaoDTO;

public class ExcecaoDAO {
	
	public List<ExcecaoDTO> recuperarListaErro(Context context) {
		List<ExcecaoDTO> lista = new ArrayList<ExcecaoDTO>();
		
		Cursor mCursor = context.getContentResolver().query(
				MonitorProvider.Excecao.CONTENT_URI, null, null, null, MonitorProvider.Excecao.EXCECAO_TICKET + " DESC ");
		
		if (mCursor != null) {
    		while (mCursor.moveToNext()) {
    			ExcecaoDTO erro = ExcecaoDTO.parseFromCursor(mCursor);
    			lista.add(erro);
    		}
    	}
		return lista;
	}
	
	public ExcecaoDTO recuperarErro(Context context, Integer id) {
		List<ExcecaoDTO> lista = recuperarListaErro(context);
		for (ExcecaoDTO dto : lista) {
			if(dto.getIdExcecao() == id) {
				return dto;
			}
		}
		return null;
	}
	
	public ListAdapter recuperarListaErroAdapter(Context context) {
		Cursor mCursor = context.getContentResolver().query(
				MonitorProvider.Excecao.CONTENT_URI, null, null, null, MonitorProvider.Excecao.EXCECAO_TICKET + " DESC ");
		
		@SuppressWarnings("deprecation")
		ListAdapter adapter = new SimpleCursorAdapter(context, R.layout.list_item_layout, mCursor,
				new String[] { MonitorProvider.Excecao.EXCECAO_DATA, MonitorProvider.Excecao.EXCECAO_TICKET, 
				MonitorProvider.Excecao.EXCECAO_TIPO}, new int[] {R.id.txtData, R.id.txtTicket, R.id.txtTipo});

		return adapter;	
	}
	
	public void inserirErro(Context context, ExcecaoDTO erro) {
		ContentValues values = new ContentValues();
		values.put(MonitorProvider.Excecao.EXCECAO_ID_EXCECAO, erro.getIdExcecao().intValue());
		values.put(MonitorProvider.Excecao.EXCECAO_DATA, BaseDTO.retornaDataString(erro.getDataExcecao()));
		values.put(MonitorProvider.Excecao.EXCECAO_TIPO, erro.getTipoExcecao());
		values.put(MonitorProvider.Excecao.EXCECAO_TICKET, erro.getTicket());
		context.getContentResolver().insert(MonitorProvider.Excecao.CONTENT_URI, values);
	}
	
	public void delete(Context context) {
		context.getContentResolver().delete(MonitorProvider.Excecao.CONTENT_URI, null, null);
	}
	
	public void delete(List<ExcecaoDTO> lista) {
		
	}

}
