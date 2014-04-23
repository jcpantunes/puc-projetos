/**
 * 
 */
package com.example.appexemplo;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author julio
 *
 */
public class ExemploExecutaNotificacao extends Activity {

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        nm.cancel(R.string.app_name);
        TextView text = new TextView(this);
        text.setText("Usuário selecionou a notificação");
        setContentView(text);
    }

}
