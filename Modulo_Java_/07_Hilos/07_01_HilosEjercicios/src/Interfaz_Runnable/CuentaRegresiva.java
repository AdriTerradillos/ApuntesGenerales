package Interfaz_Runnable;

public class CuentaRegresiva implements Runnable {
    private int numero;

    public CuentaRegresiva(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        for (int i = numero; i >= 0; i--) {
            System.out.println("[" + Thread.currentThread().getName() + "] " + i);
            try {
                Thread.sleep(500); // Espera de 500 milisegundos
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido.");
                return;
            }
        }
    }
}