package Ejercicios._02_herencias.nivelintermedio.plataformastreaming;

public class enunciado {
/*
Diseñar e implementar una estructura orientada a objetos para simular el
funcionamiento básico de una plataforma de streaming tipo Netflix.
El sistema debe permitir registrar usuarios, añadir contenidos de distintos
tipos (películas, series, documentales), visualizar información, registrar
visualizaciones y valoraciones, así como obtener estadísticas básicas.

1. Contenido (clase abstracta)
- Atributos:
	- String titulo
	- int anio
	- double duracion (en minutos)
	- Genero genero (enum)
	- List<Valoracion> valoraciones
- Métodos:
	- String mostrarResumen() → abstracto.
	- void añadirValoracion(Valoracion val)
	- double calcularValoracionMedia() → devuelve la media de las puntuaciones de las valoraciones.

2. Pelicula (extiende Contenido)
- Atributos adicionales:
	- String director
	- boolean esEstreno

- Sobrescribe mostrarResumen() para incluir si es estreno o no y quién es el director.

3. Serie (extiende Contenido)
- Atributos adicionales:
	- int numeroTemporadas
	- int capitulosPorTemporada

- Sobrescribe mostrarResumen() para incluir temporadas y capítulos.

4. Documental (extiende Contenido)
- Atributos adicionales:
	- String tema
	- String narrador

- Sobrescribe mostrarResumen() con tema y narrador.

5. Valoracion
- Atributos:
	- Usuario autor
	- Contenido contenido
	- int puntuacion (de 1 a 5)
	- String comentario

6. Usuario
- Atributos:
	- String nombreUsuario
	- List<Contenido> historialVistos

- Métodos:
	- void verContenido(Contenido c) → añade al historial.
	- void valorarContenido(Contenido c, int puntuacion, String comentario)
	- List<Contenido> getRecomendaciones()
		→ debe devolver una lista de contenidos recomendados del mismo género
		  que los ya vistos.

7. Admin (extiende Usuario)
- Puede hacer todo lo que un Usuario hace, y además:
- Métodos adicionales:
	- void crearContenido(...)
	- void eliminarContenido(Contenido c)
	- void mostrarEstadisticasPlataforma()

8. Genero (enum)
Valores obligatorios: ACCION, DRAMA, COMEDIA, DOCUMENTAL, TERROR, CIENCIA_FICCION.

9. PlataformaStreaming
- Atributos:
	- List<Usuario> usuarios
	- List<Contenido> catalogo

- Métodos:
	- void registrarUsuario(Usuario u)
	- void añadirContenido(Contenido c)
	- void mostrarCatalogo()
	- List<Contenido> buscarPorGenero(Genero g)
	- List<Contenido> obtenerTop10()

Requisitos adicionales de funcionamiento
- Valoraciones:
	*Cada contenido puede tener múltiples valoraciones.
	*La valoración media debe poder consultarse desde cualquier tipo de contenido.
	*Solo un usuario que haya visto un contenido puede valorarlo.

- Recomendaciones:
	*El método getRecomendaciones() debe buscar otros contenidos con el mismo
	 género que los vistos en el historial del usuario, excluyendo los ya vistos.

	*Las recomendaciones pueden estar ordenadas por valoración media (opcional).

- Estadísticas para el administrador:
	*Mostrar el contenido con mayor valoración media.
	*Mostrar cuántos usuarios han visto cada contenido.
	*Mostrar el total de valoraciones registradas.

- Visualización:
	*Un usuario debe poder ver un resumen del catálogo con:
	 título, género, tipo de contenido y valoración media.

	*Al seleccionar un contenido, se debe imprimir el mostrarResumen()
	 propio de su clase.

- Restricciones técnicas:
	*Deben usarse clases abstractas, herencia, polimorfismo (listas de tipo Contenido),
	 y enum para los géneros.

La clase main() debe contener un ejemplo de uso funcional 
(al menos 3 usuarios, 5 contenidos y varias valoraciones).
*/



}
