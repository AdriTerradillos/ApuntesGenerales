package Ejercicios._01_Clases.ejerciciosrelacionesvisibilidad.solucionvuelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Vuelo {
	// todos los atributos privados

	private String numeroVuelo;
	private String origen;
	private String destino; 
	private String fecha;
	//private LocalDateTime fechaHora;
	private int asientosDisponibles = 75;
	
	// constructor
	public Vuelo() {
		super();
		// solo agregar numero de vuelo si cumplen ciertas condiciones
		// dos iniciales + 4 digitos
		this.numeroVuelo = Ok.codigoVuelo();
		
		if (this.numeroVuelo.equals("S") || Ok.vueloExiste(this.numeroVuelo)) {
			return;
		} 
		
		// origen destino con codigos de aeropuertos (codigo de IATA)
		System.out.println("Código de origen: ");
		this.origen = Ok.codigoAeropuerto();
		
		if (this.origen.equals("S")) {
			return;
		}
		
		System.out.println("Código de destino: ");
		this.destino = Ok.codigoAeropuerto();
		
		if (this.destino.equals("S")) {
			return;
		}
	
		
		this.fecha = Ok.fecha();
		
		if (this.fecha.equals("S")) {
			return;
		}	
	}
	// metodos
		
	//getters y setters
	public String getNumeroVuelo() {
		return numeroVuelo;
	}
	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getAsientosDisponibles() {
		return asientosDisponibles;
	}
	public void setAsientosDisponibles(int asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}
	
	
	
	/*
	public boolean coincideCon() {
		if (this.origen.equalsIgnoreCase(origen) && this.destino.equalsIgnoreCase(destinoUsuario)) {
			return true;
		}
	}
	*/
	
	
	
	// Métodos: , cancelarReserva(), obtenerNumeroVuelo(), obtenerOrigen(), obtenerDestino(), obtenerFecha(), obtenerAsientosDisponibles().
	
	
}
