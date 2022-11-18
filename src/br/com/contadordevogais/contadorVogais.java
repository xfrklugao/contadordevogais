package br.com.contadordevogais;

import java.util.Scanner;

public class contadorVogais {

	public static void main(String[] args) {
		System.out.println("Digite até 100 caracteres.");
		Scanner lerTexto = new Scanner(System.in);
		String texto = lerTexto.nextLine();
		
		contaVogais(texto);
			
	}
	
	private static void contaVogais(String texto) {
		int contador = 0;
		char vogais[] = {'a', 'e', 'i','o', 'u'};
		
		texto.toLowerCase();
		
	if (texto.length() <= 100) {	
		for (int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			if (contem (vogais,c))
				contador++;
		}
		
		System.out.println("O texto digitado contém: " + contador + " vogais.");
		
	} else {
		System.out.println("O texto possui: " + texto.length() + " caracteres." + " Quantidade não permitida!");
	}
	}
	
	private static boolean contem(char vetor[], char comparacao) {
		
		boolean flag = false;
		
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] == comparacao)
				flag = true;
		}
		
		return flag;
		
	}
}
