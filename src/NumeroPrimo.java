/**
 * Analiza si un numero es primo
 * @author Dalkiller
 *
 */
public class NumeroPrimo {
	
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
