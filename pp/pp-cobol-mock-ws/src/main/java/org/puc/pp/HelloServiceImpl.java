package org.puc.pp;

import java.util.List;

import javax.jws.WebService;

import org.puc.pp.bean.Aluno;
import org.puc.pp.bean.Disciplina;
import org.puc.pp.bean.MatriculaAlunoDisciplina;
import org.puc.pp.bean.Nota;
import org.puc.pp.bean.dto.NotaDTO;
import org.puc.pp.bean.dto.TrancamentoDTO;

@WebService(endpointInterface = "org.puc.pp.HelloService")
public class HelloServiceImpl implements HelloService {
    
	public List<Aluno> recuperarAlunos() {
		return Aluno.recuperarAlunos();
	}
	
	public Aluno recuperarAlunoPorMatricula(String matricula) {
		return Aluno.recuperarAlunoPorMatricula(matricula);
	}

	public List<Disciplina> recuperarDisciplinas() {
		return Disciplina.recuperarDisciplinas();
	}
	
	public Disciplina recuperarDisciplinaPorCodigo(String codigo) {
		return Disciplina.recuperarDisciplinaPorCodigo(codigo);
	}
	
	public List<NotaDTO> recuperarNotaAluno (String matriculaAluno, String codigoDisciplina) {
		return Nota.recuperarNotaAluno(matriculaAluno, codigoDisciplina);
	}
	
	public List<NotaDTO> recuperarHistoricoAluno (String matricula) {
		return Nota.recuperarHistoricoAluno(matricula);
	}
	
	public TrancamentoDTO solicitarTrancamento(String matriculaAluno, String codigoDisciplina, String protocolo) {
		return MatriculaAlunoDisciplina.solicitarTrancamento(matriculaAluno, codigoDisciplina, protocolo);
	}
	
	public List<TrancamentoDTO> confirmarSolicitacao() {
		return MatriculaAlunoDisciplina.confirmarSolicitacao();
	}
}
