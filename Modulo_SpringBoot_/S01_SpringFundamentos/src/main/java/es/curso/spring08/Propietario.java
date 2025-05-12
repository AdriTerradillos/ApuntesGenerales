package es.curso.spring08;



public class Propietario {
	
	
	// genero ahora los atributos de la clase Propietario
	
	private int id;
	private String nombrePropietario;
	private int dniPropietario;
	private int telefonoPropietario;
	private String Direccion;
	
	
	
	// genero los getters y setters de la clase Propietario
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public int getDniPropietario() {
		return dniPropietario;
	}
	public void setDniPropietario(int dniPropietario) {
		this.dniPropietario = dniPropietario;
	}
	public int getTelefonoPropietario() {
		return telefonoPropietario;
	}
	public void setTelefonoPropietario(int telefonoPropietario) {
		this.telefonoPropietario = telefonoPropietario;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	
	
	// genero el método toString(), para hacer legible el mensaje en consola de la clase Propietario
	
	@Override
	public String toString() {
		return "Propietario [id= " + id + 
				", nombrePropietario= " + nombrePropietario + 
				", dniPropietario= " + dniPropietario + 
				", telefonoPropietario= " + telefonoPropietario + 
				", Direccion= " + Direccion + 
				"]";
	}
	
	
	
	
	
}