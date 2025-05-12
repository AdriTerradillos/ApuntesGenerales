package _01_Clases._07_Relaciones.ejemplo;

public class Motor {
	double cilindrada;
	int caballos;
	
	
	

	public Motor(double cilindrada, int caballos) {
		super();
		this.cilindrada = cilindrada;
		this.caballos = caballos;
	}




	@Override
	public String toString() {
		return "Motor [cilindrada=" + cilindrada + ", caballos=" + caballos + "]";
	}
	
	
}
