package _01_Clases._08_visibilidades.otropaquete;

/*
Si quiero utilizar cualquier clase que no se encuentre 
dentro de este paquete es necesario importarla. 
Para importar una clase que se encuentra en un paquete 
completamente diferente se tiene que hacer como si fuera 
la ruta. En este caso quiero la clase Estudiante. Esta 
clase se encuentra dentro de _01_Clases en otro paquete 
que es _08_visibilidades.
Si quisiera importar todo lo que se encuentra dentro de 
ese paquete valdría con utilizar un asterisco en el lugar 
de la clase como en el siguiente ejemplo:

import _01_Clases._08_visibilidades.*; --> esto me importa
										   todo: Estudiante, 
										   Pokemon, MainVisibilidad1
*/

import _01_Clases._08_visibilidades.Estudiante;


public class MainVisibilidad2 {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		//e1.nombre = "pepe"; //privado solo desde clase
		//e1.edad = 45; //por defecto, clase + paquete
		//e1.peso = 57.67; //protected clase + paquete + subclases
		e1.dni = "67890S"; //publico SI puedo
		
		
		//Pokemon p = new Pokemon(); // no puedo crear el objeto si no importo la clase
		
		
	}

}
