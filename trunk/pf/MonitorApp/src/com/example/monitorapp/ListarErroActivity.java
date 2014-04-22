/**
 * 
 */
package com.example.monitorapp;

import java.util.Calendar;
import java.util.Date;

import android.app.ListActivity;
import android.content.ContentValues;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

import com.example.monitorapp.provider.MonitorProvider;
import com.example.monitorapp.service.WebServiceCall;

/**
 * @author 05163217658
 * 
 */
public class ListarErroActivity extends ListActivity {
	
	private Cursor mCursor;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listar_erro);
		
		mCursor = this.getContentResolver().query(
				MonitorProvider.Excecao.CONTENT_URI, null, null, null, null);
		
		listarerros();
		
		ListAdapter adapter = new SimpleCursorAdapter(this, R.layout.list_item, mCursor,
				new String[] { MonitorProvider.Excecao.EXCECAO_DATA, MonitorProvider.Excecao.EXCECAO_TICKET, 
				MonitorProvider.Excecao.EXCECAO_TIPO}, new int[] {R.id.txtData, R.id.txtTicket, R.id.txtTipo});

		setListAdapter(adapter);
	}
	
	private void listarerros() {
		WebServiceCall ws = new WebServiceCall();
		ws.recuperarObjetoWS();
	}
	
}
