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
import android.widget.AdapterView;
import android.widget.Button;

import com.example.monitorapp.provider.ExcecaoCapturadaDAO;
import com.example.monitorapp.provider.MonitorProvider;
import com.example.monitorapp.service.WebServiceCallAsync;

/**
 * @author 05163217658
 * 
 */
public class ListarErroActivity extends ListActivity {
	
	private final String TAG = "ListarErros";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.listar_erro_layout);
		
		bindListaErros();
		
		final Button btnVoltar = (Button) findViewById(R.id.listarErroBtnVoltar);
		btnVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i(TAG, "Voltando para Tela Welcome ...");
				chamarMainActivity();
			}	
		});
		
		final Button btnAtualizar = (Button) findViewById(R.id.listarErroBtnAtualizar);
		btnAtualizar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i(TAG, "Atualizando Lista ...");
				bindListaErros();
			}
		});
		
		final Button btnRemover = (Button) findViewById(R.id.listarErroBtnRemover);
		btnRemover.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i(TAG, "Removendo itens ...");
				executarAcaoRemover();
			}
		});
		
		this.getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
		    @SuppressWarnings("rawtypes")
			@Override
		    public void onItemClick(AdapterView adapter, View viw, int posicao,long id) {
				Cursor info = (Cursor) adapter.getAdapter().getItem(posicao);
			    Intent it = new Intent(getBaseContext(), StacktraceActivity.class);
			    it.putExtra(MonitorProvider.Excecao.EXCECAO_ID_EXCECAO,
			    		info.getInt(info.getColumnIndex(MonitorProvider.Excecao.EXCECAO_ID_EXCECAO)));
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
	
	private void executarAcaoRemover() {
		ExcecaoCapturadaDAO dao = new ExcecaoCapturadaDAO();
		dao.delete(this);
	}
	
	private void chamarMainActivity() {
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
		finish();
	}
}
