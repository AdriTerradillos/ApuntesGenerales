package project.racing;

import project.driver.Driver;
import project.track.TrackType;
import project.exception.RaceException;

import java.util.*;

/**
 * Clase que representa una carrera con múltiples conductores, tipo de pista y lógica
 * para gestión de vueltas, estrategia y determinación del ganador.
 */
public class Race {
    private final String name;
    private final TrackType trackType;
    private final int laps;
    private final List<Driver> participants = new ArrayList<>();
    private final List<RaceEvent> listeners = new ArrayList<>();

    /**
     * Crea una nueva carrera.
     *
     * @param name nombre de la carrera
     * @param trackType tipo de pista
     * @param laps número de vueltas (si es {@code null}, se usa el valor por defecto del tipo de pista)
     */
    public Race(String name, TrackType trackType, Integer laps) {
        this.name = Objects.requireNonNull(name);
        this.trackType = Objects.requireNonNull(trackType);
        this.laps = laps != null ? laps : trackType.getDefaultLaps();
    }

    /**
     * Añade un conductor a la carrera. Verifica que el vehículo sea apto para la pista.
     *
     * @param d conductor participante
     * @throws RaceException si el vehículo del conductor no es válido para esta pista
     */
    public void addParticipant(Driver d) {
        if (d.getVehicle() == null || d.getVehicle().getPreferredTrack() != trackType)
            throw new RaceException("Vehículo no apto para tipo de pista");
        participants.add(d);
    }

    /**
     * Registra un observador para eventos de la carrera.
     *
     * @param listener objeto que escucha eventos como vuelta completada o finalización de carrera
     */
    public void addListener(RaceEvent listener) {
        listeners.add(listener);
    }

    /**
     * Inicia la carrera, ejecutando el número de vueltas configurado.
     * Registra tiempos de vuelta aleatorios simulados y aplica estrategias de conducción.
     */
    public void start() {
        participants.forEach(Driver::startDriving);
        for (int lap = 1; lap <= laps; lap++) {
            for (Driver d : participants) {
                double t = Math.random() * 10 + (1000 / d.getVehicle().getMaxSpeed());
                d.recordLap(t);
                listeners.forEach(l -> l.onLapComplete(d, t));
            }
        }
        participants.forEach(Driver::stopDriving);
        Driver winner = determineWinner();
        listeners.forEach(l -> l.onRaceFinish(winner));
    }

    /**
     * Determina el ganador de la carrera según la puntuación de rendimiento de su vehículo.
     *
     * @return conductor ganador
     * @throws RaceException si no hay participantes
     */
    private Driver determineWinner() {
        return participants.stream()
                .max(Comparator.comparingDouble(d ->
                        d.getVehicle().calculatePerformanceScore()))
                .orElseThrow(() -> new RaceException("Sin participantes"));
    }
}
