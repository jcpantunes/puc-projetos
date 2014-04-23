package com.example.appexemplo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * http://www.felipesilveira.com.br/desenvolvendo-para-android/
 * 
 * @author 05163217658
 * 
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		
		final Button button = (Button) findViewById(R.id.welcome_ok_button);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("Welcome", "Encerrando tela Welcome ...");
				chamarActivity(AddNoteActivity.class);
			}
		});
		
		final Button button1 = (Button) findViewById(R.id.welcome_notificacao);
		button1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				chamarActivity(NotificacaoActivity.class);
			}
		});
	}
	
	private void chamarActivity(Class clazz) {
		Intent i = new Intent(this, clazz);
		startActivity(i);
		finish();
	}
}
