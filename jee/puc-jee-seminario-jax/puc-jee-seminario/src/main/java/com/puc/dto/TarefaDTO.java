package com.puc.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.puc.dominio.Tarefa;

@XmlRootElement(name="Tarefa", namespace="http://localhost:8080/jaxws/dominio/Tarefa")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Tarefa", namespace = "http://localhost:8080/jaxws/dominio/Tarefa")
public class TarefaDTO extends BaseBeanDTO {
	
	private static final long serialVersionUID = 1L;

	@XmlElement(name="Codigo", required=true, nillable=true)
    private Integer codigo;

	@XmlElement(name="Nome", required=false, nillable=false)
    private String nome;
    
	@XmlElement(name="Data", required=true, nillable=false)
    private String data;
	
    public TarefaDTO() {
	}
    
    public TarefaDTO(int codigo, String nome, String data) {
    	this.codigo = codigo;
    	this.nome = nome;
    	this.data = data;
	}
    
    public Integer getCodigo() {
		return codigo;
	}
    
    public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getData() {
		return data;
	}
    
    public void setData(String data) {
		this.data = data;
	}
    
	public static TarefaDTO parserFromTarefa(Tarefa tarefa) {
		TarefaDTO dto = new TarefaDTO();
		dto.setId(tarefa.getId());
		dto.codigo = tarefa.getCodigo();
		dto.nome = tarefa.getNome();
		dto.data = tarefa.getData();
		return dto;
	}
	
	public static List<TarefaDTO> parserFromTarefa(List<Tarefa> lista) {
		List<TarefaDTO> listaRetorno = new ArrayList<TarefaDTO>();
		for (Tarefa tarefa : lista) {
			listaRetorno.add(parserFromTarefa(tarefa));
		}
		return listaRetorno;
	}

    
}
