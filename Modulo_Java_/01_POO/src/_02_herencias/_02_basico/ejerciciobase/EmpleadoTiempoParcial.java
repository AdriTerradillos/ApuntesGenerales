package _02_herencias._02_basico.ejerciciobase;

public class EmpleadoTiempoParcial extends Empleado {
	//Atributos
	private int horasTrabajadas;
	
	
	//Constructor
	public EmpleadoTiempoParcial(String nombre, int edad, double salarioBase, int horasTrabajadas) {
		super(nombre, edad, salarioBase);
		this.horasTrabajadas = horasTrabajadas;
	}
	
	//getters & setters
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	//métodos
	@Override
	public String toString() {
		return "EmpleadoTiempoParcial [horasTrabajadas=" + horasTrabajadas 
										+ ", salario=" + calcularSalario() 
										+ "]";
	}

	@Override
	public double calcularSalario() {
		// TODO Auto-generated method stub
		return this.horasTrabajadas * 40 / this.getSalarioBase();
	}
	
}
