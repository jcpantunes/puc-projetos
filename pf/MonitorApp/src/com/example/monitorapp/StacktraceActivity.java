/**
 * 
 */
package com.example.monitorapp;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.monitorapp.dto.ExcecaoCapturadaDTO;
import com.example.monitorapp.provider.ExcecaoCapturadaDAO;
import com.example.monitorapp.provider.MonitorProvider;
import com.example.monitorapp.util.Constantes;

/**
 * @author 05163217658
 * 
 */
public class StacktraceActivity extends Activity {
	
	protected String stacktrace = "";
	
	private final String TAG = "StacktraceActivity";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stacktrace_layout);
		
		final Button btnVoltar = (Button) findViewById(R.id.stacktraceBtnVoltar);
		btnVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i(TAG, "Voltando para Tela Welcome ...");
				chamarListarErroActivity();
			}
		});
		
		Integer id = getIntent().getIntExtra(MonitorProvider.Excecao.EXCECAO_ID_EXCECAO, 0);
		ExcecaoCapturadaDAO dao = new ExcecaoCapturadaDAO();
		ExcecaoCapturadaDTO dto = dao.recuperarErro(this, id);
		
		if (dto != null) {
			WebServiceRecuperaDTOAsync ws = new WebServiceRecuperaDTOAsync(dto);
			ws.execute("");
		}
		
		final TextView txtStacktrace = (TextView) findViewById(R.id.stacktraceTxt);
		txtStacktrace.setText(getStacktrace());

	}
	
	private void chamarListarErroActivity() {
		Intent i = new Intent(this, ListarErroActivity.class);
		startActivity(i);
		finish();
	}
	
	public String getStacktrace() {
		return stacktrace;
	}

	public void setStacktrace(String stacktrace) {
		this.stacktrace = stacktrace;
	}

	private class WebServiceRecuperaDTOAsync extends AsyncTask<String, Integer, Long> {
		
		private ExcecaoCapturadaDTO dto;
		
		public WebServiceRecuperaDTOAsync(ExcecaoCapturadaDTO dto) {
			super();
			this.dto = dto;
		}
	    
		protected Long doInBackground(String... urls) {
	        recuperarObjetoWS();
	        return 1l;
	    }
	
	    protected void onProgressUpdate(Integer... progress) {
	    }
	
	    protected void onPostExecute(Long result) {
	    	final TextView txtStacktrace = (TextView) findViewById(R.id.stacktraceTxt);
			txtStacktrace.setText(stacktrace);
	    }
		
	    public void recuperarObjetoWS() {
	        SoapObject request = new SoapObject(Constantes.NAMESPACE, Constantes.OPERACAO_CONSULTAR_EXCECAO);
		    request.addProperty("arg0", this.dto.getIdExcecao());
	        
	        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		    envelope.dotNet = false;
		    envelope.setOutputSoapObject(request);
		    
		    HttpTransportSE androidHttpTransport = new HttpTransportSE(Constantes.URL_WSDL);
		    
		    String txt = "Excecao Nao Encontrada. Verifique se o WS esta rodando.";
		    try {
		        androidHttpTransport.call(Constantes.NAMESPACE + "/" + Constantes.OPERACAO_CONSULTAR_EXCECAO, envelope);
		        SoapObject body = (SoapObject) envelope.bodyIn;
		        
		        if (body != null && body.getPropertyCount() > 0) {
		        	SoapObject object = (SoapObject) body.getProperty(0);
		        	if (object != null) {
		        		ExcecaoCapturadaDTO soapDTO = ExcecaoCapturadaDTO.parseFromSoapObject(object);
		        		txt = soapDTO.getStacktrace();
		        	}
		        }

		    } catch (Exception e) {
		    	if (e != null) {
		    		Log.e(TAG, "Exception Info: " + e.getCause());
		    	}

		    } finally {
		    	setStacktrace(txt);
		    }
	    }
	}
}
