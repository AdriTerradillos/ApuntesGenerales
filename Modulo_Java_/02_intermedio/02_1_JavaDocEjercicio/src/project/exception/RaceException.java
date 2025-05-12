package project.exception;

/**
 * Excepción personalizada utilizada para indicar errores específicos relacionados con
 * la ejecución de una carrera, como configuración inválida o acciones no permitidas.
 */
public class RaceException extends RuntimeException {

    /**
     * Constructor con mensaje de error.
     *
     * @param message descripción del error
     */
    public RaceException(String message) {
        super(message);
    }
}
