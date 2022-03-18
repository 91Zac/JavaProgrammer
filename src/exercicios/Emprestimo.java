package exercicios;

import javax.swing.JOptionPane;

public class Emprestimo {

	public static void main(String[] args) {
		
		double salario = Integer.parseInt(JOptionPane.showInputDialog("Digite o Salário "));
		double parcela = Integer.parseInt(JOptionPane.showInputDialog("Digite a Parcela "));
		
		JOptionPane.showMessageDialog(null, parcela > salario * 0.2 ? "Emprestimo não pode ser concedido ": "Emprestimo pode ser concedido");
		//System.out.println(parcela > salario * 0.2 ? "Emprestimo não pode ser concedido ": "Emprestimo não pode ser concedido");
	}

}
