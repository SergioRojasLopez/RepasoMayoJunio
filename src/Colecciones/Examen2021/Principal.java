package Colecciones.Examen2021;

import java.sql.ClientInfoStatus;

public class Principal {

	public static void main(String[] args) {
		
		NetPlease netPlease=new NetPlease();
		PeliculasDeUnTema peliculasDeUnTema = new PeliculasDeUnTema("FANTASIA");

		try {
			netPlease.annadirTema("COMEDIA");
			netPlease.annadirTema("ACCION");
			netPlease.annadirTema("DRAMA");
			netPlease.annadirTema("FANTASIA");
			
			netPlease.addPelicula("COMEDIA", new Pelicula("BAJO EL MISMO TECHO", 2019));
			netPlease.addPelicula("ACCION", new Pelicula("TRANSFORMER", 2007));
			netPlease.addPelicula("DRAMA", new Pelicula("TITANIC", 1999));
			netPlease.addPelicula("DRAMA", new Pelicula("SHUTER ISLAND", 2021));
			netPlease.addPelicula("DRAMA", new Pelicula("EL HOMBRE DEL NORTE", 2023));
			netPlease.addPelicula("COMEDIA", new Pelicula("SCARY MOVIE", 2004));
			netPlease.addPelicula("FANTASIA",new Pelicula("CRONICAS DE NARNIA",2004));
			netPlease.addPelicula("FANTASIA",new Pelicula("HARRY POTTER",2004));
			netPlease.temaDePelicula("BAJO EL MISMO TECHO");
			netPlease.borrarPeliculaDeUnTema("DRAMA","TITANIC");

			peliculasDeUnTema.buscarPeliculaPorTitulo("HARRY POTTER");
			peliculasDeUnTema.annadirOpinionAPelicula("HARRY POTTER", new Opinion(7,"Fantastica"));
			netPlease.listadoDeTodasPeliculasDeTodosLosTemas();

			System.out.println(peliculasDeUnTema.getListaPeliculasDeUnTema().size());

		} catch (NetPleaseException e) {
			System.err.println(e.getMessage());
		}
    }



}
