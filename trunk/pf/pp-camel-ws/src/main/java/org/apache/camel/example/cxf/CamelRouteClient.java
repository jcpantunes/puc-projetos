/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.example.cxf;

import org.apache.camel.example.cxf.aluno.AlunoWSDTO;
import org.apache.cxf.frontend.ClientProxyFactoryBean;

public class CamelRouteClient {

	private static final String URL = "http://192.168.0.106:8080/pp-camel-ws/webservices/camel";

	public static CamelService createCXFClient() {
		// we use CXF to create a client for us as its easier than JAXWS and
		// works
		ClientProxyFactoryBean factory = new ClientProxyFactoryBean();
		factory.setServiceClass(CamelService.class);
		factory.setAddress(URL);
		return (CamelService) factory.create();
	}

	public static void main(String[] args) throws Exception {
		CamelRouteClient client = new CamelRouteClient();
		
		// client.runTesteRecuperarAlunoPorMatricula();
		client.runTesteRecuperarRespostaTeste();
	}
	
	protected void runTesteRecuperarAlunoPorMatricula() throws Exception {
		// create the webservice client and send the request
		CamelService client = createCXFClient();
	
		AlunoWSDTO aluno = client.recuperarAlunoPorMatricula("0111");
		System.out.println("==> " + aluno.getNome());
	}
	
	protected void runTesteRecuperarRespostaTeste() throws Exception {
		// create the webservice client and send the request
		CamelService client = createCXFClient();
	
//		String teste = client.recuperarRespostaTeste();
//		System.out.println("==> " + teste);
		
		client.consultarListaExcecao();
	}

//	protected void runTesteConsultarNotas() throws Exception {
//		// create the webservice client and send the request
//		CamelService client = createCXFClient();
//
//		NotaWSDTO nota = client.recuperarNotaAluno("0111", "01");
//		System.out.println(nota.getAluno() + " : " + nota.getDisciplina()
//			+ " : " + nota.getNota());
//	}
//	
//	protected void runTesteHistoricoAluno() throws Exception {
//		// create the webservice client and send the request
//		CamelService client = createCXFClient();
//
//		ListaNotaWSDTO lista = client.recuperarHistoricoAluno("0111");
//		for (NotaWSDTO nota : lista.getLista()) {
//			System.out.println(nota.getAluno() + " : " + nota.getDisciplina()
//					+ " : " + nota.getNota());
//		}
//	}
//	
//	protected void runTesteTrancamento() throws InterruptedException {
//		Thread trancamentoAsync1 = new Thread(new SolicitadorTrancamento("0111", "01"));
//		trancamentoAsync1.start();
//		Thread trancamentoAsync2 = new Thread(new SolicitadorTrancamento("0111", "02"));
//		trancamentoAsync2.start();
//		Thread trancamentoAsync3 = new Thread(new SolicitadorTrancamento("0111", "03"));
//		trancamentoAsync3.start();
//		
//		trancamentoAsync1.join();
//		trancamentoAsync2.join();
//		trancamentoAsync3.join();
//	}
//
//	protected void runTesteConfirmarTrancamento() throws InterruptedException {
//		Thread servicoPoolingConfirmacaoTrancamentos = 
//				new Thread(new PoolingConfirmacaoTrancamentos(createCXFClient()));
//		servicoPoolingConfirmacaoTrancamentos.start();
//	}
	
}