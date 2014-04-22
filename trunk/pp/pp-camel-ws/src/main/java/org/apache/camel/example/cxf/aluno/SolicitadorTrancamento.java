package org.apache.camel.example.cxf.aluno;

import org.apache.camel.example.cxf.CamelRouteClient;

public class SolicitadorTrancamento implements Runnable {
	
	protected String matricula;
	
	protected String codigoDisciplina;
	
	public SolicitadorTrancamento() {
	}
	
	public SolicitadorTrancamento(String matricula, String codigoDisciplina)
	{
		this.matricula = matricula;
		this.codigoDisciplina  = codigoDisciplina;
	}
	
	public void solicitarTrancamento() {
		CamelService service = CamelRouteClient.createCXFClient();
		SolicitacaoTrancamentoMatriculaWSDTO resultadoTrancamento = service.solicitarTrancamento(this.matricula, this.codigoDisciplina);
		String mensagem = "A solicitação de trancamento de matrícula aluno " 
		+ this.matricula 
		+ " da disciplina " 
		+ this.codigoDisciplina + " ";
		if(Boolean.valueOf(resultadoTrancamento.getSolicitacaoValida())) {
			mensagem += "foi submetida a secretaria acadêmica.";
			SuportePersistenciaTrancamentoMatricula.addSolicitacao(resultadoTrancamento.getProtocoloSolicitacao(), 
					new SolicitacaoTrancamentoMatricula(matricula, codigoDisciplina));
		}
		else
			mensagem += " é inválida pois o aluno não está ativo na mesma.";
		System.out.println(mensagem);
	}

	@Override
	public void run() {
		this.solicitarTrancamento();
	}
}
