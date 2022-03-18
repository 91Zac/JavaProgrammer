package cap03.Lab33;

public class InverteString {

		public static String inverterString(String valor) {
	        
	        String inverso = new StringBuilder(valor.toLowerCase()).reverse().toString();

	        return inverso;
	    }

	    public static void main(String[] args) {
	        
	        System.out.println(InverteString.inverterString("AomTTTario"));
	        
	       
	        
	        System.out.println( InverteString.inverterString("Amarelo"));
	        
	        String inverso2 =  InverteString.inverterString("Amarelo");
	        
	        System.out.println(inverso2);
	        
	        
	       // System.out.println(InverteString.inverterString("AomTTTario"));
		       
	}

}
