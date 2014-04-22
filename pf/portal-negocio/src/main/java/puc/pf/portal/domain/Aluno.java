package puc.pf.portal.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Aluno extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	@Column
	private String nome;
	
	@Column
	private Long matricula;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, Long matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Long getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

}

