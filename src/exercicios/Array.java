package exercicios;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		String [] nome = new String[10];
		
		nome[0] = "Daniela";
		nome[1] = "Daiana";
		nome[2] = "Danila";
		nome[3] = "Danielo";
		nome[4] = "Danilo";
		nome[5] = "Daniel";
		nome[6] = "Denis";
		nome[7] = "Davis";
		nome[8] = "Dani";
		nome[9] = "Daniesis";
		
		Scanner teclado = new Scanner(System.in); 
		
		int [] numero = new int [5];
		
		for(int i = 0; i < numero.length ; i++) {
		
		System.out.println("Digite os o " + (i+1) + "número");
		
		numero[i] = teclado.nextInt();
		
		}
		
		int[] numeros = {2,7, 8, 9,9,8,7};
				
	}

}
