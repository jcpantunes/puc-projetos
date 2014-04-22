package com.example.monitorapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Log.i("Welcome", "Iniciando tela Welcome ...");
		Intent i = new Intent(this, WelcomeActivity.class);
		startActivity(i);

	}

}
