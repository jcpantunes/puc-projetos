package com.puc.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.puc.dominio.Funcionario;

@XmlRootElement(name = "Funcionario", namespace = "http://localhost:8080/jaxws/dominio/Funcionario")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Funcionario", namespace = "http://localhost:8080/jaxws/dominio/Funcionario")
public class FuncionarioDTO extends BaseBeanDTO {
	
	private static final long serialVersionUID = 1L;

	@XmlElement(name="Codigo", required=true, nillable=true)
	private Integer codigo;
	
	@XmlElement(name="Nome", required=true, nillable=true)
	private String nome;
	
	public FuncionarioDTO() {
	}
	
	public FuncionarioDTO(Integer id, Integer codigo, String nome) {
		this.setId(id);
		this.codigo = codigo;
		this.nome = nome;
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
	
	public static FuncionarioDTO parserFromFuncionario(Funcionario funcionario) {
		FuncionarioDTO dto = new FuncionarioDTO();
		dto.setId (funcionario.getId());
		dto.codigo = funcionario.getCodigo();
		dto.nome = funcionario.getNome();
		return dto;
	}
	
	public static List<FuncionarioDTO> parserFromFuncionario(List<Funcionario> lista) {
		List<FuncionarioDTO> listaRetorno = new ArrayList<FuncionarioDTO>();
		for (Funcionario funcionario : lista) {
			listaRetorno.add(parserFromFuncionario(funcionario));
		}
		return listaRetorno;
	}
}
