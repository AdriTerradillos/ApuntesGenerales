package es.curso.spring08;


public class Inquilino {
	
	// genero los atributos de la clase Inquilino
	private int id;
	private String nombreInquilino;
	private int dniInquilino;
	private int telefonoInquilino;
	private String direccionInquilino;
	
	
	// genero los getters y setters e la clase Inquilino ( ir agregando varios inquilinos, no dejarse engañar por nombre de esta clase Inquilino, generar varios
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombreInquilino() {
		return nombreInquilino;
	}
	public void setNombreInquilino(String nombreInquilino) {
		this.nombreInquilino = nombreInquilino;
	}
	public int getDniInquilino() {
		return dniInquilino;
	}
	public void setDniInquilino(int dniInquilino) {
		this.dniInquilino = dniInquilino;
	}
	public int getTelefonoInquilino() {
		return telefonoInquilino;
	}
	public void setTelefonoInquilino(int telefonoInquilino) {
		this.telefonoInquilino = telefonoInquilino;
	}
	public String getDireccionInquilino() {
		return direccionInquilino;
	}
	public void setDireccionInquilino(String direccionInquilino) {
		this.direccionInquilino = direccionInquilino;
	}
	
	
	
	// genero el método toString() para hacer legible el mensaje en consola de la clase Inquilinos.
	
	@Override
	public String toString() {
		return "Inquilino [id= " + id + 
				", nombreInquilino= " + nombreInquilino + 
				", dniInquilino= " + dniInquilino +
				", telefonoInquilino= " + telefonoInquilino + 
				", direccionInquilino= " + direccionInquilino +
				"]";
	}
	
	
	
	
}