package es.curso.spring08;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainSpring08 {
	public static ApplicationContext contexto = null;
	
	public static void main(String[] args) {
		contexto = new ClassPathXmlApplicationContext("ApplicationContext08.xml");  // enlazo este archivo con el archivo "ApplicationContext08.xml"
		
		
		
		// 1º --> genero ahora objetos de clase Dirección.  (d --> dirección)
		Direccion d1 = contexto.getBean("Reyes Católicos", Direccion.class); // Granada  (Aquí con getBean obtengo una instancia de la clase. Esto ayuda al acceso a un repositorio desde el contexto Spring (ApplicationContext08.xml)
		Direccion d2 = contexto.getBean("Sierpes", Direccion.class); // Sevilla
		Direccion d3 = contexto.getBean("Fuencarral", Direccion.class); // Madrid
		Direccion d4 = contexto.getBean("d4", Direccion.class); // Valencia
		Direccion d5 = contexto.getBean("d5", Direccion.class); // Bilbao
		Direccion d6 = contexto.getBean("d6", Direccion.class);
	
		
		// imprimo en consola  cada una de las direcciones.
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		
		// genero un Array List (tengo ciertas dudas sobre imprimir los println de arriba o estos en forma de ArrayList
		
		List<Direccion> listaDirecciones = (List<Direccion>) contexto.getBean("Direcciones", Direccion.class);
		listaDirecciones.add(d1);
		listaDirecciones.add(d2);
		listaDirecciones.add(d3);
		listaDirecciones.add(d4);
		listaDirecciones.add(d5);
		listaDirecciones.add(d6);
		
		
		
		// 2º --> genero ahora objetos de clase tipoHabitaculo (h --> habitaculo o habitación)
		
		tipoHabitaculo h1 = contexto.getBean("Salon", tipoHabitaculo.class);
		tipoHabitaculo h2 = contexto.getBean("Cocina", tipoHabitaculo.class);
		tipoHabitaculo h3 = contexto.getBean("Baño", tipoHabitaculo.class);
		tipoHabitaculo h4 = contexto.getBean("Dormitorio1", tipoHabitaculo.class);
		tipoHabitaculo h5 = contexto.getBean("Dormitorio2", tipoHabitaculo.class);
		tipoHabitaculo h6 = contexto.getBean("Dormitorio3", tipoHabitaculo.class);
		tipoHabitaculo h7 = contexto.getBean("Jardin", tipoHabitaculo.class);
		
		// imprimo en consola  cada una de las direcciones
		
		System.out.println("HABITÁCULOS: ");
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
		System.out.println(h5);
		System.out.println(h6);
		System.out.println(h7);
	}
	
	
	// 4º --> genero ahora objetos de la clase Propietario  (p --> propietario)
	
	Propietario p1 = contexto.getBean("Pablo Domíngez__Sara Torres", Propietario.class);
	Propietario p2 = contexto.getBean("Alejandra López", Propietario.class);
	Propietario p3 = contexto.getBean("Jose Manuel Fonseca__Belén Rodriguez", Propietario.class);
	Propietario p4 = contexto.getBean("Carlos Cuesta__Nuria López", Propietario.class);
	Propietario p5 = contexto.getBean("Ana de los Palacios__Manuel Sánchez", Propietario.class);
	Propietario p6 = contexto.getBean("Jaime Sanz__Elena Bueno", Propietario.class);

	
		// imprimo en consola  cada una de las direcciones
	
	System.out.println("\nPROPIETARIOS: ");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);

	
	
		// 3º --> genero objetos de la clase Inquilinos  (i --> inquilino) (debo generar un List de Inquilinos
		List<Inquilino> listaInquilinos =  (List<Inquilino>) contexto.getBean("inquilinos", Inquilino.class);
		Inquilino i1 = contexto.getBean("Pedro Cobos__Ana Louisa", Inquilino.class);
		Inquilino i2 = contexto.getBean("Roberto Gómez__Irene de la Vid", Inquilino.class);
		Inquilino i3 = contexto.getBean("Hugo Fernández__Esmeralda Rivas", Inquilino.class);
		Inquilino i4 = contexto.getBean("Yago Velilla__Delia Romero", Inquilino.class);
		Inquilino i5 = contexto.getBean("David Pardo__Alejandra de la Torre", Inquilino.class);
		Inquilino i6 = contexto.getBean("Fabio Martínez__Marta Luengo", Inquilino.class);

		
		// imprimo en consola  cada una de los Inquilinos 
		
		System.out.println("INQUILINOS: ");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		
	
}