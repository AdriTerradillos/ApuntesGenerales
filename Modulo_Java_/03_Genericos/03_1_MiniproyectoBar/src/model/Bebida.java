package model;
import enums.TipoBebida;

/**
 * Recoge las características genéricas de cada bebida.
 */

public class Bebida extends Producto {
	// Atributos
	private int mililitros;
	private TipoBebida tipoBebida;
	private double graduacion;
	
	
	
	
	// Constructor agua/refresco/cafe/infusión
	public Bebida(String nombre, double precio, int mililitros, TipoBebida tipoBebida) {
		super(nombre, precio);
		if (mililitros < 30) {
			System.out.println("Mililitros debe ser superior a 30.");
			return;
		} else {
			this.mililitros = mililitros;
		}
		
		if (tipoBebida == TipoBebida.ALCOHOL) {
			System.err.println("Introduce un tipo NO alcohólico.");
		} else {
			this.tipoBebida = tipoBebida;
			this.graduacion = 0.0;
		}
	}
	
	// Constructor alcohol
	public Bebida(String nombre, double precio, int mililitros, double graduacion) {
		super(nombre, precio);
		if (mililitros < 30) {
			System.out.println("Mililitros debe ser superior a 30.");
			return;
		} else {
			this.mililitros = mililitros;
		}
		this.tipoBebida = TipoBebida.ALCOHOL;
		
		if (graduacion < 0.0) {
			System.err.println("Bebida alcohólica la graduación no puede ser negativa.");
		} else {
			this.graduacion = graduacion;
		}
	}
	
	
	
	
	// Getter y Setter
	public int getMililitros() {
		return mililitros;
	}
	public void setMililitros(int mililitros) {
		this.mililitros = mililitros;
	}
	public TipoBebida getTipoBebida() {
		return tipoBebida;
	}
	public void setTipoBebida(TipoBebida tipoBebida) {
		this.tipoBebida = tipoBebida;
	}
	public double getGraduacion() {
		return graduacion;
	}
	public void setGraduacion(double graduacion) {
		this.graduacion = graduacion;
	}
	
	// getDescripcion
	/**
	 * Devuelve una descripción del producto.
	 * @return String con {@code nombre} y {@code precio}.
	 */
	@Override
	public String getDescripcion() {
		return tipoBebida + ": " + nombre 
				+ "\nPrecio: " + precio 
				+ "\nMililitros: " + mililitros 
				+ "\nGraduación: " + graduacion;
	}
	
	

}
