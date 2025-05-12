package es.curso.spring07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//https://docs.spring.io/spring/docs/4.3.10.RELEASE/spring-framework-reference/html/expressions.html
public class SpringMain07 {
	
	public static ApplicationContext context = null;
	
	public static void main(String[] args) {
		context = 
				new ClassPathXmlApplicationContext("ApplicationContext07.xml");
		
		Persona p = context.getBean("persona",Persona.class); // genero la variable p dentro de la clase Persona a partir de getBean. Dentro de "persona". Finalmente, enlazo con la clase Persona.class)
		System.out.println(p);  // imprimo el mensaje de la variable de Persona--> (p)
		
		Persona p2 = context.getBean("persona2",Persona.class); // genero la variable p2 dentro de la clase Persona a partir de getBean. Dentro de "persona2".  Finalmente, enlazo con la clase Persona.class)
		System.out.println(p2); // imprimo el mensaje de la variable de Persona--> (p2)
		
		Persona p3 = context.getBean("persona3",Persona.class); // genero la variable p2 dentro de la clase Persona a partir de getBean. Dentro de "persona3".  Finalmente, enlazo con la clase Persona.class)
		System.out.println(p3); // imprimo el mensaje de la variable de Persona--> (p3)
	}
}
