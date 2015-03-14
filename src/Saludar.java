import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * @author Dalkiller
 *
 */
public class Saludar {

//	static int[] numeros = new int[2];
//	static int[] num = new int[4];
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		numeros[0]=5;
//		numeros[1]=15;
//		num=numeros;
//		System.out.println("hola "+numeros[1]);
//		System.out.println("tamaño: "+numeros.length);
//		System.out.println("hola "+num[1]);
//		System.out.println("tamaño: "+num.length);
//		BufferedReader usuario = new BufferedReader(new InputStreamReader(System.in));
//		String dato;
//		dato = usuario.readLine();
//		System.out.println("info: " + dato);
//		Scanner entrada = new Scanner(System.in);
//		int number;
//		number = entrada.nextInt();
//		System.out.println(number);
//		System.out.println("Esto es una prueba de GitHub");
		
		ArrayList<Tarifa> listaTarifas = new ArrayList<Tarifa>(); // se crea array de tarifas
		agregarTarifas(listaTarifas); // Se guardan algunas tarifas automaticamente
		
		for(int i=0;i<listaTarifas.size();i++)
		{
			Tarifa tarifa = (Tarifa)listaTarifas.get(i);
			System.out.println("Datos tarifa " + (i + 1));
			System.out.println("Desde: " + tarifa.getDesde());
			System.out.println("Hasta: " + tarifa.getHasta());
			System.out.println("Precio: " + tarifa.getPrecio());

		    
		}
		
	}
	
	private static void agregarTarifas(ArrayList<Tarifa> listaTarifas) {
		Tarifa tarifa1 = new Tarifa("Santiago", "Valparaiso");
		tarifa1.setPrecio(2500);
		if(!Tarifa.estaLaTarifa(listaTarifas, tarifa1.getDesde(), tarifa1.getHasta()))
			listaTarifas.add(tarifa1);
		Tarifa tarifa2 = new Tarifa("Temuco", "Valparaiso");
		tarifa2.setPrecio(6500);
		if(!Tarifa.estaLaTarifa(listaTarifas, tarifa2.getDesde(), tarifa2.getHasta()))
			listaTarifas.add(tarifa2);
		Tarifa tarifa3 = new Tarifa("Temuco", "Valparaiso");
		tarifa3.setPrecio(15000);
		if(!Tarifa.estaLaTarifa(listaTarifas, tarifa3.getDesde(), tarifa3.getHasta()))
			listaTarifas.add(tarifa3);
		Tarifa tarifa4 = new Tarifa("Temuco", "Valparaiso");
		tarifa4.setPrecio(15000);
		if(!Tarifa.estaLaTarifa(listaTarifas, tarifa4.getDesde(), tarifa4.getHasta()))
	    	listaTarifas.add(tarifa4);
		
//	    int index = listaTarifas.indexOf( new Tarifa("tercera"));
//	    if(index == -1)
//	    	listaTarifas.add(tarifa4);
	}

}