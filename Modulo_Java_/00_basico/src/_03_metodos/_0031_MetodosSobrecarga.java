package _03_metodos;
/*
 * ===============================
 * =   ESTRUCTURA DE UN METODO   =
 * ===============================
 * Repaso:
 * === 1 === VISIBILIDAD
 * === 2 === TIPO
 * === 3 === RETORNO
 * === 4 === NOMBRE --> firma
 * === 5 === PARAMETROS --> firma
 * === 6 === LLAVES { }
 * 
 * public/privado static void/... nombreMetodo(parametros si se necesitan) {
 *     codigo con sus tareas
 * }
 * 
 * =======================
 * =   FIRMA DE METODO   =
 * =======================
 * La firma sirve para identificar concretamente cada función
 * Forman parte de la firma el NOMBRE y los PARAMETROS
 * 
 * ==================
 * =   SOBRECARGA   =
 * ==================
 * Más de un método con el mismo nombre pero diferente firma:
 *    - Cambia el tipo de los parámetros de entrada.
 *    - Cambia el número de parámetros de entrada
 * 
 * System.out.prinln() es un ejemplo. 
 */

public class _0031_MetodosSobrecarga { // ======DECLARACION DE LA CLASE======
	// constante para usar de separador
	public static final String SEPARADOR = "----------------------------";

	public static void main(String[] args) { // ===INICIO METODO MAIN===
		imprimirLong(34);
		System.out.println();
		imprimirSuma(45, 55);
		System.out.println();
		// imprimirLong("pepe");
		imprimirCadena("pepe");
			/*
			 * public static void imprimirCadena(String s1) {
			 * 	   System.out.println(SEPARADOR);
			 * 	   System.out.println("Salida imprimirCadena: " + s1);
			 * 	   System.out.println(SEPARADOR);
			 * }
			 */
		System.out.println();
		imprimirCadena("maria", "luisa");
			/*
			 * public static void imprimirCadena(String s1, String s2) {
			 * 	   System.out.println(SEPARADOR);
			 * 	   System.out.println("Salida 1: " + s1);
			 * 	   System.out.println("Salida 2: " + s2);
			 * 	   System.out.println(SEPARADOR);
			 * }
			 */

		imprimirCadena("un argumento");
		imprimirCadena("primer argumento", "segundo argumento");
		imprimirCadena("primer argumento", 23.45);

		System.out.println();
		imprimirCadena("Manolo", 34);
		System.out.println();
		
		// Gracias a la sobrecarga puedo usar la función imprimir
		// y dependiendo del parámetro de entrada, se invocará
		// una función u otra
		imprimir(34.56);
		imprimir(100L);
		imprimir("Texto");
		
		System.out.println("Fin de programa");
	} // LLAVE DE CIERRE METODO MAIN
	
	private static void imprimirLong(long n1) {
		System.out.println(SEPARADOR);
		System.out.println("Salida imprimirLong: " + n1);
		System.out.println(SEPARADOR);
	}
	
	// Podemos invocar a funciones dentro de otras funciones y suele ser muy habitual
	private static void imprimirSuma(int n1, int n2) {
		long resultado = n1 + n2;
		System.out.println("Salida imprimirSuma (llama internamente a imprimirLong):");
		imprimirLong(resultado);
	}
	
	private static void imprimirCadena(String s1) {
		System.out.println(SEPARADOR);
		System.out.println("Salida imprimirCadena: " + s1);
		System.out.println(SEPARADOR);
	}
	
	// La siguiente función daria error, porque tiene la MISMA FIRMA que la
	// función de arriba. Para Java ambas funciones son iguales
	/*
		private static void imprimirCadena(String s1) {
			System.out.println("----------------------------");
		}
	*/
	//La función de arriba no daría error si cambiamos el nombre
	
	// Creamos otra función que se llame igual, PERO cambiamos el número
	// de parámetros de entrada. Por lo tanto, la firma es diferente:
	private static void imprimirCadena(String s1, String s2) {
		System.out.println(SEPARADOR);
		System.out.println("Salida imprimirCadena dos parámetros:");
		System.out.println("Salida 1: " + s1);
		System.out.println("Salida 2: " + s2);
		System.out.println(SEPARADOR);
	}
	
	// Ahora cambiamos la firma de la función, variando el TIPO de parámetros
	// de entrada:
	private static void imprimirCadena(String s1,double d2) {
		System.out.println(SEPARADOR);
		System.out.println("Salida imprimirCadena dos parámetros:");
		System.out.println("Salida 1: " + s1);
		System.out.println("Salida 1: " + d2);
		System.out.println(SEPARADOR);
	}
	
	// Vamos a sobrecargar la función imprimir(), para hacerla genérica
	private static void imprimir(long valor) {
		System.out.println("-------- long --------------");
		System.out.println("salida: " + valor);
		System.out.println("----------------------------");
	}
	
	private static void imprimir(String valor) {
		System.out.println("------- String -------------");
		System.out.println("salida: " + valor);
		System.out.println("----------------------------");
	}
	
	private static void imprimir(double valor) {
		System.out.println("------- double -------------");
		System.out.println("salida: " + valor);
		System.out.println("----------------------------");
	}
	
	// La siguiente función daría error en tiempo de compilación porque
	// tiene la misma firma que el método de arriba. El parámetro de
	// salida NO pertenece a la firma de un método, por lo tanto
	// Java no tiene manera de distinguirlos:
	/*
		private static String imprimir(double valor) {
			System.out.println("------- double -------------");
			System.out.println("salida: " + valor);
			System.out.println("----------------------------");
			return "Valor * valor es: " + valor * valor;
		}
	*/
} // === LLAVE DE CIERRE DE CLASE