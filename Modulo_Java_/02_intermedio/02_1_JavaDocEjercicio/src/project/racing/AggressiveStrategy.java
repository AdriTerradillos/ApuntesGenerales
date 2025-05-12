package project.racing;

import project.driver.Driver;

/**
 * Estrategia de conducción agresiva. Reduce ligeramente el tiempo actual
 * para simular una conducción más arriesgada y veloz.
 */
public class AggressiveStrategy implements Strategy {

    /**
     * Aplica la estrategia agresiva al conductor.
     * Reduce el tiempo de vuelta en un 5%.
     *
     * @param driver el conductor
     * @param currentLapTime tiempo actual
     */
    @Override
    public void apply(Driver driver, double currentLapTime) {
        double adjusted = currentLapTime * 0.95;
        driver.recordAdjustedTime(adjusted);
    }
}