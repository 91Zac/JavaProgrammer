package cap10;

public class Executando {

	public static void main(String[] args) {
		Eletrodomestico a,b,c,d,e,f,g;
		
		a = new Geladeira();
		b = new Televisao();
		c = new Televisao();
		d = new Geladeira();
		e = new Microondas();
		f = new Televisao();
		g = new Geladeira();
		
		
		Eletrodomestico.ligarTudo(a,b,c,d,e,f,g);
		Eletrodomestico.desligarTudo(a,b,c,d,e,f,g);

	}

}
