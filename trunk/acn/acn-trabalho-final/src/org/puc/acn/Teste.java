package org.puc.acn;

import java.util.List;
import java.util.Scanner;

import org.puc.acn.dao.PessoaDAO;
import org.puc.acn.dominio.Pessoa;
import org.puc.acn.negocio.OrdenarSequenciaBC;

public class Teste {
	
	public static void main(String[] args) {
		System.out.println("");
		
		Scanner entrada = new Scanner (System.in);
		System.out.println ("Digite o tamanho (entre 0 e 2100): ");  
		Integer tamanho = Integer.parseInt(entrada.nextLine());  
		
		long t1 = System.currentTimeMillis();
		
		PessoaDAO dao = new PessoaDAO();

		System.out.println("=============================================="); 
		System.out.println(" => Salvando registros no banco .... ");
		dao.preencherTabela(tamanho);
		
		System.out.println("=============================================="); 
		System.out.println(" => Recuperando registros do banco de dados .... ");
		List<Pessoa> lista = dao.recuperar();
		
		System.out.println("=============================================="); 
		System.out.println(" => Ordenando registros ..... ");
		
		OrdenarSequenciaBC ordenarBC = new OrdenarSequenciaBC();
		ordenarBC.ordenarListaPessoas(lista);
		
		long tempoTotal = System.currentTimeMillis() - t1;
	
//		for (Pessoa p : lista) {
//			System.out.println(p.getCodigo() + " - " + p.getNome());
//		}
		System.out.println("=============================================="); 
		System.out.println(" => Numero de registros considerados: " + lista.size());
		
		
		System.out.println("=============================================="); 
		System.out.println(" => Tempo de Insert: " + dao.getTempoInsert());
		System.out.println(" => Tempo de Select: " + dao.getTempoSelect());
		System.out.println(" => Tempo de Processamento: " + ordenarBC.getTempoOrdenacao());
		System.out.println(" => Tempo Total: " + tempoTotal);
		System.out.println("==============================================");
		
		
	}
}
