package _01_fundamentos;
/*
 * =================
 * =   LITERALES   =
 * =================
 * 
 * Antes de ver las variables, los LITERALES.
 * Literal es un valor constante que se escribe directamente en el código
 * y que representa un tipo de dato concreto (texto, booleano, número...).
 * 
 * Se pueden asignar a VARIABLES, que es lo siguiente que vamos a ver.
 * 
 * ==========================
 * =   TIPOS DE LITERALES   =
 * ==========================
 * 
 *  - Literales de cadenas de texto (String) que se escriben entre comillas dobles "literal"
 *  - Literales de caracter (char) que se escriben entre comillas simples 'a'
 *  - Literales de números enteros (int)
 *  - Literales de números enteros grandes (long) --> se escribe una L al final del número
 *  - Literales de números decimales (double)
 *  - Literales de números decimales cortos (float) --> se escribe una f al final del número
 *  - Literales booleanos --> true o false
 */
public class _0010_Literales { // ===INICIO DE LA CLASE LITERALES===
    //  Para que se puedan observar salidas por pantalla es necesario el método main
    public static void main(String[] args) {
        // System.out.println(); --> Salida por consola del argumento que se le dé

        // ======LITERALES DE TEXTO======
        // Literal cadena de texto
        System.out.println("Soy un literal de cadena de texto."); // Recuerda: ";" al final de la sentencia.

        // Literal de caracter, es un único caracter
        System.out.println('a'); // 

        // ======LITERALES NUMERICOS======
        // Literal de número entero
        // Los números enteros no tienen ni puntos ni comas
        System.out.println(10);

        // 2.000.000 --> Esto es lo que escribía a mano

        // Si el número es por ejemplo 2 millones se puede usar _ para separar
        // millares y facilitar la lectura. Los _ no se imprimirán
        System.out.println(2_000_000);
        System.out.println(2000000);

        // Literal de número grande (el rango de int es: –2,147,483,648 a 2,147,483,647)
        System.out.println(3456456456L); // 3_456_456_456L
        // No es necesario que supere el rango permitido por int:
        System.out.println(1000L);

        // Literal de número decimal (double)
        // La parte decimal de la parte entera se separa con un punto "."
        System.out.println(52.6789);

        // 52,6789 <-> 52'6789

        // Literal de número decimal pequeño (float)
        System.out.println(1199.99f); // 1_199.99f

        // ======BOOBLEAN======
        // Verdadero
        System.out.println(true);
        // Falso
        System.out.println(false);

    } // Llave que CIERRA metodo main
} // Llave que CIERRA la clase _001_Literales