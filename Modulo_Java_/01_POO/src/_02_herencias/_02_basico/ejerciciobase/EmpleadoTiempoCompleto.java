package _02_herencias._02_basico.ejerciciobase;

public class EmpleadoTiempoCompleto extends Empleado {
	
	//Atributos
	private double bonoAnual;

	
	//Constructor
	public EmpleadoTiempoCompleto(String nombre, int edad, double salarioBase, double bonoAnual) {
		super(nombre, edad, salarioBase);
		this.bonoAnual = bonoAnual;
	}

	//getters & setters
	public double getBonoAnual() {
		return bonoAnual;
	}


	public void setBonoAnual(double bonoAnual) {
		this.bonoAnual = bonoAnual;
	}

	//métodos
	@Override
	public double calcularSalario() {	
		return this.getSalarioBase() + this.bonoAnual;
	}

	@Override
	public String toString() {
		return "EmpleadoTiempoCompleto [bonoAnual=" + bonoAnual 
				+ ", salario=" + calcularSalario() + "]";
	}

	

	
	
	
	
	
	
}
