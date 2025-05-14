package es.curso.modelo.persistencia;

import java.util.List;

import es.curso.modelo.entidad.Pelicula;

public class DaoPelicula {

	private List<Pelicula> listaPeliculas;
	private int numeroMaximoPelicula;
	
	//Esto sería un comentario JavaDoc
	/**
	 * Método que inserta una película y la guarda
	 * @param p representa la película que queremos insertar
	 * @return <b>true</b> en caso de que la película haya sido insertada y <b>false</b>
	 * en caso de que la lista este llena y no haya sido posible insertarla
	 */
	public boolean insertar(Pelicula p) {
		/*
		 * comparamos el tamaño de la lista con el máximo número de películas
		 */
		if(listaPeliculas.size() >= numeroMaximoPelicula) {
			return false;
		}else {
			listaPeliculas.add(p);
			return true;
		}
	}
	
	public List<Pelicula> getListaPeliculas() {
		return listaPeliculas;
	}	
	
	public void setListaPeliculas(List<Pelicula> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}
	public int getNumeroMaximoPelicula() {
		return numeroMaximoPelicula;
	}
	public void setNumeroMaximoPelicula(int numeroMaximoPelicula) {
		this.numeroMaximoPelicula = numeroMaximoPelicula;
	}
}
