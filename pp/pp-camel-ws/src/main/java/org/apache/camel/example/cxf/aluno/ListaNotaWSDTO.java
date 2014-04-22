package org.apache.camel.example.cxf.aluno;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListaNotaWSDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<NotaWSDTO> lista;
	
	public ListaNotaWSDTO() {
		lista = new ArrayList<NotaWSDTO>();
	}
	
	public List<NotaWSDTO> getLista() {
		return lista;
	}
	
	public void setLista(List<NotaWSDTO> lista) {
		this.lista = lista;
	}

}
