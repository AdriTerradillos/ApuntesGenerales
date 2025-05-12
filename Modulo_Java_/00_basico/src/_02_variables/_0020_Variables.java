package _02_variables;
/*
 * =================
 * =   VARIABLES   =
 * =================
 * En Java, una variable es un espacio en la memoria que se utiliza para 
 * almacenar un valor específico (generalmente un literal). 
 * Las variables tienen un tipo, un nombre y un valor.
 *  
 * El nombre de una variable es un identificador único que se 
 * utiliza para hacer referencia al valor almacenado en esa variable. 
 * El tipo de una variable especifica qué tipo puede almacenarse en 
 * ella y el valor es el dato que se guarda.
 *
 * Java es un lenguaje de tipado estático, lo que significa que el tipo de 
 * una variable debe ser especificado al momento de declararla. Además,
 * no se podrá cambiar el tipo de dato que puede contener esa variable.
 * 
 * ======DECLARACION DE UNA VARIABLE======
 * [tipo] [nombre] = [valor];
 * Se declara una variable en el momento que se crea.
 * Una vez ha sido creada no se puede volver a crear otra vez,
 * pero si utilizar, simplemente llamándolas por su nombre.
 * 
 * El nombre de las variables únicamente puede empezar por:
 *      1. caracter alfabético
 *      2. guión bajo '_'
 *      3. símbolo del dólar '$'
 * Se escribe el nombre en camelCase.
 * 
 * ==================
 * =   CONSTANTES   =
 * ==================
 * Hay un tipo especial de variable que es una constante.
 * A una constante no se le puede cambiar el valor.
 * Tampoco se puede hacer una reasignación a lo largo del ciclo de vida
 * de la variable.
 * Como las variables pueden ser de cualquier tipo.
 * Si son una constante de clase, más adelante sabréis qué significa,
 * hay que indicar si son públicas, privadas, protegidas...
 * 
 * Si una constante se declara dentro del método main 
 * únicamente necesita la palabra reservada final antes del tipo.
 * Las constantes se escriben enteramente en mayúsculas separando
 * las palabras con guiones bajos _
 */
public class _0020_Variables { // Llave de inicio de la clase
    public static void main(String[] args) { // Llave de inicio del método main
        // ======DECLARACION CON ASIGNACION======
        // En el momento que se declara se le asigna el valor.
        // Variable de un número del tipo int
        int numero = 5;
        System.out.println(numero);
        System.out.println("Variable con valor: " + numero);

        // ======DECLARACION======
        // Número entero sin valor
        int numeroVacio;
        // System.out.println("Se ha declarado numeroVacio: " + numeroVacio); //--> numeroVacio no tiene valor
        // Asignación de valor a la variable
        numeroVacio = 7;
        System.out.println("Ahora viene valor: " + numeroVacio);

        /*
         * ====================
         * =   REASIGNACION   =
         * ====================
         * Cuando ya se ha declarado una variable se le puede reasignar otro valor
         * siempre que cumpla la condición de ser del mismo tipo.
         */

        int numeroCambiante = 70;
        System.out.println("He declarado una variable int cuyo valor es:");
        System.out.println(numeroCambiante);
        System.out.println("Le voy a hacer una reasignación con otro int:");
        numeroCambiante = 1500; // 1500 también es int y va a sustituir el valor
        System.out.println(numeroCambiante);

        // Se pueden declarar variables de cualquiera de los tipos primitivos
        // o clases, u objetos... (lo entenderéis más adelante).

        long numeroGrande = 500L; // si es long se indica con la L al final.
        double numeroDecimal = 5.25;
        boolean variableBooleana = true;

        // tipos menos usados
        // byte --> números muy pequeños -128 a 127
        byte numeroByte = 1;
        // short --> -32768 a 32767
        short numeroShort = 31_500;
        //float --> decimal de menos precisión
        float numeroFloat = 5.25f; // si es float se indica con la f al final.
        
        // Tipo char recuerda que va entre comillas simples y es un único caracter
        char unaLetra = 'b';

        // Las cadenas de texto son String, va en mayúscula
        String cadenaDeTexto = "Una cadena de texto siempre con comillas dobles \"\"";

        System.out.println("Número grande no muestra la L:");
        System.out.println(numeroGrande);
        System.out.println("Los números no muestran _ que se usa para facilitar la lectura:");
        System.out.println(numeroShort);
        System.out.println("Los decimales float no muestran la f:");
        System.out.println(numeroFloat);
        System.out.println("Una variable vive dentro de todo el bloque entre las mismas {}");
        System.out.println(numero);

        /*
         * ==============
         * =   STRING   =
         * ==============
         * Las variables String su tipo empieza en mayúscula porque String es una clase.
         * Al ser una clase este tipo de variables tendrán algunos métodos que podrán usarse
         * los métodos realizarán una determinada tarea sobre la variable que se aplique.
         * 
         * ======OPERACIONES CON CADENAS======
         * Se pueden sumar dos cadenas, generando una nueva.
         * Se pueden comparar dos cadenas para validar si son iguales
         */

         /*
          * "tortilla"
          "patata"

          "tortilla" + "patata" = "tortillapatata"
          */
        
        // ======CONCATENACION======
        String adjetivo = "fácil";
        String sufijo = "mente";
        String adverbio = adjetivo + sufijo; // "fácil" + "mente"
        System.out.println("Tengo un adjetivo: " + adjetivo);
        System.out.println("Tengo un sufijo: " + sufijo);
        System.out.println("Al juntarlos sale este adverbio: " + adverbio);

        // ======COMPARACION======
        String nombre = "Alex";
        String apellido = "Bometón";
        // Cuando haga la comparación me devolverá un boolean
        // Si lo almaceno tengo que asignar ese tipo a la variable
        boolean comparacion = nombre.equals(apellido); // false
        System.out.println("Voy a comparar si mi nombre (" 
                           + nombre + ") y mi apellido (" 
                           + apellido + ") son iguales");
        System.out.println("La respuesta es: " + comparacion);

        // Con char, al ser tipo primitivo no se utiliza ningún método
        char letraA = 'a';
        char letraB = 'b';
        // Una comparativa será verdadera o falsa
        boolean aIgualB = letraA == letraB; // false
        System.out.println("¿Son 'a' y 'b' la misma letra?: " + aIgualB);
        
        // Declaro otra variable con otra letra
        char letra3 = 'a';
        boolean aIgual3 = letraA == letra3; // true
        System.out.println("¿Son la variable letraA y la variable letra3 iguales?: " + aIgual3);

        /*
         * =================
         * =   CONSTANTE   =
         * =================
         * final [tipo] [NOMBRE] = [valor];
         */

        final double NUMERO_PI = 3.1416;
        // no se puede cambiar ese valor
        // NUMERO_PI = 2.35; // error

    } // Llave de cierre de main
} // Llave de cierre de la clase
