package org.apache.camel.example.cxf.aluno;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListaResultadoTrancamentoMatriculaWSDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ResultadoTrancamentoMatriculaWSDTO> lista;
	
	public ListaResultadoTrancamentoMatriculaWSDTO() {
		lista = new ArrayList<ResultadoTrancamentoMatriculaWSDTO>();
	}
	
	public List<ResultadoTrancamentoMatriculaWSDTO> getLista() {
		return lista;
	}
	
	public void setLista(List<ResultadoTrancamentoMatriculaWSDTO> lista) {
		this.lista = lista;
	}
	
}
