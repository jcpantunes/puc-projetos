package com.example.monitorapp.service;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.os.AsyncTask;
import android.util.Log;

import com.example.monitorapp.provider.MonitorProvider;
import com.example.monitorapp.util.Constantes;

public class WebServiceCallAsync extends AsyncTask<String, Integer, Long> {
	
	ContentResolver contentResolver;
	
	public WebServiceCallAsync(ContentResolver contentResolver) {
		super();
		this.contentResolver = contentResolver;
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
	        SoapObject response = (SoapObject)envelope.getResponse();
	        
	        if (response != null) {
	        	Long id = Long.parseLong(response.getProperty(0).toString());
	        	String tipoExcecao = response.getProperty(1).toString();
	        	String stacktrace = response.getProperty(2).toString();
	        	String ticket = response.getProperty(3).toString();
	        	String dataOperacao = response.getProperty(4).toString();
	        	
				ContentValues values = new ContentValues();
				values.put(MonitorProvider.Excecao.EXCECAO_DATA, dataOperacao.toString());
				values.put(MonitorProvider.Excecao.EXCECAO_TIPO, tipoExcecao);
				values.put(MonitorProvider.Excecao.EXCECAO_TICKET, ticket);
				
				this.contentResolver.insert(MonitorProvider.Excecao.CONTENT_URI, values);
	        }
	    }
	    catch(Exception e)
	    {
	    	if (e != null) {
	    		Log.e("WS", "Exception Info: " + e.getCause());
	    	}
	    }
    }

}
