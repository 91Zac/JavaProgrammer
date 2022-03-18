package cap03.Lab33;

public class Classes {
	static int ano;

	public static void main(String[] args) {
		Classes a = new Classes();
		Classes b = new Classes();
		Classes c = new Classes();

		a.ano = 2012;
		System.out.println(c.ano);
		b.ano = 2013;
		System.out.println(c.ano);
	}
}
