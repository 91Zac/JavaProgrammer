package Lab5;

import javax.swing.JOptionPane;

public class VetoresNomes {

	public static void main(String[] args) {
		String nomes[] = new String[5];

		for (int i = 1; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite o nome número " + i);
		}
		for (String nome : nomes) {
			System.out.print(" "+nome);
		}
		
		
	}

}
