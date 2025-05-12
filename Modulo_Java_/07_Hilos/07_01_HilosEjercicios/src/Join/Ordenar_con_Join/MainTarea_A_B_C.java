package Join.Ordenar_con_Join;

public class MainTarea_A_B_C {
    public static void main(String[] args) throws InterruptedException {
        Thread hA = new Thread(new TareaA());
        Thread hB = new Thread(new TareaB());
        Thread hC = new Thread(new TareaC());

        // el orden de impresión se mantiene en consola
        // 1º--> TareaA
        // 2º--> TareaB
        // 3º--> TareaC


        hA.start();
        hA.join();

        hB.start();
        hB.join();

        hC.start();
        hC.join();

        System.out.println("Todas las tareas han finalizado");
    }
    
}
