# Gestión de pedidos de un bar

Queremos modelar un sistema de pedidos de bar donde haya diferentes tipos de productos y una clase genérica que administre los pedidos de cualquier subtipo de Producto.

## Clases

1. Producto (superclase):

   * Atributos: nombre, precio.
   * Método getDescripcion().

2. Subclases:

   * Bebida: añade mililitros.
     * Refrescos
     * Alcoholes: añadir vol%
   * Comida: añade tipo (tapa, ración, bocadillo).

3. Clase genérica `Pedido<T extends Producto>`:
   * Atributo: `Map<T, Integer>` (producto → cantidad).

## Métodos:

* `void agregarProducto(T producto, int cantidad)`
* `double calcularTotal()`
* `void imprimirTicket()`

## DOCUMENTACION:

JavaDoc para cada clase y método:
* En `Pedido<T>` usar `@param <T>` y explicar que está restringido a `Producto`.
* En `imprimirTicket()`, mostrar `nombre`, `cantidad` y `subtotal`.
* En `calcularTotal()`, mostrar el cálculo total del pedido.

MAIN:
- Crear un `Pedido<Producto>` o `Pedido<? extends Producto>`.
- Añadir objetos de tipo `Bebida` y `Comida`.
- Imprimir el ticket con precios y total.