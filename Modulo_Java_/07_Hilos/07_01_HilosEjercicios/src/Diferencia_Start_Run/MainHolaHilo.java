package Diferencia_Start_Run;

public class MainHolaHilo {
    public static void main(String[] args) {
        HolaHilo hilo1 = new HolaHilo();
        HolaHilo hilo2 = new HolaHilo();

        hilo1.setName("Hilo-1");
        hilo2.setName("Hilo-2");

        // Ejecutando con start(): se crean dos hilos concurrentes
        hilo1.start();
        hilo2.start();

        // Si reemplazas start() por run(), así:
        // hilo1.run();
        // hilo2.run();
        //
        // Entonces se ejecutan en el hilo principal, de forma secuencial,
        // y no se aprovecha el paralelismo.
    }
}
