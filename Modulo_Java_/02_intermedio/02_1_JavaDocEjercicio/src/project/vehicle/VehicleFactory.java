package project.vehicle;

import project.track.TrackType;

/**
 * Fábrica de vehículos para instanciar objetos de tipo {@link Vehicle}.
 * Aplica el patrón de diseño Factory para encapsular la lógica de creación.
 */
public class VehicleFactory {

    /**
     * Crea una instancia de {@link Vehicle} en función del tipo especificado.
     *
     * @param type tipo de vehículo a crear
     * @param model modelo del vehículo
     * @param engineType tipo de motor
     * @param maxSpeed velocidad máxima en km/h
     * @param track tipo de pista para el que está diseñado el vehículo
     * @param extra parámetro adicional específico del tipo:
     *              <ul>
     *                  <li>{@code Integer} para {@link VehicleType#CAR} (número de puertas)</li>
     *                  <li>{@code Boolean} para {@link VehicleType#MOTORCYCLE} (presencia de ABS)</li>
     *                  <li>{@code Double} para {@link VehicleType#TRUCK} (capacidad de carga en kg)</li>
     *              </ul>
     * @return una instancia del vehículo adecuado
     * @throws IllegalArgumentException si el tipo no es válido o los parámetros no son correctos
     */
    public static Vehicle createVehicle(VehicleType type,
                                        String model,
                                        EngineType engineType,
                                        double maxSpeed,
                                        TrackType track,
                                        Object extra) {
        switch (type) {
            case CAR:
                return new Car(model, engineType, maxSpeed, track, (Integer) extra);
            case MOTORCYCLE:
                return new Motorcycle(model, engineType, maxSpeed, track, (Boolean) extra);
            case TRUCK:
                return new Truck(model, engineType, maxSpeed, track, (Double) extra);
            default:
                throw new IllegalArgumentException("Tipo de vehículo desconocido: " + type);
        }
    }
}
