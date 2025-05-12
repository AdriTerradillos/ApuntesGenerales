package programa;

public class ProcesadorPagos {

    /**
     * Simula el cobro:
     * - Duerme 50 ms para representar procesamiento
     * - Si monto < total => IllegalArgumentException
     * @return cambio = monto - total
     */
    public double procesarPago(double monto, double total) throws InterruptedException {
        Thread.sleep(50);
        if (monto < total) {
            throw new IllegalArgumentException("Fondos insuficientes");
        }
        return monto - total;
    }
}
