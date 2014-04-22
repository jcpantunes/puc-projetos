package org.apache.camel.example.cxf.aluno;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.impl.MappedEndpointConfiguration;

public class SuportePersistenciaTrancamentoMatricula {
	
	protected static Map<String, SolicitacaoTrancamentoMatricula> baseTrancamentos;
	
	protected static Map<String, SolicitacaoTrancamentoMatricula> getBaseTrancamentos() {
		if(baseTrancamentos == null)
			baseTrancamentos = new HashMap<String, SolicitacaoTrancamentoMatricula>();
		return baseTrancamentos;
	}
	
	public static void addSolicitacao(String protocoloSolicitacao, SolicitacaoTrancamentoMatricula solicitacao) {
		getBaseTrancamentos().put(protocoloSolicitacao, solicitacao);
	}
	
	public static SolicitacaoTrancamentoMatricula getSolicitacao(String protocoloSolicitacao) {
		return getBaseTrancamentos().get(protocoloSolicitacao);
	}
	
	
	public static void imprimirStatusSolicitacao() {
		for(String protocolo : getBaseTrancamentos().keySet()) {
			SolicitacaoTrancamentoMatricula solicitacao = getBaseTrancamentos().get(protocolo);
			System.out.println("Protocolo trancamento: "
					+ protocolo
					+ "\nAluno: " + solicitacao.getMatriculaAluno()
					+ "\nDisciplina: " + solicitacao.getCodigoDisciplina()
					+ "\nStatus: " + solicitacao.getStatus()
					+ "\n");
		}
	}

}
