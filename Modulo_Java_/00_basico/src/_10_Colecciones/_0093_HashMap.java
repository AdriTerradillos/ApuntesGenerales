package _10_Colecciones;

import java.util.HashMap;

public class _0093_HashMap {
	public static void main(String[] args) {
		//Tenemos otro tipo de estructuras MUY importantes que son
		//las llamadas estructuras hash, diccionarios o arrays asociacivos,
		//según el lenguaje que estemos usando
		
		//Este tipo de estructuras se caracterizan por tener una clave
		//y un valor asociados, es decir, a partir de una clave podemos
		//acceder o modificar un valor
		
		//Solamente puede haber UNA clave, en caso de que se pongan dos
		//claves iguales, el valor se sobreescribe
		
		//Para crear una estructura de tipo hash, podemos usar la clase
		//HashMap

        /*
         * =======CREAR UN HASHMAP======
         */
		
		HashMap<String, Double> temperaturas = new HashMap<>();

        // =======INSERTAR DATOS=======
		
		//podemos establecer claves y valores con el método put(clave,valor)
		temperaturas.put("Madrid", 10.0);
		temperaturas.put("Barcelona", 11.0);
        temperaturas.put("Sevilla", 12.0);
		
        // ======OBTENER DATOS=======

        System.out.println("Se puede obtener el valor de cada key.");

		//podemos acceder a los valores con el método get(clave) 
		Double temperatura = temperaturas.get("Madrid"); // 10.0
		System.out.println(temperatura);
		temperatura = temperaturas.get("Barcelona"); // 11.0
		System.out.println(temperatura);
		//Si accedemos a una clave que NO exite te devuelve NULL
		temperatura = temperaturas.get("Zaragoza");
		System.out.println(temperatura);
		
		//Las clave son CASE SENSITIVE
		//No es lo mismo "Madrid" que "MADRID"
		temperatura = temperaturas.get("MADRID"); // esto no existe no puede encontrarlo
		System.out.println(temperatura);

        // ========VERIFICAR PRESENCIA DE DATOS=========

        System.out.println("Se puede verificar la presencia de una key");
		
		//Podemos saber si una clave existe con el método containsKey()
		//que devuelve true o false
		System.out.println(temperaturas.containsKey("Madrid")); // true
		System.out.println(temperaturas.containsKey("MADRID")); // false

        System.out.println("También de un value...");

        //Igual que con las key se puede verificar la presencia de un Value
        //con el método containsValue()
        System.out.println(temperaturas.containsValue(11.0)); // true

        // ========ELIMINAR PARES DE VALOR========
        // Con el método remove()
        System.out.println("Se pueden eliminar valores indicando su key:");
        System.out.println("Antes de eliminar existe Sevilla: " + temperaturas.containsKey("Sevilla")); // true
        temperaturas.remove("Sevilla"); // ahora deja de existir "Sevilla" y su temperatura dentro del Map
        System.out.println("Después de eliminar existe Sevilla: " + temperaturas.containsKey("Sevilla")); // false
        
        
        // ========RECORRER UN HASHMAP========
        /*
         * Se puede recorrer un HashMap por sus keys, y también por sus value.
         * Al se pares de valores.
         * 
         * ===RECORRER POR KEYS===
         * keySet() --> utilizando un for-each recorre el HashMap por sus key
         * values() --> utilizando un for-each recorre el HashMap por sus value
         * entrySet() --> utilizando un for-each recorre el HashMap por el par de valores
         */

        System.out.println("Recorriendo HashMap");
        System.out.println("\nPor las key...");
        for (String ciudad : temperaturas.keySet()) { // Madrid, Barcelona, ...
            System.out.println("Estoy en: " + ciudad);
            System.out.println("Con una temperatura de: " + temperaturas.get(ciudad)); // 10.0
        }

        System.out.println("\nPor los value...");
        for (double temp : temperaturas.values()) {
            System.out.println("Estoy a: " + temp + " grados.");
        }

        System.out.println("\nPor el par de valores...");

        //Java soporta la inferencia de tipos:
        //Esta característica puede definir el tipo de variable que es al
        //asignar el primer valor. Pero al ser de tipado estático siempre
        //tendrá ese tipo. 
        for (var entry : temperaturas.entrySet()) {
            System.out.println("La ciudad es el key: " + entry.getKey());
            System.out.println("la temperatura es el value: " + entry.getValue());
        }

        /*
         * Una utilidad muy eficiente es que podemos utilizarlo como contador de palabras
         * con el método getOrDefault()
         * 
         * Convertimos un texto en un array y luego simplemente tenemos que declarar
         * un HashMap que irá acumulando el recuento de palabras. Recuerda que cada key
         * es única, así que se puede añadir al recuento sin añadir keys
         */

        String texto = "hola mundo mundo hola hola mundo hola";
        String[] palabras = texto.split(" "); // ["hola", "mundo", "mundo", "hola", "hola", "mundo", "hola"]

        HashMap<String, Integer> contador = new HashMap<>();
        for (String palabra : palabras) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }


        /*
         * antes de entrar al bucle
         * {}
         * primera iteración
         * {"hola":1}
         * segunda iteración
         * {"hola":1,
         *  "mundo":1}
         * tercera iteración
         * {"hola":1,
         *  "mundo":2}
         * cuarta iteración
         * {"hola":2,
         *  "mundo":2}
         * quinta iteración
         * {"hola":3,
         *  "mundo":2}
         * sexta iteración
         * {"hola":4,
         *  "mundo":3}
         */
    }
}