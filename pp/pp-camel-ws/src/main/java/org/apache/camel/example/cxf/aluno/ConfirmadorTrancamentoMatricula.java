package org.apache.camel.example.cxf.aluno;

import org.apache.camel.example.cxf.CamelRouteClient;

public class ConfirmadorTrancamentoMatricula implements Runnable {

	public void confirmarTrancamentos() {
		CamelService service = CamelRouteClient.createCXFClient();
		ListaResultadoTrancamentoMatriculaWSDTO listaResultadoTrancamento = service.confirmarSolicitacao();
		
		for(ResultadoTrancamentoMatriculaWSDTO resultadoTrancamento : listaResultadoTrancamento.getLista()) {
			StatusSolicitacaoTrancamentoMatricula status;
			if(resultadoTrancamento.getResultadoTrancamento().equals("true")) {
				status = StatusSolicitacaoTrancamentoMatricula.APROVADA;
			}
			else {
				status = StatusSolicitacaoTrancamentoMatricula.REJEITADA;
			}
			SolicitacaoTrancamentoMatricula solicitacao = SuportePersistenciaTrancamentoMatricula.getSolicitacao(resultadoTrancamento.getProtocoloSolicitacao());
			if (solicitacao != null) {
				solicitacao.setStatus(status);
			}
		}

	}
	
	@Override
	public void run() {
		this.confirmarTrancamentos();

	}

}
