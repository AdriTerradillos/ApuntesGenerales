package _01_Clases._07_Relaciones.ejemplo;

public class Main {

	public static void main(String[] args) {
		// quiero construir un coche
		Coche c = new Coche(new Rueda[4], new Motor(2.0, 175));
		
		//he instanciado coche con las ruedas y el motor en su constructor
		System.out.println(c);
		
		//todavía no tiene ruedas no puede circular
		Rueda r1 = new Rueda();
		//tengo la rueda pero tengo que ponérsela al coche
		c.ejeDireccion[0] = r1;
		System.out.println(c);
		//me faltan tres ruedas más
		Rueda r2 = new Rueda();
		Rueda r3 = new Rueda();
		Rueda r4 = new Rueda();
		//las tengo individuales porque si el coche muere puedo recuperar
		//las que no se hayan estropeado
		
		//tengo que poner las 3, ya tengo una puesta
		c.ejeDireccion[1] = r2;
		c.ejeDireccion[2] = r3;
		c.ejeDireccion[3] = r4;
		System.out.println(c);
		
		System.out.println();
		System.out.println("hago un viaje por pista forestal y pincho una rueda");
		r1.aire = false;
		System.out.println(c);
		System.out.println("pongo el spray reparador y vuelvo a hinchar la rueda");
		c.ejeDireccion[0].aire = true; //r1.aire=true; --> es lo mismo
												 //porque r1 y c.ruedas[0] hacen ref
												 //al mismo objeto
		System.out.println("compruebo el estado de la rueda: " + r1);
		
		System.out.println();
		System.out.println("el coche hace un ruido raro y se para");
		System.out.println("el taller me dice que el coche no se puede salvar");
		System.out.println("tengo que enviar el coche al desguace");
		System.out.println();
		c = null;
		System.out.println("igualmente intento recuperar el motor para venderlo: no puedo");// + c.motor);
		
		System.out.println("el motor ha dejado de funcionar, pero las ruedas están intactas");
		System.out.println("quiero venderlas");
		
		//System.out.println(c.ruedas); // así no puedo acceder
		
		// tengo las ruedas en diferentes variables
		System.out.println("vendo una rueda: " + r1);
		r1 = null;
		System.out.println(r1);
		
				
		

	}

}
