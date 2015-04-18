import java.util.ArrayList;

/**
 * TARIFAS POR UBICACION
 * @author Dalkiller
 *
 */
public class Tarifa {
	/**
	 * Declaracion de variables privadas
	 */
	private String desde = new String();
	private String hasta = new String();
	private int precio;
	private ArrayList<Bus> buses = new ArrayList<Bus>();
	
	/**
	 * INICIALIZA LOS PARAMETROS
	 * @param desde string de donde viene el bus
	 * @param hasta string a donde llega el bus
	 */
	public Tarifa(String desde, String hasta) {
		this.desde = desde;
		this.hasta = hasta;
		precio = 0;
		
	}
	public Tarifa(String desde, String hasta, int precio) {
		this.desde = desde;
		this.hasta = hasta;
		this.precio = precio;
		
	}
	
	
	
	public String getDesde() {
		return desde;
	}



	public void setDesde(String desde) {
		this.desde = desde;
	}



	public String getHasta() {
		return hasta;
	}



	public void setHasta(String hasta) {
		this.hasta = hasta;
	}



	public int getPrecio() {
		return precio;
	}



	public void setPrecio(int precio) {
		this.precio = precio;
	}



	public ArrayList<Bus> getBuses() {
		return buses;
	}



	public void setBuses(ArrayList<Bus> buses) {
		this.buses.add(new Bus(null, desde, desde, desde));
	}



	/**
	 * 
	 * @param listaTarifas lista de las tarifas
	 * @param desde string de donde viene el bus
	 * @param hasta string a donde llega el bus
	 * @return posicion si ya existe en listaTarifas sino -1
	 */
	public static int estaLaTarifa(ArrayList<Tarifa> listaTarifas, String desde, String hasta) {
		int encontrado = -1;
		int i = listaTarifas.size() - 1;
		while(i > -1 && encontrado == -1) {
			Tarifa tarifa = listaTarifas.get(i);
			if(tarifa.getDesde()==desde && tarifa.getHasta()==hasta)
				encontrado = i;
			i--;
		}
		return encontrado;
	}
	
}
