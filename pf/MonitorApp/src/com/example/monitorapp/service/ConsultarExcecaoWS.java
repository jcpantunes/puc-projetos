package com.example.monitorapp.service;

import org.ksoap2.serialization.SoapObject;

import android.util.Log;

import com.example.monitorapp.dto.ExcecaoDTO;
import com.example.monitorapp.util.AppConstantes;

public class ConsultarExcecaoWS {
	
	public ConsultarExcecaoWS() {
	}
	
	public String executar(Integer idExcecao)  {
		WebServiceCallAsync ws = new WebServiceCallAsync(AppConstantes.OPERACAO_CONSULTAR_EXCECAO, idExcecao.toString());
		ws.execute("");
		try {
			for (int i = 0; i < 10 && ws.getSoapResultado() == null; i++) {
				Thread.sleep(500);
			}
			if (ws.getSoapResultado() != null) {
				// private ExcecaoCapturadaDTO dto;
				SoapObject soapResultado = (SoapObject) ws.getSoapResultado().getProperty(0);
				
				if (soapResultado != null && soapResultado.getProperty(0) != null) {
					ExcecaoDTO soapDTO = ExcecaoDTO.parseFromSoapObject(soapResultado);
					return soapDTO.getStacktrace();
				}
	    		
			}
		} catch (Exception e) {
			Log.e("WS", "Exception Info: " + e.getCause());
		}
		
		return "Excecao Nao Encontrada. Verifique se o WS esta rodando.";
	}
}
