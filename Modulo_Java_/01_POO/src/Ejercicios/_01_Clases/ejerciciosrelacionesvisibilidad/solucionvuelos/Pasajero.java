package Ejercicios._01_Clases.ejerciciosrelacionesvisibilidad.solucionvuelos;

/*
- Atributos: nombre (String), numeroPasaporte (String).
- Métodos: obtenerNombre(), obtenerNumeroPasaporte().
*/

public class Pasajero {
	private String nombre;
	private String numeroPasaporte;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumeroPasaporte() {
		return numeroPasaporte;
	}
	public void setNumeroPasaporte(String numeroPasaporte) {
		this.numeroPasaporte = numeroPasaporte;
	}
	
	
}
