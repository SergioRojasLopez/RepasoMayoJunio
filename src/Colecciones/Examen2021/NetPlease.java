package Colecciones.Examen2021;

import java.util.HashMap;

public class NetPlease {

    //Hashmap donde por cada tema, podemos acceder a las películas de ese tema
    private HashMap<String, PeliculasDeUnTema> mapPeliculas;


    public NetPlease() {
        mapPeliculas = new HashMap<String, PeliculasDeUnTema>();
    }

    public void annadirTema(String tema) throws NetPleaseException {

        tema = tema.toUpperCase();
        if (mapPeliculas.containsKey(tema)) {
            throw new NetPleaseException("Ya existe ese tema");
        }
        mapPeliculas.put(tema, new PeliculasDeUnTema(tema));
    }

    public void addPelicula(String tema, Pelicula pelicula) throws NetPleaseException {

        PeliculasDeUnTema listaPeliculasDeUnTema = mapPeliculas.get(tema);
        if (listaPeliculasDeUnTema == null) {
            throw new NetPleaseException("No existe el tema " + tema);
        }
        listaPeliculasDeUnTema.addPelicula(pelicula);
    }

    public void listadoDeTodasPeliculasDeTodosLosTemas() {
        for (PeliculasDeUnTema listaPelisTema : mapPeliculas.values()) {
            System.out.println(listaPelisTema);
        }
    }

    public void borrarPeliculaDeUnTema(String tema, String titulo) throws NetPleaseException {
        if (!mapPeliculas.containsKey(tema)) {
            throw new NetPleaseException("No existe el tema");
        }
        for (PeliculasDeUnTema peliculasDeUnTema : mapPeliculas.values()) {
            if (peliculasDeUnTema.getTema().equals(tema)){
                peliculasDeUnTema.borrar(titulo);
            }
        }
    }

    public String temaDePelicula(String titulo) throws NetPleaseException {
        for (PeliculasDeUnTema peliculasDeUnTema : mapPeliculas.values()){
            if (peliculasDeUnTema.buscarPeliculaPorTitulo(titulo) != null){
                return peliculasDeUnTema.getTema();
            }
        }
        return null;
    }
}
