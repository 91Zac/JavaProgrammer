package exercicios;

import java.util.Scanner;

public class RaizOuQuadrado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite um numero");
		int num = teclado.nextInt();

		if (num > 0) {
			System.out.println("A raiz Quadrada do número é: " + Math.sqrt(num));
		} else if (num < 0) {
			System.out.println("O Quadrado do número é: " + Math.pow(num, 2));

		}

	}

}
