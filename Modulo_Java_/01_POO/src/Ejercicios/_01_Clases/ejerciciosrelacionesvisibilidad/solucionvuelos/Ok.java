package Ejercicios._01_Clases.ejerciciosrelacionesvisibilidad.solucionvuelos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.UUID;

public class Ok {
	static Scanner sc = new Scanner(System.in);
	
	public static String codigoVuelo() {
		boolean continuar = true;
		do {
			try {
				System.out.print("Introduzca el número de vuelo [AZ0000]: ");
				String entradaUsuario = sc.nextLine().toUpperCase();
				if (entradaUsuario.matches("^[A-Z]{2}\\d{4}$")) {
					continuar = false;
					return entradaUsuario;
					/*
					if(vueloExiste()) {
						System.err.println("Número de vuelo ya existe, no se puede duplicar.");
						return "S";
					} else {
						continuar = false;
						return entradaUsuario;
					}
					*/
				} else if (entradaUsuario.equals("S")){
					return "S";
				}
			} catch (Exception e) {
				System.err.println("Número de vuelo inválido. Dos letras mayúsculas + 4 dígitos.");
				System.out.println("Pulsa \"S\" para salir.");
			}
		} while (continuar);
		return null;
	}
			
	// Introduccion códgios aeropuertos
	public static String codigoAeropuerto() {
		boolean continuar = true;
		do {
			try {
				System.out.print("Introduzca el aeropuerto [AAA]: ");
				String aeropuerto = sc.nextLine().toUpperCase();
				if (aeropuerto.matches("^[A-Z]{3}$")) {
					return aeropuerto;
				} else if (aeropuerto.equals("S")) {
					return "S";
				}
			} catch (Exception e) {
				System.err.println("Código de aeropuerto inválido. Tres letras mayúsculas.");
				System.out.println("Pulsa \"S\" para salir.");
			}
		} while (continuar);
		return null;
	}
	
	//Verificación Origen-Destino diferentes
	public static boolean coherenciaOrigenDestino(String origen, String destino) {
		try {
			if (!origen.equals(destino)) {
				return true;
			}
		} catch (Exception e) {
			System.err.println("Origen y destino deben ser distintos.");
		}
		return false;
	}
	
	public static String fecha() {
		boolean continuar = true;
		do {
			try {
				System.out.print("Introduce fecha y hora de salida [dd/mm/yyyy hh:mm:ss]: ");
				String entradaUsuario = sc.nextLine();
				//dividimos por partes el input 
				if (entradaUsuario.matches("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\s(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$")) {
					return entradaUsuario;
				} else if (entradaUsuario.equals("S")) {
					return "S";
				}
	
			} catch (Exception e) {
				System.err.println("Patrón dd/MM/yyyy hh:mm:ss");
				System.out.println("Pulsa \"S\" para salir.");
			}
		} while (continuar);
		return null;
	}

	//función para convertir fecha
	public static LocalDateTime convertirFecha(String fecha) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		return LocalDateTime.parse(fecha, formatter);
	}
	
	
	//función para introducir cantidad de asientos a reservar
	public static int cantidadAsientos() {
		boolean continuar = true;
		do {
			try {
				System.out.print("Introduce cantidad de asientos a reservar [min.1, max.8]: ");
				int entradaUsuario = sc.nextInt();
				if ( entradaUsuario >= 0 || entradaUsuario <= 8) {
					continuar = false;
					return entradaUsuario;
				} else if (entradaUsuario == 0) {
					return 0;
				}
			} catch (Exception e) {
				System.err.println("Introduzca un número entre 1 y 8.");
				System.out.println("Pulsa \"0\" para salir.");
			}
		} while (continuar);
		return 0;
	}
	
	
	public static int reservarAsiento(Vuelo v, int numAsientos) {
		// comprobar origen y destino
		
		if (v.getAsientosDisponibles() == 0 || vueloHaSalido(v)) {
			System.err.println("No puede reservar. Vuelo no disponile.");
			return 0;
		} else if (numAsientos > v.getAsientosDisponibles()) {
			System.err.println("No se puede reservar. Queda(n) " + v.getAsientosDisponibles() + " disponible(s).");
			return 1;
		} else {
			int asientos = v.getAsientosDisponibles() - numAsientos;
			v.setAsientosDisponibles(asientos);
			System.out.println("Reserva realizada con éxito.");
			return 2;
		}
	}
	
	public static boolean vueloHaSalido(Vuelo v) {
		LocalDateTime horaActual = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime fechaVuelo = LocalDateTime.parse(v.getFecha(), formato);
		return horaActual.isBefore(fechaVuelo);
		/*
		if(horaActual.isBefore(fechaVuelo)) {
			return false;		
		} else {
			return true;
		}
		*/
	}
	
	public static boolean vueloExiste(String codVuelo) {
		SistemaReservas sr = new SistemaReservas();
		return sr.getListaVuelos().stream().anyMatch(v -> v.getNumeroVuelo().equals(codVuelo));
	}

	public static String nombrePasajero() {
		System.out.println("Introduzca nombre completo, y sus apellidos: ");
		String entradaUsuario = sc.nextLine().toUpperCase().trim();
		// no esté vacío
		// que no tenga números, o caracteres especiales (!"·$%&/(),.¡?¿{}[]*)
		// que tenga espacios
		// string.split(" ") --> esto da una lista, elemento 0 de la lista es el nombre
				//nombre mínimo 2 letras
		// que tenga mínimo 6 caracteres
		// que tenga un máximo 100 caracteres
		if (entradaUsuario.length() > 100 || entradaUsuario.length() < 6) {
			System.err.println("El nombre debe contener entre 6 y 100 caracteres.");
		} else if (!entradaUsuario.matches("^[\\p{IsLatin}’'\\- ]+$")) {
			System.err.println("Puede contener caracteres del alfabeto latín.");
		} else if (!entradaUsuario.contains(" ")) {
			System.err.println("Nombre y Apellidos separados con espacios.");
		}
	}
	
	
	public static String pasaporte() {
		boolean continuar = true;
		do {
			try {
				System.out.print("Introduzca el número de pasaporte [AAA000000]: ");
				String entradaUsuario = sc.nextLine().toUpperCase();
				if (entradaUsuario.matches("^[A-Z]{3}\\d{6}$")) {
					continuar = false;
					return entradaUsuario;
				} else if (entradaUsuario.equals("S")){
					return "S";
				}
			} catch (Exception e) {
				System.err.println("Número de vuelo inválido. Dos letras mayúsculas + 4 dígitos.");
				System.out.println("Pulsa \"S\" para salir.");
			}
		} while (continuar);
		return null;
	}
	
	public static String generarNumReserva (String codVuelo, int numAsientos) {
		//return UUID.randomUUID().toString();
		
		// Vamos a hacer nuestro propio #reserva
		// RSV-fechahora-codVuelo-numAsientos
		LocalDateTime fechaActual = LocalDateTime.now();
		return "RSV-" + fechaActual + "-" + codVuelo + "-" + numAsientos;
	}
	
	public static void devolverAsientos(Vuelo v, int numAsientos) {
		int asientos = v.getAsientosDisponibles() + numAsientos;
		v.setAsientosDisponibles(asientos);
	}
}
