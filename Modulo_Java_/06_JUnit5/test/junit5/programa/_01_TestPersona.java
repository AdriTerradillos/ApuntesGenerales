package junit5.programa;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import programa.Persona;

public class _01_TestPersona {
	
	private Persona p1;
	
	@BeforeEach
	void setUp() throws Exception {
		//Me interesa antes de cada test tener un objeto persona 
		//limpio (nuevo)
		p1 = new Persona();
		//configuramos todo lo que queramos antes de cada @Test
	}

	@AfterEach
	void tearDown() throws Exception {
		p1 = null;
	}

	/**
	 * En esta prueba unitaria vamos a probar el metodo "setNombre" con más
	 * de tres caracteres
	 */
	@Test
	public void testSetNombreMayorTresCaracteres(){
		//No hace falta crear el objeto porque  lo creamos en el 
		//metodo anotado con @BeforeEach
		p1.setNombre("Goku");
		//el nombre en el objeto tiene que estar puesto a Goku
		
		String resultadoEsperado = "Goku";
		String resultadoObtenido = p1.getNombre();
		
		//Comparamos que sean iguales
		assertEquals(resultadoEsperado, resultadoObtenido);	
	}
	
	@Test
	public void testSetNombreMayorMenorOIgualTresCaracteres() {
		p1.setNombre("ana");
		//el nombre tiene que estar puesto a Goku
		
		String resultadoEsperado = "";
		String resultadoObtenido = p1.getNombre();
		
		assertEquals(resultadoEsperado, resultadoObtenido);		
	}
	
	@Test
	public void testSetNombreMasPruebas() {
		//Podemos pasar mas pruebas, no tienen porque estar de más
		p1.setNombre("az");
		
		String resultadoEsperado = "";
		String resultadoObtenido = p1.getNombre();
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		p1.setNombre("a");
		assertEquals("", p1.getNombre());
		
		p1.setNombre("Pikolo");
		assertEquals("Pikolo", p1.getNombre());
	}
	
	@Test
	public void testConstructores() {
		Persona p = new Persona("Tony", 23, 45);
		
		String resultadoEsperadoNombre = "Tony";
		String resultadoObtenidoNombre = p.getNombre();
		
		assertEquals(resultadoEsperadoNombre, resultadoObtenidoNombre);
		
		assertEquals(23, p.getEdad());
		assertEquals(45, p.getPosicion());
	}
	
	@Test
	public void testCaminar() {
		p1.setPosicion(0);
		
		p1.caminar(30);
		
		int resultadoEsperado = 30;
		int resultadoObtenido = p1.getPosicion();
		
		assertEquals(resultadoEsperado, resultadoObtenido); //si funciona correctamente
															//me tiene que validar el test
		
		p1.caminar(50);
		
		resultadoEsperado = 80;
		resultadoObtenido = p1.getPosicion();
		
		assertEquals(resultadoEsperado, resultadoObtenido); //si funciona bien paso esta segunda parte
		
		p1.caminar(-40);
		
		assertEquals(40, p1.getPosicion());
	}

	@Test
	public void testCopiaPersona() {
		p1.setNombre("Tony");
		p1.setEdad(23);
		p1.setPosicion(0);
		
		Persona p2 = p1.copiarPersona(); //esto debería generar un objeto nuevo de Persona
										 //pero con los mismos valores en sus atributos
		
		assertEquals(p1.getNombre(), p2.getNombre()); //en principio debería ser que sí
		assertEquals(p1.getEdad(), p2.getEdad()); 
		assertEquals(p1.getPosicion(), p2.getPosicion());
		
		//Para dar por buena la prueba tengo que comprobar que
		//ambos objetos no son el mismo
		
		//System.out.println(p1);
		//System.out.println(p2);
		//No nos valdría el assertNotEquals ya que el metodo equal esta
		//sobreescrito en la clase Persona
		assertNotSame(p1, p2); //equivalente a p1 != p2
		
		// p1.equals(p2); --> esto de aquí me comprueba si el contenido (sus atributos) son
							  //los mismos en ambos objetos
		
		// p1 == p2; --> me comprueba si los objetos son el mismo, ambas variables hacen referencia
						// al mismo objeto
	}
	
	//Lo ideal sería dividirlo en 3 test
	@Test
	public void testPersonaMayor() {
		Persona p2 = new Persona();
		
		p1.setEdad(45);	
		p2.setEdad(30);
		
		//en p3 voy a tener guardada la persona que sea mayor de las 2
		Persona mayor = p1.personaMayor(p2); //nos devuelve a la Persona como tal, el objeto
		
		assertSame(mayor, p1); //en Persona mayor tengo el resultado de la comprobación de quién es mayor
							//se queda la referencia al objeto que es mayor (en este caso p1)
							//mayor hace referencia a p1 y p1 es p1, ambos son el mismo objeto
		
		p1.setEdad(22);
		p2.setEdad(50);
		
		mayor = p1.personaMayor(p2); //ahora en mayor tengo referencia a p2 (porque p2 tiene
									 //y p1 tiene 22)
		
		assertSame(mayor, p2); //este también debería pasarlo porque mayor hace referencia a p2 
							   // y p2 es p2.
		
		p1.setEdad(30);
		p2.setEdad(30);
		
		assertSame(p2, p1.personaMayor(p2)); //también cumple porque salta el else y devuelve el
											 //objeto pasado por parámetro (que es p2)
	}
	
	@Test
	public void testCalcularDistacia() {
		// Para este test, al menos habría que probar 3 casos
		p1.setPosicion(10);
		
		int resultadoObtenido = p1.calcularDistancia(-5);
		int resultadoEsperado = -1;
		
		//Primer caso, espero -1
		assertEquals(resultadoEsperado, resultadoObtenido);
		
		//Segundo caso, la posicion pasada es menor que la posición
		//del objeto
		resultadoObtenido = p1.calcularDistancia(7);
		resultadoEsperado = 3;
		
		assertEquals(resultadoObtenido,resultadoEsperado);// 10 - 7 = 3
		
		//Tercer caso, la posición pasada es mayor que la posición
		//del objeto
		resultadoObtenido = p1.calcularDistancia(13);
		resultadoEsperado = 3;
		
		assertEquals(resultadoObtenido, resultadoEsperado);

	}
}
