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
		
		// addExcecao(Calendar.getInstance().getTime(), "java.lang.NullPointerException");
		
		mCursor = this.getContentResolver().query(
				MonitorProvider.Excecao.CONTENT_URI, null, null, null, null);

		ListAdapter adapter = new SimpleCursorAdapter(this, R.layout.list_item, mCursor,
				new String[] { MonitorProvider.Excecao.EXCECAO_DATA, MonitorProvider.Excecao.EXCECAO_TIPO }, 
				new int[] { R.id.text, R.id.text });

		setListAdapter(adapter);
	}
	
	public void addExcecao(Date data, String tipo) {
		ContentValues values = new ContentValues();
		values.put(MonitorProvider.Excecao.EXCECAO_DATA, data.toString());
		values.put(MonitorProvider.Excecao.EXCECAO_TIPO, tipo);
		getContentResolver().insert(MonitorProvider.Excecao.CONTENT_URI, values);
	}
}
