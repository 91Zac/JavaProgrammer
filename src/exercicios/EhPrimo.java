package exercicios;

import javax.swing.JOptionPane;

public class EhPrimo {
	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int contador = 0;

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;

			}

		}
		if (contador == 2 && contador != 0 && contador != 1) {
			System.out.println(" o numero é primo ");

		} else {
			System.out.println(" o numero não é primo ");

		}

	}

}
