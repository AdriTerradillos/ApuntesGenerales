package model;
import enums.TipoComida;

/**
 * Recoge tipos de comida que se pueden pedir.
 */

public class Comida extends Producto {
	// Atributos
	private TipoComida tipoComida;
	
	// Constructor
	public Comida (String nombre, double precio, TipoComida tipoComida) {
		super(nombre, precio);
		this.tipoComida = tipoComida;
	}
	

	
	// Getter y Setter
	public TipoComida getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(TipoComida tipoComida) {
		this.tipoComida = tipoComida;
	}
	
	// getDescripcion()
	@Override
	public String getDescripcion() {
		return tipoComida + ": " + nombre
				+ "\nPrecio: " + precio;
	}
	
	

}
