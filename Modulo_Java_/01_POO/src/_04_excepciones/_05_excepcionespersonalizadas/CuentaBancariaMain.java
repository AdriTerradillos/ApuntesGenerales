package _04_excepciones._05_excepcionespersonalizadas;

public class CuentaBancariaMain {
	public static void main(String[] args) {
		CuentaBancaria cb = new CuentaBancaria(1000.0);
		try {
			// Instrucción que no genera error
			cb.sacarDinero(500.0);
			// Instrucción que genera una excepción
			cb.sacarDinero(1200.0);
		} catch (SaldoNegativoException sne) {
			// Mostramos el mensaje definido en
			// el constructor de la excepción
			System.out.println(sne.getMessage());
			//mostramos el mensaje sobreescrito
			System.out.println(sne.getLocalizedMessage());
			// Imprimimos la traza por pantalla
			sne.printStackTrace();
		}
	}
}