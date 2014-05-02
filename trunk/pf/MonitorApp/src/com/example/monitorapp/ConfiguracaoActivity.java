/**
 * 
 */
package com.example.monitorapp;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.monitorapp.util.Constantes;
import com.example.monitorapp.util.MonitorService;

/**
 * @author 05163217658
 * 
 */
public class ConfiguracaoActivity extends Activity {
	
	private Intent intentService;
	
	private Button btnIniciarServico;
	
	private Button btnPararServico;
	
	private final String TAG = "ConfiguracaoActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.configuracao_layout);
		
		intentService = new Intent(this, MonitorService.class);
		 
		Integer[] array_spinner = new Integer[9];
		array_spinner[0]=10;
		array_spinner[1]=20;
		array_spinner[2]=30;
		array_spinner[3]=60;
		array_spinner[4]=120;
		array_spinner[5]=300;
		array_spinner[6]=600;
		array_spinner[7]=1800;
		array_spinner[8]=3600;
		
		Spinner s = (Spinner) findViewById(R.id.configuracaoLstTempo);
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, array_spinner);
		s.setAdapter(adapter);

		configurarEventos();
	}
	
	private void configurarEventos() {
		
		final Button btnVoltar = (Button) findViewById(R.id.btnConfiguracaoVoltar);
		btnVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				chamarMainActivity();
			}
		});
		
		btnIniciarServico = (Button) findViewById(R.id.configuracaoBtnIniciarServico);
		btnIniciarServico.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i(TAG, "Iniciando Servico de Notificacao ...");
				iniciarServico();
			}
		});
		
		btnPararServico = (Button) findViewById(R.id.configuracaoBtnPararServico);
		btnPararServico.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i(TAG, "Finalizando Servico de Notificacao ...");
				pararServico();
			}
		});
		
		
		if (isServiceRunning(Constantes.MONITOR_SERVICE_PATH)) {
			setVisibilidade(View.INVISIBLE, View.VISIBLE);

		} else {
			setVisibilidade(View.VISIBLE, View.INVISIBLE);
			
		}
		
	}
	
	private void iniciarServico() {
		if (!isServiceRunning(Constantes.MONITOR_SERVICE_PATH)) {
			Spinner s = (Spinner) findViewById(R.id.configuracaoLstTempo);
			Integer tempo = (Integer) s.getSelectedItem();
			if (tempo == null || tempo == 0) {
				tempo = 10;
			}
			intentService.putExtra(MonitorService.TEMPO, tempo);
			startService(intentService);
			
			setVisibilidade(View.INVISIBLE, View.VISIBLE);
			
		} else {
			Log.i(TAG, "Servico ja esta rodando ...");
		}
	}
	
	private void pararServico() {
		if (isServiceRunning(Constantes.MONITOR_SERVICE_PATH)) {
			stopService(intentService);
			setVisibilidade(View.VISIBLE, View.INVISIBLE);
			
		} else {
			Log.i(TAG, "Servico nao esta rodando ...");
		}
	}
	
	private void chamarMainActivity() {
		Intent i = new Intent(this, MainActivity.class);
		startActivity(i);
		finish();
	}
	
    private boolean isServiceRunning(String service) {
        ActivityManager manager = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
        for (RunningServiceInfo runService : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (service.equals(runService.service.getClassName())) {
                return true;
            }
        }
        return false;
    }
    
    private void setVisibilidade(int iniciar, int parar) {
    	btnIniciarServico.setVisibility(iniciar);
		btnPararServico.setVisibility(parar);
    }
	
}
