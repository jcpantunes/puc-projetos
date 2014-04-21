package com.puc.acn.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teste {
	
	private static final int TAM = 2100;

//	public static void main (String[] args) {
//		try {
//			BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Julio\\Documents\\workspace\\acn-appengine-gwt\\test\\com\\puc\\acn\\server\\nomes"));
//			
//			BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Julio\\Documents\\workspace\\acn-appengine-gwt\\test\\com\\puc\\acn\\server\\pessoas"));
//			
//			List<Integer> teste = recuperarLista(TAM);
//			
//			int i = 0;
//			
//			String str = "";
//			while (in.ready()) {
//				str = in.readLine();
//				
//				Random gerador = new Random();
//				
//		        int numero = gerador.nextInt(TAM - i);
//		        
//		        Integer codigo = teste.get(numero);
//		        teste.remove(numero);
//		        
//		        out.write(codigo + "|" + str);
//		        out.newLine();
//		        
//		        System.out.println(codigo + "|" + str);
//		        
//		        i++;
//		        
//			}
//			
//			in.close();
//			out.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	private static List<Integer> recuperarLista(int fim) {
//		List<Integer> teste = new ArrayList<Integer>();
//		for(int i = 1 ; i <= fim ; i++ ) {
//			teste.add(new Integer(i));
//		}
//		return teste;
//	}
}
