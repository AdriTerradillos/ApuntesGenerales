package model;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase genérica que almacena productos a incluir en el pedido del proveedor.
 * @param <T> es el tipo de producto (bebida, comida...)
 */

public class Pedido<T extends Producto> {
	
	// Atributos
	/**
	 * El Map recibe producto y cantidad, en unidades.
	 */
	private Map<T, Integer> productos;
	
	
	// Constructor
	public Pedido() {
		this.productos = new HashMap<>();
	}
	
	/**
	 * Añade producto al pedido con la cantidad.
	 * @param producto el producto que se va a pedir
	 * @param cantidad unidades a agregar al pedido
	 */
	public void agregarProducto(T producto, int cantidad) {
		if (this.productos.containsKey(producto)) { //¿este producto está en el pedido?
			this.productos.put(producto, this.productos.get(producto) + cantidad);
		} else {
			this.productos.put(producto, cantidad);
		}
	}
	
	/**
	 * Añade producto al pedido, solo una unidad.
	 * @param producto el producto que se va a pedir
	 */
	public void agregarProducto(T producto) {
		agregarProducto(producto, 1);
	}
	
	
	/**
	 * Calcula el total del precio a pagar.
	 * @return importe del resultado de la suma de todos los productos por su precio.
	 */
	public double calcularTotal() {
		//double total = productos.entrySet().stream().mapToDouble(producto -> producto.getKey().getPrecio() * producto.getValue()).sum(); 
		
		
		double total = 0;
		//recorrer todo el map productos para sumar precios
		for (Map.Entry<T, Integer> producto : productos.entrySet()) {
			total += producto.getKey().getPrecio() * producto.getValue();
		}
		
		
		return total;
	}
	
	
	public void imprimirTicket() {
		System.out.println("   ============  TICKET  ============  ");
		System.out.println("Producto | Cantidad | Precio | Subtotal");
		
		for (Map.Entry<T, Integer> producto : this.productos.entrySet()) {
			// nombre producto
			String nombre = producto.getKey().getNombre();
			
			// cantidad producto
			int cantidad = producto.getValue();
			
			// precio unitario
			double precio = producto.getKey().getPrecio();
			
			// subtotal
			double subtotal = cantidad * precio;
			
			System.out.println(nombre + ": " 
								+ cantidad + " x " 
								+ precio + "€ = " 
								+ subtotal + "€");
		}
		
		System.out.println("   =================================  ");
		System.out.println("Total: " + calcularTotal() + "€");
	}	
}
