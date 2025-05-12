package project.util;

import java.util.List;
import java.util.DoubleSummaryStatistics;

/**
 * Clase utilitaria para realizar análisis estadísticos sobre listas de tiempos de vuelta.
 * Se utiliza para determinar promedio, mínimos, máximos y consistencia del rendimiento.
 */
public class LapTimeAnalyzer {

    /**
     * Calcula estadísticas básicas (mínimo, máximo, promedio, suma, cantidad) de una lista de tiempos.
     *
     * @param times lista de tiempos de vuelta en segundos
     * @return objeto {@link DoubleSummaryStatistics} con los resultados
     */
    public static DoubleSummaryStatistics analyze(List<Double> times) {
        return times.stream()
                    .mapToDouble(Double::doubleValue)
                    .summaryStatistics();
    }

    /**
     * Calcula la desviación estándar de los tiempos de vuelta en la lista.
     * Ayuda a medir la consistencia del rendimiento del piloto o vehículo.
     *
     * @param times lista de tiempos de vuelta
     * @return desviación estándar
     */
    public static double stdDev(List<Double> times) {
        double avg = analyze(times).getAverage();
        return Math.sqrt(
            times.stream()
                 .mapToDouble(t -> (t - avg) * (t - avg))
                 .average()
                 .orElse(0)
        );
    }
}
