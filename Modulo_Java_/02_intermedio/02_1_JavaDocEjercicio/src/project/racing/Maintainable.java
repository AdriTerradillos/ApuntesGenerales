package project.racing;

/**
 * Interfaz que define el comportamiento de mantenimiento que deben seguir los objetos
 * que requieren revisión técnica tras un uso intensivo, como una carrera.
 */
public interface Maintainable {

    /**
     * Ejecuta el mantenimiento del objeto.
     */
    void performMaintenance();

    /**
     * Indica si el objeto requiere mantenimiento.
     *
     * @return {@code true} si requiere mantenimiento, {@code false} en caso contrario
     */
    boolean needsService();
}
