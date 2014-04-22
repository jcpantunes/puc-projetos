package puc.pf.portal.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import puc.pf.portal.domain.Aluno;
import puc.pf.portal.util.Constantes;

@XmlRootElement(name=Constantes.ALUNO, namespace=Constantes.NAMESPACE + Constantes.DOMINIO_ALUNO)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name=Constantes.ALUNO, namespace=Constantes.NAMESPACE + Constantes.DOMINIO_ALUNO)
public class AlunoDTO extends BaseBeanDTO {
	
	private static final long serialVersionUID = 1L;

	@XmlElement(name="Nome", required=true, nillable=true)
	private String nome;
	
	@XmlElement(name="Matricula", required=true, nillable=true)
	private Long matricula;
	
	public AlunoDTO() {
	}
	
	public AlunoDTO(Long id, String nome, Long matricula) {
		this.setId(id);
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
	
	public static AlunoDTO parserFromAluno(Aluno objeto) {
		AlunoDTO dto = new AlunoDTO();
		dto.setId(objeto.getId());
		dto.nome = objeto.getNome();
		dto.matricula = objeto.getMatricula();
		return dto;
	}
	
	public static List<AlunoDTO> parserFromAluno(List<Aluno> lista) {
		List<AlunoDTO> listaRetorno = new ArrayList<AlunoDTO>();
		for (Aluno objeto : lista) {
			listaRetorno.add(parserFromAluno(objeto));
		}
		return listaRetorno;
	}
}
