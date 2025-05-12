package _02_wildcards;

import java.util.ArrayList;
import java.util.List;

import entidades.Bulldog;
import entidades.Mastin;
import entidades.Perro;
//TODO cosas que faltan


//Memotecnia:
//REWS --> Read extends / Write super
//PECS --> Producer extends (producir, leer) / Consumer super (consumir, escribir)

public class PruebaWildcards {
	//Wildcards o Comodines
	public static void main(String[] args) {
		
		List<Perro> listaPerro = new ArrayList<>();
		Mastin mastin1 = new Mastin(); mastin1.setNombre("rufo");
		Mastin mastin2 = new Mastin(); mastin2.setNombre("daisy");
		listaPerro.add(mastin1);
		listaPerro.add(mastin2);
		
		//Esto lo podemos hacer sin problema
		//Mastin es subclase de Perro
		imprimirLista(listaPerro);
		
		//Pero esto dara problemas
		List<Mastin> listaMastin = new ArrayList<>();
		listaMastin.add(mastin1);
		listaMastin.add(mastin2);
		//esto da error ya que solamente puede ser
		//de perros, y no importa que mastin extienda de perro
		//imprimirLista(listaMastin);
		
		System.out.println("---------- Wildcards ----------");
		//podemos usar el otro metodo sin problema para ambas listas
		imprimirListaWildcard(listaPerro);
		imprimirListaWildcard(listaMastin);
		
		//=================================
		//Creo una clase Bulldog que hereda de perro y creo Bulldog
		
		Bulldog bulldog1 = new Bulldog(); bulldog1.setNombre("rocky");
		
		//Puedo usar funciones propias para añadir mastines o sus super clases
		//A una lista <? super Mastin> pero no puedo hacerlo
		//con Bulldog
		aniadirPerroALista(listaPerro, mastin1);
		//aniadirPerroALista(listaPerro, bulldog1);
		
		
		//pero sí tengo más flexibilidad con .add()
		listaPerro.add(bulldog1);
		
	}

	public static void imprimirLista(List<Perro> lista){
		for(Object elemento : lista){
			System.out.println(elemento);
		}		
	}
	
	//la ? le estamos diciendo que puede ser de cualquier tipo
	//podemos poner extends si queremos limitarlo a un tipo de
	//clase
	public static void imprimirListaWildcard(List<?> lista){
		for(Object elemento : lista){
			System.out.println(elemento);
		}		
	}
	
	
	
	//<? extends Perro> acepta cualquier objeto Perro y de sus subclases
	/*
	public static void imprimirListaWildcard(List<? extends Perro> lista){
		for(Object elemento : lista){
			System.out.println(elemento);
		}		
	}
	*/
	
	//¿Podemos hacer lo mismo para interfaces?
	//Sí, pero la palabra clave es extends igualmente
	/*
	public static void imprimirListaWildcard(List<? extends Interfaz> lista){
		for(Object elemento : lista){
			System.out.println(elemento);
		}		
	}
	
	
	ESTO DE AQUI NO SE PUEDE, con extends podemos leer (ver los diferentes elementos)
	
	public static void aniadirPerroALista(List<? extends Perro> lista, Perro perro) {
		lista.add(perro);
	*/
	
	/*
	List<Perro> listaPerro = new ArrayList<>();
	mastin1.add(listaPerro)
	bulldog1.add(listaPerro)
	
	Esto de aquí no me da problema, pero puedo utilizar WildCard para superclases
	Poder utilizar <? super Clase> permite poder escribir (add) elementos a una colección.
	
	public static void aniadirPerroALista(List<? super Mastin> lista, String nombre) {
		lista.add(new Mastin(nombre);
	
	Podría añadir objetos Mastin y Perro, pero si tuviera Bulldog siendo herencia de Perro
	NO PODRIA HACERLO
	 */
	
	public static void aniadirPerroALista(List<? super Mastin> lista, Mastin perro) {
		lista.add(perro);
	}
	
	
}
