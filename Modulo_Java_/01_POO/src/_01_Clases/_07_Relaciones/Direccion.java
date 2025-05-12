package _01_Clases._07_Relaciones;

public class Direccion {
	String tipoVia;
	String nombreVia;
	String ciudad;
	String cp;
	
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", ciudad=" + ciudad + ", cp=" + cp + "]";
	}
}
