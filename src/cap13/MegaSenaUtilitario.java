package cap13;

import java.util.Random;

public class MegaSenaUtilitario {

	public static int sortearNumero() {
		Random sorteador = new Random();
		int numero = sorteador.nextInt();
		return numero;

	}

}
