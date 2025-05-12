package junit5.programa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import programa.Producto;

public class _03_TestProducto {

	@Test
	public void testDamePvp(){
		Producto prod = new Producto();
		
		//LÓGICA DE LA CLASE
		prod.setPvc(100.00);
		prod.setBeneficio(1.3);
		//RESULTADO ESPERADO
		// ya que el pvp es el Pvc * el beneficio
		double res = 100.00 * 1.3;

		/* parametros
		 * expected - lo esperado
		   actual - el valor que se va a comprobar
		   delta - margen de error. En este caso se indica 0.01, si lo esperado y lo actual tienen
		   							una diferencia de 0.003 va a pasar el test.
		   							Si la diferencia es de 0.02 no lo va a pasar.
		   							Esto ocurre porque 130.0 puede ser 130.000000000003 y esa variación
		   							puede alterar el resultado de las operaciones.
		 */
		assertEquals(res, prod.damePvp(), 0.01);
	}

	@Test
	public void testDamePvpIva(){
		Producto prod = new Producto();

		//MÉTODO DE PRUEBA
		prod.setPvc(100.00);
		prod.setIva(1.21);
		prod.setBeneficio(1.3);

		//RESULTADO ESPERADO
		//ya que es el pvc * el beneficio * el iva
		double res = 157.3;
		
		assertEquals (res, prod.damePvpIva(), 0.0001);
	}

}
