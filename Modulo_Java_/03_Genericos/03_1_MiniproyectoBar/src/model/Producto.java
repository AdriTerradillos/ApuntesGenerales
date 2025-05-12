package model;

/**
 * Clase base para productos del bar.
 */
public abstract class Producto {
	// Atributos
	protected String nombre;
	protected double precio;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		if (precio < 0.05) {
			System.err.println("Precio debe ser superior a 0.05€");
			return;
		} else {
			this.precio = precio;
		}
	}
	
	// Getter y Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	// Métodos
	/**
	 * Devuelve una descripción del producto.
	 * @return String con {@code nombre} y {@code precio}.
	 */
	public String getDescripcion() {
		return "Producto: " + nombre + "\nPrecio: " + precio;
	}
	
	
}
