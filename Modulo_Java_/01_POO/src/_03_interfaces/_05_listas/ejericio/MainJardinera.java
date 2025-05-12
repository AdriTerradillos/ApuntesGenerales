package _03_interfaces._05_listas.ejericio;

public class MainJardinera {
	public static void main(String[] args) {
		
		// Aquí está la jardinera vacía --> necesito una jardinera para añadir plantas
		//public class Jardinera<T> --> ¿Qué va a ser T? --> Las plantas
		//no tengo interfaz ni herencias
		//todas las clases de Java heredan de la clase Object
		// T entonces es Object y así puedo meter dentro todas las plantas
		Jardinera<Object> jardinera = new Jardinera<>();
		
		// Añado diferentes plantas:
		
		jardinera.plantar(new Margarita());
		jardinera.plantar(new Lavanda());
		jardinera.plantar(new Lavanda());
		jardinera.plantar(new Amapola());
		jardinera.plantar(new Amapola());
		jardinera.plantar(new Margarita());
		
		
		// Añado método para poder ver las plantas en la clase Jardinera
		jardinera.mostrarPlantas();
	}
}
