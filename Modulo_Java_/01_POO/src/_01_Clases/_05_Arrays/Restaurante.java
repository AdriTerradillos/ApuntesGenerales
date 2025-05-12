package _01_Clases._05_Arrays;

import java.util.Arrays;

/*
 * ==============================
 * =   REFERENCIAS DE OBJETOS   =
 * ==============================
 * Desde el método main de la clase MainRestauranteArray veremos cómo se pueden
 * utilizar objetos que han sido definidos en otras clases.
 * 
 * Se manipulará el array double[] puntuaciones desde dentro de un objeto,
 * esta manipulación afectará a TODOS los objetos.
 */

public class Restaurante {
	int id;//0
	String nombre;//null
	double[] puntuaciones;//null
	
	//Constructor por defecto (no es necesario escribirlo)
	public Restaurante() {
		super(); //Aprenderemos más sobre super() con las herencias
	}
	
	//Constructor con parámetros
	public Restaurante(int id, String nombre, double[] puntuaciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.puntuaciones = puntuaciones;
	}

	@Override
	public String toString() {
		return "Restaurante [id=" + id + ", nombre=" + nombre + ", puntuaciones=" + Arrays.toString(puntuaciones) + "]";
	}
	
	
}
