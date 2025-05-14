package es.curso.cfg;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import es.curso.modelo.entidad.Pelicula;
import es.curso.modelo.persistencia.DaoPelicula;

//Esta clase es la que vamos a usar para dar de alta nuestros objetos y para
//decirle a Spring que busque anotaciones en nuestro proyecto

//Para decirle a Spring que esta clase va a ser una clase de configuración
//usaremos la anotación @Configuration.

@Configuration
//También podemos decirle a Spring, una vez que hayamos dicho que es una clase de 
//configuración, que vaya a buscar anotaciones de beans para dar de alta en el contexto
//de Spring. Podemos poner todos los paquetes que queramos separados por ","
@ComponentScan(basePackages = {"es.curso"})
public class ConfiguracionSpring {
	
	//Las clases de configuración también tienen métodos anotados con @Bean
	//Spring ejecutará estos métodos para obtener beans dentro de su contexto.
	
	//Es decir, el siguiente método Spring lo ejecutará y el objeto devuelto
	//lo meterá dentro del contexto con el "id" igual al nombre del método
	
	//<bean id="daoPelicula" class="DaoPelicula"/>
	@Bean
	public DaoPelicula daoPelicula() {
		DaoPelicula daoPelicula = new DaoPelicula();
		List<Pelicula> listaPelicula = new LinkedList<>();
		daoPelicula.setListaPeliculas(listaPelicula);
		daoPelicula.setNumeroMaximoPelicula(2);
		return daoPelicula;
	}
}
