package project.vehicle;

import project.track.TrackType;
import project.util.LapTimeAnalyzer;

import java.util.List;

/**
 * Clase que representa un coche de carreras.
 * Incorpora lógica propia para calcular el rendimiento en función del número de puertas.
 */
public class Car extends Vehicle {

    private int doorCount;

    /**
     * Crea un coche con sus características específicas.
     *
     * @param model          modelo del coche
     * @param engineType     tipo de motor
     * @param maxSpeed       velocidad máxima en km/h
     * @param preferredTrack tipo de pista preferida
     * @param doorCount      número de puertas (entre 2 y 5)
     * @throws IllegalArgumentException si el número de puertas es inválido
     */
    public Car(String model, EngineType engineType, double maxSpeed, TrackType preferredTrack, int doorCount) {
        super(model, engineType, maxSpeed, preferredTrack);
        setDoorCount(doorCount);
    }

    /**
     * @return número de puertas del coche
     */
    public int getDoorCount() {
        return doorCount;
    }

    /**
     * Establece el número de puertas.
     *
     * @param doorCount número de puertas
     */
    public void setDoorCount(int doorCount) {
        if (doorCount < 2 || doorCount > 5)
            throw new IllegalArgumentException("doorCount debe estar entre 2 y 5");
        this.doorCount = doorCount;
    }

    /**
     * Calcula el rendimiento del coche en función de la velocidad máxima,
     * la regularidad de los tiempos de vuelta y el número de puertas.
     *
     * @return puntuación de rendimiento
     */
    @Override
    public double calculatePerformanceScore() {
        List<Double> times = lapTimes;
        var stats = LapTimeAnalyzer.analyze(times);
        double consistency = 1 / (1 + LapTimeAnalyzer.stdDev(times));
        return (getMaxSpeed() / stats.getAverage()) * (doorCount / 2.0) * consistency;
    }
}
