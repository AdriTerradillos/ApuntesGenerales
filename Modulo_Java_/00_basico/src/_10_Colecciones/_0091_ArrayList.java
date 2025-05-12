package _10_Colecciones;

import java.util.ArrayList;
import java.util.Arrays;

public class _0091_ArrayList {
	public static void main(String[] args) {
		//Los arrays "normales" en java tienen un problema y es que son
		//estaticos, es decir, una vez creado el array, el tamaño no
		//puede cambiar nunca. Si creamos un array de 5 elementos
		//solo podra tener 5 elementos.
		
		String[] arrayStrings1 = new String[5];
		//aunque no tenga ningún elemento el array si pregunto
		//por su tamaño, me dice 5
		System.out.println(arrayStrings1.length);

		//Normalmente este tipo de array NO se suele utilizar
		//En su lugar se utilizan arrays dinamicos, es decir
		//arrays que se amplia el tamaño en tiempo de ejecución
		//dicho de otra menera, nunca se llenan.
		
		//La clase ArrayList se tiene que parametrizar, esto es,
		//se pone entre <> el tipo de dato que queremos que contenga
		//el ArraList. A los arraylist yo los llamos listas
		ArrayList<String> listaString1 = new ArrayList<String>();
		//Si preguntamos por el tamaño del array
		System.out.println(listaString1.size());
		
		//Con arrays normales tenemos que tener siempre en cuenta
		//la posición del array que estamos usando
		arrayStrings1[0] = "Tom Sawyer"; //  ["Tom Sawyer", null, null, null, null]
		arrayStrings1[1] = "Scooby Doo";

		// [null, null, null, null, null]
		
		//Con arraylist no necesitamos controlar ultima posición
		//usada, podemos usar el método "add" que añade automáticamente
		//a la última posición libre del array
		listaString1.add("Son Goku");
		listaString1.add("Vegeta"); // ["Son Goku", "Vegeta"]
									// 	     0          1
		listaString1.add(1, "Celula"); // ["Son Goku", "Vegeta"]
									   //             ^		
									   //          "Celula"
									   // ["Son Goku", "Celula", "Vegeta"]

		// Añade un elemento en una posición concreta y lo demás lo desplaza
		
		//Para recorrer array lo posemos igual, pero vemos diferencias
		System.out.println("imprimiendo array");
		for(String s : arrayStrings1) {
			System.out.println(s);
		}

		/*
		 * El array tiene espacio para 5 elementos.
		 * Hemos añadido a Son Goku y a Vegeta.
		 * El resto de elementos son null
		 * ["Son Goku", "Vegeta", null, null, null]
		 */
		
		System.out.println("imprimiendo arraylist");
		for(String s : listaString1) {
			System.out.println(s);
		}

		/*
		 * Hemos creado arrayList sin decirle el tamaño que tiene
		 * ni cantidad de elementos.
		 * Vamos añadiendo elementos con .add()
		 * Y hemos añadido Son Goku, Vegeta
		 * ["Son Goku", "Vegeta"]
		 */
		
		//Accediendo a elementos concretos
		System.out.println(arrayStrings1[0]); // "Son Goku"
		System.out.println(listaString1.get(0)); // "Son Goku"
		
		//Estas dos sentencias dan Exceptiones
		// El array tiene 5 elementos es decir que tiene los indices 0, 1, 2, 3, 4
		//System.out.println(arrayStrings1[5]);//ArrayIndexOutOfBoundsException

		// El arrayList nace vacío y se le han añadido 3 elementos "Son Goku", "Celula", "Vegeta"
		//																0         1          2
		//System.out.println(listaString1.get(3));//IndexOutOfBoundsException
		
		// Con el array cambiamos el valor de un elemento por su posición haciendo una reasignación:
		arrayStrings1[0] = "Son Goan"; // He cambiado a "Son Goku" por "Son Goan"

		// COn arrayList es lo que hacemos con set() --> Cambia el elemento de esa posición por el indicado entre paréntesis
		//Podemos rellenar posicones concretas
									  // ["Son Goku", "Celula", "Vegeta"]
		listaString1.set(1, "Broly"); // ["Son Goku", "Broly", "Vegeta"]

		// set(posición, valor) -> en la posición que se indica pondrá el valor.
		// 						-> sustituye lo que hay en esa posición
		// add(valor) -> añade el valor al final del ArrayList, a la última posición
		// add(posición, valor) -> añadir el valor en la posición que se le indique
		// 						-> lo que había en esa posición se desplaza a la derecha, a las siguientes posiciones

		/*
		 * ===============
		 * =   EJEMPLO   =
		 * ===============
		 * 
		 * ArrayList<String> cuberteria = new ArrayList<>();
		 * ["vaso", "plato", "cuchillo", "cuchra"]
		 * 
		 * cuberteria.add("tenedor") --> ["vaso", "plato", "cuchillo", "cuchra", "tenedor"]
		 * 
		 * me he dejado una jarra y la quiero poner al principio con el resto de la vajilla
		 * cuberteria.add(0, "jarra") --> ["jarra", "vaso", "plato", "cuchillo", "cuchra", "tenedor"]
		 * 
		 * veo que tengo cuchara mal escrito y quiero cambiarlo
		 * cuchara está en el índice 4
		 * cuberteria.set(4, "cuchara") --> ["jarra", "vaso", "plato", "cuchillo", "cuchara", "tenedor"]
		 * sustituye el valor anterior (cuchra) por el que le indico en set
		 */
		
		//Notese la diferencia de imprimir directamente un array y un arraylist
		System.out.println(arrayStrings1);
		System.out.println(listaString1);
		System.out.println(Arrays.toString(arrayStrings1));
		

		//La parametrización de los arraylist NO admiten primitivos
		//pero afortunadamente Java invento los tipo "Wrapper" de los
		//primitivos. Dicho de otra manera todos los primitivos
		//tienen su equivalente a objeto.
		
		int numero1 = 5;
		//Integer numeroObjeto = new Integer(5);
		//Normalmente esta el concepto "auto wrapper" que hace
		//que Java convierta directamente un primitivo a un objeto
		Integer numeroObjeto = 5;//Esto creo un objeto con el valor 5 internamente
		//Los objetos de tipo wrapper son "inmutables". Un objeto inmutable
		//se define como un objeto el cual no se puede cambiar NUNCA el valor
		//de sus atributos (también llamado estado)
		numeroObjeto = 6;
		
		//La clase String tambien es inmutable
		String s = "Sherlock";
		//Aquí lo que estamos cambiando es la referencia de sitio,
		//pero valor del objeto no se cambia (permanece inmutable)
		s = "Dr. Wattson";
		
		String s2 = "Sherlock";
		//ver _01_ArrayList_02_wrappers.jpg
		
		//Existen tipos wrappper para todos los primitivos
		//que se suelen llamar igual que el primitivo pero
		//con la primera letra en mayuscula
		double d1 = 4.5;
		Double d2 = 5.6;
		Boolean b1 = true;
		Float f1 = 5.6F;
		Character c1 = 'f';
		Byte byte1 = 23;
		
		//ArrayList<int> listaEnteros = new ArrayList<>();
		ArrayList<Integer> listaEnteros = new ArrayList<>();
		//Operador diamente, desde la 1.7, y dice que no es
		//necesario crear el objeto con la parametrización,
		//automáticamente coge el de la referencia
		ArrayList<Double> listaDobles = new ArrayList<Double>();


		// quiero hacer una lista de enteros int --> NO PUEDO
		// ArrayList<int> listaEnterosMal = new ArrayList<>();

        /*
         * =   METODOS   =
         * 
         * add() --> añade un numero elemento al final de la lista
         * add(index, element) --> añade el elemento en la posición indicada
         * set(index, element) --> modifica el elemento de esa posición (sustituye lo que ya hay).
         * remove() --> elimina el elemento por posición (por indice)
         * size() --> tamaño de ArrayList
         * get() --> obtiene el elemento por indice
         */
	}
}

