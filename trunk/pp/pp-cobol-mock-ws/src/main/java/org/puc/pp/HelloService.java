package org.puc.pp;

import java.util.List;

import javax.jws.WebService;

import org.puc.pp.bean.Aluno;
import org.puc.pp.bean.Disciplina;
import org.puc.pp.bean.dto.NotaDTO;
import org.puc.pp.bean.dto.TrancamentoDTO;

@WebService
public interface HelloService {
    
	public List<Aluno> recuperarAlunos();
	
	public Aluno recuperarAlunoPorMatricula(String matricula);

	public List<Disciplina> recuperarDisciplinas();
	
	public Disciplina recuperarDisciplinaPorCodigo(String codigo);
	
	public List<NotaDTO> recuperarNotaAluno(String matriculaAluno, String codigoDisciplina);
	
	public List<NotaDTO> recuperarHistoricoAluno(String matricula);
	
	public TrancamentoDTO solicitarTrancamento(String matriculaAluno, String codigoDisciplina, String protocolo);
	
	public List<TrancamentoDTO> confirmarSolicitacao();
	
}
