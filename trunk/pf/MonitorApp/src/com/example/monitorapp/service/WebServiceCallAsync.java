package com.example.monitorapp.service;

import java.util.ArrayList;
import java.util.List;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.os.AsyncTask;
import android.util.Log;

import com.example.monitorapp.util.AppConstantes;

public class WebServiceCallAsync extends AsyncTask<String, Integer, Long> {
	
	private String nomeOperacao = "";
	
	private SoapObject soapResultado = null;
	
	private List<String> listaParametros = new ArrayList<String>();
	
	public WebServiceCallAsync(String nomeOperacao, String... parametros) {
		super();
		this.nomeOperacao = nomeOperacao;
		for (int i=0; i < parametros.length ; i++) {
			listaParametros.add(parametros[i]);
		}
	}
    
	protected Long doInBackground(String... urls) {
        recuperarObjetoWS();
        return 1l;
    }

    protected void onProgressUpdate(Integer... progress) {
    }

    protected void onPostExecute(Long result) {
    }
	
    public void recuperarObjetoWS() {
        SoapObject request = new SoapObject(AppConstantes.NAMESPACE, this.nomeOperacao);
        
        for(int i = 0; i < listaParametros.size(); i++) {
        	request.addProperty("arg"+i, listaParametros.get(i));
        }
        
	    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
	    envelope.dotNet = false;
	    envelope.setOutputSoapObject(request);
	    HttpTransportSE androidHttpTransport = new HttpTransportSE(AppConstantes.URL_WSDL);
	    try {
	    	String namespaceOperacao = AppConstantes.NAMESPACE + "/" + this.nomeOperacao;
	        androidHttpTransport.call(namespaceOperacao, envelope);
	        SoapObject body = (SoapObject) envelope.bodyIn;

	        if (body != null && body.getPropertyCount() > 0) {
	        	this.soapResultado = (SoapObject) body.getProperty(0);
	        }
	    }
	    catch(Exception e)
	    {
	    	if (e != null) {
	    		Log.e("WS", "Exception Info: " + e.getCause());
	    	}
	    }
    }
    
    public SoapObject getSoapResultado() {
		return soapResultado;
	}
    
}
