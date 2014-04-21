package org.puc.acn.dominio;

public class Pessoa extends BaseBean {

	private int codigo;
	
	private String nome;
	
	public Pessoa() {
	}
	
	public Pessoa (int id, int codigo, String nome) {
		this.setId(id);
		this.codigo = codigo;
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
