package sysos;

/**
 * Clase que permite imprimir una cadena de texto o un número entero
 * utilizando la misma función: <b>imprimir()</b>
 */

public class ImprimirPantalla {
	
	/**
	 * Método que imprime por pantalla "consola: " 
	 * y luego concatena el valor pasado por parámetro
	 * @param s la cadena que se quiere imprimir
	 */
	public void imprimir(String s) {
		System.out.println("consola: " + s);
	}
	
	/**
	 * Método que imprime por pantalla "consola: " 
	 * y luego concatena el valor pasado por parámetro
	 * @param n el entero que se quiere imprimir
	 */
	public void imprimir(int n) {
		System.out.println("consola: " + n);
	}
}