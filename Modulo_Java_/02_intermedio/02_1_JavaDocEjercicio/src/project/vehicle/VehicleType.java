package project.vehicle;

/**
 * Enumeración que define los tipos de vehículos disponibles en el sistema.
 * Utilizada por la clase {@link VehicleFactory} para instanciar los vehículos apropiados.
 */
public enum VehicleType {
    /**
     * Coche de turismo o competición.
     */
    CAR,

    /**
     * Motocicleta deportiva.
     */
    MOTORCYCLE,

    /**
     * Camión preparado para competición de carga o terreno difícil.
     */
    TRUCK
}
