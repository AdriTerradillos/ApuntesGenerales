package _01_fundamentos;
/*
 * ===========================
 * =   FUNDAMENTOS BASICOS   =
 * ===========================
 */

// ======COMENTARIOS====== 
// Esto es un comentario de una sola línea en Java.
// Los comentarios en Java empiezan por "//"
// Son explicaciones que ponemos en nuestro código para aclarar 
// ciertas partes del mismo.
// Son muy útiles para nosotros y para los futuros desarrolladores que lean
// nuestro código.

// Las líneas en Java no se recomiendan que pasen de 80 caracteres

// ======COMENTARIOS MULTILINEA======

/*
 * Poniendo los comentarios con este formato podemos poner comentarios
 * de varias líneas sin necesidad
 * de estar poniendo todo el rato '//'
 */
// El formato sería "/* */" --> al hacerlo el cursor se queda en medio
// al pulsar la tecla ENTER automáticamente podrás ir introduciendo
// texto tantas lineas como desees hasta llegar a '*/' que indica el cierre.

/*
 * Java es un lenguaje de programación orientado a objetos, por lo que 
 * tenemos que usar clases para poder arrancar nuestro programa.
 * Las clases se escriben con notación PascalCase (o UpperCamelCase). Es muy importante
 * seguir las convenciones de código en Java
 *
 * Nótese que las clases siempre tienen bloques asociados, los bloques de 
 * una clase están delimitados por los simbolos "{ }"
 *
 * Las clases tienen que llamar igual que el nombre del fichero donde se
 * encuentran
 */

public class _0000_JavaFundamentos {
    /*
     * Para que un programa funcione tenemos que crear la clase.
     * Dentro de la clase pondremos el método "main".
     * Es un método especial que siempre tiene que llamarse exactamente igual:
     */

    // public static void main(String[] args) {...}

        /*
         * ======TRABAJANDO CON ECLIPSE (de momento no)======
         * Al crear la clase selecciona la casilla de "crear método main"
         * 
         * Si se te olvida no te preocues: escribe main y pulsa "ctrl + espacio"
         */
    public static void main(String[] args) { // ===INICIO METODO MAIN===
        /*
         * Un programa en Java se ejecuta dentro de las llaves { } del método "main".
         * Los métodos siempre tienen el bloque asociado delimitado entre llaves { }.
         * 
         * En todos los lenguajes los programas se ejecutan de manera SECUENCIAL,
         * van línea a línea ejecutando las sentencias.
         * Una sentencia es un comando, orden o instrucción que se le da al programa.
         * 
         * En Java las sentencias acaban con punto y coma ";".
         */

        // Sentencia que le indica al prgrama que imprima por pantalla lo que tiene entre paréntesis:
        System.out.println("Este literal se imprimirá por pantalla cuando lo ejecutemos");
        System.out.println("Hola hola caracola");

        /*
         * Cada texto que hay dentro de System.out.println(); se imprime en una línea diferente.
         * println(); --> contracción de print line (imprimir línea).
         *      - Incluye un salto de línea después de imprimir lo que tenga como argumento (paréntesis).
         */

        System.out.print("Esto sería imprimir sin salto de linea: "); // esta línea NO tiene salto de línea
        System.out.println(" observa cómo lo imprime seguido."); // esta línea sí tiene salto de línea
        System.out.println("Ahora estoy en otra línea porque he usado println(); en el anterior.");

        // Puedo imprimir una línea vacía para dejar una línea en blanco en la consola:
        System.out.println();
        System.out.println("Por dejar un println(); sin argumento se ha quedado la línea en blanco.");
    }// Fin del método "main". Aquí acabaría nuestro programa de Java
        
        // Las sentencias van siempre dentro de métodos! Si ponéis sentencias fuera de los métodos
        // no van a funcionar
        // System.out.println("Ahora lo imprimimos seguido"); // Esto daría error!!
    
} // ===Fin de la clase _000_JavaFundamentos

/*
 * =========================
 * =   MANTENER EL ORDEN   =
 * =========================
 * 
 * Ser ordenados con el código es FUNDAMENTAL.
 * Hay que respetar las tabulaciones, saltos de línea, etc.
 *
 * 
 * ======ECLIPSE======
 * Si el código no tiene errores te va a ayudar a mantener el orden.
 * Simplemente hay que seleccionar el código que queremos ordenar:
 *      ==> CON EL RATON
 *          1. clic con botón derecho.
 *          2. "source" y luego "format"
 *      ==> CON EL TECLADO: ctrl + a
 * 
 * ================
 * =   COMPILAR   =
 * ================
 * 
 * Siempre antes de compilar nuestro código tenemos que guardar los cambios.
 * MANERA FACIL: ctrl + s
 * 
 * Si realizamos cualquier cambio en nuestro código tenemos que guardar.
 * Una vez guardados los cambios podemos volver a compilar.
 * 
 * ======RECORDATORIO======
 * Navega desde la terminal hasta el lugar en el que tienes tu archivo.
 *      cd .. --> subir de nivel
 *      cd carpeta --> ir a la carpeta (dentro del nivel en el que estoy)
 *      pwd --> consultar el directorio en el que me encuentro
 * 
 * Una vez hemos llegado al directorio en el que está el archivo a compilar:
 *      javac archivo.java
 *      java archivo
 * 
 * Si todo va bien y el código es correcto cuando compiles podrás ejecutar el programa.
 * Si hay algún error (como haberse dejado el ";" a final de sentencia,
 * o escribir mal el nombre de alguna variable...) no compilará y saldrá el error por
 * por la terminal. 
 * 
 * Hay muchas maneras de cometer errores.
 */

