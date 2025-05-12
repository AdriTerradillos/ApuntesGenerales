package Ping_Pong_Wait_Notify;


public class JugadorPong implements Runnable {
    private final Pelota pelota;

    public JugadorPong(Pelota pelota) {
        this.pelota = pelota;
    }


    // sobreescribimo el método toString() para hacer legible el mensaje en consola de la clase JugadorPong
    @Override
    public void run() { // corremos el mensaje en orden de código
        try {
            for (int i = 0; i < 10; i++) {
                pelota.golpear("Pong");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
