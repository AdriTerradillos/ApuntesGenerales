package _01_Clases._08_visibilidades;

public class MainVisibilidad1 {
	public static void main(String[] args) {
		
		Pokemon poke = new Pokemon();
		//poke.nombre = "Pikachu";
		
		poke.setNombre("Pikachu");
		System.out.println(poke.getNombre());
		
		
		poke.setVida(100);
		System.out.println(poke.getVida());
		poke.setVida(-80);
		System.out.println(poke.getVida());
		
		
		//=======================================//

		
		Estudiante e1 = new Estudiante();
		//e1.nombre = "P"; // ERROR --> nombre es privado, necesito setNombre()
		e1.edad = 45; // esto funciona es accesible desde la clase y cualquier otra clase del paquete
		e1.peso = 56.67; // funciona porque es protected, puedo acceder desde clase, paquete y herencias
		e1.dni = "456789S"; // es publico puedo acceder desde cualquier lugar
		
		
		e1.setNombre("P");
		System.out.println(e1.getNombre());//null
		e1.setNombre("NatASha");
		System.out.println(e1.getNombre());//pepe
		
		e1.setNota(6.0);
		System.out.println(e1.getNota());
		
	}

}
