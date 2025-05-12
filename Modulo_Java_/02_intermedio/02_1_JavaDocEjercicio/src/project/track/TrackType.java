package project.track;

/**
 * Enumeración que representa los tipos de pista disponibles en una carrera.
 * Cada tipo define una cantidad de vueltas por defecto.
 */
public enum TrackType {
    /**
     * Pista de carretera convencional.
     */
    ROAD(1000),

    /**
     * Pista de circuito cerrado profesional.
     */
    CIRCUIT(5000),

    /**
     * Pista todo terreno.
     */
    OFFROAD(2000);

    private final int defaultLaps;

    /**
     * Constructor del tipo de pista con vueltas por defecto.
     * @param defaultLaps número de vueltas por defecto
     */
    TrackType(int defaultLaps) {
        this.defaultLaps = defaultLaps;
    }

    /**
     * Devuelve el número de vueltas por defecto para la pista.
     * @return número de vueltas por defecto
     */
    public int getDefaultLaps() {
        return defaultLaps;
    }
}