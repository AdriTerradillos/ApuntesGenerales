package es.curso.spring07;

public class Persona {
	
	// genero los atributos de la clase Persona
	private String nombre;
	private int edad;
	private double peso;
	private boolean casada;
	
	private Direccion direccion;
	private Ordenador ordenador;
		
	
	// genero los getters y setters
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public boolean isCasada() {
		return casada;
	}
	public void setCasada(boolean casada) {
		this.casada = casada;
	}

	public Ordenador getOrdenador() {
		return ordenador;
	}
	public void setOrdenador(Ordenador ordenador) {
		this.ordenador = ordenador;
	}
	
	
	// genero el método toString() para hacer legible el mensaje a consloa desde la clase Persona
	@Override
	public String toString() {
		return "Persona [Nombre= " + nombre + 
				", Edad= " + edad + 
				", Peso= " + peso + 
				", Casada= " + casada +
				", Direccion= " + direccion + 
				", Ordenador= " + ordenador + 
				"]";
	}
	
}
