package com.puc.dominio;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Tarefa")
@AttributeOverride(name = "id", column = @Column(name = "id_tarefa", nullable = false))
public class Tarefa extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	@Column(name="codigo")
    private Integer codigo;

	@Column(name="nome")
    private String nome;
    
	@Column(name="Data")
    private String data;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_funcionario")
	private Funcionario funcionario;
    
    public Tarefa() {
	}
    
    public Tarefa(int codigo, String nome, String data, Funcionario funcionario) {
    	this.codigo = codigo;
    	this.nome = nome;
    	this.data = data;
    	this.funcionario = funcionario;
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
    
    public Funcionario getFuncionario() {
		return funcionario;
	}
    
    public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
    
}
