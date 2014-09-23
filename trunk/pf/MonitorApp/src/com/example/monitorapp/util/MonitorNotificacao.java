package com.example.monitorapp.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import com.example.monitorapp.R;
import com.example.monitorapp.activity.ListarErroActivity;

public class MonitorNotificacao {
	
	public MonitorNotificacao() {
	}
	
	public void gerarNotificacao(Context context, String titulo, String mensagem) {
		String msgBarra = "MonitorApp: Você recebeu uma mensagem ...";
		criarNotificacao(context, msgBarra, titulo, mensagem, ListarErroActivity.class);
	}

	private void criarNotificacao(Context context,String msgBarra, String titulo, String msg, Class activity) {
		NotificationManager nm = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
		PendingIntent p = PendingIntent.getActivity(context, 0, new Intent(context, activity), 0);

		Notification n = new Notification(R.drawable.abc_ab_bottom_solid_dark_holo, msgBarra, System.currentTimeMillis());
		n.flags |= Notification.FLAG_AUTO_CANCEL;
		n.setLatestEventInfo(context, titulo, msg, p);
		n.vibrate = new long[] { 100, 250, 100, 500 };

		nm.notify(R.string.app_name, n);
	}

}
