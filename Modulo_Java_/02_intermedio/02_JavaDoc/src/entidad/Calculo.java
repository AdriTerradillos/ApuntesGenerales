package entidad;

public class Calculo {

	/**
	 * Método que calcula si un número es primo o no.  
	 * Un número es primo cuando es solamente divisible por sí mismo y por la unidad.
	 *  
	 * @param numero representa el número a calcular.
	 * @return {@code true} en caso de que el número sea primo, {@code false} en caso contrario.
	 */
	public boolean calculoPrimo(int numero) {
		if (numero <= 1) return false;
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) return false;
		}
		return true;
	}
	
	/**
	 * Método que calcula si un número es primo o no.  
	 * El número debe ser menor o igual a 1000.
	 * 
	 * @param numero representa el número a calcular.
	 * @return {@code true} si el número es primo y menor o igual a 1000, 
	 * {@code false} si no es primo o está fuera del rango.
	 */
	public boolean calculoPrimoVersion1(int numero) {
		if (numero > 1000) return false;
		return calculoPrimo(numero);
	}
	
	/**
	 * Método que calcula si un número es primo o no.  
	 * El número debe ser menor o igual a 1000.
	 * 
	 * @param numero representa el número a calcular.
	 * @return 0 si el número es primo,  
	 *         1 si el número NO es primo,  
	 *         2 si el número es superior a 1000.
	 */
	public int calculoPrimoVersion2(int numero) {
		if (numero > 1000) return 2;
		if (calculoPrimo(numero)) return 0;
		return 1;
	}
}