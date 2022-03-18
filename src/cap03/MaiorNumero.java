package cap03;

import javax.swing.JOptionPane;

public class MaiorNumero {

	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		
		System.out.println(numero1 > numero2 ? numero1:numero2);

	}

}
