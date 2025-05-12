package es.curso.spring08;


public class Direccion {
	
	
	// genero los atributos de clase Dirección
	
	private int id;
	private String tipoVia;
	private String nombreVia;
	private int cp;
	private int numeroPuerta;
	
	
	
	
	// genero los getters y setter de clase Dirección
	
	
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
	
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	
	
	public int getNumeroPuerta() {
		return numeroPuerta;
	}
	public void setNumeroPuerta(int numeroPuerta) {
		this.numeroPuerta = numeroPuerta;
	}

	
	
	// genero el método toString() para hacer legible el mensaje de la clase Dirección

	@Override
	public String toString() {
		return "Direccion [id= " + id + 
				", tipoVia= " + tipoVia + 
				", nombreVia= " + nombreVia +
				", cp= " + cp + 
				", numeroPuerta= " + numeroPuerta + 
				"]";
	}
	
	
	
	
	
}