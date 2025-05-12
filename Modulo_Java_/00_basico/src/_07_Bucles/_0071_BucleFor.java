package _07_Bucles;
public class _0071_BucleFor {
	/*
	 * Otra manera de controlar el flujo del código que no sean los bloques condicionales
	 * es utilizar bucles.
	 * 
	 * Los bucles los vamos a utilizar cuando tenemos que realizar una tarea repetitiva.
	 * 
	 * Todo bucle for empieza con la sentencia "for". Indistintamente de si es for o for-each.
	 */
		
	public static void main(String[] args) {
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		System.out.println("Hola en este tema vamos a hablar de bucles");
		
		/*
		 * Quiero imprimir esta misma frase 10 veces.
		 * No necesito escribir 10 veces el mismo código.
		 * Puedo utilizar un bucle con 10 iteraciones:
		 * 
		 * =================
		 * =   BUCLE FOR   =
		 * =================
		 * 1.- for
		 * 2.- variable de control, generalmente int
		 * 3.- condición. Mientras sea true el bucle se ejecutará
		 * 4.- incremento de la variable de control
		 * 
		 * Las partes 2, 3, 4 van entre paréntesis y separadas por ";"
		 */

		System.out.println("------------------ FOR ---------------------");
		for(int i = 1; i <= 10;i++) { // empeza en 1 y ejecuta mientras sea < ó = a 10.
									  // cuando no cumpla esa condición parará.
			System.out.println("Hola en este tema vamos a hablar de bucles");
		}

		/*
		for (int i = 10; i <= 20; i++) {
			System.out.println("Estoy en la vuelta: " + i);
		}
		*/

		/*
		 * 1.- Variable de control:
		 * Podemos inicializar la variable de control con cualquier valor.
		 * Generalmente, en 0.
		 * Si tenemos una colección y queremos acceder a sus elementos
		 * por sus índices: Java empieza a contar las posiciones desde 0.
		 * 
		 * 2.- Condición:
		 * Verificamos el valor de la variable de control con una condición.
		 * La condición será cualquiera que necesitemos que se cumpla en función
		 * de las necesidades que tengamos.
		 * 
		 * Si la condición se cumple entrará en el bloque de código del bucle.
		 * Cuando termine todas las instrucciones se ejecutará incremento.
		 * 
		 * 3.- Incremento:
		 * El incremento es la tercera parte del paréntesis después de for.
		 * El incremento puede ser cualquier operación aritmética, según
		 * necesite la lógica de nuestro bucle.
		 */

		/*
		 * Primera vuelta del bucle
		 * i = 1 --> inicializamos el bucle con este valor
		 * i <= 10 --> cumple la condición, así que entra en el bucle
		 * System.out.println("Hola en este tema vamos a hablar de bucles");
		 * el siguiente paso es incremento de la variable de control i++
		 * 
		 * Segunda vuelta del bucle
		 * hemos incrementado en 1 unidad la variable de control i, con i++
		 * ahora i = 2
		 * i <= 10 --> cumple la condición, así que entra en el bucle
		 * System.out.println("Hola en este tema vamos a hablar de bucles");
		 * el siguiente paso es incremento de la variable de control i++
		 * 
		 * Tercera vuelta del bucle...
		 * Cuarta vuelta...
		 * ...
		 * 
		 * Décima vuelta del bucle
		 * ahora i = 10
		 * i <= 10 --> cumple la condición, así que entra en el bucle
		 * System.out.println("Hola en este tema vamos a hablar de bucles");
		 * el siguiente paso es incremento de la variable de control i++
		 * 
		 * Ahora va a intentar hacer otra iteración:
		 * i = 11
		 * i <= 10 --> la condición es false, el bucle ya no se va a ejecutar
		 */

		/* 
		 * Cuando ÚNICAMENTE tenemos una sentencia dentro del bucle, igual que con
		 * las condiciones, no hace falta que se utilicen las llaves {}.
		 * 
		 * La primera línea de código, en el ejemplo System.out.println(); formará parte
		 * del bucle, las siguientes no.
		 */
		
		System.out.println("------------------ FOR 100000---------------------");
		for(int i = 1; i <= 100_000;i++) 
			System.out.println("Hola en este tema vamos a hablar de bucles");
		
		/*
		 * Si hay más de una instrucción se necesitan llaves {}
		 * Es recomendable (y hace más claro y legible el código) utilizar 
		 * siempre las llaves {}
		 */

		//Es habitual
		System.out.println("------------------ FOR CON BLOQUE---------------------");
		for(int i = 1; i <= 1_000;i++) {
			System.out.println("Hola en este bucle");	
			System.out.println("Vamos a ejecutar varias sentencias");
		}

		//Complicando el bucle
		System.out.println("------------------ FOR CON BLOQUE + CONDICIONES---------------------");
		for(int i = 1; i <= 1_000;i++) {
			if (i % 2 == 0) {
				System.out.println("Esta vuelta es par.");
			} else {	
				System.out.println("Esta vuelta es impar.");
			}
		}
		
		System.out.println("------------------ FOR USANDO LA VARIABLE DE CONTROL---------------------");
		for(int i = 1; i <= 10; i++) {
			System.out.println("Hola este bucle lo hemos ejecutado " + i);
		}
		
		/*
		 * La variable de control i, creada para controlar las iteraciones del bucle,
		 * no existe fuera del bucle. Su ciclo de vida es el bucle.
		 * Si fuera del bucle intentamos usarla Java nos dará un error.
		 */

		// Descomenta la siguiente línea y verás el tipo de error
		//System.out.println("No puedo acceder a la variable 'i'" + i);
		
		System.out.println("------------------ FOR SOLO PARES---------------------");
		//Imprimir solo los pares
		for(int i = 0; i <= 10;i += 2) {
			System.out.println("Hola este bucle lo hemos ejecutado " + i);
			//i++;//No es buena practica alterar la variable de control de bucle fuera del "for"
		}

		System.out.println("------------------ FOR SOLO PARES---------------------");
		//Imprimir solo los pares
		for(int i = 0; i <= 10;i++) {
			if (i % 2 == 0) {
				System.out.println("Hola este bucle lo hemos ejecutado " + i);
			}
			//i++;//No es buena practica alterar la variable de control de bucle fuera del "for"
		}

		//Normalmente usamos la palabra "iteracion" para referirnos a cada
		//salto del bucle
		
		//Todas las partes del "for" son OPCIONALES
		//for(;;) {
			//OJO, cuidado con bucles que no paran porque podemos hacer
			//un bucle infinto
			//System.out.println("Esto es un bulce infinito");
		//}

		/*
		 * Un bucle infinito se estará ejecutando hasta que los recursos de nuestro
		 * sistema se agoten. CUIDADO: sobrecarga el sistema, entre otros.
		 * 
		 * 1. Consumo de CPU: va a estar utilizando uno de los núcleos del procesador
		 * 					  al 100% para ejecutarlo.
		 * 2. Memory Leaks: si tenemos una colección a la que le vamos añadiendo elementos
		 * 					de manera infinita va a colapsar la RAM.
		 * 3. Bloqueo de programa: si se trabaja con diferentes hilos de ejecución y está
		 * 						   en el hilo principal el programa deja de responder.
		 * 4. Sobrecarga de logs: si dentro del bucle hay escritura a un archivo o consola
		 * 						  se va a llenar el log rápidamente o nos va a dejar sin
		 * 						  espacio el disco.  
		 */
		
		//A veces podemos hacer que no entre en un bucle por error de programacion
		for(int i = 0; i > 1_000;i += 2) {
			System.out.println("Esto no se imprime nunca " + i);
		}
		
		//A veces podemos hacer que bucles infinitos por error
		//Bueno, en este caso se parara cuando llegue al maximo rango del "int"
		/* 
		for(int i = 1001; i > 1_000;i += 1) {
			System.out.println("Esto se imprime muuuuuchas veces " + i);
		}
		*/
		
		/*
		 * =======================
		 * =   RECOMENDACIONES   =
		 * =======================
		 * 
		 * 1.- Escribe la variable de control en un papel para ver cómo va incrementando
		 * 2.- SIEMPRE haz bloques con el uso de las llaves {}, aunque solo sea para
		 *     una sentencia.
		 */
		
		//Podemos declarar la variable de control de bucle fuera del bucle
		int i = 0;
		for(i = 0; i <= 1_000;i += 2) {
			System.out.println("Hola este bucle lo hemos ejecutado " + i);
		}
		System.out.println("Ahora si que puede acceder a la variable de control: " + i);
		
		//Usando bucles podemos resolver de varias maneras los ejercicios
		//jugando con la variable de control y las condiciones de ejecución
		for(int j = 0; j <=9; j++) {
			System.out.println("Hola a todos");
		}
		
		for(int j = 1; j <=10; j++) {
			System.out.println("Hola a todos");
		}
		
		for(int j = 10; j <=20; j++) {
			System.out.println("Hola a todos");
		}
		
		//Las tres maneras anteriores son equivalente, imprimen 10 veces por pantalla
		
		//Podemos seguir usando variables para las condiciones de bucle
		int numero = 10;
		for(int j = 1; j <= numero; j++) {
			System.out.println("Hola 10 veces");
		}

		/*
		 * =======================================
		 * =   DIFERENCIA ENTRE FOR y FOR EACH   =
		 * =======================================
		 */

		// si tengo que repetir una tarea sin recorrer una coleccion (como array)
		// ¿puedo utilizar for-each?
		// NO, hay una excepción --> String
		String texto = "Lorem ipsum";
		// texto.toCharArray() --> char[] texto = {'L','o','r','e','m',' ','i','p','s','u','m'};
		int contarM = 0;
		for (char letra : texto.toCharArray()) { // aplico método toCharArray() a texto
												 // a partir de ahora es un 
			if (letra == 'm') { // quiero imprimir la letra 'm'
				System.out.println(letra);
			}
			// quiero contar cuántas 'm' hay:
			if (letra == 'm') {
				contarM++;
			}
			
			// System.out.println("hay " + contarM + " letras 'm'.");
			
			/*
			 * Si ponemos este print dentro del bucle se va a imprimir
			 * con cada iteración.
			 * La primera vez, con la L, no cumple y el print dirá que hay 0 Ms
			 * La segunda vez, con la o, no cumple y el print dirá que hay 0 Ms
			 * así sucesivamente hasta llegar a la primera 'm'
			 * A partir de ahí, el contador pasará a 1 y cada iteración 
			 * mostrará el print con el mensaje: "hay 1 letras 'm'."
			 */
		}
		System.out.println("hay " + contarM + " letras 'm'."); // este print va fuera del bucle
															   // así solo se imprime una vez con el resultado

		// ======LO MISMO CON BUCLE FOR======
		contarM = 0;
		for (int j = 0; j < texto.length(); j++) {
			/* 
			if (texto.toCharArray()[j] == 'm') {
				contarM++;
			}

			Comento este condicional porque hay una manera más sencilla de hacerlo
			*/
			if (texto.charAt(j) == 'm') {
				contarM++;
			}
		}
		System.out.println("hay " + contarM + " Ms en texto.");
		
		//Podemos invocar funciones dentro de un bucle "for"
		for(int j = 1; j <= numero; j++) {
			imprimirNumero(j);
		}
		
		//De igual manera podemos invocar funciones que hagan bucles for
		imprimirXVecesNumero(10);
		imprimirXVecesNumero(100);
	}
	
	public static void imprimirNumero(int numero) {
		System.out.println("El numero es : " + numero);
	}
	
	public static void imprimirXVecesNumero(int numero) {
		for(int j = 1; j <= numero; j++) {
			imprimirNumero(j);
		}
	}
}