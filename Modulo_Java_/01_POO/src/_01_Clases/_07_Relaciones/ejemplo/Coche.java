package _01_Clases._07_Relaciones.ejemplo;

import java.util.Arrays;

public class Coche {
	Rueda[] ejeDireccion;
	Motor motor;
	
	
	public Coche(Rueda[] ruedas, Motor motor) {
		super();
		this.ejeDireccion = ruedas;
		this.motor = motor;
	}


	@Override
	public String toString() {
		return "Coche [ruedas=" + Arrays.toString(ejeDireccion) + ", motor=" + motor + "]";
	}
	
	
}
