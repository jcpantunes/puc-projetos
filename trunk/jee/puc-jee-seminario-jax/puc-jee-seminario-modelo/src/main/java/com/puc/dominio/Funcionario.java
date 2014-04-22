package com.puc.dominio;

import java.io.ByteArrayOutputStream;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

@Entity
@Table(name="Funcionario")
@AttributeOverride(name = "id", column = @Column(name = "id_funcionario", nullable = false))
public class Funcionario extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="codigo")
	private Integer codigo;
	
	@Column(name="nome")
	private String nome;
	
	@OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
    private List<Tarefa> listaTarefa;
	
	public Funcionario() {
	}
	
	public Funcionario(Integer codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Tarefa> getListaTarefa() {
		return listaTarefa;
	}
	
	public void setListaTarefa(List<Tarefa> listaTarefa) {
		this.listaTarefa = listaTarefa;
	}
	
	public String toXmlString() {
		try {
			JAXBContext context = JAXBContext.newInstance(Funcionario.class);
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			ByteArrayOutputStream b = new ByteArrayOutputStream();
			m.marshal(this, b);
			return b.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
