package _09_Clases;

import java.util.Random;

public class _0081_ClaseRandom {
	public static void main(String[] args) {

		/*
		 * =====
		 * =   RANGOS   =
		 * =====
		 * 
		 * Rango entre un número inicial y un número final
		 * inicio de rango --> 1
		 * fin de rango --> 11
		 * 
		 * Si solo tengo enteros...
		 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, \\\\ 11, 12...
		 * 
		 * fin de rango es 11 y es el punto en el que se detiene
		 */
		
		// Con la clase random podemos generar primitivos aleatorios de manera sencilla
		Random rd = new Random();
		
		// Mirar documentación para ver lo que hace
		int numeroEntero = rd.nextInt(1, 11);//generando un numero entre el 1 y el 10
		System.out.println("Numero aleatorio: " + numeroEntero);
		
		double numeroDouble = rd.nextDouble(1.0, 100.0);
		System.out.println("Numero double aleatorio: " + numeroDouble);
		
		// Son llamadas numeros pseudoaleatorios ya que se basan siempre en una semilla
		// incial
		Random rdSemilla = new Random(1000);
		// En este caso, como la semilla es igual en el objeto Random
		// siempre generara los mismos números aleatorios
		numeroEntero = rdSemilla.nextInt(1, 11);
		System.out.println("Numero aleatorio: " + numeroEntero);
		numeroDouble = rdSemilla.nextDouble(1.0, 100.0);
		System.out.println("Numero double aleatorio: " + numeroDouble);
		

		/*
		 * Tengo una semilla
		 * Quiero sacar tres aleatorios entre el 1 y el 10
		 * 
		 * CON SEMILLA
		 * me salen 3, 4, 3
		 * 
		 * sin semilla --> cada vez que ejecutemos el programa saldrán diferentes
		 */
	}
}
