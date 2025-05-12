package _03_interfaces._05_listas.ejericio;

import java.util.ArrayList;

/**
 * Crea una jardinera que tiene diferentes plantas.
 * Hay varios tipos de planta: margaritas, lavanda, amapola.
 * En una jardinera caben hasta seis plantas.
 * 
 * Haz tu propia clase genérica para plantar las plantas.
 * 
 */

public class Jardinera<T> {
	private ArrayList<T> plantas = new ArrayList<>();
	
	
	//en la jardinera caben hasta 6 plantas (check)
	// necesito método para añadir plantas a la lista
	public void plantar(T planta ) { 
		// hay una restricción que no puede haber más de 6 plantas
		// puedo consultar el tamaño, así que con un condicional ya filtro
		if (this.plantas.size() < 6) {
			this.plantas.add(planta);
			System.out.println("Se ha plantado: " + planta);
		} else {
			System.out.println("Jardinera llena.");
		}
	}
	
	public void mostrarPlantas() {
		System.out.println("Plantas en la jardinera.");
		this.plantas.forEach(planta -> System.out.println("- " + planta));
	}
	
	

}
