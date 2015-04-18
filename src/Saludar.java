import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * @author Dalkiller
 *
 */
public class Saludar {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		ArrayList<Integer> lista = new ArrayList<Integer>();
//		ArrayList<Tarifa> listaTarifas = new ArrayList<Tarifa>(); // se crea array de tarifas
//		agregarTarifas(listaTarifas); // Se guardan algunas tarifas automaticamente
//		
//		for(int i=0;i<listaTarifas.size();i++)
//		{
//			Tarifa tarifa = (Tarifa)listaTarifas.get(i);
//			System.out.println("Datos tarifa " + (i + 1));
//			System.out.println("Desde: " + tarifa.getDesde());
//			System.out.println("Hasta: " + tarifa.getHasta());
//			System.out.println("Precio: " + tarifa.getPrecio());
//
//		    
//		}
		
		
		boolean rut = Cliente.validarRut(8058356, 7);
		
//		System.out.println("El rut esta " + rut);
//		
//		Map <Integer, Tarifa> mp = new HashMap<Integer, Tarifa>();
//		Tarifa tarifa1 = new Tarifa("Santiago", "Valparaiso");
//		tarifa1.setPrecio(2500);
//		mp.put(31233, tarifa1);
		
//		System.out.println("20150312: " + mp.get(31233).getDesde());
//		System.out.println("2234: " + mp.get(2234));

		// Instantiate a Date object
	       Date date = new Date();
	        
	       // display time and date using toString()
	       System.out.println(date.toString());
		
//		double numero=924271261324111.0;
//		numero=(double) 15;
//		System.out.println(numero + ": " + NumeroPrimo.esPrimo(numero));
//		System.out.println("Ciclos: " + NumeroPrimo.ciclos);
//		System.out.println("Divisor: " + NumeroPrimo.divisor);
		

		
	   PasswordRecursivo.pass("hola", "0#0", 0, "");
	   

		// Instantiate a Date object
		Date date2 = new Date();
	    
	   // display time and date using toString()
	   System.out.println(date2.toString());
		
        
	}
	
	private static void agregarTarifas(ArrayList<Tarifa> listaTarifas) {
		Tarifa tarifa1 = new Tarifa("Santiago", "Valparaiso");
		tarifa1.setPrecio(2500);
		if(Tarifa.estaLaTarifa(listaTarifas, tarifa1.getDesde(), tarifa1.getHasta())==-1)
			listaTarifas.add(tarifa1);
		Tarifa tarifa2 = new Tarifa("Temuco", "Valparaiso",6500);
		if(Tarifa.estaLaTarifa(listaTarifas, tarifa2.getDesde(), tarifa2.getHasta())==-1)
			listaTarifas.add(tarifa2);
		Tarifa tarifa3 = new Tarifa("Temuco", "Valparaiso");
		tarifa3.setPrecio(15000);
		if(Tarifa.estaLaTarifa(listaTarifas, tarifa3.getDesde(), tarifa3.getHasta())==-1)
			listaTarifas.add(tarifa3);
		Tarifa tarifa4 = new Tarifa("Temuco", "Valparaiso");
		tarifa4.setPrecio(15000);
		if(Tarifa.estaLaTarifa(listaTarifas, tarifa4.getDesde(), tarifa4.getHasta())==-1)
	    	listaTarifas.add(tarifa4);
		
	}

}