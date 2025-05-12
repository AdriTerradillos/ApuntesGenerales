package project.racing;

import project.driver.Driver;

/**
 * Estrategia de conducción conservadora. Penaliza ligeramente el tiempo actual
 * para simular una conducción prudente que busca minimizar errores.
 */
public class ConservativeStrategy implements Strategy {

    /**
     * Aplica la estrategia conservadora al conductor.
     * Aumenta el tiempo de vuelta en un 5%.
     *
     * @param driver el conductor
     * @param currentLapTime tiempo actual
     */
    @Override
    public void apply(Driver driver, double currentLapTime) {
        double adjusted = currentLapTime * 1.05;
        driver.recordAdjustedTime(adjusted);
    }
}
