package exercicios;

import java.util.Scanner;

public class MaiorDe2Numeros {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primerioro numero");
		int num1 = teclado.nextInt();
		System.out.println("Digite o primerioro numero");
		int num2 = teclado.nextInt();
		
		if(num1+num2>10) {
			System.out.println("A soma dos dois números é: " + num1+num2);
		}
	}

}
