package Ejercicios._01_Clases.ejerciciosrelacionesvisibilidad.solucionvuelos;

/*
 Reserva:
	- Atributos: pasajero (Pasajero), vuelo (Vuelo), codigoReserva (String generado automáticamente).
	- Métodos: obtenerPasajero(), obtenerVuelo(), obtenerCodigoReserva().
 */

public class Reserva {
	private Pasajero pasajero;
	private Vuelo vuelo;
	private String codigoReserva;
	
	
	
	public Pasajero getPasajero() {
		return pasajero;
	}
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	public String getCodigoReserva() {
		return codigoReserva;
	}
	public void setCodigoReserva(String codigoReserva) {
		this.codigoReserva = codigoReserva;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Reserva [pasajero=" + pasajero + ", vuelo=" + vuelo + ", codigoReserva=" + codigoReserva + "]";
	}
	
	

}
