package com.example.monitorapp.service;

import java.util.List;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.example.monitorapp.dto.ExcecaoCapturadaDTO;
import com.example.monitorapp.provider.ExcecaoCapturadaDAO;
import com.example.monitorapp.util.AppConstantes;
import com.example.monitorapp.util.MonitorNotificacao;

public class WebServiceCallAsync extends AsyncTask<String, Integer, Long> {
	
	private Context context;
	
	public WebServiceCallAsync(Context context) {
		super();
		this.context = context;
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
        SoapObject Request = new SoapObject(AppConstantes.NAMESPACE, AppConstantes.OPERACAO_CONSULTAR_LISTA_EXCECAO);
	    SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
	    envelope.dotNet = false;
	    envelope.setOutputSoapObject(Request);
	    HttpTransportSE androidHttpTransport = new HttpTransportSE(AppConstantes.URL_WSDL);
	    try {
	    	String namespaceOperacao = AppConstantes.NAMESPACE + "/" + AppConstantes.OPERACAO_CONSULTAR_LISTA_EXCECAO;
	        androidHttpTransport.call(namespaceOperacao, envelope);
	        SoapObject body = (SoapObject) envelope.bodyIn;
	        // ConsultarListaExcecaoResponse body = (ConsultarListaExcecaoResponse) envelope.bodyIn;

	        if (body != null && body.getPropertyCount() > 0) {
	        	SoapObject listaWS = (SoapObject) body.getProperty(0);
	        	
	        	ExcecaoCapturadaDAO dao = new ExcecaoCapturadaDAO();
	        	List<ExcecaoCapturadaDTO> lista = dao.recuperarListaErro(context);
	        
	        	for (int i = 0; i < listaWS.getPropertyCount(); i++) {
        			SoapObject obj = (SoapObject) listaWS.getProperty(i);
        			inserirObjeto(obj, lista);
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
    
    private void inserirObjeto(SoapObject object, List<ExcecaoCapturadaDTO> lista) {
    	ExcecaoCapturadaDTO soapDTO = ExcecaoCapturadaDTO.parseFromSoapObject(object);

    	if (!verificarTicket(soapDTO.getTicket(), lista)) {
    		Log.i("AsyncTask", "===========> Novo Ticket: " + soapDTO.getTicket());
    		
    		MonitorNotificacao notificador = new MonitorNotificacao();
    		notificador.gerarNotificacao(context, "Ticket: " + soapDTO.getTicket(), soapDTO.getTipoExcecao());
    		
    		ExcecaoCapturadaDAO dao = new ExcecaoCapturadaDAO();
    		dao.inserirErro(context, soapDTO);
    	}
    }
    
    @SuppressLint("DefaultLocale")
	private boolean verificarTicket(String ticket, List<ExcecaoCapturadaDTO> lista) {
    	if (lista != null && lista.size() > 0) {
	    	for (ExcecaoCapturadaDTO dto : lista) {
	    		if (ticket.toLowerCase().equalsIgnoreCase(dto.getTicket().toLowerCase())) {
	    			return true;
	    		}
	    	}
    	}	
    	return false;
    }
    
	
}
