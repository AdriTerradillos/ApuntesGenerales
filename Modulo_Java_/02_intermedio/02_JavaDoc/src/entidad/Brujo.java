package entidad;

/**
 * Clase que representa un brujo con tres atributos, vida, tieneAlma y poder.
 * 
 * Esta clase sera usada para un videojuego de lucha
 * 
 * @author Steve Rogers
 * @version 1.0
 *
 */
public class Brujo {
	
	/**
	 * Vida del brujo, va con valores comprendidos entre cualquier número
	 * negativo y el 100
	 * Si llega a 0 o inferior esta muerto
	 */
	private int vida;
	/**
	 * El brujo puede tener alma
	 */
	private boolean tieneAlma;
	/**
	 * El brujo puede tener poder. No hay máximo y no se admiten negativos.
	 */
	private int poder;	
	
	/**
	 * Método que establece el poder al brujo. No se admiten negativos, en 
	 * caso de que el poder que se intente establecer sea negativo, el poder
	 * se establecerá a 0
	 * 
	 * @param poder representa el poder que intentamos establecer
	 */
	public void setPoder(int poder) {
		if(poder < 0) {
			this.poder = 0;
		} else {
			this.poder = poder;
		}
	}
	
	/**
	 * Método que devuelve si el brujo está muerto o no está muerto en base
	 * a su vida y a si tiene alma.
	 * 
	 * @return si la vida del brujo es igual o menor que cero devuelve true.
	 * Si brujo tiene la vida positiva pero no tiene alma, el metodo 
	 * devuelve true. Devuelve false para otros casos
	 */
	public boolean estaMuerto() {
		if(vida <= 0) {
			return true;
		}else if(!tieneAlma) {
			return true;
		}		
		return false;
	}
	
	// Los getter y setters no hace falta documentarlos normalmente
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public boolean isTieneAlma() {
		return tieneAlma;
	}

	public void setTieneAlma(boolean tieneAlma) {
		this.tieneAlma = tieneAlma;
	}

	public int getPoder() {
		return poder;
	}

}