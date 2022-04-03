package cap15;

import java.util.HashMap;

public class ExemploHashMap {

	public static void main(String[] args) {
		HashMap<String,Produto> map = new HashMap();
		
		map.put("leite", new Produto("Leite em pó", "Laticinios", 5.80));
		map.put("cerveja", new Produto("Cerveja em lata", "Bebidas", 1.89));
		map.put("detergente", new Produto("Detergente", "Limpeza", 2.49));
		map.put("manteiga", new Produto("Manteiga", "Laticinios", 2.90));
		map.put("pasta", new Produto("Pasta de Dente", "Laticinios", 1.75));
		
		System.out.println(map.containsKey("cerveja"));
		System.out.println(map.get("pasta"));
		map.remove("detergente");
		System.out.println(map.size());
		System.out.println("=========================================");

	}

}
