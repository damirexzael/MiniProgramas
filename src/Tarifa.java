import java.util.ArrayList;


public class Tarifa {
	/**
	 * Declaracion de variables privadas
	 */
	private String desde = new String();
	private String hasta = new String();
	private int precio;
	
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
	
	/**
	 * SET DE PRECIO
	 * @param precio el valor de la tarifa
	 */
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	/**
	 * GET DE DESDE
	 * @return string de donde viene el bus
	 */
	public String getDesde() {
		return this.desde;
	}
	
	/**
	 * GET DE HASTA
	 * @return string a donde llega el bus
	 */
	public String getHasta() {
		return this.hasta;
	}
	
	/**
	 * GET PRECIO
	 * @return int el valor de la tarifa
	 */
	public int getPrecio() {
		return this.precio;
	}
	
	
	/**
	 * FUNCIONES GENERALES
	 */
	
	/**
	 * 
	 * @param listaTarifas lista de las tarifas
	 * @param desde string de donde viene el bus
	 * @param hasta string a donde llega el bus
	 * @return true si ya existe en listaTarifas estos dos parametros (desde,hasta)
	 */
	public static boolean estaLaTarifa(ArrayList<Tarifa> listaTarifas, String desde, String hasta) {
		boolean encontrado = false;
		int i = listaTarifas.size() - 1;
//		for(int i = 0 ; i < listaTarifas.size() ; i++ ) {
		while(i > -1 && encontrado == false) {
			Tarifa tarifa = listaTarifas.get(i);
			if(tarifa.getDesde()==desde && tarifa.getHasta()==hasta)
				encontrado = true;
			i--;
		}
//		}
		return encontrado;
	}
	
}
