package cap04;

public class SwitchPaises {

	public static void main(String[] args) {

		String pais = "Argentina";

		switch (pais) {
		case "brasil:":
		case "Portugal":
			System.out.println("Bom Dia!");
			break;
		case "Franca":
			System.out.println("Bon Jour!");
			break;
		case "Maxico":
		case "Argentina":
		case "Espanha":
			System.out.println("Buenos Dias!");
			break;
		default:
			System.out.println("Good Morning");

		}

	}

}
