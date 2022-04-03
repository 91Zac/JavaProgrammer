package exercicios;

public class DescontosSalariais {

	public static void main(String[] args) {
		double salarioBruto[] = {1350.0,430.15,8235.25,2500.55,1830.0,850.26,3614.29,12500.0};
		
		double salarioLiquido[] = DoubleArrayUtils.transformaValores(salarioBruto, sal-> sal * 0.9);
		
		
		DoubleArrayUtils.processaValores(salarioLiquido, 
        		d -> System.out.println(d));
 

	}

}
