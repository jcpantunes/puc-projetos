package com.example.monitorapp.service;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.util.Log;

import com.example.monitorapp.ListarErroActivity;
import com.example.monitorapp.R;
import com.example.monitorapp.provider.MonitorProvider;
import com.example.monitorapp.util.Constantes;

public class WebServiceCallAsync extends AsyncTask<String, Integer, Long> {
	
	private Context context;
	
	public WebServiceCallAsync(Context context) {
		super();
		this.context = context;
	}
    
	protected Long doInBackground(String... urls) {
        // int count = urls.length;
        recuperarObjetoWS();
        return 1l;
    }

    protected void onProgressUpdate(Integer... progress) {
        // setProgressPercent(progress[0]);
    }

    protected void onPostExecute(Long result) {
        // showDialog("Downloaded " + result + " bytes");
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	// Log.i("AsyncTask", "===========> Verificação de novas mensagens .....");
    	WebServiceCallAsync taskAsync = new WebServiceCallAsync(context);
    	taskAsync.execute("");
    }
	
    public void recuperarObjetoWS() {
    
        SoapObject Request = new SoapObject(Constantes.NAMESPACE, Constantes.OPERACAO_CONSULTAR_LISTA_EXCECAO);
        
	    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
	    envelope.dotNet = false;
	    envelope.setOutputSoapObject(Request);
	    
	    // AndroidHttpTransport androidHttpTransport = new AndroidHttpTransport(URL);
	    HttpTransportSE androidHttpTransport = new HttpTransportSE(Constantes.URL_WSDL);
	    try
	    {
	        androidHttpTransport.call(Constantes.NAMESPACE + "/" + Constantes.OPERACAO_CONSULTAR_LISTA_EXCECAO,
	        		envelope);
	        //SoapObject response = (SoapObject) envelope.getResponse();
	        SoapObject body = (SoapObject) envelope.bodyIn;
	        if (body != null && body.getPropertyCount() > 0) {
	        	
	        	Cursor mCursor = this.context.getContentResolver().query(
	    				MonitorProvider.Excecao.CONTENT_URI, null, null, null, null);
	        	
	        	for (int i = 0; i < body.getPropertyCount(); i++) {
        			SoapObject obj = (SoapObject) body.getProperty(i);
        			inserirObjeto(obj, mCursor);
	        	}
	        }
	    }
	    catch(Exception e)
	    {
	    	if (e != null) {
	    		Log.e("WS", "Exception Info: " + e.getCause());
	    	}
	    }
    }
    
    private void inserirObjeto(SoapObject response, Cursor mCursor) {
    	Long id = Long.parseLong(response.getProperty(0).toString());
    	String tipoExcecao = response.getProperty(1).toString();
    	String stacktrace = response.getProperty(2).toString();
    	String ticket = response.getProperty(3).toString();
    	String dataOperacao = response.getProperty(4).toString();
    	
    	boolean persistir = true;
    	if (mCursor != null) {
    		while (mCursor.moveToNext()) { //id,ticket,data,tipo
    			String ticketDB = mCursor.getString(1);
    			if (ticketDB.toLowerCase().equalsIgnoreCase(ticket.toLowerCase())) {
    				persistir = false;
    				break;
    			}
    		}
    	}

    	if (persistir) {
    		gerarNotificacao("Ticket: " + ticket, tipoExcecao);
    		Log.i("AsyncTask", "===========> Novo Ticket: " + ticket);
    		
			ContentValues values = new ContentValues();
			values.put(MonitorProvider.Excecao.EXCECAO_DATA, dataOperacao.toString());
			values.put(MonitorProvider.Excecao.EXCECAO_TIPO, tipoExcecao);
			values.put(MonitorProvider.Excecao.EXCECAO_TICKET, ticket);
			this.context.getContentResolver().insert(MonitorProvider.Excecao.CONTENT_URI, values);
    	}
    }
    
	private void gerarNotificacao(String titulo, String mensagem) {
		// Texto que aparecerá na barra de status (chamada para a notificação)
		String tickerText = "Você recebeu uma mensagem ...";

		// Exibe a notificação
		criarNotificacao(context, tickerText, titulo, mensagem,
				ListarErroActivity.class);
	}

	// Exibe a notificacao
	private void criarNotificacao(Context context,
			CharSequence mensagemBarraStatus, CharSequence titulo,
			CharSequence mensagem, Class activity) {
		// Recupera o serviço do NotificationManager
		NotificationManager nm = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
		Notification n = new Notification(
				R.drawable.abc_ab_bottom_solid_dark_holo, mensagemBarraStatus,
				System.currentTimeMillis());

		// PendingIntent para executar a Activity se o usuário \oselecionar a
		// notificação
		PendingIntent p = PendingIntent.getActivity(context, 0, new Intent(context,
				activity), 0);

		// Flag utilizada para remover a notificação da barra de status
		// quando o usuário clicar nela
		n.flags |= Notification.FLAG_AUTO_CANCEL;

		// Informações
		n.setLatestEventInfo(context, titulo, mensagem, p);

		// Espera 100ms e vibra por 250ms, espera por mais 100ms e vibra por
		// 500ms
		n.vibrate = new long[] { 100, 250, 100, 500 };

		// id da notificacao
		nm.notify(R.string.app_name, n);
	}
}
