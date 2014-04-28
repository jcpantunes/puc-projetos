/**
 * 
 */
package com.example.monitorapp;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.monitorapp.dto.ExcecaoCapturadaDTO;
import com.example.monitorapp.provider.ExcecaoCapturadaDAO;
import com.example.monitorapp.util.Constantes;

/**
 * @author 05163217658
 * 
 */
public class StacktraceActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.stacktrace);
		
		final Button btnVoltar = (Button) findViewById(R.id.stacktraceBtnVoltar);
		btnVoltar.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Log.i("ListarErros", "Voltando para Tela Welcome ...");
				chamarListarErroActivity();
			}
		});
		
		Integer id = getIntent().getIntExtra("id", 0);
		ExcecaoCapturadaDAO dao = new ExcecaoCapturadaDAO();
		ExcecaoCapturadaDTO dto = dao.recuperarErro(this, id);
		
		WebServiceRecuperaDTOAsync ws = new WebServiceRecuperaDTOAsync(this, dto);
		ws.execute("");
	}
	
	private void chamarListarErroActivity() {
		Intent i = new Intent(this, ListarErroActivity.class);
		startActivity(i);
		finish();
	}


	private class WebServiceRecuperaDTOAsync extends AsyncTask<String, Integer, Long> {
		
		private Context context;
		
		private ExcecaoCapturadaDTO dto;
		
		public WebServiceRecuperaDTOAsync(Context context, ExcecaoCapturadaDTO dto) {
			super();
			this.context = context;
			this.dto = dto;
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
	        SoapObject request = new SoapObject(Constantes.NAMESPACE, Constantes.OPERACAO_CONSULTAR_EXCECAO);
		    request.addProperty("arg0", this.dto.getId());
	        
	        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
		    envelope.dotNet = false;
		    envelope.setOutputSoapObject(request);
		    
		    HttpTransportSE androidHttpTransport = new HttpTransportSE(Constantes.URL_WSDL);
		    try {
		        androidHttpTransport.call(Constantes.NAMESPACE + "/" + Constantes.OPERACAO_CONSULTAR_EXCECAO, envelope);
		        SoapObject body = (SoapObject) envelope.bodyIn;
	
		        if (body != null && body.getPropertyCount() > 0) {
		        	SoapObject object = (SoapObject) body.getProperty(0);
		        	if (object != null) {
		        		ExcecaoCapturadaDTO soapDTO = ExcecaoCapturadaDTO.parseFromSoapObject(object);
		        		final TextView txt = (TextView) findViewById(R.id.stacktraceTxt);
			    		txt.setText(soapDTO.getStacktrace());
		        	} else {
			        	final TextView txt = (TextView) findViewById(R.id.stacktraceTxt);
			    		txt.setText("Excecao Nao Encontrada!");
			        }
		        	
		        } else {
		        	final TextView txt = (TextView) findViewById(R.id.stacktraceTxt);
		    		txt.setText("Excecao Nao Encontrada!");
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
}
