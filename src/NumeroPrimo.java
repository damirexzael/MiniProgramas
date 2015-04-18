import java.util.Date;

/**
 * Analiza si un numero es primo
 * @author Dalkiller
 *
 */
public class NumeroPrimo {
	
	public static void main(String[] args) {

		// Instantiate a Date object
	       Date date = new Date();
	        
	       // display time and date using toString()
	       System.out.println(date.toString());
		
		double numero=924271261324111.0;
//		numero=(double) 15;
		System.out.println(numero + ": " + NumeroPrimo.esPrimo(numero));
		System.out.println("Ciclos: " + NumeroPrimo.ciclos);
		System.out.println("Divisor: " + NumeroPrimo.divisor);
		
		// Instantiate a Date object
		Date date2 = new Date();
	    
	   // display time and date using toString()
	   System.out.println(date2.toString());
		
        
	}
	
	
	public static double ciclos=0;
	public static double divisor=1;
	/**
	 * Resuelve si un numero es primo
	 * @param numero
	 * @return String si es primo, si no es primo o si el numero es invalido (menor a 1)
	 */
	public static String esPrimo(double numero) {
		if(numero < 1)
			return "Numero Invalido";
		if(numero%2 == 0)
		{
			divisor = 2;
			return "No Es Primo";
		}
		if(segundoPaso(numero)) 
			return "Es Primo";
		return "No Es Primo";
	}
	
	
	private static boolean segundoPaso(double numero) {
		double valor=3,
			fin=numero,
			modulo=0;
		do {
			modulo=numero%valor;
			if(modulo==0) {
				divisor=valor;
				return false;
			}
			fin = (numero-modulo)/valor;
			valor += 2;
			ciclos++;
		} while(valor < fin);
		return true;
	}
	
	
}
