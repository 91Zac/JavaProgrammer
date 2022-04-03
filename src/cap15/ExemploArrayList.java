package cap15;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {
		List<String> paises = new ArrayList();
		paises.add("Brasil");
		paises.add("Portugal");
		paises.add("EUA");
		paises.add("França");
		paises.add("Inglaterra");
		paises.add("Itália");
		
		System.out.println("Países na Ordem Original");
		paises.forEach(curso -> System.out.println("  -   " + curso));
		
		System.out.println("===========================================");
		paises.replaceAll(s -> s.toUpperCase());
		System.out.println(paises.contains("EUA"));
		System.out.println(paises.get(2));
		System.out.println(paises.size());
		System.out.println(paises.indexOf("FRANÇA"));
		paises.sort((x,y) -> x.compareTo(y));
		
		paises.forEach(curso -> System.out.println(" -  " + curso));

	}

}
