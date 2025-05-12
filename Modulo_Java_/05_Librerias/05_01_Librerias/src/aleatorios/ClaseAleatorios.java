package aleatorios;

import java.util.Random;

/**
 * Clase para generar números aleatorios
 */
public class ClaseAleatorios {

	/**
	 * Método que genera un <b>número aleatorio</b> entre dos números
	 * pasados por parámetro
	 * @param n1 el mínimo valor posible del rango (incluido)
	 * @param n2 el máximo valor posible del rango (incluido)
	 * @return el número aleatorio generado
	 */
	public int numeroAleatorioEntreDosNumeros(int n1, int n2) {
		Random rn = new Random();
		//ponemos n2 + 1 para incluir en n2
		int nAleatorio = rn.nextInt(n1, n2 +1);
		return nAleatorio;
	}
	
	/**
	 * Método que genera un número aleatorio entre el 0
	 * y 2^32
	 * @return el número pseudoaleatorio :)
	 */
	public int numeroAleatorio() {
		Random rn = new Random();
		int nAleatorio = rn.nextInt();
		return nAleatorio;
	}
}