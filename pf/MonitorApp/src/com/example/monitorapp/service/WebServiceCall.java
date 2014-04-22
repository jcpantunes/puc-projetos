package com.example.monitorapp.service;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransport;

public class WebServiceCall {
	String NAMESPACE = "http://localhost:8080/jaxws";
    String METHOD_NAME = "ConsultarListaExcecao";
    String SOAP_ACTION = "http://localhost:8080/jaxws/ConsultarListaExcecao";
    String URL = "http://localhost:8080/portal-servicos/IServicePortal?wsdl";
    
    public void recuperarObjetoWS() {
    
        SoapObject Request = new SoapObject(NAMESPACE, METHOD_NAME);
        
	    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
	    envelope.dotNet = false;
	    envelope.setOutputSoapObject(Request);
	    
	    // AndroidHttpTransport androidHttpTransport = new AndroidHttpTransport(URL);
	    HttpTransport androidHttpTransport = new HttpTransport(URL);
	    try
	    {
	        androidHttpTransport.call(SOAP_ACTION, envelope);
	        SoapObject response = (SoapObject)envelope.getResponse();
	        // String a = Integer.parseInt(response.getProperty(0).toString());
	        String a = response.getProperty(1).toString();
	        String b = response.getProperty(2).toString();
	        String c = response.getProperty(3).toString();
	        
	        String x = a + b + c;
//	        TextView tv = (TextView)findViewById(R.id.TextView01);
//	        tv.setText("CategoryId: " +C.CategoryId + " Name: " + C.Name + " Description " + C.Description);
	    }
	    catch(Exception e)
	    {
	        e.printStackTrace();
	    }
    }

}
