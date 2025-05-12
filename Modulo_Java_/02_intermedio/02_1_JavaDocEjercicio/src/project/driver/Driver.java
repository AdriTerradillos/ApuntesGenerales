package project.driver;

import project.vehicle.Vehicle;
import project.exception.RaceException;
import project.racing.Strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un piloto que participa en una carrera. Cada piloto puede estar asociado a un vehículo
 * y utilizar una estrategia de conducción.
 * También mantiene una lista de tiempos ajustados, generados al aplicar estrategias en cada vuelta.
 */
public class Driver {

    private final String name;
    private int experienceYears;
    private Vehicle vehicle;
    private Strategy strategy;
    private List<Double> adjustedLapTimes = new ArrayList<>();

    /**
     * Crea un nuevo piloto.
     *
     * @param name            nombre del piloto
     * @param experienceYears años de experiencia en competición
     * @throws RaceException si el nombre es nulo o vacío
     */
    public Driver(String name, int experienceYears) {
        if (name == null || name.isBlank())
            throw new RaceException("Name inválido");
        this.name = name;
        setExperienceYears(experienceYears);
    }

    /**
     * Obtiene el nombre del piloto.
     *
     * @return nombre del piloto
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene los años de experiencia del piloto.
     *
     * @return años de experiencia
     */
    public int getExperienceYears() {
        return experienceYears;
    }

    /**
     * Establece los años de experiencia del piloto.
     *
     * @param experienceYears años de experiencia
     * @throws IllegalArgumentException si el valor es negativo
     */
    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 0)
            throw new IllegalArgumentException("experienceYears debe ser >= 0");
        this.experienceYears = experienceYears;
    }

    /**
     * Obtiene el vehículo asignado al piloto.
     *
     * @return vehículo del piloto
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Asigna un vehículo al piloto.
     *
     * @param vehicle instancia del vehículo a asignar
     */
    public void assignVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * Establece la estrategia de conducción del piloto.
     *
     * @param strategy estrategia a utilizar
     */
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Inicia la carrera para el piloto, activando su vehículo.
     *
     * @throws RaceException si no tiene vehículo asignado
     */
    public void startDriving() {
        if (vehicle == null)
            throw new RaceException("Sin vehículo asignado");
        vehicle.startRace();
    }

    /**
     * Finaliza la carrera para el piloto, deteniendo su vehículo.
     *
     * @throws RaceException si no tiene vehículo asignado
     */
    public void stopDriving() {
        if (vehicle == null)
            throw new RaceException("Sin vehículo asignado");
        vehicle.stopRace();
    }

    /**
     * Registra una vuelta completada por el piloto, incluyendo el tiempo original y el ajustado si hay estrategia.
     *
     * @param time tiempo real registrado en segundos
     */
    public void recordLap(double time) {
        vehicle.recordLapTime(time);
        if (strategy != null)
            strategy.apply(this, time);
    }

    /**
     * Registra un tiempo ajustado (resultado de aplicar una estrategia de conducción).
     *
     * @param t tiempo ajustado
     */
    public void recordAdjustedTime(double t) {
        adjustedLapTimes.add(t);
    }

    /**
     * Obtiene la lista de tiempos ajustados.
     *
     * @return lista de tiempos en segundos
     */
    public List<Double> getAdjustedLapTimes() {
        return adjustedLapTimes;
    }

    /**
     * Obtiene la lista de tiempos reales del vehículo del piloto.
     *
     * @return lista de tiempos originales
     */
    public List<Double> getRawLapTimes() {
        return vehicle.lapTimes;
    }
}
