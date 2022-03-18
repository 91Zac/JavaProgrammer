package Lab5;

public class Lab5 {

	public static void main(String[] args) {

		Garagem g = new Garagem();

//		 g.carroPasseio = new Carro();
//		 g.carroUtilitario = new Carro();

		g.getCarroPasseio().setCor("vermelho");
		g.getCarroPasseio().setModelo("VW");
		g.getCarroPasseio().setPotencia(2.3);

		g.getCarroUtilitario().setCor("Branco");
		g.getCarroUtilitario().setModelo("Renault Boxer");
		g.getCarroUtilitario().setPotencia(3.8);

		System.out.println("Carro de Passeio: ");
		System.out.println("Cor: " + g.getCarroPasseio().getCor());
		System.out.println("Modelo: " + g.getCarroPasseio().getModelo());
		System.out.println("Potência: " + g.getCarroPasseio().getPotencia());

		System.out.println("---------------------------------------");

		System.out.println("Carro Utilitário: ");
		System.out.println("Cor: " + g.getCarroUtilitario().getModelo());
		System.out.println("Modelo: " + g.getCarroUtilitario().getCor());
		System.out.println("Potência: " + g.getCarroUtilitario().getPotencia());

	}

}
