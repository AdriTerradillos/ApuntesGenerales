package _02_herencias._02_basico.ejerciciobase;

public class EmpleadoPorHoras extends Empleado {
	private double eurosHora;
	private int horasMensuales;
	
	public EmpleadoPorHoras(String nombre, int edad, double eurosHora, int horasMensuales) {
		super(nombre, edad, 0.0);
		this.eurosHora = eurosHora;
		this.horasMensuales = horasMensuales;
	}

	public double getEurosHora() {
		return eurosHora;
	}

	public void setEurosHora(double eurosHora) {
		this.eurosHora = eurosHora;
	}

	public int getHorasMensuales() {
		return horasMensuales;
	}

	public void setHorasMensuales(int horasMensuales) {
		this.horasMensuales = horasMensuales;
	}

	@Override
	public double calcularSalario() {
		return this.eurosHora * this.horasMensuales;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
