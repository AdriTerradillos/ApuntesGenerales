package _07_Bucles;

public class _0075_BreakContinue {

	public static void main(String[] args) {
		/*
		 * Algunas veces nos podremos encontrar con que tenemos que alterar
		 * el flujo de ejecución de los bucles.
		 * 
		 * Para alterar el flujo tenemos dos palabras reservadas:
		 * 1.- break
		 * 2.- continue
		 */

		/* 
		 * =============
		 * =   BREAK   =
		 * =============
		 * Con esta palabra se rompe la ejecución del bucle donde se encuentra,
		 * es decir, sale inmediatamente.
		 */
		
		// Voy a imprimir todos los números naturales del 1 al 7
		for(int i = 1; i <= 10; i++) {
			System.out.println("Numero: " + i);
			if (i == 7) {
				break; // Cuando el número sea 7, dejo de ejecutar el bucle
			}
		}
		// El ejemplo de aquí arriba se puede hacer sin "break" mejorando
		// la condición de parada del bucle (i <= 7)
		for(int i = 1; i <= 7; i++) {
			System.out.println("Numero: " + i);
			}
		
		
		/*
		 * break; --> romperá el bucle en el que se ejecuta,
		 * 			  pero si hay un bucle dentro del bucle
		 * 			  el bucle exterior no se ejecutará.
		 * 
		 * Veremos array de más dimensiones (array que tienen dentro otra array)
		 * Ahí entenderemos mejor la anidación de los bucles.
		 */
		
		System.out.println("---------------- BREAK -------------------------");
		//Vamos a imprimir la tabla de multiplicar de los 5 primeros
		//numeros pero solo los resultados del 1 al 5
		for (int i = 1; i <= 10; i++) { // entra al bucle con un 1
			System.out.println("Tabla de multiplicar del " + i);
			for(int j = 1; j <= 10; j++) { // ejecuta este bucle con i = 1
										   // utiliza j para contar ejecuciones
										   // se ejecutará hasta que j sea <= 10
				System.out.println(j + " x " + i + " es igual a " + (i * j));
				if(j == 5) { // cuando j sea 5 se detendrá este bucle y el bucle superior
							 // pasará a la siguiente iteración, en la que i es 2
					break;//Este "break" rompe el bucle de la "j" NO rompe el bulce "i"
				}
			}
			if(i == 5) {
				break;
			}
		}
		
		System.out.println("------------- CONTINUE --------------------");
		
		//"continue"
		//Esta palabra se usa cuando queremos dejar de ejecutar el código del
		//bucle y queremos pasar a la siguiente iteración. OJO, no rompe
		//completamente la ejecución del bucle
		
		//Imprimir todos los numeros pares del 1 al 10
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.println("Numero par: " + i);
			}			
		}
		
		System.out.println("------------------------------");
		/* 
		 * Este segundo bucle utiliza continue para hacer lo mismo que el anterior
		 * Si el número es impar entra en el condicional y ejecuta continue;
		 * Esto lo que hace es olvidarse que hay más código dentro del bucle
		 * y salta a la siguiente iteración directamente.
		 */
		for(int i = 1; i <= 10; i ++) {
			if(i % 2 != 0) {
				continue;// Saltamos a la siguiente iteracion del bucle
						 // por lo tanto, no se ejecutaria la linea 85
			}	
			System.out.println("Numero par: " + i);
		}
		
		// Vamos a imprimir la tabla de multiplicar de los 6 primeros
		// numeros pares pero solo los resultados del 1 al 6 pares
		for(int i = 1; i <= 6; i ++) {
			if(i % 2 != 0) {
				continue;//volveriamos a la linea 94
			}
			System.out.println("Tabla de multiplicar del " + i);
			for(int j = 1; j <= 6; j++) {
				if(j % 2 != 0) {
					continue;//volveriamos a la línea 99
				}
				System.out.println(j + " x " + i + " es igual a " + (i * j));
			} // cierra el bucle anidado
		} // cierra el bucle principal
	} // cierra main
} // cierra la clase

/*
 * ===================================================
 * =   DIFERENCIA PRINCIPAL ENTRE BREAK Y CONTINUE   =
 * ===================================================
 * 
 * Estructuras de control de bloques de código:
 * 1.- Condicionales: si la condición da true --> ejecuta el bloque entre {}
 * 2.- Bucles: ejecuta el bloque entre llaves {} repetidamente hasta que se dé
 * 			   una condición
 * 	   - For: cuando sé cuántas repeticiones tengo que hacer
 * 	   - While: cuando no se cuantas repeticiones tengo que hacer
 * 
 * También podemos controlar las iteraciones de nuestros bucles.
 * Palabras break y continue:
 * break --> en la línea que se ejecute se detiene el código y sale de ese bucle
 * 		     y ejecuta el código que haya después del bucle de ese nivel.
 * 
 * continue --> en la línea que se ejecute esta palabra reservada va a darle
 * 				la órden al código que debe ejecutrase desde el principio del bucle
 *				pero en la siguiente iteración
 */