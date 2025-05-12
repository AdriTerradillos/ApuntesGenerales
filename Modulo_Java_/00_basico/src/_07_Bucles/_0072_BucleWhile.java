package _07_Bucles;
import java.util.Scanner;

public class _0072_BucleWhile {

	/*
	 * En ocasiones no se sabe cuántas veces necesitamos repetir una
	 * misma ejecución.
	 * 
	 * Para ello está while, que es una mezcla entre "for" y condicional "if".
	 * 
	 * La lectura sería "mientras se cumpla esto ejecútate"
	 * A diferencia de for, que también lleva una condición, a "for" lo limitamos
	 * utilizando puntos de control.
	 * 
	 * "while" no tiene ese control y debemos ser cautos con las condiciones
	 * para no hacer bucles infinitos, que es más fácil tenerlo que en el bucle "for"
	 * 
	 * 
	 * La sintaxis de esta sentencia es:
	 * while (CONDICION_BOOLEANA) {
	 *     // bloque de código
	 * }
	 */
	public static void main(String[] args) {
		//El ejemplo más facil sería un bucle infinito
		/*
		while(true)
			System.out.println("Esto es un bucle infinito");
		*/
		
		/*
		 * Mientras que en "for" tenemos la variable de control,
		 * la condición, y el incremento en la misma línea;
		 * while tiene el control fuera del bucle.
		 * 
		 * Dentro del bucle alteraremos esa variable de control
		 * para poder llevar la cuenta y que cambie la condición
		 * a false.
		 */
		
		//Imprimir los 10 primeros números mediante un bucle while
		int numero = 1;
		while(numero <=10) {
			System.out.println(numero++);
		}

		/*
		 * Todo aquello que puedes hacer con "for" lo puedes hacer con "while"
		 * (y a la inversa, pero es poco frecuente).
		 * 
		 * En "while" si no cumple la condición no se va a ejecutar ni una vez,
		 * pero la idea es que si no sabemos cuántas veces se tendrá que repetir
		 * la misma instrucción (como pedir una clave con ciertas características
		 * al usuario y no dejar de pedirla hasta que cumpla todas las condiciones)
		 * debemos utilizar "while" (o do while, si necesitamos que como mínimo se
		 * ejecute una vez).
		 */
		
		numero = 11;
		while(numero <=10) {
			System.out.println("Esto no se ejecutaria ninguna vez");
		}
		
		//Vamos a pedirle un numero al usuario hasta que este entre los valores
		//1 y 10
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entre el 1 y el 10, pls :)");
		numero = sc.nextInt();
		while(numero < 1 || numero > 10) {
			System.out.println("El numero es incorrecto");
			System.out.println("Introduzca un número entre el 1 y el 10, pls :)");
			numero = sc.nextInt();
		}
		System.out.println("El numero esta entre 1 y 10");
		
		//Manera equivalente con una variable booleana que hace efecto de "flag"
		boolean correcto = false;//Esta variable hace efecto de "flag" o "bandera"
								 //es decir, va a hacer que se sigua ejecutando
								 //el bucle "while" o no.
								 //En este caso parto de la base en que el usuario
								 //va a introducir mal los datos, por lo tanto
								 //establezco correcto=false
		while(!correcto) {
			System.out.println("Introduzca un número entre el 1 y el 10, pls :)");
			numero = sc.nextInt();
			if(numero <= 10 && numero >= 1) {
				System.out.println("El numero esta entre 1 y 10");
				correcto = true; // al cambiar a true, como en la condición está
								 // negado lo entenderá como false y se parará
								 // el bucle
			}else {
				System.out.println("El numero es incorrecto");
			}			
		}
		sc.close();
	}
}