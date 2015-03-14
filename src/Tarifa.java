
public class Tarifa {
	/**
	 * Declaracion de variables privadas
	 */
	private String desde = new String();
	private String hasta = new String();
	private int precio;
	private String lugar = new String();
	
	/**
	 * Inicializamos variables
	 */
	public Tarifa(String lugarTarifa) {
		desde = "";
		hasta = "";
		precio = 0;
		lugar = lugarTarifa;
		
	}
	
	/**
	 * Se agregan funciones de obtencion y edicion de las variables
	 */
	public void setDesde(String desde) {
		this.desde = desde;
	}
	public void setHasta(String hasta) {
		this.hasta = hasta;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getDesde() {
		return this.desde;
	}
	public String getHasta() {
		return this.hasta;
	}
	public int getPrecio() {
		return this.precio;
	}
	public String getLugar() {
		return this.lugar;
	}
	
}
