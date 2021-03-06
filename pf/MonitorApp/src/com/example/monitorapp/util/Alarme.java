package com.example.monitorapp.util;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;

import com.example.monitorapp.service.ConsultarListaExcecaoWS;

@SuppressLint("Wakelock")
public class Alarme extends BroadcastReceiver {    
    
	@Override
    public void onReceive(Context context, Intent intent) {   
        PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);
        PowerManager.WakeLock wl = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK, "");
        wl.acquire();

        // Put here YOUR code.
        // Toast.makeText(context, "Alarm !!!!!!!!!!", Toast.LENGTH_LONG).show();
        
        ConsultarListaExcecaoWS consultarLista = new ConsultarListaExcecaoWS();
		consultarLista.executar(context);

        wl.release();
    }

	public void SetAlarm(Context context, int tempo) {
	    AlarmManager am=(AlarmManager)context.getSystemService(Context.ALARM_SERVICE);
	    Intent i = new Intent(context, Alarme.class);
	    PendingIntent pi = PendingIntent.getBroadcast(context, 0, i, 0);
	    am.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(), 1000 * tempo, pi); // Millisec * Second * Minute
	}
	
	public void CancelAlarm(Context context)
	{
	    Intent intent = new Intent(context, Alarme.class);
	    PendingIntent sender = PendingIntent.getBroadcast(context, 0, intent, 0);
	    AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
	    alarmManager.cancel(sender);
	}
}
