package _03_interfaces._02_ejemploimprimir;

public class ImprimirPantalla implements Imprimible{

	@Override
	public void imprimir(String cadena) {
		System.out.println(cadena);		
	}

}