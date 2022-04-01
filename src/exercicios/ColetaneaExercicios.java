package exercicios;

import java.util.Scanner;

public class ColetaneaExercicios {

	public static void main(String[] args) {

		System.out.println(quatroDigitosDoNome("Paola"));
		letrasNaPosicaoImpar("Wesley");
		letrasNaPosicaoPar("Isac");
        loopdenome ("GUSTAVO");
	
	}

	public static void loopdenome(String nome) {
		System.out.println();
		int i = 0;
		while (i <10 ){
			System.out.println(nome);
			i++;
		}
		
	}

	public static String quatroDigitosDoNome(String nome) {

		return nome.substring(0, 4);
	}

	public static void letrasNaPosicaoImpar(String palavra) {

		for (int i = 0; i < palavra.length(); i++) {

			if (i % 2 == 0) {
				System.out.print(palavra.charAt(i));
			}
		}

	}

	public static void letrasNaPosicaoPar(String palavra) {

		System.out.println();

		for (int i = 0; i < palavra.length(); i++) {

			if (i % 2 != 0) {
				System.out.print(palavra.charAt(i));
			}

		}

	}

}
