package _07_Bucles;

import java.util.Scanner;

public class _0073_BucleDoWhile {

	/*
	 * Es lo mismo que el bucle "while" aunque cambia un poco la sintaxis.
	 * 
	 * No sabemos cuántas veces se va a tener que repetir el bucle,
	 * pero como mínimo se tiene que ejecutar una vez.
	 * 
	 * do {
	 *     // bloque de lo que tiene que hacer
	 * } while (condicion);
	 */
	
	public static void main(String[] args) {
		
		//Vamos a pedirle un numero al usuario hasta que este entre los valores
		//1 y 10
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca un número entre el 1 y el 10");
			numero = sc.nextInt();
		} while (numero < 1 || numero > 10);
		
		System.out.println("Numero entre 1 y 10");
		
		// Manera similiar, pero avisando al usuario de cuando se ha equivocado
		do {
			System.out.println("Introduzca un número entre el 1 y el 10");
			numero = sc.nextInt();
			if (numero > 10) {
				System.out.println("Te has pasado, tiene que ser más pequeño.");
			}
			if (numero < 1) {
				System.out.println("Te quedaste corto, debe ser mayor.");
			}
		} while (numero < 1 || numero > 10);
		
		System.out.println("Numero entre 1 y 10");
		sc.close();
	}

}
