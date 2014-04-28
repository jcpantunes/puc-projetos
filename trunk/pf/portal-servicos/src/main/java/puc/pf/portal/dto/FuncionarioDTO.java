package puc.pf.portal.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import puc.pf.portal.domain.Funcionario;
import puc.pf.portal.util.Constantes;

@XmlRootElement(name=Constantes.FUNCIONARIO, namespace=Constantes.NAMESPACE + Constantes.DOMINIO_FUNCIONARIO)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name=Constantes.FUNCIONARIO, namespace=Constantes.NAMESPACE + Constantes.DOMINIO_FUNCIONARIO)
public class FuncionarioDTO extends BaseBeanDTO {
	
	private static final long serialVersionUID = 1L;

	@XmlElement(name="Nome", required=true, nillable=true)
	private String nome;
	
	@XmlElement(name="Matricula", required=true, nillable=true)
	private Long matricula;
	
	public FuncionarioDTO() {
	}
	
	public FuncionarioDTO(Long id, String nome, Long matricula) {
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
	
	public static FuncionarioDTO parserFromFuncionario(Funcionario objeto) {
		FuncionarioDTO dto = new FuncionarioDTO();
		dto.setId(objeto.getId());
		dto.nome = objeto.getNome();
		dto.matricula = objeto.getMatricula();
		return dto;
	}
	
	public static List<FuncionarioDTO> parserFromFuncionario(List<Funcionario> lista) {
		List<FuncionarioDTO> listaRetorno = new ArrayList<FuncionarioDTO>();
		for (Funcionario objeto : lista) {
			listaRetorno.add(parserFromFuncionario(objeto));
		}
		return listaRetorno;
	}
}
