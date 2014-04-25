/**
 * 
 */
package com.example.monitorapp;

import android.app.ListActivity;
import android.content.Intent;
import android.database.sqlite.SQLiteCursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;

import com.example.monitorapp.provider.ExcecaoCapturadaDAO;
import com.example.monitorapp.service.WebServiceCallAsync;

/**
 * @author 05163217658
 * 
 */
public class ListarErroActivity extends ListActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listar_erro);
		
		bindListaErros();
		
		final Button btnVoltar = (Button) findViewById(R.id.listarErroBtnVoltar);
		btnVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("ListarErros", "Voltando para Tela Welcome ...");
				chamarMainActivity();
			}
		});
		
		final Button btnAtualizar = (Button) findViewById(R.id.listarErroBtnAtualizar);
		btnAtualizar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("ListarErros", "Atualizando Lista ...");
				bindListaErros();
			}
		});
		
		final Button btnVerStacktrace = (Button) findViewById(R.id.listarErroBtnVerStacktrace);
		btnVerStacktrace.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("ListarErros", "Visualizar Stacktrace ...");
				chamarStacktraceActivity();
			}
		});
		
		this.getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
		    @Override
		    public void onItemClick(AdapterView adapter, View viw, int posicao,long id) {
			    SQLiteCursor c = (SQLiteCursor)adapter.getAdapter().getItem(posicao);
			    Intent it = new Intent(getBaseContext(), StacktraceActivity.class);
			    it.putExtra("id", c.getInt(0));
			    startActivity(it);
		    }            
		});

	}
	
	private void bindListaErros() {
		WebServiceCallAsync ws = new WebServiceCallAsync(this);
		ws.execute("");
		
		ExcecaoCapturadaDAO adapter = new ExcecaoCapturadaDAO();
		setListAdapter(adapter.recuperarListaErroAdapter(this));
	}
	
	private void chamarMainActivity() {
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
		finish();
	}
	
	private void chamarStacktraceActivity() {
		Intent i = new Intent(this, StacktraceActivity.class);
		startActivity(i);
		finish();
	}
	
}
