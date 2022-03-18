package exercicios;

import java.time.LocalDateTime;

public class CalcularIdade {

	public static void main(String[] args) {
		LocalDateTime anoAtual = LocalDateTime.now();
		LocalDateTime dataNascimento = LocalDateTime.of(1991,1, 5, 0, 0);
		
		System.out.println(anoAtual.compareTo(dataNascimento));

	}

}
