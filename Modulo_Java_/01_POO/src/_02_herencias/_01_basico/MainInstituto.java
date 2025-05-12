package _02_herencias._01_basico;

public class MainInstituto {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "Ricardo";
		p1.edad = 40;
		p1.presentarse();
		//p1.salario = 45000;
		
		Alumno a1 = new Alumno();
		a1.nombre = "Blago";
		a1.edad = 23;
		a1.presentarse();
		a1.curso = "Administración";
		System.out.println(a1.esCiencias());
		
		Docente d1 = new Docente();
		d1.nombre = "Manuela";
		d1.edad = 45;
		d1.presentarse();
		d1.salario = 50000;
		System.out.println(d1.calcularSalarioNeto());
		

	}

}
