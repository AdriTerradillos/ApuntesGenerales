package Ejercicios._02_herencias.nivelbasico.productosiva;

public class enunciado {
/*
Enunciado
Diseña un sistema para calcular el precio final de productos según su tipo de IVA.

Crea una clase abstracta Producto con:
- Atributos: nombre (String), precioBase (double).
- Método abstracto calcularPrecioFinal() que devuelve un double.

Crea las siguientes subclases que extiendan de Producto:

- ProductoGeneral
	- Aplica un IVA del 21%.
	- calcularPrecioFinal(): precioBase * 1.21

- ProductoReducido
	- Aplica un IVA del 10%.
	- calcularPrecioFinal(): precioBase * 1.10

- ProductoSuperReducido
	- Aplica un IVA del 4%.
	- calcularPrecioFinal(): precioBase * 1.04

En una clase principal:
	- Crea varios productos de cada tipo.
	- Guárdalos en una lista de tipo Producto.
	- Muestra el nombre y precio final de cada uno.

* Tendrás que añadir atributos para el nombre, código o todo aquello
  que consideres que debe tener un producto.
  
* Puedes hacer más clases, por ejemplo Pasta, Arroz, Carne, Pescado, Lácteos...
  Según los tipos de producto que hay con los diferentes tipos de IVA y
  que cada clase contenga productos diferentes.

Guía
Define la clase abstracta Producto.

Implementa cada subclase con su fórmula específica.

En el main, instancia distintos productos y almacénalos en una lista.

Recorre la lista con polimorfismo llamando a calcularPrecioFinal().
*/
}
