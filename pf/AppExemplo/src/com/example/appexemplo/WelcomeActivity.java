/**
 * 
 */
package com.example.appexemplo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * @author 05163217658
 * 
 */
public class WelcomeActivity extends Activity {

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);

		final Button button = (Button) findViewById(R.id.welcome_ok_button);
		button.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("Welcome", "Encerrando tela Welcome ...");
				finish();
			}
		});
	}

}
