package Sleep;

public class MainTareaPesada {
    public static void main(String[] args) throws InterruptedException {
        Thread hiloPesado = new Thread(new TareaPesada(), "Pesado");
        hiloPesado.start();

        // Esperar 3 segundos
        Thread.sleep(3000);

        // Interrumpir el hilo "Pesado"
        hiloPesado.interrupt();
    }
}

