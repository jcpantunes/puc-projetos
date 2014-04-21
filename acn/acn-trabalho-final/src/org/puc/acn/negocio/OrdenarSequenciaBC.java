package org.puc.acn.negocio;

import java.util.List;

import org.puc.acn.dominio.Pessoa;

public class OrdenarSequenciaBC {
	
	private Long tempoOrdenacao = 0l;
	
	public Integer[] ordenarSequencia (Integer inicio, Integer fim) throws Exception {
		Integer[] sequencia = null; 
		if (inicio > 0 && fim > 0 && inicio != fim) {
			sequencia = new Integer[Math.abs(fim-inicio) + 1];
			
			if (inicio > fim) {
				for (int index = 0, i = inicio ; i >= fim ; index++, i--) {
					sequencia[index] = i;
				}
			} else {
				for (int index = 0, i = inicio; i <= fim ; index++, i++) {
					sequencia[index] = i;
				}
			}
			// imprimirSequencia(sequencia);
			sortByBolha(sequencia);

		} else {
			throw new Exception("Somente numeros positivos podem ser inseridos e os numeros de inicio e fim devem ser diferentes");
		}
		return sequencia;
	}
	
	private void sortByBolha(Integer[] sequencia) {
	    int temp;
	    boolean houveTroca;
	    do {
	    	houveTroca = false;
	        for ( int i=0; i < sequencia.length - 1 ; i++ ){
	            if (sequencia[i] > sequencia [i+1]){
	                temp = sequencia[i];
	                sequencia[i] = sequencia[i+1];
	                sequencia[i+1] = temp;
	                houveTroca = true;
	            }
	        }
	    } while (houveTroca);
	}
	
	public void ordenarListaPessoas(List<Pessoa> lista) {
		long t1 = System.currentTimeMillis();
	    int contador = 1;
	    do {
	        for ( int i=0; i < lista.size() - 1 ; i++ ){
	            if (lista.get(i).getCodigo() > lista.get(i+1).getCodigo()){
	                Pessoa temp1 = lista.get(i);
	                Pessoa temp2 = lista.get(i+1);
	                
	                lista.remove(i);
	                lista.add(i, temp2);
	                
	                lista.remove(i+1);
	                lista.add(i+1, temp1);
	            }
	        }
	        contador++;
	    } while (contador < lista.size());
	    tempoOrdenacao = System.currentTimeMillis() - t1;
	}
	
	public Long getTempoOrdenacao() {
		return tempoOrdenacao;
	}
	
//	private void imprimirSequencia(Integer[] seq) {
//		for (int i = 0 ; i < seq.length ; i++) {
//			System.out.print(seq[i] + " ");
//		}
//		System.out.println();
//	}
//	
//	public static void main (String[] args) {
//		OrdenarSequenciaBC cl = new OrdenarSequenciaBC();
//		try {
//			//cl.imprimirSequencia(cl.ordenarSequencia(41, 41));
//			
//			List<Pessoa> l1 = new ArrayList<Pessoa>();
//			l1.add(new Pessoa(1, 5, "Julio"));
//			l1.add(new Pessoa(1, 4, "Joao"));
//			l1.add(new Pessoa(1, 2, "Pedro"));
//			l1.add(new Pessoa(1, 3, "Joaquim"));
//			l1.add(new Pessoa(1, 1, "Tiao"));
//			
//			cl.ordenarListaPessoas(l1);
//			for (Pessoa p : l1) {
//				System.out.println(p.getCodigo() + " / " + p.getNome());
//			}
//			
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
	
}
