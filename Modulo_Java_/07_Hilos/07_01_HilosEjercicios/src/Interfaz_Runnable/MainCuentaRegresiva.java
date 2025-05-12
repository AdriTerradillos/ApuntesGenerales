package Interfaz_Runnable;

public class MainCuentaRegresiva {
    public static void main(String[] args) {
        CuentaRegresiva cr = new CuentaRegresiva(5);
        Thread hilo = new Thread(cr);
        hilo.setName("Contador");
        hilo.start();
    }
    
}
