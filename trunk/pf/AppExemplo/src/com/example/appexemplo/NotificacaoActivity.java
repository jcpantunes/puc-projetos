package com.example.appexemplo;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * http://www.felipesilveira.com.br/desenvolvendo-para-android/
 * 
 * @author 05163217658
 * 
 */
public class NotificacaoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.notificacao);
		
		final Button button1 = (Button) findViewById(R.id.btnNotificacaoVoltar);
		button1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				chamarActivity(MainActivity.class);
			}
		});
		
		final Button button2 = (Button) findViewById(R.id.btnCriarNotificacao);
		button2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				gerarNotificacao();
			}
		});
	}
	
	private void gerarNotificacao() {
        // Texto que aparecerá na barra de status (chamada para a notificação)
        String tickerText = "Você recebeu uma mensagem.";
 
        // Detalhes da notificação
        CharSequence titulo = "André";
        CharSequence mensagem = "Exemplo de notificação";
 
        // Exibe a notificação
        criarNotificacao(this, tickerText, titulo, mensagem, ExemploExecutaNotificacao.class);
    }
 
    // Exibe a notificacao
    protected void criarNotificacao(Context context, CharSequence mensagemBarraStatus,
            CharSequence titulo, CharSequence mensagem, Class activity) {
        // Recupera o serviço do NotificationManager
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Notification n = new Notification(R.drawable.abc_ab_bottom_solid_dark_holo, 
        		mensagemBarraStatus, System.currentTimeMillis());
 
        // PendingIntent para executar a Activity se o usuário selecionar a notificação
        PendingIntent p = PendingIntent.getActivity(this, 0, new Intent(this, activity), 0);
 
        // Flag utilizada para remover a notificação da barra de status
        // quando o usuário clicar nela
        n.flags |= Notification.FLAG_AUTO_CANCEL;
 
        // Informações
        n.setLatestEventInfo(this, titulo, mensagem, p);
 
        // Espera 100ms e vibra por 250ms, espera por mais 100ms e vibra por 500ms
        n.vibrate = new long[] { 100, 250, 100, 500 };
 
        // id da notificacao
        nm.notify(R.string.app_name, n);
    }
	 
	
	
	private void chamarActivity(Class clazz) {
		Intent i = new Intent(this, clazz);
		startActivity(i);
		finish();
	}
}
