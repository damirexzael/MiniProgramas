import java.util.ArrayList;


public class BuscarOrden {
	
	private static ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public static void add(int numero) {
		numeros.add(numero);
	}
	
	private static int contarDer(int centro) {
		int numeroAnterior = numeros.get(centro);
		for( int i = centro + 1 ; i < numeros.size() ; i++ ) {
			if(numeroAnterior < numeros.get(i)) {
				
			}
		}
		return 1;
	}
}
