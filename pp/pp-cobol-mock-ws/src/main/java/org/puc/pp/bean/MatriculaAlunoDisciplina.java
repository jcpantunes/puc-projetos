package org.puc.pp.bean;

import java.util.ArrayList;
import java.util.List;

import org.puc.pp.bean.dto.TrancamentoDTO;

public class MatriculaAlunoDisciplina extends BaseBean {
	
	private static final long serialVersionUID = 1L;

	private String matriculaAluno;
	
	private String codigoDisciplina;
	
	private boolean ativo;
	
	private static List<TrancamentoDTO> listaProtocolos = new ArrayList<TrancamentoDTO>();
	
	public MatriculaAlunoDisciplina() {
	}
	
	public MatriculaAlunoDisciplina(String matriculaAluno, String codigoDisciplina, boolean ativo) {
		this.matriculaAluno = matriculaAluno;
		this.codigoDisciplina = codigoDisciplina;
		this.ativo = ativo;
	}

	public String getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(String matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	private static List<MatriculaAlunoDisciplina> criarLista() {
		List<MatriculaAlunoDisciplina> lista = new ArrayList<MatriculaAlunoDisciplina>();
		lista.add(new MatriculaAlunoDisciplina("0111", "01", true));
		lista.add(new MatriculaAlunoDisciplina("0111", "02", false));
		lista.add(new MatriculaAlunoDisciplina("0111", "03", true));
		lista.add(new MatriculaAlunoDisciplina("0111", "04", false));
		lista.add(new MatriculaAlunoDisciplina("0112", "01", true));
		lista.add(new MatriculaAlunoDisciplina("0112", "02", false));
		lista.add(new MatriculaAlunoDisciplina("0112", "03", false));
		lista.add(new MatriculaAlunoDisciplina("0112", "04", true));
		return lista;
	}
	
	public static TrancamentoDTO solicitarTrancamento(String matriculaAluno, String codigoDisciplina, String protocolo) {
		for (MatriculaAlunoDisciplina mat : criarLista()) {
			if (mat.getMatriculaAluno().equals(matriculaAluno) && mat.getCodigoDisciplina().equals(codigoDisciplina)) {
				TrancamentoDTO dto = new TrancamentoDTO(mat.isAtivo(), protocolo);
				listaProtocolos.add(dto);
				return dto;
			}
		}
		return new TrancamentoDTO(Boolean.FALSE, "");
	}

	public static List<TrancamentoDTO> confirmarSolicitacao() {
		return listaProtocolos;
	}
}
