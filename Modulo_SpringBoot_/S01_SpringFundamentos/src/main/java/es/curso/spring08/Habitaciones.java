package es.curso.spring08;


// import de las clases necesarias

import es.curso.spring08.tipoHabitaculo;
import java.util.List;
import java.util.ArrayList;


public class Habitaciones<Habitacion> {
	
	// genero el ArrayList nuevo
	 private List<Habitacion> habitaciones = new ArrayList<>();
	
	 
	// genero los atributos de la clase Habitaciones
	 
	private int id;
	private int metrosCuadrados;
	private String tipoHabitaculo;  // incorporar baño, cocina, salaEstar, dormitorio (denro de una nueva clase llamada tipoHabitaculo)
	private int numero;   // número del portal 
	
	
	
	// getters y setters de clase Habitaciones
	
	public List<Habitaciones> getHabitaciones() {
		return habitaciones;
	
	public void setHabitaciones(List<tipoHabitaculo> habitaciones) {
		this.habitaciones = habitaciones;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}
	
	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}
	
	
	
	public String getTipoHabitacion() {
		return tipoHabitaculo;
	}
	
	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitaculo = tipoHabitacion;
	}
	
	
	
	public int getNumeroHabitacion() {
		return numero;
	}
	
	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numero = numeroHabitacion;
	}
	
	
	
	// genero el método toString(), para hacer legible el mensaje en consola de la clase Habitaciones.
	
	@Override
	public String toString() {
		return "Habitaciones [id= " + id + 
				", metrosCuadrados= " + metrosCuadrados + 
				", tipoHabitaculo= " + tipoHabitaculo + 
				", numero= " + numero + 
				"]";
	}


	
	
	
}