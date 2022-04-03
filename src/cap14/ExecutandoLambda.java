package cap14;

public class ExecutandoLambda {

	public static void main(String[] args) {
		OperacaoAritmatica operacao = (x,y) -> x+y;
		
		double result = operacao.execute(15.8,8.3);
		
		System.out.println(result);

	}

}
