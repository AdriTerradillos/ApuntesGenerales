package _04_excepciones._05_excepcionespersonalizadas;

public class CuentaBancaria {
	private double saldo;

	public CuentaBancaria(double sld) {
		saldo = sld;
	}

	// Método que lanza nuestra excepción personalizada
	public void sacarDinero(double cantidad) throws SaldoNegativoException {
		if (cantidad > saldo) {
			// Lanzamiento de la excepci�n
			throw new SaldoNegativoException("Fondos insuficientes");
		}
		saldo -= cantidad;
	}
}