package project.app;

import project.vehicle.*;
import project.track.TrackType;
import project.driver.Driver;
import project.racing.*;
import project.util.LapTimeAnalyzer;

import java.util.DoubleSummaryStatistics;

/**
 * Clase principal que simula una carrera utilizando las clases y estructuras del proyecto.
 * Permite probar la creación de vehículos, asignación de estrategias, ejecución de vueltas
 * y determinación del ganador, junto con estadísticas básicas.
 * 
 * @author Gamma Tech School
 * @version 1.0
 */
public class RaceApp {

    /**
     * Método principal que ejecuta una carrera de ejemplo con dos conductores.
     * Ilustra el uso de estrategias, listener de eventos y análisis de rendimiento.
     *
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {

        // Crear vehículos usando la fábrica
        Vehicle car = VehicleFactory.createVehicle(
                VehicleType.CAR, "Ferrari F8", EngineType.PETROL, 340, TrackType.CIRCUIT, 2);

        Vehicle moto = VehicleFactory.createVehicle(
                VehicleType.MOTORCYCLE, "Yamaha R1", EngineType.PETROL, 299, TrackType.CIRCUIT, true);

        // Crear pilotos y asignar estrategia
        Driver alice = new Driver("Alice", 5);
        alice.assignVehicle(car);
        alice.setStrategy(new AggressiveStrategy());

        Driver bob = new Driver("Bob", 3);
        bob.assignVehicle(moto);
        bob.setStrategy(new ConservativeStrategy());

        // Configurar carrera avanzada con tipo de pista
        Race race = new Race("GP Avanzado", TrackType.CIRCUIT, null);
        race.addParticipant(alice);
        race.addParticipant(bob);

        // Añadir observador de eventos de carrera
        race.addListener(new RaceEvent() {
            @Override
            public void onLapComplete(Driver driver, double lapTime) {
                System.out.printf("%s completó vuelta en %.2f s%n", driver.getName(), lapTime);
            }

            @Override
            public void onRaceFinish(Driver winner) {
                System.out.println("Ganador: " + winner.getName());
            }
        });

        // Ejecutar simulación
        race.start();

        // Analizar resultados del piloto Alice
        DoubleSummaryStatistics stats = LapTimeAnalyzer.analyze(alice.getAdjustedLapTimes());
        System.out.printf("Promedio ajustado de Alice: %.2f s%n", stats.getAverage());
    }
}
