package br.com.contadordevogais;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class contadorVogais {

	private static final List<Character> VOGAIS = Arrays.asList('a', 'e', 'i','o', 'u');

	public static void main(String[] args) {
		System.out.println("Digite até 100 caracteres.");
		Scanner lerTexto = new Scanner(System.in);
		String texto = lerTexto.nextLine();
		
		contaVogais(texto);
			
	}
	
	private static void contaVogais(String texto) {
		int contador = 0;
		
		texto.toLowerCase();
		
	if (texto.length() <= 100) {

		for (char c : texto.toCharArray()) {
			if(VOGAIS.contains(c)) contador++;
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
