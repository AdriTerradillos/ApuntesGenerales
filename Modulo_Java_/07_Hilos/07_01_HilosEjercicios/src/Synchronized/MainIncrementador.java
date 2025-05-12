package Synchronized;

import Uso_Join.ContadorCompartido;

public class MainIncrementador {
	
	 public static void main(String[] args) {
	        ContadorCompartido contador = new ContadorCompartido();
	        Thread[] hilos = new Thread[5];

	        for (int i = 0; i < 5; i++) {
	            hilos[i] = new Thread(new Incrementador(contador));
	            hilos[i].setName("Hilo-" + (i + 1));
	            hilos[i].start();
	        }

	        for (Thread hilo : hilos) {
	            try {
	                hilo.join();
	            } catch (InterruptedException e) {
	                System.out.println("Hilo interrumpido: " + hilo.getName());
	            }
	        }

	        	System.out.println("Valor final del contador: " + contador.getValor());
	    }
}
