package _11_TryCatch;

/*
 * =================
 * =   TRY-CATCH   =
 * =================
 * 
 * Java permite manejar los diferentes errores que pueden ocurrir al ejecutar un programa.
 * A veces ocurren problemas que no dependen de nosotros:
 * - Registrar mal un dato.
 * - No queda espacio en el disco.
 * - No existe el archivo.
 * 
 * La estructura try-catch nos permite responder a esos errores.
 * 
 * Diferencia entre ERROR y EXCEPCION
 * 
 * ======ERROR======
 * Es un problema grave que no puede recuperarse fácilmente.
 * Como puede ser que se agota la memoria o que el sistema operativo no responde.
 * 
 * ======EXCEPTION======
 * Son problemas menos graves que sí pueden manejarse.
 * Las excepciones solemos capturarlas para poder reaccionar.
 * Puede ser que no tengamos permisos para añadir archivos a una carpeta.
 * 
 * ***TIPOS DE EXCEPTION***
 * 1. Checked exception: necesitan obligatoriamente uso de try-catch. (leer un archivo que no existe)
 * 2. Unchecked exception: son opcionales de manejar. (dividir por cero, NullPointerException).
 */

public class _0101_TryCatch {
    /*
     * Dentro del bloque try-catch tenemos dos secciones:
     * 
     * ======TRY======
     * Es el bloque de código donde puede ocurrir la excepción.
     * 
     * En caso que se produzca salta al bloque catch.
     * 
     * ======CATCH======
     * Es el bloque que lanza la excepción en caso de producirse.
     * Así se puede controlar sin que se detenga el programa.
     * 
     * ================
     * =   SINTAXIS   =
     * ================
    try {
        // código que puede lanzar una excepción
    } catch (TipoDeExcepcion e) {
        // código que se ejecuta si ocurre la excepción
    }
     */

    public static void main(String[] args) {
        int a = 10; int b = 0;

        //int resultadoExt = a / b;
        //System.out.println("Resultado: " + resultadoExt);

        try {
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("¡Error! No se puede dividir entre cero.");
        }

        System.out.println("El programa todavía no se detiene.");

        String[] nombres = new String[3];
        nombres[0] = "Alex";
        nombres[2] = "Sonia";

        try {
            for (String no : nombres) {
                System.out.println("El nombre " + no + " tiene " + no.length() + " letras.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético");
        } catch (NullPointerException e) {
            System.out.println("Error: variable sin valor");
        } catch (Exception e) {
            System.out.println("Otro tipo de error");
        }

        System.out.println("Ahora he llegado al final.");
    }   
}