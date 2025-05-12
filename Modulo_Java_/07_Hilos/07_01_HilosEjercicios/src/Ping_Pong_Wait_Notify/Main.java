package Ping_Pong_Wait_Notify;

public class Main {
    public static void main(String[] args) {
        Pelota pelota = new Pelota();

        Thread ping = new Thread(new JugadorPing(pelota));
        Thread pong = new Thread(new JugadorPong(pelota));

        ping.start();
        pong.start();
    }
}
