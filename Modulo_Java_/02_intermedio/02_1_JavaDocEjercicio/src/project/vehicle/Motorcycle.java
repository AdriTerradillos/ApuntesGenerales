package project.vehicle;

import project.track.TrackType;
import project.util.LapTimeAnalyzer;

import java.util.List;

/**
 * Clase que representa una motocicleta de carreras.
 * Puede tener o no sistema de frenos ABS, lo cual afecta al cálculo del rendimiento.
 */
public class Motorcycle extends Vehicle {

    private boolean hasABS;

    /**
     * Crea una nueva motocicleta.
     *
     * @param model          modelo de la moto
     * @param engineType     tipo de motor
     * @param maxSpeed       velocidad máxima
     * @param preferredTrack pista preferida
     * @param hasABS         indica si tiene ABS
     */
    public Motorcycle(String model, EngineType engineType, double maxSpeed, TrackType preferredTrack, boolean hasABS) {
        super(model, engineType, maxSpeed, preferredTrack);
        this.hasABS = hasABS;
    }

    /**
     * @return {@code true} si tiene ABS
     */
    public boolean hasABS() {
        return hasABS;
    }

    /**
     * Establece si la moto tiene ABS.
     *
     * @param hasABS indicador booleano
     */
    public void setHasABS(boolean hasABS) {
        this.hasABS = hasABS;
    }

    /**
     * Calcula el rendimiento de la moto, considerando su velocidad
     * y si cuenta con ABS (pequeña bonificación).
     *
     * @return puntuación de rendimiento
     */
    @Override
    public double calculatePerformanceScore() {
        List<Double> times = lapTimes;
        var stats = LapTimeAnalyzer.analyze(times);
        double agility = 1 + (hasABS ? 0.1 : -0.1);
        return (getMaxSpeed() / stats.getAverage()) * agility;
    }
}
