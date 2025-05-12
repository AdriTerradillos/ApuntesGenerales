package project.racing;

import project.driver.Driver;

/**
 * Interfaz para aplicar distintas estrategias de conducción durante una carrera.
 * Se aplica en cada vuelta para modificar el comportamiento del conductor.
 */
public interface Strategy {

    /**
     * Aplica la estrategia de conducción al conductor en función del tiempo de vuelta actual.
     *
     * @param driver el conductor al que se aplica la estrategia
     * @param currentLapTime tiempo de vuelta actual
     */
    void apply(Driver driver, double currentLapTime);
}
