package com.example.monitorapp.service;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.util.Log;

public class WebServiceCall {
	// String NAMESPACE = "http://localhost:8080/jaxws";
    // String METHOD_NAME = "ConsultarListaExcecao";
	
//	StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//	StrictMode.setThreadPolicy(policy);

    
    private static final String URL = "http://localhost:8080/portal-servicos/IServicePortal?wsdl";
	private static final String NAMESPACE = "http://localhost:8080/jaxws";
	private static final String PREFIX = "jax";
	private static final String OPERATION = "ConsultarListaExcecao";
	private static final String SOAP_ACTION = NAMESPACE  + "/consultarListaExcecao";
	
    
    public void recuperarObjetoWS() {
    
        SoapObject Request = new SoapObject(NAMESPACE, OPERATION);
        
	    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
	    envelope.dotNet = false;
	    envelope.setOutputSoapObject(Request);
	    
	    // AndroidHttpTransport androidHttpTransport = new AndroidHttpTransport(URL);
	    HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);
	    try
	    {
	        androidHttpTransport.call(SOAP_ACTION, envelope);
	        SoapObject response = (SoapObject)envelope.getResponse();
	        // String a = Integer.parseInt(response.getProperty(0).toString());
	        String a = response.getProperty(1).toString();
	        Log.i("WS", "===> A: " + a);
	        String b = response.getProperty(2).toString();
	        Log.i("WS", "===> B: " + b);
//	        String c = response.getProperty(3).toString();
	        
	        String x = a + b;
	        Log.i("WS", "===> X: " + x);
//	        TextView tv = (TextView)findViewById(R.id.TextView01);
//	        tv.setText("CategoryId: " +C.CategoryId + " Name: " + C.Name + " Description " + C.Description);
	    }
	    catch(Exception e)
	    {
	    	Log.e("WS", "Exception ... ");
	    	if (e != null) {
	    		Log.e("WS", "Exception Info: " + e.getCause().getMessage());
	    	}
	    }
    }

}
