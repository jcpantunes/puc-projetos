/**
 * 
 */
package com.example.monitorapp.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.monitorapp.R;
import com.example.monitorapp.dto.ExcecaoDTO;
import com.example.monitorapp.provider.ExcecaoDAO;
import com.example.monitorapp.provider.MonitorProvider;
import com.example.monitorapp.service.ConsultarExcecaoWS;

/**
 * @author 05163217658
 * 
 */
public class StacktraceActivity extends Activity {
	
	private final String TAG = "StacktraceActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stacktrace_layout);
		
		final Button btnVoltar = (Button) findViewById(R.id.stacktraceBtnVoltar);
		btnVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i(TAG, "Voltando para Tela Welcome ...");
				chamarListarErroActivity();
			}
		});
		
		Integer id = getIntent().getIntExtra(MonitorProvider.Excecao.EXCECAO_ID_EXCECAO, 0);
		ExcecaoDAO dao = new ExcecaoDAO();
		ExcecaoDTO dto = dao.recuperarErro(this, id);
		
		if (dto != null) {
			ConsultarExcecaoWS ws = new ConsultarExcecaoWS();
			String txt = ws.executar(dto.getIdExcecao());
			
			final TextView txtStacktrace = (TextView) findViewById(R.id.stacktraceTxt);
			txtStacktrace.setText(txt);
		}
	}
	
	private void chamarListarErroActivity() {
		Intent i = new Intent(this, ListarErroActivity.class);
		startActivity(i);
		finish();
	}
}
