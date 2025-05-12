package modelo.negocio;

import java.util.List;

import modelo.entidades.Pelicula;
import modelo.persistencia.DaoPelicula;

public class GestorPelicula {
	
	private DaoPelicula daoPelicula;
	
	/**
	 * Método que insertará una película mediante el daoPelícula. La película
	 * no puede tener el título vacío para poder ser insertada
	 * @param p la película a insertar
	 * @return 0 en caso de que hayamos podido insertar la pelicula, 1 en caso
	 * de que el titulo este vacío y 2 en caso de la lista no admita más películas
	 */
	public int insertar(Pelicula p) {
		if(p.getTitulo().equals("")) {
			return 1;
		}else {
			boolean insertada = daoPelicula.insertar(p);
			if(insertada) {
				return 0;
			}else {
				return 2;
			}
		}
	}
	
	public List<Pelicula> listar(){
		return daoPelicula.listar();
	}

	//Los getter y setter para las insertar las dependencias con el DaoPelicula
	public DaoPelicula getDaoPelicula() {
		return daoPelicula;
	}

	public void setDaoPelicula(DaoPelicula daoPelicula) {
		this.daoPelicula = daoPelicula;
	}
	
	
}
