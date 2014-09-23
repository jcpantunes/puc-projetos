package com.example.monitorapp.service;

import java.util.ArrayList;
import java.util.List;

import org.ksoap2.serialization.SoapObject;

import android.content.Context;
import android.util.Log;

import com.example.monitorapp.dto.ExcecaoDTO;
import com.example.monitorapp.dto.ExcecaoHistoricoDTO;
import com.example.monitorapp.provider.ExcecaoDAO;
import com.example.monitorapp.provider.ExcecaoHistoricoDAO;
import com.example.monitorapp.util.AppConstantes;
import com.example.monitorapp.util.MonitorNotificacao;

public class ConsultarListaExcecaoWS {
	
	public ConsultarListaExcecaoWS() {
	}
	
	public void executar(Context context)  {
		ExcecaoHistoricoDAO excHistoricoDAO = new ExcecaoHistoricoDAO();
		ExcecaoHistoricoDTO excHistoricoDTO = excHistoricoDAO.listarUltimo(context);

		WebServiceCallAsync ws = null;
		if(excHistoricoDTO != null) {
			ws = new WebServiceCallAsync(AppConstantes.OPERACAO_CONSULTAR_LISTA_EXCECAO_MAIOR_ID, 
					excHistoricoDTO.getIdExcecao().toString());
		} else {
			ws = new WebServiceCallAsync(AppConstantes.OPERACAO_CONSULTAR_LISTA_EXCECAO);
		}
		ws.execute("");
		
		try {
			for (int i = 0; i < 10 && ws.getSoapResultado() == null; i++) {
				Thread.sleep(500);
			}
			if (ws.getSoapResultado() != null) {
				List<ExcecaoDTO> lista = recuperarLista(context, ws.getSoapResultado());
				
				if(lista.size() > 0) {
					ExcecaoHistoricoDAO dao = new ExcecaoHistoricoDAO();
					dao.inserir(context, ExcecaoHistoricoDTO.parseFromExcecaoDTO(lista.get(lista.size()-1)));
				
					inserirListaExcecao(context, lista);
				}
				
			}
		} catch (Exception e) {
			Log.e("WS", "Exception Info: " + e.getCause());
		}
	}
	
	private List<ExcecaoDTO> recuperarLista(Context context, SoapObject soapResultado) {
		List<ExcecaoDTO> lista = new ArrayList<ExcecaoDTO>();
    	for (int i = 0; i < soapResultado.getPropertyCount(); i++) {
			SoapObject objeto = (SoapObject) soapResultado.getProperty(i);
			lista.add(ExcecaoDTO.parseFromSoapObject(objeto));
   	}
    	return lista;
	}
	
    
    private void inserirListaExcecao(Context context, List<ExcecaoDTO> lista) {
    	ExcecaoDAO dao = new ExcecaoDAO();
    	for (ExcecaoDTO dto : lista) {
			Log.i("AsyncTask", "===========> Novo Ticket: " + dto.getTicket());
			
			MonitorNotificacao notificador = new MonitorNotificacao();
			notificador.gerarNotificacao(context, "Ticket: " + dto.getTicket(), dto.getTipoExcecao());
			
			dao.inserirErro(context, dto);
    	}
    }
    
//    @SuppressLint("DefaultLocale")
//	private boolean verificarTicket(String ticket, List<ExcecaoDTO> lista) {
//    	if (lista != null && lista.size() > 0) {
//	    	for (ExcecaoDTO dto : lista) {
//	    		if (ticket.toLowerCase().equalsIgnoreCase(dto.getTicket().toLowerCase())) {
//	    			return true;
//	    		}
//	    	}
//    	}	
//    	return false;
//    }
    
	
}
