package _03_interfaces._05_listas;

//Esto se llama Generics en Java

/*
 * Un Generic en Java es una forma de crear clases, interfaces y datos.
 * Antes de los Generics en una colección (lista, map...) se podía
 * añadir cualquier tipo objeto. Esto suponía errores en tiempo de ejecución.
 * 
 * Con el uso de generics es como decirle a Java "solo acepta este tipo"
 * también "acepta cualquier tipo, pero de forma segura".
 * 
 * Seguridad de tipo: no se puede meter un String en una colección de Integer.
 * Reutilización de código: mismo método para muchos tipos de dato.
 * Evitar ClassCastException: no es necesario convertir datos manualmente.
 * 
 * La <X> es una letra genérica y puede ser cualquier tipo de dato.
 * Por convención:
 * 		- T: type
 * 		- E: element (listas)
 * 		- K, V: key, value
 */
public class Almacen<X> {
	
	private X dato;

	public X getDato() {
		return dato;
	}

	public void setDato(X dato) {
		this.dato = dato;
		
	}
}