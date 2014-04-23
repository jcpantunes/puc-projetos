package com.example.monitorapp.util;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MonitorService extends Service {

	Alarme alarm = new Alarme();

	public void onCreate() {
		super.onCreate();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		alarm.SetAlarm(MonitorService.this);
		return START_STICKY;
	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}
	
	@Override
	public void onDestroy() {
		alarm.CancelAlarm(MonitorService.this);
		super.onDestroy();
	}
}
