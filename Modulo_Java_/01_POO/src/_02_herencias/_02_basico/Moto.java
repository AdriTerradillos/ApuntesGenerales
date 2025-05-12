package _02_herencias._02_basico;

public class Moto extends VehiculoTerrestre{
	private TipoMoto tipo; // es un enum

	public TipoMoto getTipo() {
		return tipo;
	}

	public void setTipo(TipoMoto tipo) {
		this.tipo = tipo;
	}
	
	
}
