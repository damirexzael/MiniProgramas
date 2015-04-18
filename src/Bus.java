/**
 * BUSES DE LA EMPRESA
 * @author Dalkiller
 *
 */
public class Bus {
	Tarifa tarifa;
	String horaSalida;
	String horaLlegada;
	String fecha;
	Cliente[] asiento;
	
	/**
	 * INICIALIZA LOS PARAMETROS
	 * @param tarifa
	 * @param horaSalida
	 * @param horaLlegada
	 * @param fecha
	 */
	public Bus(Tarifa tarifa, String horaSalida, String horaLlegada,String fecha) {
		this.tarifa = tarifa;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.fecha = fecha;
		this.asiento = new Cliente[45];
	}
	
	public Bus(Tarifa tarifa, String horaSalida, String horaLlegada,String fecha, int asientos) {
		this.tarifa = tarifa;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.fecha = fecha;
		this.asiento = new Cliente[asientos];
	}
	
}
