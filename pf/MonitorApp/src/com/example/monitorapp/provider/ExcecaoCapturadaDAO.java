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
import com.example.monitorapp.dto.ExcecaoCapturadaDTO;

public class ExcecaoCapturadaDAO {
	
	public List<ExcecaoCapturadaDTO> recuperarListaErro(Context context) {
		List<ExcecaoCapturadaDTO> lista = new ArrayList<ExcecaoCapturadaDTO>();
		
		Cursor mCursor = context.getContentResolver().query(
				MonitorProvider.Excecao.CONTENT_URI, null, null, null, null);
		
		if (mCursor != null) {
    		while (mCursor.moveToNext()) { //id,ticket,data,tipo
    			ExcecaoCapturadaDTO erro = new ExcecaoCapturadaDTO(mCursor.getLong(0), 
    					mCursor.getString(3), mCursor.getString(3), mCursor.getString(1), mCursor.getString(2));
    			lista.add(erro);
    		}
    	}
		return lista;
	}
	
	public ExcecaoCapturadaDTO recuperarErro(Context context, Integer id) {
		List<ExcecaoCapturadaDTO> lista = recuperarListaErro(context);
		for (ExcecaoCapturadaDTO dto : lista) {
			if(dto.getId().intValue() == id) {
				return dto;
			}
		}
		return null;
	}
	
	public ListAdapter recuperarListaErroAdapter(Context context) {
		Cursor mCursor = context.getContentResolver().query(
				MonitorProvider.Excecao.CONTENT_URI, null, null, null, null);
		
		ListAdapter adapter = new SimpleCursorAdapter(context, R.layout.list_item, mCursor,
				new String[] { MonitorProvider.Excecao.EXCECAO_DATA, MonitorProvider.Excecao.EXCECAO_TICKET, 
				MonitorProvider.Excecao.EXCECAO_TIPO}, new int[] {R.id.txtData, R.id.txtTicket, R.id.txtTipo});

		return adapter;	
	}
	
	public void inserirErro(Context context, ExcecaoCapturadaDTO erro) {
		ContentValues values = new ContentValues();
		values.put(MonitorProvider.Excecao.EXCECAO_DATA, BaseDTO.retornaDataString(erro.getDataExcecao()));
		values.put(MonitorProvider.Excecao.EXCECAO_TIPO, erro.getTipoExcecao());
		values.put(MonitorProvider.Excecao.EXCECAO_TICKET, erro.getTicket());
		context.getContentResolver().insert(MonitorProvider.Excecao.CONTENT_URI, values);
	}

}
