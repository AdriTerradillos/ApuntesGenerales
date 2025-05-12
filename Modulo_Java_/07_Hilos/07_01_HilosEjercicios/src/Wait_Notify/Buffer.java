package Wait_Notify;

import java.util.LinkedList;
import java.util.List;

public class Buffer {
    private final List<Integer> datos = new LinkedList<>();
    private final int capacidad = 2;

    public synchronized void producir(int x) throws InterruptedException {
        while (datos.size() == capacidad) {
            wait();
        }
        datos.add(x);
            System.out.println("Producido: " + x);
        notifyAll();
    }

    public synchronized int consumir() throws InterruptedException {
        while (datos.isEmpty()) {
            wait();
        }
        int x = datos.remove(0);
            System.out.println("Consumido: " + x);
        notifyAll();
        return x;
    }  
}
