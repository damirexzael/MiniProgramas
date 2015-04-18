/**
 * Cientes de la empresa (los que compraran pasajes)
 * @author Dalkiller
 *
 */
public class Cliente {
	private boolean registrado;
	private String nombres;
	private String apellidos;
	private int rut;
	private int digitoVerificador;
	
	public Cliente(boolean registrado, String nombres, String apellidos, int rut, int digitoVerificador) {
		this.registrado = registrado;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rut = rut;
		this.digitoVerificador = digitoVerificador;
	}
	
	public boolean isRegistrado() {
		return registrado;
	}

	public void setRegistrado(boolean registrado) {
		this.registrado = registrado;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getRut() {
		return rut;
	}

	public int getDigitoVerificador() {
		return digitoVerificador;
	}

	public static boolean validarRut(int rut, int digitoVerificador) {
		int moduloRut;
		int i = 2,
			sumatoria = 0;
		while(rut > 0) {
			moduloRut = rut % 10;
			rut = (rut - moduloRut)/10;
			sumatoria += (moduloRut*i);
			if(i == 7)
				i = 2;
			else
				i++;
		}
		sumatoria = sumatoria % 11;
		sumatoria = 11 - sumatoria; // 11 -> 0 y 10 -> k
		
		if(digitoVerificador == sumatoria)
			return true;
		else
			return false;
	}
	
}
