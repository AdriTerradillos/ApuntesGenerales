package Ping_Pong_Wait_Notify;

public class JugadorPing implements Runnable {
    private final Pelota pelota;

    public JugadorPing(Pelota pelota) {
        this.pelota = pelota;
    }

    // sobreescribo el método toString() para hacer legible el mesaje en consola de la clase JugadorPing
    @Override
    public void run() { // corremos el mensaje en ordende código.
        try {
            for (int i = 0; i < 10; i++) {
                pelota.golpear("Ping");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

