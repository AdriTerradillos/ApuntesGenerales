package Ejercicios._01_Clases.ejerciciosrelacionesvisibilidad;

/*
====================
=   ENUNCIADO 03   =
====================


Ejercicio 3: Sistema de Reservas de Vuelos

====Enunciado:====

Un programa simula un sistema de reservas de vuelos.
Cada vuelo tiene un número de vuelo, una ciudad de origen, una ciudad de destino, una fecha y un número de asientos disponibles.
Los pasajeros pueden realizar reservas para un vuelo.
Cada reserva está asociada a un pasajero (con su nombre y número de pasaporte) y a un vuelo.
El sistema debe permitir buscar vuelos por origen y destino, realizar una reserva (si hay asientos disponibles) y cancelar una reserva.

====Clases:====

***Vuelo:
	- Atributos: numeroVuelo (String), origen (String), destino (String), fecha (String), asientosDisponibles (int).
	- Métodos: reservarAsiento(), cancelarReserva(), obtenerNumeroVuelo(), obtenerOrigen(), obtenerDestino(), obtenerFecha(), obtenerAsientosDisponibles().
***Pasajero:
	- Atributos: nombre (String), numeroPasaporte (String).
	- Métodos: obtenerNombre(), obtenerNumeroPasaporte().
***Reserva:
	- Atributos: pasajero (Pasajero), vuelo (Vuelo), codigoReserva (String generado automáticamente).
	- Métodos: obtenerPasajero(), obtenerVuelo(), obtenerCodigoReserva().
***SistemaReservas: (Clase principal)
	- Atributo: listaVuelos (ArrayList de Vuelo), listaReservas (ArrayList de Reserva).
	- Métodos: agregarVuelo(Vuelo vuelo), buscarVuelos(String origen, String destino), realizarReserva(Pasajero pasajero, Vuelo vuelo), cancelarReserva(String codigoReserva).
***UsuarioReservas: (Clase principal para interactuar)
	- Método: main() que permita realizar las acciones mencionadas en el enunciado.

====Paquetes:====

model: Contendrá las clases Vuelo, Pasajero y Reserva.
service: Contendrá la clase SistemaReservas.
ui: Contendrá la clase UsuarioReservas.
 */

public class ejercicio03 {

}
