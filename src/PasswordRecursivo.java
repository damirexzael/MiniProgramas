import java.util.Date;


public class PasswordRecursivo {
	
	public static void main(String[] args) {
		// Instantiate a Date object
	       Date date = new Date();
	        
	       // display time and date using toString()
	       System.out.println(date.toString());
		
	   PasswordRecursivo.pass("hola", "0#0", 0, "");
	   

		// Instantiate a Date object
		Date date2 = new Date();
	    
	   // display time and date using toString()
	   System.out.println(date2.toString());
		
        
	}

	public static void pass(String palabra, String clave, int lugar, String pre) {
		if(clave.length() <= lugar) {
			System.out.println(pre);
		}
		else if(clave.charAt(lugar) == '#') {
			pass(palabra, clave, lugar + 1, pre + palabra);
		}
		else if(clave.charAt(lugar) == '0') {
			pass(palabra, clave, lugar + 1, pre + 0);
			pass(palabra, clave, lugar + 1, pre + 1);
			pass(palabra, clave, lugar + 1, pre + 2);
			pass(palabra, clave, lugar + 1, pre + 3);
			pass(palabra, clave, lugar + 1, pre + 4);
			pass(palabra, clave, lugar + 1, pre + 5);
			pass(palabra, clave, lugar + 1, pre + 6);
			pass(palabra, clave, lugar + 1, pre + 7);
			pass(palabra, clave, lugar + 1, pre + 8);
			pass(palabra, clave, lugar + 1, pre + 9);
		}
	}
}
