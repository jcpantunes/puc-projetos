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
import android.widget.Button;

import com.example.monitorapp.util.Constantes;
import com.example.monitorapp.util.MonitorService;

/**
 * @author 05163217658
 * 
 */
public class ConfiguracaoActivity extends Activity {
	
	private Intent intentService;
	
	Button btnIniciarServico;
	
	Button btnPararServico;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.configuracao);
		
		 intentService = new Intent(this, MonitorService.class);

		 configurarEventos();
	}
	
	private void configurarEventos() {
		
		final Button btnVoltar = (Button) findViewById(R.id.btnConfiguracaoVoltar);
		btnVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// Log.i("ListarErros", "Voltando para Tela Welcome ...");
				chamarMainActivity();
			}
		});
		
		btnIniciarServico = (Button) findViewById(R.id.configuracaoBtnIniciarServico);
		btnIniciarServico.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("Configuracao", "Iniciando Servico de Notificacao ...");
				iniciarServico();
			}
		});
		
		btnPararServico = (Button) findViewById(R.id.configuracaoBtnPararServico);
		btnPararServico.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("Configuracao", "Finalizando Servico de Notificacao ...");
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
			startService(intentService);
			setVisibilidade(View.INVISIBLE, View.VISIBLE);
			
		} else {
			Log.i("ListarErros2", "Servico ja esta rodando ...");
		}
	}
	
	private void pararServico() {
		if (isServiceRunning(Constantes.MONITOR_SERVICE_PATH)) {
			stopService(intentService);
			setVisibilidade(View.VISIBLE, View.INVISIBLE);
			
		} else {
			Log.i("ListarErros2", "Servico nao esta rodando ...");
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
