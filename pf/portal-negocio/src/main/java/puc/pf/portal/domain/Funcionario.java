package puc.pf.portal.domain;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "id_funcionario", nullable = false))
public class Funcionario extends BaseBean {

	private static final long serialVersionUID = 1L;
	
	@Column
	private String nome;
	
	@Column
	private Long matricula;
	
	@OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY)
	private List<Tarefa> listaTarefa;
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, Long matricula) {
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

