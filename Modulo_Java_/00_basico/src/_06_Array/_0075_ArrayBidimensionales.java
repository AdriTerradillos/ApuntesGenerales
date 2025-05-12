package _06_Array;
public class _0075_ArrayBidimensionales {

	public static void main(String[] args) {
		/*
		 * [1, 2, 3, 4] --> int
		 * 
		 * [[], [], []] --> array de 3 elementos --> cada elemento es: array
		 * 
		 * [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
		 * 
		 * [[1, 2, 3], [100, 200, 300], [4000, 5678, 9999]]
		 * 
		 * ======PROHIBIDO======
		 * Subarrays de diferentes elementos, o tipos
		 * 
		 * [[1, 2, 3], [1, 2, 3, 4], [1, 2]] --> NO
		 * [['a', 'b', 'c'], [1, 2, 3]] --> NO
		 */



		// Los arrays que hemos trabajado anteriormente son también conocidos como 
		// "unidimensionales", por ejemplo podemos guardar el eje de las X.
		
		// Existen también los arrays bidimensionales, para guardar por ejemplo
		// puntos en un eje de coordenadas de X e Y.

		// Diferencia entre array simple y array unidimensional
		// unidimensional
		// <tipo>[] nombreArray = {elemento, ...};
		// <tipo>[] nombreArray = new <tipo>[n_posiciones];

		// BIDIMENSIONAL
		int[][] ejeXY = new int[3][3];
		ejeXY[1][1] = 2;
		ejeXY[2][1] = 3;
		ejeXY[0][1] = 4; // Esto da error en tiempo de ejecucción
						 // si lo dejamos así

		ejeXY[0][0] = 0; // esto tendríamos que repetirlo por cada elemento
						 // que se queda vacío.

		/*
		 * [[_, 4, _], [_, 2, _], [_, 3, _]]
		 */
		

		// ======BUCLE ANIDADO====== 
		for(int x = 0; x < ejeXY.length;x++){ // primera dimensión
			for(int y = 0; y < ejeXY[x].length; y++) { // segunda dimensión 
				System.out.println(ejeXY[x][y]);
			}
		}

		/* EXPLICACION DETALLADA
		 * Entro en el primer bucle
		 * 1ª --> [[X], [], []]
		 * Entro en el segundo bucle
		 * 	- en la primera iteración del primer bucle x = 0
		 *  - en la primera iteración del segundo bucle ejeXY[0].length
		 * [[0, 1, 2], [], []] --> se llena la primera y se termina el segundo bucle
		 * 
		 * Vuelvo al primer bucle --> x = 1
		 * 2ª --> [[], [X], []]
		 * Entro en el segundo bucle
		 * 	- en la segunda iteración del primer bucle x = 1
		 *  - en la primera iteración del segundo bucle ejeXY[1].length
		 * [[0, 1, 2], [0, 1, 2], []] --> se llena la segunda y se termina el segundo bucle
		 * 
		 * Vuelvo al primer bucle --> x = 2
		 * 2ª --> [[], [], [X]]
		 * Entro en el segundo bucle
		 * 	- en la tercera iteración del primer bucle x = 2
		 *  - en la primera iteración del segundo bucle ejeXY[2].length
		 * [[0, 1, 2], [0, 1, 2], [0, 1, 2]] --> se llena la segunda y se termina el segundo bucle
		 * 
		 * 
		 */
		
		String[][] avengers = new String[3][4];
		// Podríamos hacerlo con Arrays
		avengers[0][0] = "Steve";
		avengers[0][1] = "Rogers";
		avengers[0][2] = "+0044789567432";
		avengers[0][3] = "Queens";
		
		avengers[1][0] = "Natasha";
		avengers[1][1] = "Romanoff";
		avengers[1][2] = "+004633434444";
		avengers[1][3] = "Molotov";
		
		avengers[2][0] = "Bruce";
		avengers[2][1] = "Baner";
		avengers[2][2] = "+00558737373";
		avengers[2][3] = "Manhattan";
		
		for(int x = 0; x < avengers.length;x++){
			System.out.println("----- DATOS DEL AVENGER " + (x+1) + " --------------");
			for(int y = 0; y < avengers[x].length; y++) {
				System.out.print(avengers[x][y] + " - ");
			}
			System.out.println();
		}


		/* FOREACH
		 * Nos obliga a tener una variable de control declarada antes del bucle.
		 */

		int primeraDimension = 0;
		for (String[] cliente: avengers) {
			int segundaDimension = 0;
			for (String c: cliente) {
				c = "Alex"; // esta c es única para este bucle
				System.out.println(avengers[primeraDimension][segundaDimension]);
			}
		}
	}

}