package _01_Clases._08_visibilidades;

//Con las visibilidades establecemos desde donde podemos acceder a
//nuestros atributos y métodos

//En Java tenemos 4 tipos de visibilidades


//1. public -> tenemos visibilidad en todas las partes de nuestro
//			   proyecto.

//2. private -> solo tenemos visiblidad dentro de la propia clase.

//3. protected -> solo tenemos visibilidad dentro de la propia clase,
//				  de las clases dentro del mismo paquete y de las 
//				  clases que hereden de ésta.

//4. (default) -> solo tenemos visibilidad dentro de la propia clase
//				  y de las clases dentro del mismo paquete

//A efectos prácticos los atributos, normalmente, los atributos
//siempre se declaran como private, y se crean sus métodos accesores
//y modificadores
public class Estudiante {
	private String nombre;
	int edad;
	protected double peso;
	public String dni;
	private double nota;
	
	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, int edad, double peso, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.dni = dni;
	}
	
	//Normalmente si creamos un atributo private tenemos que darle
	//métodos modificadore y accesores publicos. La ventaja es que en los
	//métodos podemos aplicar lógica, mientras que en un atributo
	//no.
	//Es MUY importante seguir los convenios de java para estos métodos.
	//Los métodos modificadores empiezan por "set" y luego el nombre
	//del atributo, se conocen como SETTER
	public void setNombre(String nombre) {
		if(nombre.length() > 1) {
			this.nombre = nombre;
		}
	}
	
	//Para los métodos accesores, empiezan por la palabra "get" y 
	//luego el nombre del atributo, se conocen como GETTER
	public String getNombre() {
		if(this.nombre != null) {//envitamos NullPointers
			return convertirNombreAMinuscula();
		}
		return this.nombre;
	}
	
	public void setNota(double nota) {
		if (nota >= 0 && nota <= 10) {
			this.nota = nota;
		}
	}
	
	public double getNota() {
		return this.nota;
	}
	
	
	//podemos aplicar visibilidades a métodos
	private String convertirNombreAMinuscula() {
		return this.nombre.toLowerCase();
	}
	
}