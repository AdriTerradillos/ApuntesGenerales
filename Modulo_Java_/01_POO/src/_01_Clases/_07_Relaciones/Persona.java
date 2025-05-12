package _01_Clases._07_Relaciones;

import java.util.Arrays;

public class Persona {
	String nombre;
	Direccion direccion;//1-1 en BBDD
	CuentaBancaria[] cuentasBancarias;//1-N
	Persona matrimonio;
	Corazon oCorazon;
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", direccion=" + direccion + ", cuentasBancarias="
				+ Arrays.toString(cuentasBancarias) + "]";
	}
}
