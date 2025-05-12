package Wait_Notify;

public class Productor implements Runnable {
    private final Buffer buffer;

    public Productor(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int contador = 0;
        try {
            while (true) {
                buffer.producir(contador++);
                Thread.sleep(400);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}