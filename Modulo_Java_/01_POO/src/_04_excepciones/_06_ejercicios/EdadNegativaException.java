package _04_excepciones._06_ejercicios;

public class EdadNegativaException extends Exception {

	private static final long serialVersionUID = 1L;
	
    public EdadNegativaException(String mensaje) {
        super(mensaje);
    }
}
