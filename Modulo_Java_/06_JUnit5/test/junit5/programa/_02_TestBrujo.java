package junit5.programa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programa.Brujo;

public class _02_TestBrujo {
	
	//Añadir atributo para la instancia del Brujo
	//private Brujo b1;
	
	//Se debería añadir aquí un @BeforeEach que instancie el brujo
	
	//Se debería añadir aquí un @AfterEach que deje el atributo b1 = null;

	/**
	 * Para el método setPoder al menos hay que probar 2 casos, uno cuando
	 * le pasamos un poder positivo o cero, y otro para cuando le pasamos
	 * un poder negativo
	 */
	
	@Test
	public void testPoderPositivo(){
		Brujo brujo = new Brujo(); // Esto no sería una buena práctica del todo
								   // Esto sería más correcto con un @BeforeEach
		brujo.setPoder(50);
		
		int resultadoEsperado = 50;
		int resultado = brujo.getPoder();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testPoderNegativo(){
		Brujo brujo = new Brujo();
		brujo.setPoder(-20);
		
		int resultadoEsperado = 0;
		int resultado = brujo.getPoder();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	/** 
	 * Este no sería 100% necesario, ya que realmente estaría incluido en el 
	 * método testPoderPositivo, pero en las pruebas podemos probar todos
	 * los casos que se nos ocurran, no hay un límite
	 */
	@Test
	public void testPoderCero(){
		Brujo brujo = new Brujo();
		brujo.setPoder(0);
		
		int resultadoEsperado = 0;
		int resultado = brujo.getPoder();
		
		assertEquals(resultadoEsperado, resultado); 
	}

	/**
	 * Para el método estaMuerto al menos debemos de probar 3 casos
	 * ya que hay 3 opciones por las que tenemos que pasar
	 * 
	 * En este caso simplemente vamos a probar que si el brujo
	 * no tiene vida, el brujo esta muerto
	 */
	@Test
	public void testEstaMuertoVidaNegativa(){		
		Brujo brujo = new Brujo();
		brujo.setVida(-5);
		
		//Ahora el resultado esperado es que el brujo esté muerto
		assertTrue(brujo.estaMuerto());	//assertTrue --> comprueba si el resultado es true
		
	}

	/**
	 * Aquí vamos a probar que el brujo tenga la vida positiva
	 * pero no tengan alma. Según la documentación, el brujo
	 * tiene que estar muerto
	 */
	@Test
	public void testEstaMuertoVidaPositivaSinAlma(){
		Brujo brujo = new Brujo();
		brujo.setVida(5); //aquí el brujo tiene puntos de vida --> primer condicional no se cumple
		brujo.setTieneAlma(false); //el brujo no tiene alma --> entra en la condición RETURN TRUE
		
		//Ahora el resultado esperado es que el brujo esté muerto
		assertTrue(brujo.estaMuerto());	//¿realmente esto está devolviendo true?	
	}
	
	/**
	 * Aquí vamos a probar que el brujo tenga la vida positiva
	 * y tenga alma, ya que según la documentación el brujo
	 * tiene que estar vivo
	 */
	@Test
	public void testEstaMuertoVidaPositivaConAlma(){

		Brujo brujo = new Brujo();
		brujo.setVida(5); //vida positiva
		brujo.setTieneAlma(true);	//alma true	
		
		//Ahora el resultado esperado es que el brujo NO esté muerto --> está vivo 
		assertFalse(brujo.estaMuerto()); //¿Realmente estaMuerto() da false, porque está vivo?	
	}
	
	/**
	 * En este caso no estaría tampoco de más probar que el brujo
	 * con vida negativa y alma esta muerto también
	 */
	@Test
	public void testEstaMuertoVidaNegativaConAlma(){
		Brujo brujo = new Brujo();
		brujo.setVida(-5);
		brujo.setTieneAlma(true);		
		
		//Ahora el resultado esperado es que el brujo SI esté muerto
		assertTrue(brujo.estaMuerto());		
	}
}
