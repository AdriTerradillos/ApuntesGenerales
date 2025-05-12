package _07_Bucles;

public class _0074_BucleForEach {

	public static void main(String[] args) {
		// Hay una manera mas sencilla de recorrer arrays sin tener 
		// que usar el for normal, que es el llamado "for-each"
		String[] blackWidow = new String[4];
		blackWidow[0] = "Natasha";
		blackWidow[1] = "Romanoff";
		blackWidow[2] = "+00459876543";
		blackWidow[3] = "Molotov";
		
		/*
		 * ==============================
		 * =   ESTRUCTURA DEL FOREACH   =
		 * ==============================
		 * 
		 * for (<tipo> nomVariable : array) {
		 * 		// nomVariable --> va a contener el valor de cada posición del array.
		 * }
		 */

		for(String s : blackWidow) {
			System.out.println(s);
		}
		
		/*
		 * Con este tipo de bucle no vamos a poder acceder a los diferentes elementos
		 * del array por su índice.
		 * 
		 * ======VENTAJAS======
		 * 1.- Es muy sencillo de recorrer completamente un array por todas sus posiciones.
		 * 2.- Es más rápido de escribir.
		 * 
		 * ======INCONVENIENTES======
		 * 1.- No tenemos acceso al índice.
		 * 2.- No podemos alterar la manera de recorrere el array. Por ejemplo, 
		 * 	   no podemos acceder solamente a los pares.
		 * 
		 * Para solucionar el problema podemos ayudarnos de variables auxiliares,
		 * así podremos controlar el índice.
		 * 
		 * 
		 */

		int posicion = 1;
		for(String s : blackWidow) {
			System.out.println(posicion + "-" + s);
			posicion++;
		}

		// lo mismo pero en FOR
		for (int i = 1; i < blackWidow.length; i++){
			System.out.println(i + "-" + blackWidow[i]);
		}

		// lo mismo pero en WHILE
		posicion = 1;
		while (posicion < blackWidow.length) {
			System.out.println(posicion + "-" + blackWidow[posicion]);
		}
	}
}