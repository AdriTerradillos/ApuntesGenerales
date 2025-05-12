package project.util;

/**
 * Clase utilitaria para realizar validaciones comunes de entrada de datos en el sistema.
 * Evita duplicar código de validación en las distintas clases del proyecto.
 */
public class Validator {

    /**
     * Verifica que un objeto no sea null.
     *
     * @param obj  objeto a comprobar
     * @param name nombre del parámetro (para el mensaje de error)
     * @throws IllegalArgumentException si el objeto es null
     */
    public static void checkNotNull(Object obj, String name) {
        if (obj == null) {
            throw new IllegalArgumentException(name + " no puede ser null");
        }
    }

    /**
     * Verifica que un valor numérico sea mayor que cero.
     *
     * @param value valor a comprobar
     * @param name  nombre del parámetro (para el mensaje de error)
     * @throws IllegalArgumentException si el valor es menor o igual a cero
     */
    public static void checkPositive(double value, String name) {
        if (value <= 0) {
            throw new IllegalArgumentException(name + " debe ser positivo");
        }
    }
}
