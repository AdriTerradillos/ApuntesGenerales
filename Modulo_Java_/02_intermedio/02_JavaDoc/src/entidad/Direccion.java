package entidad;

/**
 * Una dirección encapsula un tipo de vía y un nombre de vía
 * 
 * @author Tony Stark
 * @version 1.5
 *
 */
public class Direccion {
	private String tipoVia;
	private String nombreVia;
	
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
}
