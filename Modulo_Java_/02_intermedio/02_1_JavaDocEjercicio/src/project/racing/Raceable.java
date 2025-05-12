package project.racing;

/**
 * Interfaz que define las operaciones básicas que debe implementar cualquier objeto
 * que pueda participar en una carrera.
 */
public interface Raceable {

    /**
     * Inicia la carrera para el objeto.
     */
    void startRace();

    /**
     * Finaliza la carrera para el objeto.
     */
    void stopRace();

    /**
     * Registra un tiempo de vuelta en segundos.
     *
     * @param seconds tiempo de vuelta en segundos
     * @throws IllegalArgumentException si el tiempo no es válido
     */
    void recordLapTime(double seconds);
}
