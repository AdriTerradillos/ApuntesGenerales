package _02_herencias._02_basico.ejerciciobase;

public class MainEmpleados {

	public static void main(String[] args) {
		EmpleadoTiempoCompleto etc = new EmpleadoTiempoCompleto("Jose", 25, 20000, 3000);
		EmpleadoTiempoParcial etp = new EmpleadoTiempoParcial("Maika", 35, 20000, 20);
		EmpleadoPorHoras eph = new EmpleadoPorHoras("Victor", 40, 120.0, 8);
		
		System.out.println(etc);
		System.out.println(etp);
		System.out.println(eph);

	}

}
