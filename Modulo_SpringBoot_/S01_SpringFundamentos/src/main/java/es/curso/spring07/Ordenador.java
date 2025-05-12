package es.curso.spring07;

public class Ordenador {
	
	// genero los atributos de la clase Ordenador 
	private int id;
	private String marca;
	
	// genero ahora los getters y setters de la clase Ordenador
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	// genero el método toString(), para hacer legible el mensaje en consola de la clase Ordenador
	@Override
	public String toString() {
		return "Ordenador [id=" + id + ", marca=" + marca + "]";
	}	
}
