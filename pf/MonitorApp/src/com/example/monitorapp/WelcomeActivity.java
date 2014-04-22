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
public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);

		final Button button = (Button) findViewById(R.id.welcomeBtnOk);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("Welcome", "Encerrando tela Welcome ...");
				iniciarListarErroActivity();
				finish();
			}
		});
	}
	
	private void iniciarListarErroActivity() {
		Intent i = new Intent(this, ListarErroActivity.class);
		startActivity(i);
	}

}
