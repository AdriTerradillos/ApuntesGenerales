package entidad;

/**
 * Entidad persona con un nombre, una edad, una posición y un objeto de tipo
 * Direccion
 * 
 * @author Tony Stark
 * @version 1.5
 * @see entidad.Direccion
 *
 */
public class Persona {
	
	//ATRIBUTOS	
	/**
	 * El nombre de la persona
	 */
	private String nombre;
	/**
	 * La edad de la persona
	 */
	private int edad;
	
	/**
	 * Posición de la persona en el eje de las X dentro de una matriz, en metros
	 */
	private int posicion;
	
	/**
	 * La direccion de la persona asociada
	 * @see entidad.Direccion
	 */
	private Direccion direccion;
	
	/**
	 * Constructor por defecto
	 */
	public Persona() {
		super();
	}
	
	/**
	 * Constructor con parametros
	 * 
	 * @param a representa el nombre de la persona
	 * @param b representa la edad de la persona
	 * @param c representa la posicion de la persona
	 */
	public Persona(String a, int b, int c) {
		super();
		nombre = a;
		edad = b;
		posicion = c;
	}
	
	/**
	 * Constructor con el parametro del nombre
	 * 
	 * @param a representa el nombre de la persona
	 */
	public Persona(String a) {
		super();
		nombre = a;
	}
	
	//GETTER Y SETTER
	//Estos metodos no hace falta crear Javadoc
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}		
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	//Este en cambio si que haría falta documentarlo, ya que lo hemos cambiado.
	//No es el que se genera por defecto.
	
	/**
	 * Este metodo asiganará el nombre pasado por parámetro a la 
	 * propiedad nombre del objeto, pero únicamente cuando el nombre 
	 * pasado tenga más de 3 caracteres. En caso contrario (menor o 
	 * igual que 3 caracteres) se le pondrá el valor de vacío ("")
	 * 
	 * @param nombre representa el nombre a dar de alta
	 */
	public void setNombre(String nombre) {
		if(nombre.length() > 3) {
			this.nombre = nombre;
		}else {
			this.nombre = "";
		}
	}
	
	//METODOS
	
	/**
	 * Método que aumenta el atributo posición actual en un número 
	 * entero de metros.
	 * 
	 * @param metros representa el numero de metros que queremos 
	 * incrementar.
	 */
	public void caminar(int metros) {
		this.posicion += metros;
	}
	
	/**
	 * Método que copia una persona atributo por atributo a un
	 * nuevo objeto persona.
	 * 
	 * @return un objeto nuevo con la persona copiada.
	 */
	public Persona copiarPersona() {
		Persona p = new Persona();
		p.setNombre(this.nombre);
		p.setEdad(this.edad);
		p.setPosicion(this.posicion);
		
		return p;
	}
	
	/**
	 * Este método devuelve una referencia de que persona es mayor. 
	 * Si es mayor la persona que está ejecutando el método, o es 
	 * mayor la persona que se le pasa por parámetro.
	 * 
	 * @param p persona pasada por parámetro.
	 * @return this en caso de que esta persona sea mayor o p en caso 
	 * de que p sea la mayor. En caso de que sean iguales devuelvo 
	 * la refrencia p.
	 */
	public Persona personaMayor(Persona p) {
		if(this.edad > p.edad) {
			return this;
		} else {
			return p;
		}
	}
	
	/**
	 * Calcula la distancia de un objeto persona respecto a una 
	 * posición en metros en valor absoluto.
	 * 
	 * No se admiten posiciones negativas.
	 * 
	 * @param posicion representa una posición en el eje de las X, es 
	 * la posición con la que voy a comparar la persona. No se admite
	 * valores negativos.
	 * 
	 * @return la distancia en metros y absoluta de la posición 
	 * respecto al objeto. Devolvemos -1 en caso de que la posición que le
	 * pasemos por parámetro sea negativa.
	 */
	public int calcularDistancia(int posicion) {
		if(posicion < 0) {
			return -1;//error, no se aceptan posiciones negativas
			//Tambien valdría y sería una mejor opción, arrojar 
			//Excepciones
		}
		
		if(posicion < this.posicion) {
			return this.posicion - posicion;
		} else {
			return posicion - this.posicion;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", posicion=" + posicion + ", direccion=" + direccion
				+ "]";
	}		
}
