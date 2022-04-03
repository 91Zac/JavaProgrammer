package cap11;

public class TestaExcecoes {

	public static void main(String[] args) {
		int i;
		try {
			i =2;
			System.out.println(i);
		}catch(Exception e) {
			System.out.println("Ococorreu um erro");
		}
		
		try { 
			i = 1/0;
			System.out.println(i);
		}catch(ArithmeticException e ) { 
			System.out.println("Divisao por zero" + e.getMessage());
		}

	}

}
