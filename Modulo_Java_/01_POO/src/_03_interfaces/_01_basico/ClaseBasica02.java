package _03_interfaces._01_basico;

public class ClaseBasica02 implements InterfaceBasica01 {

	@Override
	public void metodo1() {
		System.out.println("Este es el metodo1 pero de la clase ClaseBasica2");
	}

	@Override
	public String metodo2(Object o) {
		String cadena = "Este sería el método2 de la clase ClaseBasica2 que invocamos "
				+ "el método toString del objeto object " + o.toString();
		return cadena;
	}

	/**
	 * Operacion multiplicación
	 */
	@Override
	public int operacion(int a, int b) {
		int multiplicacion = a * b;
		return multiplicacion;
	}

}
