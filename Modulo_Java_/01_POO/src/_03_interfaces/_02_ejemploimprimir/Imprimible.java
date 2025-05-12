package _03_interfaces._02_ejemploimprimir;

/**
*
* Las interfaces muchas veces acaban en "able" o empiezan por "I"
*/
public interface Imprimible {
	/**
	 * Este método imprime un valor pasado por parámetro
	 * por algun tipo de salida
	 * @param cadena el valor a imprimir
	 */
	void imprimir(String cadena);
}
