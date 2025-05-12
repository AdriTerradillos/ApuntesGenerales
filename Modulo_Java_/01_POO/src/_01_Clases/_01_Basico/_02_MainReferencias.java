package _01_Clases._01_Basico;

public class _02_MainReferencias {
	public static void main(String[] args) {
		Persona p1 = new Persona(); // instancia de la clase persona
		p1.nombre = "Tony";
		p1.edad = 45;
		p1.peso = 90;
		p1.estaCasado = false;//no haria falta, se inicializa a false
		
		Persona p2 = new Persona();
		p2.nombre = "Natasha";
		p2.edad = 37;
		p2.peso = 65;
		p2.estaCasado = true;
		//ver dibujo "dibujos/_01_basico_03_dos_referencias"
		
		//Un objeto puede estar "apuntado" por muchas referencias
		Persona p3 = p2;
		//Con el código de arriba estamos diciendo que p3 apunte al mismo
		//objeto al que apunte p2
		p2.edad = 65;
		System.out.println(p2.edad);
		System.out.println(p3.edad);
		
		//Puedo modificar atributos de Natasha también desde p3
		p3.peso = 40;
		System.out.println(p2.peso);
		System.out.println(p3.peso);
		
		//¿Puedo hacer referencia a una variable primitiva con otra variable?
		int n1 = 5;
		int n2 = n1;
		n1 = 10; //Aquí cojo la variable n1 y le modifico el valor
				 //¿El valor de n2 se va a ver modificado?
		System.out.println(n1);
		System.out.println(n2);
		
		// si ahora digo que n2 = n1 --> me lo va a cambiar, pero
		// con los primitivos no tengo variables referenciales, con los OBJETOS SI
		
		p3 = new Persona(); //instancia de un nuevo objeto en p3
		p3.edad = 75;
		System.out.println("Edad de p2: " + p2.edad);
		System.out.println("Edad de p3: " + p3.edad);
		System.out.println("Peso de p2: " + p2.peso);
		System.out.println("Peso de p3: " + p3.peso);
		//ver dibujo "_01_basico_04_dos_referencias_primitivos.jpg"
		
		Persona p4 = new Persona();
		p4.edad = 50;
		cambiarEdad(p4);
		System.out.println(p4.edad);
		
		p4.edad = 30;
		cambiarEdad2(p4); //} p=new Persona() --> aquí muere
		System.out.println(p4.edad); //Aquí p4 es el objeto de la linea 50
		//ver dibujo "_01_basico_04_dos_referencias.jpg"
	}
	
	public static void cambiarEdad(Persona p) {
		p.edad = 100;
	}
	
	public static void cambiarEdad2(Persona p) { // entra p4
		p = new Persona(); // p4 = new Persona();
		p.edad = 100; // ahora p4 es un objeto nuevo
	}
	
}