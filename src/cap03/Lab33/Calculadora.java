package cap03.Lab33;

import javax.swing.JOptionPane;

public class Calculadora {

	public static int somar(int valor1, int valor2,String letra) {
		return valor1 + valor2;
	}
	
	public double somarVetor(int valores[]) {
		double soma = 0;
		for(int i = 0 ; i< valores.length; i++) {
			soma +=valores[i];
		}
		return soma;
	}
	
	public static void main(String[] args) {
		//System.out.println(somar(1,2,"a"));
		
		//System.out.println(subtrair(67,50," Isac"));
		
		somarSolicitandoValor();
		
		
	}
	
	public static String subtrair(int valor1, int valor2,String letra) {
		return valor1 - valor2+letra;
	}

	public static String somarSolicitandoValor() {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog(" digite primeiro numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog(" digite Segundo numero"));
		JOptionPane.showMessageDialog(null,"A soma de " + numero1+ " com " + numero2+" é = "+(numero1+numero2));
		return "a";
	}
}
