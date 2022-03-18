package cap09;

import javax.swing.JOptionPane;

public class TesteProgramador 
{
	public static void main(String[] args) 
	{
		String nome = JOptionPane.showInputDialog("Digite o nome:");
		String email = JOptionPane.showInputDialog("Digite o email:");
		String linguagem = JOptionPane.showInputDialog("Digite a linguagem:");
		String so = JOptionPane.showInputDialog("Digite o Sistema Operacional:");
		Programador jr = new Programador(nome, email, linguagem, so);
		jr.imprimirDados();
	}
}
