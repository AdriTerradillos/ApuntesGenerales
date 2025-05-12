package es.curso.spring08;



public class PrecioAlquiler {
	
	// genero los atributo(s) de la clase PrecioAlquiler --> La desgrano en partes, luego sumaré el total cuotaMensual
	private double cuotaLuz;
	private double cuotaAgua;
	private double cuotaGas;
	
	
	
	
	// genero getters y setters de clase PrecioAlquiler
	
	public double getCuotaLuz() {
		return cuotaLuz;
	}
	public void setCuotaLuz(double cuotaLuz) {
		this.cuotaLuz = cuotaLuz;
	}
	public double getCuotaAgua() {
		return cuotaAgua;
	}
	public void setCuotaAgua(double cuotaAgua) {
		this.cuotaAgua = cuotaAgua;
	}
	public double getCuotaGas() {
		return cuotaGas;
	}
	public void setCuotaGas(double cuotaGas) {
		this.cuotaGas = cuotaGas;
	}
	
	
	// genero el método toString(), para hacer legible el mensaje en consola de la clase PrecioAlquiler
	
	@Override
	public String toString() {
		return "PrecioAlquiler [cuotaLuz= " + cuotaLuz + 
				", cuotaAgua= " + cuotaAgua + 
				", cuotaGas= " + cuotaGas + 
				"]";
	}
	
	
	

	
}