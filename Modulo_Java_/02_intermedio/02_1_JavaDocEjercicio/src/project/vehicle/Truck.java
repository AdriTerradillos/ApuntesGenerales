package project.vehicle;

import project.track.TrackType;
import project.util.LapTimeAnalyzer;

import java.util.List;

/**
 * Clase que representa un camión de carreras.
 * Tiene en cuenta la capacidad de carga como penalización al rendimiento.
 */
public class Truck extends Vehicle {

    private double loadCapacity;

    /**
     * Crea un nuevo camión.
     *
     * @param model          modelo del camión
     * @param engineType     tipo de motor
     * @param maxSpeed       velocidad máxima
     * @param preferredTrack pista preferida
     * @param loadCapacity   capacidad de carga en kilogramos
     */
    public Truck(String model, EngineType engineType, double maxSpeed, TrackType preferredTrack, double loadCapacity) {
        super(model, engineType, maxSpeed, preferredTrack);
        setLoadCapacity(loadCapacity);
    }

    /**
     * @return capacidad de carga del camión
     */
    public double getLoadCapacity() {
        return loadCapacity;
    }

    /**
     * Establece la capacidad de carga.
     *
     * @param loadCapacity capacidad de carga (kg)
     */
    public void setLoadCapacity(double loadCapacity) {
        if (loadCapacity < 0)
            throw new IllegalArgumentException("loadCapacity debe ser >= 0");
        this.loadCapacity = loadCapacity;
    }

    /**
     * Calcula el rendimiento del camión penalizando la capacidad de carga.
     *
     * @return puntuación de rendimiento
     */
    @Override
    public double calculatePerformanceScore() {
        List<Double> times = lapTimes;
        var stats = LapTimeAnalyzer.analyze(times);
        double penalty = 1 - (loadCapacity / 10000);
        return (getMaxSpeed() / stats.getAverage()) * penalty;
    }
}
