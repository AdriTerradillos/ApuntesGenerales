package Synchronized;

import Uso_Join.ContadorCompartido;

public class Incrementador implements Runnable {
	    private ContadorCompartido cont;

	    public Incrementador(ContadorCompartido cont) {
	        this.cont = cont;
	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < 1000; i++) {
	            cont.incrementar();
	        }
	        System.out.println("[" + Thread.currentThread().getName() + "] terminó. Valor parcial: " + cont.getValor());
	    }
	}


