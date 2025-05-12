package _01_Clases._04_EclipseAyuda;

public class Persona {
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;
	
	//Los IDEs en general nos ayudan mucho a la creación de código
	//En concreto Eclipse nos puede ayudar en la creación de los
	//contructores
	
	//Para crear este constructor 
	//-> boton derecho sobre donde queremos crearlo
	//-> seleccionamos "source"
	//-> seleccionarmos "Generate constructor using fields"
	//A continuación elegimos los atributos con los que queremos crear
	//el constructor

	/**
	 * Este es el constructor de la clase que me permite instanciar una persona
	 * Pero necesito todos los argumentos para dar valor a los parámetros.
	 * @param nombre
	 * @param edad
	 * @param peso
	 * @param estaCasado
	 */
	public Persona(String nombre, int edad, double peso, boolean estaCasado) {
		super(); //Super cuando lleguemos a herencias 
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.estaCasado = estaCasado;
	}


	//podemos crear todos los constructores que queramos
	public Persona() {
		super();
	}

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	//Sobreescribimos el método toString()
	/*
	public String toString() {
		return "Me llamo: " + this.nombre;
	}*/
	
	//Eclipse tambien nos ayuda en sobrescribir el método toString()
	//Para crear este método
	//-> boton derecho sobre donde queremos crearlo
	//-> seleccionamos "source"
	//-> seleccionarmos "Generate toString()"
	//A continuación elegimos los atributos con los que queremos crear
	//el método
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estaCasado=" + estaCasado + "]";
	}
	
		
	
}