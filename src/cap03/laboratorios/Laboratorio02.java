package cap03.laboratorios;

import javax.swing.JOptionPane;

public class Laboratorio02 {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		System.out.println(numero%2 == 0 ? "O número " + numero + " é Par" : "O número " + numero + " é impar");
	}

}
