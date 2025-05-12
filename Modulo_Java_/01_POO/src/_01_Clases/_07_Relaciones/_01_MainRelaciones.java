package _01_Clases._07_Relaciones;

/*
 * Ejemplo para composición persona-organos
 * Ejemplo para agregación persona-cuenta banco
 * 
 * Ejemplo programación misma relación persona-dinero(cuenta o trabajo)
 * según si es un negocio o un simulador (spotify-sims)
 */

public class _01_MainRelaciones {
public static void main(String[] args) {
		
		//Los números que empiezan por 0 en java estan en base octal
		double cp = 054676; // no hay ni 8 ni 9
		System.out.println(cp);
		int hexa = 0x123ABCF;
		int binario = 0b101;
		System.out.println(binario);
		System.out.println(hexa);
		
		//Así puedo utilizar la clase persona que tenemos en el paquete métodos
		_01_Clases._03_Metodos.Persona p03 = new _01_Clases._03_Metodos.Persona();
		
		
		Persona p1 = new Persona();
		//p1.direccion = "Calle Orense 62 Madrid 28224";
		p1.nombre = "Thor";
		//p1.direccion.ciudad = "Madrid";
		//System.out.println(p1.cuentasBancarias.length);
		
		Direccion d1 = new Direccion();
		d1.ciudad = "Madrid";
		p1.direccion = d1;
		p1.direccion.ciudad = "Barcelona";
		System.out.println(d1.ciudad);
		
		
		CuentaBancaria[] arrayCb1  = new CuentaBancaria[2];
		//p1.cuentasBancarias = new CuentaBancaria[2]; --> si hago esto directamente
													   //la única referencia al array
													   //el atributo de p1
		p1.cuentasBancarias = arrayCb1; // esto hace referencia al objeto arrayCb1
										// ahora es accesible desde arrayCb1 y desde p1.cuentasBancarias
		System.out.println(p1.cuentasBancarias.length);
		//System.out.println(p1.cuentasBancarias[0].iban);
		CuentaBancaria cb1 = new CuentaBancaria(); //creo la cuenta bancaria
		cb1.iban = "ES3267890";
		p1.cuentasBancarias[0] = cb1; //meto esta cuenta bancaria en el array, en el indice 0
		cb1.saldo = 5000; //la cuenta bancaria tiene este saldo CUENTA BANCARIA OBJETO
		System.out.println(p1.cuentasBancarias[0].saldo); //desde dentro del array que está dentro de la persona
		System.out.println(arrayCb1[0].saldo); //desde el array accediendo por fuera de la persona
		System.out.println(cb1.saldo); //desde el propio objeto
		
		/*
		cuidado con las referencias
		
		cb1 = null; --> ahora cb1 no hace referencia al objeto
						pero p1.cuentasBancarias[0] todavía hace referencia al objeto
		
		System.out.println(cb1);
		System.out.println(p1.cuentasBancarias[0]);
		p1.cuentasBancarias[0] = cb1; --> ahora ya p1.cuentasBancarias[0] deja de hacer
										  referencia al objeto
		*/
		
		cb1 = new CuentaBancaria();
		cb1.iban = "SZ56721";
		arrayCb1[1] = cb1;
		
		System.out.println(p1.cuentasBancarias[0].iban); //ES3267...
		System.out.println(p1.cuentasBancarias[1].iban); //SZ56...
		
		//cb1 = null;
		
		//arrayCb1[1] --> sigue siendo SZ56721
		//p1.cuentasBancarias --> esto accede al array
		//p1.cuentasBancarias[1] --> tengo SZ56721
		
		//p1.cuentasBancarias = cb1; --> cb1 está declarado de la clase CuentaBancaria
										//el atributo cuentasBancarias quiere un array CuentaBancaria[]
		//p1.cuentasBancarias[0] = null; --> esto no da error, hace que la referencia
											//de esta posición pase a ser null.
											// porque la variable cb1 es de la clase CuentaBancaria
											// el atributo es un array que quiere CuentaBancaria dentro
											// cualquier posición solo acepta CuentaBancaria, aunque ahora cb1
											// hace referencia a NADA, porque es null
		
		Persona p2 = new Persona();
		//p2.direccion = "Orense 05789 Plaza de España 78"; 
		p2.nombre = "Ironman";
		//p2 = p1;
		d1 = new Direccion();
		d1.ciudad = "New York";
		p2.direccion = d1;
		//System.out.println(p2.direccion.ciudad.charAt(0));
		//p1 = null;
		p2.direccion.ciudad = "Oklahoma";
		System.out.println(d1.ciudad);
		
		//arrayCb1 = new CuentaBancaria[2];
		//p1.cuentasBancarias = arrayCb1;
		//p1 = null;
		//arrayCb1 --> sigue siendo accesible porque la variable hace referencia
		
		CuentaBancaria cb2 = new CuentaBancaria();
		cb2.iban = "PT56";
		p2.cuentasBancarias = new CuentaBancaria[2];
		p2.cuentasBancarias[0] = cb2;
		
		//p2 = null;
		//p2.cuentasBancarias --> ya no puedo porque p2 ha muerto.
		//cb2 --> sigue siendo accesible desde esta referencia.
		
		Persona pSoltera1 = new Persona();
		pSoltera1.nombre = "Tristan";
		System.out.println("nace " + pSoltera1.nombre);
		
		Persona pSoltera2 = new Persona();
		pSoltera2.nombre = "Isolda";
		System.out.println("nace " + pSoltera2.nombre);
		
		pSoltera1.matrimonio = pSoltera2;
		pSoltera2.matrimonio = pSoltera1;
		System.out.println("se han casado");
		
		pSoltera1 = null;
		System.out.println("Tristan muere, no puedo hacer referencia porque NullPointer");
		System.out.println("Isolda sigue casada con Tristan, tiene que comunicar su muerte.");
		System.out.println("Comprobando si se ha hecho el trámite... Matrimonio: " + pSoltera2.matrimonio);
		pSoltera2.matrimonio = null;
		System.out.println("Isolda ya lo ha comunicado y ya no está vinculada.");
		System.out.println("sigue viva..." + pSoltera2.nombre);
		
		//otra vinculación en la que si uno muere el otro también
		//creo un órgano
		Persona persona = new Persona();
		System.out.println("Ha nacido un persona...");
		persona.nombre = "Pol";
		System.out.println("El persona se llama " + persona.nombre);
		persona.oCorazon = new Corazon();
		System.out.println("el persona está sano por que el corazon late: " + persona.oCorazon);
		System.out.println("el persona se pone malo y acaba muriendo");
		persona = null;
		System.out.println("quiero usar el corazon en otra parte");
		System.out.println(persona.oCorazon);
		
		
		
		cb2 = new CuentaBancaria();
		
		p2.cuentasBancarias[1] = cb2;
		cb2.iban = "IT89";
		System.out.println(p2.cuentasBancarias[1].iban);
		System.out.println(p2.cuentasBancarias[1]);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
