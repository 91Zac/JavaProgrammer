package exercicios;

import javax.swing.JOptionPane;

public class Comparando20 {

	public static void main(String[] args) {
		
		double x = Integer.parseInt(JOptionPane.showInputDialog("Digite o Salário "));

		if (x < 20) {
			System.out.println("x é menor que 20");
		} else if (x > 20) {
			System.out.println("x é maior que 20");
		} else {
			System.out.println("x é igual a 20");
		}

	}
}
