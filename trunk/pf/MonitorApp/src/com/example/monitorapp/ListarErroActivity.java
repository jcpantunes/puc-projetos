/**
 * 
 */
package com.example.monitorapp;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
		
		final Button btnVoltar = (Button) findViewById(R.id.btnVoltar);
		btnVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("ListarErros", "Voltando para Tela Welcome ...");
				iniciarWelcomeActivity();
				finish();
			}
		});
		
		final Button btnAtualizar = (Button) findViewById(R.id.btnAtualizar);
		btnAtualizar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("ListarErros", "Atualizando Lista ...");
				bindListaErros();
			}
		});
		
		bindListaErros();
	}
	
	private void bindListaErros() {
		mCursor = this.getContentResolver().query(
				MonitorProvider.Excecao.CONTENT_URI, null, null, null, null);
		
		ListAdapter adapter = new SimpleCursorAdapter(this, R.layout.list_item, mCursor,
				new String[] { MonitorProvider.Excecao.EXCECAO_DATA, MonitorProvider.Excecao.EXCECAO_TICKET, 
				MonitorProvider.Excecao.EXCECAO_TIPO}, new int[] {R.id.txtData, R.id.txtTicket, R.id.txtTipo});

		setListAdapter(adapter);		
	}
	
	private void iniciarWelcomeActivity() {
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
		finish();
	}
	
}
