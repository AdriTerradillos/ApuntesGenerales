package _03_metodos;
/*
 * Los objetivos de las funciones:
 * 1. Reutilizar código
 * 2. Ordenar código
 * 
 * Tienen parámetros de entrada o de salida.
 * 
 * ======================
 * =   FUNCIONAMIENTO   =
 * ======================
 * 
 * 1. Los métodos se declaran DENTRO de la clase.
 * 2. NO se declaran dentro del método "main". --> No se pueden declarar métodos dentro de métodos.
 * 3. Los métodos tienen que tener nombre.
 * 4. Java es compilado --> podemos declarar un método donde queramos dentro de la clase:
 *    No importa que al principio se llame a un método que se está declarando al final de la clase.
 *    Al compilar el método "se va a crear" y se puede usar en cualquier lugar.
 * 
 *    En un lenguaje NO compilado (como Python) debe declararse el método o la función antes de
 *    utilizarse.
 * 
 * Después del método "main" se van a declarar los distintos métodos. 
 * Recuerda, se utilizan llaves para abrir y cerrar el alcance del método "main".
 * 
 *     public static void main(String[] args) {
 *         // bloque de código
 *     } --> llave de cierre
 * 
 * Baja y sigue profundizando.
 */

public class _0030_Metodos { // ======DECLARACION DE LA CLASE======

	// Ignora esta variable hasta el último método metodoConUnaVariable()
	static String variableGlobal = "Soy global y se me puede usar en toda la clase";

    // ======METODO MAIN======

    public static void main(String[] args) {
		/*
		 * Imagina que esto es una tarea que necesita varias líneas de código para funcionar.
		 * Necesito realizar esta tarea en diferentes momentos, o simplemente quiero un código más limpio,
		 * ordenado y fácil de mantener.
		 */

		System.out.println("=====================================================");
        System.out.println("=   Bienvenidos a las funciones o métodos en Java   =");
		System.out.println("=====================================================");
		System.out.println("Gamma Tech School & Randstad");
        System.out.println("Autor: Alex Bometon");
		System.out.println();

		// Fuera del método "main" voy a declarar un método con el nombre "bienvenida".
		// bienvenida() hará esta tarea que ocupa 5 líneas.
		System.out.println("Después de esto voy a ejecutar el método 'bienvenida()'");
		bienvenida(); // --> realizo la tarea en una única linea.

		// Debajo de la declaración del método "bienvenida()" declaro el método "nombreDelAutor()"
		// Ese método devuelve una cadena de texto, pero no tiene ninguna instrucción
		// que haga que se muestre por pantalla...
		System.out.println("Llamando al método 'nombreDelAutor()'...");
		nombreDelAutor(); // Esto me da --> "Alex Bometon" pero por sí solo no es nada... no digo que se muestre por consola
		

		// Necesito que se vea por consola:
		// Puedo cuardarlo en una variable o hacer un print para que lo muestre directamente.
		String cadenaDelMetodo = nombreDelAutor(); // esto guarda el retorno del método
												   // en este caso es "Alex Bometon"
		System.out.println("Llamo directamente al método: " + nombreDelAutor());
		System.out.println("Llamo a la variable cadenaDelMetodo: " + cadenaDelMetodo);
		System.out.println();

		// ======Método con parámetros======
		// Voy a crear, al final, después de la declaración de nombreDelAutor() otro método imprimirNombre()
		// Este método tendrá un parámetro, al que en el momento de llamarlo le tendré que dar un argumento
		System.out.println("El nombre que sale a continuación es un argumento del método imprimirNombre()");
		imprimirNombre("Sonia Frias"); // Mostrará por pantalla el nombre
		// También se puede dar como argumento una variable, siempre que sea String (en este caso)
		imprimirNombre(cadenaDelMetodo);
		imprimirNombre(nombreDelAutor());
		System.out.println();
		System.out.println("Ahora el método es imprimirNombreApellido() y tiene dos parámetros");
		imprimirNombreApellido("Sonia", "Frias");
		imprimirNombreApellido("Bometon", "Alex"); // Todo lo hace en el orden que se le indica
		System.out.println();
		System.out.println("Entendiendo el alcance y la vida de las variables...");
		// Vamos a intentar que nos muestre la variableMetodo
		// System.out.println(variableMetodo); // --> ni siquiera la encuentra, porque fuera del método no existe.
		metodoConUnaVariable(); // Llamando al método sí lo muestra...
		System.out.println();
		System.out.println("Voy a intentar imprimir variableGlobal desde main: " 
							+ variableGlobal);
		System.out.println("Voy a volver a llamar a metodoConUnaVariable() a ver si también puede imprimirla...");
		metodoConUnaVariable();
    } // cierra método main

    /*
     * ==========================================================
     * =   DECLARANDO TODOS LOS METODOS QUE SE VAN A UTILIZAR   =
     * ==========================================================
     */

	// ======bienvenida======

    // Método bienvenida() --> no va a devolver ningún tipo de dato, va a hacer los prints
	// Recuerda: antes del nombre hay que indicar la clase del tipo de dato que nos va a devolver.
	//           void --> si no va a devolver nada

	public static void bienvenida() { // llave que abre
		// bienvenida() --> no tiene nada dentro del paréntesis, no necesita ningún parámetro para funcionar
		System.out.println("=====================================================");
        System.out.println("=   Bienvenidos a las funciones o métodos en Java   =");
		System.out.println("=====================================================");
		System.out.println("Gamma Tech School & Randstad");
        System.out.println("Autor: Alex Bometon");
		System.out.println();
	} // llave que cierra

	/*
	 * ======Nombre del Autor======
	 * Este método va a devolver un nombre, en una cadena de texto (String).
	 * Para que eso sea así en su declaración donde antes había void ahora debe haber String.
	 *     - String o el tipo/clase que sea lo que vaya a devolver.
	 * 
	 * Recuerda: para que devuelva información de algún tipo/clase se necesita la palabra reservada return.
	 * ==> return --> puede haber tantos como sea necesarios (quizá debe devolver una cosa u otra en base a una condición)
	 * 			  --> va a finalizar la ejecución del método y devolverá la información que se indique en esa línea de código.
	 */

	public static String nombreDelAutor() {
		String nombre = "Alex Bometon";
		return nombre;
		// Se puede hacer directamente esto y sería lo mismo:
		// return "Alex Bometon";
	} // llave que cierra nombreDelAutor

	/*
	 * ======Imprimir Nombre======
	 * Como su nombre indica lo que va a hacer es imprimir un nombre.
	 * Va a tener un parámetro "nombre" que será de la clase String.
	 * No va a devolver nada, su tarea es que salga por consola el nombre.
	 * Cuando a un parámetro le damos un valor eso es su argumento.
	 */

	public static void imprimirNombre(String nombre) { // Se pueden poner tantos como sean necesarios, separados por coma
		System.out.println("Nombre: " + nombre);
	} // llave que cierra imprimirNombre

	// Ahora este método va a tener más de un parámetro
	// Le tendré que dar tantos argumentos como parámetros tenga
	public static void imprimirNombreApellido(String nombre, String apellido) {
		// Dentro de este método no se va a poder declarar ninguna variable con el nombre de los parámetros
		// Los parámetros son como si fueran variables dentro de la función
		// RECUERDA: NO puedes declarar dos variables con el mismo nombre 
		System.out.println("Nombre completo: " + nombre + " " + apellido);
	} // llave que cierra imprimirNombreApellido

	/*
	 * ============================
	 * =   VIDA DE UNA VARIABLE   =
	 * ============================
	 * 
	 * Una variable puede ser llamada dentro de su bloque de código.
	 * 
	 * public class <> {
	 *     <> variableGlobal;
	 *     public static void main(String[] args) {
	 *         System.out.println(variableGlobal); // puedo imprimirla sin problema
	 * 		   System.out.println(variableLocal); // no va a funcionar, solamente puede ser llamada en la declaración del metodo
	 *         metodo(); // mostrará en consola el valor de variableGlobal.
	 * 					 // variableGlobal puede utilizarse desde que abre la llave de la clase hasta que se cierra
	 *					 // todo el código comprendido entre esas llaves puede usarla
	 *     }
	 *     
	 *     public static void metodo() {
	 *         <> variableLocal; // Esta variable únicamente tiene vida aquí dentro
	 * 		   System.out.println(variableGlobal);
	 *     }
	 * }
	 */

	public static void metodoConUnaVariable() {
		String variableMetodo = "Solo puedo ser usada entre las llaves ({}) que de definen el método.";
		System.out.println(variableMetodo);
		// Antes del método main está la variableGlobal
		System.out.println("No sé si puedo imprimir la variableGlobal: " + variableGlobal);
		System.out.println("Resulta que sí pero utilizando la palabra reservada static...");
	}
}