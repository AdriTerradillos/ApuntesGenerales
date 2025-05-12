package Ping_Pong_Wait_Notify;

public class Pelota {
    private boolean pingTurno = true; // true = Ping, false = Pong

    public synchronized void golpear(String jugador) throws InterruptedException {
        boolean esPing = jugador.equals("Ping");

        while (pingTurno != esPing) {
            wait(); // Esperar si no es el turno del jugador
        }

        System.out.println(jugador + " dice: " + (esPing ? "ping" : "pong"));

        // Alternar turno y notificar al otro jugador
        pingTurno = !pingTurno;
        notifyAll();

        // Esperar al siguiente turno (solo si no es la última vez en main)
        if (!(Thread.currentThread().isInterrupted())) {
            wait();
        }
    }
}
