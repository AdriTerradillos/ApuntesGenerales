package _04_excepciones._06_ejercicios;

public class PasswordInseguroException extends Exception {
	
    public PasswordInseguroException(String mensaje) {
        super(mensaje);
    }

}
