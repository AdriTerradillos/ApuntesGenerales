package project.racing;

import project.driver.Driver;

/**
 * Interfaz del patrón Observer para notificar eventos ocurridos durante una carrera.
 * Puede implementarse para realizar acciones cuando un conductor completa una vuelta
 * o cuando la carrera finaliza.
 */
public interface RaceEvent {

    /**
     * Evento que se lanza cada vez que un piloto completa una vuelta.
     *
     * @param driver conductor que completó la vuelta
     * @param lapTime tiempo registrado en segundos
     */
    void onLapComplete(Driver driver, double lapTime);

    /**
     * Evento que se lanza al finalizar la carrera, indicando al ganador.
     *
     * @param winner conductor ganador de la carrera
     */
    void onRaceFinish(Driver winner);
}
