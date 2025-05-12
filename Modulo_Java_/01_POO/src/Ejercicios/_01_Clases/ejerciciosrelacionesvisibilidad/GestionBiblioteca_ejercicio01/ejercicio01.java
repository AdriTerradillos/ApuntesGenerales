package Ejercicios._01_Clases.ejerciciosrelacionesvisibilidad;

/*
====================
=   ENUNCIADO 01   =
====================


Ejercicio 1: Sistema de Gestión de Libros

====Enunciado:====

Un programa necesita gestionar una biblioteca de libros. 
Cada libro tiene un título, un autor, un ISBN (Identificador 
Único de Libro) y un estado (disponible o prestado). La biblioteca 
tiene una colección de libros. Los usuarios de la biblioteca pueden 
tomar prestado un libro si está disponible y devolver un libro que 
hayan tomado prestado. El programa debe permitir añadir nuevos libros 
a la biblioteca y mostrar la lista de todos los libros con su respectivo 
estado.

====Clases:====

***Libro:
	- Atributos: titulo (String), autor (String), isbn (String), estado (Enum: DISPONIBLE, PRESTADO).
	- Métodos: prestar(), devolver(), obtenerTitulo(), obtenerAutor(), obtenerISBN(), obtenerEstado().
***Biblioteca:
	- Atributos: coleccionLibros (ArrayList de Libro).
	- Métodos: agregarLibro(Libro libro), prestarLibro(String isbn), devolverLibro(String isbn), mostrarLibros().
***UsuarioBiblioteca: (Clase principal para interactuar con el sistema)
	- Método: main() que permita realizar las acciones mencionadas en el enunciado.

====Paquetes:====

modelo: Contendrá las clases Libro y el Enum para el estado.
servicio: Contendrá la clase Biblioteca.
principal: Contendrá la clase UsuarioBiblioteca.
 */


public class ejercicio01 {

}
