## Contexto

Vais a poner en práctica todas las características vistas en clase:

Ciclo de vida de los tests: @BeforeAll, @AfterAll, @BeforeEach, @AfterEach.

Aserciones variadas: assertEquals, assertTrue, assertFalse, assertThrows, assertArrayEquals, assertSame/assertNotSame, fail(), etc.

Tests de excepción con assertThrows.

Tiempo máximo de ejecución con @Timeout.

Tests parametrizados con @ParameterizedTest y @ValueSource.

Suites de prueba con @Suite y @SelectClasses.

Para ello, vais a trabajar con dos clases:

CarritoCompra: gestiona una lista de Producto.

ProcesadorPagos: simula el cobro de un pago.

## Test Classes
Deberéis crear dos clases de prueba bajo test/junit5.programa:

* TestCarritoCompra.java
* TestProcesadorPagos.java

Y, adicionalmente, una suite:

* AllTestsTienda.java (usa @Suite y @SelectClasses para ejecutar ambos tests).

## Requisitos detallados

### TestCarritoCompra.java

#### Ciclo de vida

@BeforeAll (static): inicializa un CarritoCompra compartido.

@AfterAll (static): deja a null el carrito.

@BeforeEach: vacía el carrito antes de cada test.

@AfterEach: imprime en consola "Test finalizado" (para comprobar @AfterEach).

#### Tests de aserciones

* testAgregarYCantidad
	* agregarProducto(...) con dos Producto distintos.
	* assertEquals(2, getCantidadProductos()).
* testEliminarProductoExistente
	* Añade un producto, lo elimina, y comprueba con assertEquals(0, getCantidadProductos()).
* testEliminarNoExistente
	* Llama a eliminarProducto(999) sin haber añadido nada.
	* Debe lanzar IllegalArgumentException (assertThrows).
* testListarIds
	* Añade 3 productos con IDs 10, 20, 30.
	* int[] esperado = {10,20,30}
	* assertArrayEquals(esperado, listarIds()).

#### Timeout

Crea un test @Test @Timeout(100, MILLISECONDS) que invoque calcularTotalSinIva() en un carrito con 1000 productos (puedes simular añadiendo un for). Debe completarse en menos de 100 ms.

#### Parametrizado

Usa @ParameterizedTest @ValueSource(ints = {0, 1, 5, 10}) para un método testCantidadParametrizada(int n) que añade n productos (todos con mismo id) y comprueba getCantidadProductos() == n.

## TestProcesadorPagos.java

### Lifecycle reducido

Sólo @BeforeEach para crear un ProcesadorPagos nuevo.

#### Tests principales

* testPagoSuficiente
	* procesarPago(200.0, 150.0) → assertEquals(50.0, resultado, 0.001).
* testPagoInsuficiente
	* assertThrows(IllegalArgumentException.class, () -> procesarPago(100.0, 150.0)).
* testTimeoutProcesamiento
	* @Test @Timeout(80, MILLISECONDS) en procesarPago(500.0, 100.0) → no debe exceder 80 ms.
* testCambioExacto (parametrizado)
	* @ParameterizedTest @ValueSource(doubles = {100.0, 200.0, 300.0})
	* Para cada monto, con total = monto, assertEquals(0.0, procesarPago(monto, monto), 0.0001).