package es.curso.spring07;

public class Direccion {
	
	// genero los atributos de la clase Dirección 
	private int id;
	private String tipoVia;
	private String nombreVia;
	private String cp;
	private String pais;
	
	
	
	// genero los getters y setters de la clase Dirección
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	// genero el método toString() para hacer legible el mensaje en consola de la clase Dirección
	
	@Override
	public String toString() {
		return "Direccion [id= " + id + 
				", tipoVia= " + tipoVia + 
				", nombreVia= " + nombreVia + 
				", cp= " + cp + 
				", pais= " + pais + 
				"]";
	}
}
	