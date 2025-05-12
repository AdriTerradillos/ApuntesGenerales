package project.vehicle;

import project.racing.Raceable;
import project.racing.Maintainable;
import project.track.TrackType;
import project.util.Validator;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que representa un vehículo que puede participar en una carrera.
 * Define comportamiento común para todos los tipos de vehículos, como gestión de tiempos
 * de vuelta, estado de carrera y mantenimiento.
 */
public abstract class Vehicle implements Raceable, Maintainable {

    private final String model;
    private EngineType engineType;
    private double maxSpeed;
    private TrackType preferredTrack;
    private boolean inRace = false;
    private boolean maintenanceRequired = false;
    public List<Double> lapTimes = new ArrayList<>();

    /**
     * Constructor base para cualquier vehículo.
     *
     * @param model          modelo del vehículo
     * @param engineType     tipo de motor
     * @param maxSpeed       velocidad máxima en km/h
     * @param preferredTrack tipo de pista preferida
     * @throws IllegalArgumentException si alguno de los parámetros es inválido
     */
    public Vehicle(String model, EngineType engineType, double maxSpeed, TrackType preferredTrack) {
        Validator.checkNotNull(model, "Model");
        this.model = model;
        setEngineType(engineType);
        setMaxSpeed(maxSpeed);
        setPreferredTrack(preferredTrack);
    }

    /**
     * @return modelo del vehículo
     */
    public String getModel() {
        return model;
    }

    /**
     * @return tipo de motor
     */
    public EngineType getEngineType() {
        return engineType;
    }

    /**
     * Establece el tipo de motor.
     * @param engineType tipo de motor
     */
    public void setEngineType(EngineType engineType) {
        Validator.checkNotNull(engineType, "EngineType");
        this.engineType = engineType;
    }

    /**
     * @return velocidad máxima del vehículo
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Establece la velocidad máxima.
     * @param maxSpeed velocidad máxima en km/h
     */
    public void setMaxSpeed(double maxSpeed) {
        Validator.checkPositive(maxSpeed, "maxSpeed");
        this.maxSpeed = maxSpeed;
    }

    /**
     * @return tipo de pista preferida
     */
    public TrackType getPreferredTrack() {
        return preferredTrack;
    }

    /**
     * Establece la pista preferida para este vehículo.
     * @param preferredTrack tipo de pista
     */
    public void setPreferredTrack(TrackType preferredTrack) {
        Validator.checkNotNull(preferredTrack, "preferredTrack");
        this.preferredTrack = preferredTrack;
    }

    /**
     * Inicia la carrera, habilitando el registro de vueltas.
     * @throws IllegalStateException si ya está en carrera
     */
    @Override
    public void startRace() {
        if (inRace) throw new IllegalStateException("Ya en carrera");
        inRace = true;
        lapTimes.clear();
    }

    /**
     * Finaliza la carrera y marca que requiere mantenimiento.
     * @throws IllegalStateException si no estaba en carrera
     */
    @Override
    public void stopRace() {
        if (!inRace) throw new IllegalStateException("No en carrera");
        inRace = false;
        maintenanceRequired = true;
    }

    /**
     * Registra un nuevo tiempo de vuelta.
     * @param seconds duración en segundos
     * @throws IllegalArgumentException si el tiempo es <= 0
     */
    @Override
    public void recordLapTime(double seconds) {
        if (!inRace) throw new IllegalStateException("No en carrera");
        Validator.checkPositive(seconds, "lapTime");
        lapTimes.add(seconds);
    }

    /**
     * Indica si requiere mantenimiento tras la carrera.
     * @return true si necesita mantenimiento
     */
    @Override
    public boolean needsService() {
        return maintenanceRequired;
    }

    /**
     * Marca el vehículo como mantenido.
     */
    @Override
    public void performMaintenance() {
        maintenanceRequired = false;
    }

    /**
     * Calcula la puntuación de rendimiento del vehículo.
     * Debe ser implementada por cada subclase según su lógica específica.
     *
     * @return puntuación de rendimiento (mayor es mejor)
     */
    public abstract double calculatePerformanceScore();
}
