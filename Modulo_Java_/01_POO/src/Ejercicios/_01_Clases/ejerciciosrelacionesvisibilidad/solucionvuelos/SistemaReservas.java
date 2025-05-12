package Ejercicios._01_Clases.ejerciciosrelacionesvisibilidad.solucionvuelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SistemaReservas {

/*
 * SistemaReservas: (Clase principal)
	- Atributo: listaVuelos (ArrayList de Vuelo), listaReservas (ArrayList de Reserva).
	- Métodos: agregarVuelo(Vuelo vuelo), buscarVuelos(String origen, String destino), realizarReserva(Pasajero pasajero, Vuelo vuelo), cancelarReserva(String codigoReserva).
 */
	
	private ArrayList<Vuelo> listaVuelos;
	private ArrayList<Reserva> listaReservas;
	
	// propuesta Lola
	//private HashMap<>
	private HashMap<Vuelo, Reserva> mapReserva;
	
	public ArrayList<Vuelo> getListaVuelos() {
		return listaVuelos;
	}


	public void setListaVuelos(ArrayList<Vuelo> listaVuelos) {
		this.listaVuelos = listaVuelos;
	}


	public ArrayList<Reserva> getListaReservas() {
		return listaReservas;
	}


	public void setListaReservas(ArrayList<Reserva> listaReservas) {
		this.listaReservas = listaReservas;
	}


	public HashMap<Vuelo, Reserva> getMapReserva() {
		return mapReserva;
	}


	public void setMapReserva(HashMap<Vuelo, Reserva> mapReserva) {
		this.mapReserva = mapReserva;
	}


	public void agregarVuelo() {
		Vuelo avion = new Vuelo();
		listaVuelos.add(avion);
		System.out.println("Vuelo agregado.");
	}

	
	//TO-DO buscar vuelo
	public ArrayList<Vuelo> buscarVuelo() {
		//Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el origen: ");
		String origenUsuario = Ok.codigoAeropuerto();
		System.out.print("Introduce el destino: ");
		String destinoUsuario = Ok.codigoAeropuerto();
		
		if (!Ok.coherenciaOrigenDestino(origenUsuario, destinoUsuario)) {
			System.err.println("Origen y destino no pueden ser iguales.");
			return null;
		} else {
			// podemos tener más de un vuelo disponible
			// restricción con fecha: tiene que ser una fecha posterior a la actual
			// ordenar la lista de los disponibles por fecha
			// validar disponibilidad de asientos
			ArrayList<Vuelo> listaDisponibles = new ArrayList<>();
			
			
			for(Vuelo v : listaVuelos) {
				if (v.getOrigen().equals(origenUsuario) 
						&& v.getDestino().equals(destinoUsuario) 
						&& v.getAsientosDisponibles() > 0
						&& Ok.vueloHaSalido(v)) {
					listaDisponibles.add(v);
				}
			}
			
			if (listaDisponibles.isEmpty()) {
				System.err.println("No hay vuelos disponibles con estas características.");
			}
			return listaDisponibles;
		}
	}
	
	//TO-DO realizar reserva
	// puede haber null como vuelos disponibles
	// código de vuelo para pasar a la función reservarAsiento
	// número de asientos (try-catch --> si introduce una letra vuelve a pedir [1-8])
	public void realizarReserva(ArrayList<Vuelo> listaVuelos) {
		String codVuelo = Ok.codigoVuelo();
		// comprobar si este código está entre los vuelos del aeropuerto
		if (!Ok.vueloExiste(codVuelo)) {
			System.err.println("El código de vuelo no existe.");
			return;
		} 
		//Bucle que comprueba el código dentro de la lista de vuelos y lo guarda
		//para poder seguir manipulando el objeto
		Vuelo v = null;
		for (int i = 0; i < listaVuelos.size(); i++) {
			if (listaVuelos.get(i).getNumeroVuelo().equals(codVuelo)) {
				v = listaVuelos.get(i);
				break;
			}
		}
		
		//Generamos la variable para numReserva que necesitamos más adelante
		String numReserva = null;
		int numAsientos = 0;
		
		boolean continuar = true;
		do {
			numAsientos = Ok.cantidadAsientos();
			int estadoReserva = Ok.reservarAsiento(v, numAsientos);
			switch (estadoReserva) {
				case 0:
					return;
				case 1:
					System.out.println("Introduzca de nuevo asientos a reservar o pulse 0 para salir.");
					break;
				case 2:
					continuar = false;
					numReserva = Ok.generarNumReserva(codVuelo, numAsientos);
			}
		} while (continuar);
		
		//Para la reserva se encesita Pasajero (aquí todavía falta), Vuelo, numReserva
		//Falta Pasajero que tiene nombre y pasaporte
		//Si no se puede generar el Pasajero hay que cancelar asientos
		
		String pasaporteUsuario = Ok.pasaporte();
		//necesitamos cancelar asientos reservados si falla
		if (pasaporteUsuario.equals("S")) {
			Ok.devolverAsientos(v, numAsientos);
			System.err.println("Proceso de reserva cancelado.");
			return;
		}
		
		
	}	
			
		
		
		
		
		
		
		
	}

		
		//tiene que añadir la reserva a algún lugar --> lista de reservas
		
		//VERIFICACIONES
		//pasajero
			//pasaporte
		
		//vuelo
			//codigo
		//tiene que generar el código de reserva
		
		//fechas
		//usuario

		
	
			// reserva el asiento
	//TO-DO cancelar reserva
			// devuelve ese asiento disponible de nuevo
	
	
}
