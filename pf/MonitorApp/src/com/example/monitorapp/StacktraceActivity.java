/**
 * 
 */
package com.example.monitorapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * @author 05163217658
 * 
 */
public class StacktraceActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stacktrace);
		
		final Button btnVoltar = (Button) findViewById(R.id.stacktraceBtnVoltar);
		btnVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("ListarErros", "Voltando para Tela Welcome ...");
				chamarListarErroActivity();
			}
		});

	}
	
	private void chamarListarErroActivity() {
		Intent i = new Intent(this, ListarErroActivity.class);
		startActivity(i);
		finish();
	}
}
