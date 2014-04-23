package com.example.monitorapp;

import com.example.monitorapp.service.WebServiceCallAsync;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		
		// executaThreadListarErro();
		
		final Button btnModo1 = (Button) findViewById(R.id.welcomeBtnListarModo1);
		btnModo1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("Welcome", "Acessando Listar Erro - Modo 1 ...");
				iniciarListarErroActivity();
			}
		});
		
		final Button btnModo2 = (Button) findViewById(R.id.welcomeBtnListarModo2);
		btnModo2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("Welcome", "Acessando Listar Erro - Modo 2 ...");
				iniciarListarErro2Activity();
			}
		});
	}
	
	private void iniciarListarErroActivity() {
		Intent i = new Intent(this, ListarErroActivity.class);
		startActivity(i);
		finish();
	}
	
	private void iniciarListarErro2Activity() {
		Intent i = new Intent(this, ConfiguracaoActivity.class);
		startActivity(i);
		finish();
	}
	
	private void executaThreadListarErro() {
		WebServiceCallAsync ws = new WebServiceCallAsync(this);
		ws.execute("");
	}
}
