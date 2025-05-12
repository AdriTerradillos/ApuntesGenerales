package _02_herencias._02_basico.ejerciciobase;

public class Empleado {
	
	//Atributos
	private String nombre;
	private int edad;
	private double salarioBase;

	//Constructor
	public Empleado(String nombre, int edad, double salarioBase) {
		if (salarioBase < 0) {
			System.err.println("No puedo cobrar negativo.");
			return;
		}
		this.nombre = nombre;
		this.edad = edad;
		this.salarioBase = salarioBase;
	}
	
	//getter & setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	//métodos
	public double calcularSalario() {
		return this.salarioBase;
	}
	
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre 
						  + ", edad=" + edad 
						  + ", salarioBase=" + salarioBase 
						  + "]";
	}
	
	//métodos
	
}
