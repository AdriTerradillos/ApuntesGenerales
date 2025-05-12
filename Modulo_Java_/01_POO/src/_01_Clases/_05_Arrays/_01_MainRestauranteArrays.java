package _01_Clases._05_Arrays;

import java.util.Arrays;

public class _01_MainRestauranteArrays {
	public static void main(String[] args) {
		
		//Genero un array que luego usaré como valor de un atributo del restaurante
		double[] pArray = new double[3]; //esto se va a meter dentro del restaurante
		pArray[0] = 3.0;
		pArray[1] = 4.5;
		pArray[2] = 5.0;
		
		// por ahora pArray hace referencia al array [3.0, 4.5, 5.0]
		
		//Instancia de un objeto restaurante
		//El Restaurante r1 tiene 3 atributos: r1.id, r1.nombre, r1.puntuaciones
		Restaurante r1 = new Restaurante(); //esto tiene un lugar X en la memoria
		r1.id = 1;
		r1.nombre = "McDonalds";
		//r1.puntuaciones apunta al mismo array
		r1.puntuaciones = pArray; // --> ahora el restaurante que está en el lugar X de la memoria tiene dentro pArray
		
		// por ahora r1 hace referencia al restaurante McDonalds
		// el atributo puntuaciones del restaurante McDonalds hace referencia a pArray
		// ahora pArray es accesible desde: la variable pArray y desde el atributo r1.puntuaciones
	
		System.out.println("Array visto desde el restaurante: " 
							+ Arrays.toString(r1.puntuaciones));
		System.out.println("Array visto desde la variable pArray: "
							+ Arrays.toString(pArray));
		pArray[0] = 2.0; //modifico array desde fuera del restaurante
		
		// como que r1.puntuaciones hace referencia a pArray si modifico pArray también veo los cambios en r1.puntuaciones
		
		System.out.println(r1.puntuaciones[0]);
		System.out.println("Viendo el array completo desde el restaurante: "
							+ Arrays.toString(r1.puntuaciones)); //Array modificado igualmente desde dentro del restaurante
		
		//Array de Restaurantes
		Restaurante[] arrayRestaurante;
		arrayRestaurante = new Restaurante[3];
		
		//En arrayRestaurante meto a McDonalds (que tiene un array dentro
		//apuntando a pArray)
		arrayRestaurante[0] = r1; // r1 hace referencia al restaurante McDonalds
								  // estoy poniendo dentro del arrayRestaurante el OBJETO McDonalds
		arrayRestaurante[0].puntuaciones[0] = 1.0; // arrayRestaurante[0] --> accede a McDonalds
												   // .puntuaciones --> accede al array que tenemos en pArray
												   // .puntuaciones[0] = 1.0 --> asigna ese valor a la posición 0 del array que está en pArray
		System.out.println(pArray[0]); // 1.0
	
		/*
		 * Hasta este momento arrayRestaurante[0] es el McDonalds.
		 * A partir de aquí r1 pasa a ser un Restaurante sin nombre.
		 * Pero arrayRestaurante[0] TIENE UN MCDONALDS DENTRO.
		 * 
		 * Ese McDonalds hace referencia a pArray en su atributo puntuaciones.
		 */
		
		/*
		 Momento 1:
		 Hago un restaurante McDonalds en una variable llamada PACO que se aloja en el hueco de memoria 0123
		 
		 Tengo un array de restaurantes en la variable SONIA que está en el lugar de la memoria 9876
		 
		 Dentro de este array pongo el McDonalds dentro, es decir, el cajón de memoria
		 9876 tengo la caja 0123.
		 
		 Momento 2:
		 Cojo la variable PACO y hago un nuevo restaurante y se guarda en el cajón 5454. Los atributos de este restaurante
		 serán diferentes a los atributos que hay en el PACO guardado dentro de SONIA, porque ese PACO
		 sigue haciendo referencia al cajón 0123.
		 
		 Hasta que a SONIA no le indiquemos que ese PACO ha cambiado.
		 
		 */
		
		
		
		/*
		 * String nombre; nombre = new String("Alex");
		 * System.out.println("Tengo una string en la variable NOMBRE que es: " + nombre);
		 * 
		 * 
		 * String[] arrayNombre = new String[2]; 
		 * arrayNombre[0] = nombre; 
		 * System.out.println("Tengo una array que en indice 0 tiene el valor de NOMBRE: "
		 * 						+ Arrays.toString(arrayNombre));
		 * 
		 * 
		 * nombre = new String("Paco");
		 * System.out.println("Tengo una NUEVA string en la variable NOMBRE que es: " + nombre);
		 * System.out.println("Lo que tengo en arrayNombre indice 0 es: "
		 * 						+ Arrays.toString(arrayNombre));
		 * System.out.println("Sigue siendo Alex");
		 * 
		 * 
		 * 
		 * System.out.println("No le he asignado el nuevo objeto que tengo en la variable.");
		 * 
		 * arrayNombre[0] = nombre; 
		 * 
		 * System.out.println("Ahora hago arrayNombre[0] = nombre "
		 * 						+ "--> le digo a array que reasigne la posición 0 al nuevo objeto");
		 * 
		 * System.out.println("Lo que tengo en arrayNombre indice 0 es: "
		 * 						+ Arrays.toString(arrayNombre));
		 * 
		 * 
		 * 
		 * Hasta que no le diga que en lugar 0 del arrayNombre va de nuevo nombre (es decir, Paco)
		 * esto no va a cambiar, seguirá siendo Alex.
		 */
		

		//Nuevo restaurante
		//r1 --> Tenía el McDonalds, pero ahora tendrá un restaurante sin nombre
		r1 = new Restaurante();
		r1.puntuaciones = new double[3]; // como r1 es ahora un restaurante DISTINTO, puntuaciones es un array DISTINTO a pArray
		System.out.println(r1.puntuaciones[0]);		
		
		//Cuidado!! arrayRestaurante[0] = r1 --> pArray
		r1.puntuaciones[1] = 3.5;
		System.out.println("arrayRestaurante tiene dentro a McDonalds, que tiene dentro a pArray");
		System.out.println("Valor de puntuaciones[1] accediendo desde arrayRestaurante: " + arrayRestaurante[0].puntuaciones[1]); //arrayRestaurante[0] --> tiene dentro McDonalds
																 //accedo a puntuaciones[1] que hay dentro de McDonalds
																 //puntuaciones del McDonalds hace referencia a --> pArray
		System.out.println(r1.puntuaciones[1]);
		
		//Todos hacen referencia al mismo
		Restaurante r2 = r1; // tiene dentro el objeto restaurante sin nombre
		Restaurante r3 = r2; // r2 tiene dentro el objeto restaurante sin nombre que tiene r1
		Restaurante r4 = r1; // tiene dentro el objeto restaurante sin nombre
		
		r2.puntuaciones[2] = 5.0;
		System.out.println(r2.puntuaciones[2]);
		System.out.println(r3.puntuaciones[2]); // r3 --> tiene dentro r2 que hace referencia a r1
		System.out.println(r4.puntuaciones[2]);
		
		r1.puntuaciones[1] = 3.5;
		r2.puntuaciones[0] = 1.7;
		r3.puntuaciones[2] = 4.5;
		r4.puntuaciones[2] = 7.5;
		r1.puntuaciones[0] = 6.3;
		r1.puntuaciones[2] = 3.3;
		r4.puntuaciones[2] = 7.5;
		
		arrayRestaurante[1] = r4;
		
		arrayRestaurante[1].puntuaciones[1] = 2.0;
		System.out.println(r2.puntuaciones[1]); //2.0  --> r1, r2, r3, r4 y arrayRestaurantes[1] hacen ref al mismo restaurante
		
		r3.puntuaciones[1] = 4.5;
		
		System.out.println(r2.puntuaciones[1]); //4.5 --> r1, r2, r3, r4 y arrayRestaurantes[1] hacen ref al mismo objeto
		
		System.out.println(r4.puntuaciones[0]); // 6.3
		System.out.println(r3.puntuaciones[1]); // 3.5
		
		r4 = new Restaurante(); // r4 --> pasa a ser un nuevo objeto
		r4.puntuaciones = new double[3];
		r4.puntuaciones[1] = 7.5; // puntuaciones[1] no tiene nada que ver con r1, r2, r3 ni arrayRestaurantes[1]
		
		System.out.println(r2.puntuaciones[1]); //3.5 --> sigue siendo lo mismo que en r1, r3 y arrayRestaurantes[1]
		System.out.println(r4.puntuaciones[1]); //7.5 --> es distinto porque ahora r4 es un nuevo objeto
		
		
		arrayRestaurante[1].puntuaciones[2] = 3.3; // --> arrayRestaurante[1] es el mismo objeto que r1, r2 y r3. Se modifica para ellos
		System.out.println(r4.puntuaciones[2]); // 0.0 --> r4 es un nuevo objeto y no se le ha asignado nada todavía
		System.out.println(r1.puntuaciones[2]); // 3.3 --> r1, r2, r3 y arrayRestarante[1] siguen siendo lo mismo, pero r4 YA NO
		System.out.println(r2.puntuaciones[2]); // 3.3
		System.out.println(r3.puntuaciones[2]); // 3.3
		
		//System.out.println("------------------");
		//mostrarPuntuacion(r2.puntuaciones[2]);
		//mostrarPuntuacion(r3.puntuaciones[2]);
		//mostrarPuntuacion(r4.puntuaciones[2]);
	}
	
	public static void mostrarPuntuacion(double p) {
		System.out.println(p);
	}
}
