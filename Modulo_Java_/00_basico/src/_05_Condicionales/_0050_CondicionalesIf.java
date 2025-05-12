package _05_Condicionales;
import java.util.Scanner;

public class _0050_CondicionalesIf {
	public static void main(String[] args) {		
		boolean cierto = true;
		if(cierto) // Como la variable 'cierto' es TRUE, entramos dentro del condicional
			System.out.println("La variable tiene valor TRUE");
		

		cierto = false;
		if(cierto) // Como la variable 'cierto' es FALSE, NO entramos dentro del condicional
			System.out.println("La variable tiene valor FALSE (esto no se imprime, ulio)");
		
		// Puedo jugar con operadores para alterar la expresión boolean
		if(!cierto)
			System.out.println("La variable tiene valor FALSE, pero está negada.");
		
		int numero = 7;
		if(numero > 5)
			System.out.println("La variable 'numero' es mayor que 5");
		
		numero = 4;
		if(numero > 5) {
			System.out.println("La variable 'numero' es mayor que 5");
		}
		
		// Si queremos que la condicion afecta a más de una línea, debemos
		// de usar un 'bloque'
		numero = 6;
		if(numero > 5) {
			System.out.println("Hurra!! El numero es mayor que 5");
			System.out.println("El numero es: " + numero);
		}
		// IMPORTANTE: Se considera buena práctica de programación en Java
		// hacer siempre bloques en los condicionales, ya que facilita la
		// lectura. Es decir, no importa si haceis una línea o varias, 
		// siempre en conveniente hacer un bloque
		
		// La sentencia 'if' puede contener otra palabra reservada en caso
		// de que no se cumpla la condición. La palabra es 'else'
		numero = 3;
		if(numero > 5) {
			System.out.println("El número es mayor que 5");
		}else {
			System.out.println("El número es menor o igual que 5");
		}
		
		// Normalmente las condiciones se basan en entradas de usuario o parámetros
		// de entrada
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número para saber si es mayor, igual o menor 5");
		numero = sc.nextInt();
		if(numero > 5) {
			System.out.println("El número es mayor que 5");
		}else {
			System.out.println("El número es menor o igual que 5");
		}
		
		// Existe otra variente del 'if' que nos da la opción de poner más condiciones
		// a valorar, que es 'else if'. Podemos poner tanto 'else if' como queramos.
		if(numero > 5) {
			// Si entra por esta condicion, NO valora el 'else if' y por supuesto
			// tampoco entraría por el 'else'
			System.out.println("El número es mayor que 5");
		} else if (numero < 5) { 
			// Si no se cumple la condicion del 'if', valora esta otra opción
			// Si la condición del if se cumple NO se valora esta
			// otra opción
			System.out.println("El número es menor que 5");
		} else if (numero == 5) { // Para comparar valores se usa '=='
			// Si no cumple el primer 'if' y no cumple el segundo 'else if'
			// entonces valoramos esta opción
			System.out.println("El número es igual a 5");
		}/*else {// El 'else' lo podemos usar si lo necesitamos, pero en 
				 // este caso no tiene sentido
			System.out.println("El número es menor o igual que 5");
		}*/
		

		// CONDICION HECHO EN CLASE UTILIZANDO ELSE
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d";

		System.out.println("Introduce una letra");
		String letra = sc.next();

		if (a.equals(letra)) {
			System.out.println("Me has escrito una a");
		} else if (b.equals(letra)) {
			System.out.println("Me has escrito una b");
		} else if (c.equals(letra)) {
			System.out.println("Me has escrito una c");
		} else if (d.equals(letra)) {
			System.out.println("Me has escrito una d");
		} // else {
		// 	System.out.println("No se admite esta letra.");
		// }




		// Podemos ver como los bloques 'else if' y 'else' son totalmente
		// optativos. Además, el bloque 'else if' se puede repetir, mientras
		// que el bloque 'else' solo puede haber uno (si lo hay).
		
		System.out.println("Fin de programa");
		
		sc.close();

	}
}