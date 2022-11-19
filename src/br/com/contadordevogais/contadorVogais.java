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
	
	private static void contaVogais(String textoOriginal) {
		int contador = 0;
		
		String textoCaixaBaixa = textoOriginal.toLowerCase();
		
		if (textoCaixaBaixa.length() <= 100) {

			for (char c : textoCaixaBaixa.toCharArray()) {
				if(VOGAIS.contains(c)) contador++;
			}

			System.out.println("O texto digitado contém: " + contador + " vogais.");

		} else {
			System.out.println("O texto possui: " + textoCaixaBaixa.length() + " caracteres." + " Quantidade não permitida!");
		}
	}
}
