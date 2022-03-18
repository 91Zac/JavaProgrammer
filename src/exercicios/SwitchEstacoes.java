package exercicios;

import javax.swing.JOptionPane;

public class SwitchEstacoes {

	public static void main(String[] args) {
		String mesDoano = JOptionPane.showInputDialog("Qual o mes do ano?");
		switch (mesDoano) {
		case "marco":
		case "abril":
		case "maio":
		case "junho":
			System.out.println("É Outono");
			break;
		case "julho":
		case "agosto":
			System.out.println("É Inverno");
		case "setembro":
		case "outubro":
		case "novembro":
			System.out.println("É Primavera");
		case "Dezembro":
		case "janeiro":
		case "fevereiro":
			System.out.println("É Verão");

		}

	}

}
