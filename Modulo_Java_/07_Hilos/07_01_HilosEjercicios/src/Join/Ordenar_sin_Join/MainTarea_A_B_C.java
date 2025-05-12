package Join.Ordenar_sin_Join;

public class MainTarea_A_B_C {
    public static void main(String[] args) {
        Thread hA = new Thread(new TareaA());
        Thread hB = new Thread(new TareaB());
        Thread hC = new Thread(new TareaC());

        hA.start();
        hB.start();
        hC.start();

        // El orden de impresión puede variar
    }
}
