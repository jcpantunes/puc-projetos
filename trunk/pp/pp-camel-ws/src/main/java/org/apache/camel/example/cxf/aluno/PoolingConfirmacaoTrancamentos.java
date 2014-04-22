package org.apache.camel.example.cxf.aluno;

import java.util.Date;

public class PoolingConfirmacaoTrancamentos implements Runnable {

	public void confirmarTrancamentos() throws InterruptedException {
		while(true){
			Thread confirmarAsync = new Thread(new ConfirmadorTrancamentoMatricula());
			confirmarAsync.start();
			System.out.println("Resultado trancamentos verificação as " + new Date() + ": ");
			SuportePersistenciaTrancamentoMatricula.imprimirStatusSolicitacao();
			Thread.sleep(2000);
		}
	}
	
	@Override
	public void run() {
		
		try {
			this.confirmarTrancamentos();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
