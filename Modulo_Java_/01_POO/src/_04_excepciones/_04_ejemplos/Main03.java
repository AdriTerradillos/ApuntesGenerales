package _04_excepciones._04_ejemplos;

public class Main03 {
	public static void main(String[] args) {
		// Aquí, num es más grande que denom
		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };
		try { // try externo
			for (int i = 0; i < nums.length; i++) {
				try { // try anidado
					System.out.println(nums[i] + " / " + denom[i] + " es " + nums[i] / denom[i]);
				} catch (ArithmeticException exc) {
					// Capturando la excepción de división por cero, si no
					//puede capturar la excepción se propaga al siguiente
					//catch (ArrayIndexOutOfBoundsException)
					System.err.println("No se puede dividir por cero!");
				}
			}
		} catch (ArrayIndexOutOfBoundsException exc) {
			// Capturando la excepción de cuando nos pasamos del array
			System.err.println("Alguna excepción ocurrió.");
			System.err.println("ERROR: Programa terminado.");
		}
	}

}