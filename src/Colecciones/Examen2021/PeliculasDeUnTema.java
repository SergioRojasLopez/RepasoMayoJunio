package Colecciones.Examen2021;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.IllegalFormatCodePointException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PeliculasDeUnTema {

    private String tema;
    private LinkedList<Pelicula> listaPeliculasDeUnTema;

    public PeliculasDeUnTema(String tema) {
        this.tema = tema;
        listaPeliculasDeUnTema = new LinkedList<Pelicula>();
    }
    public String getTema() {
        return this.tema;
    }
    public void addPelicula(Pelicula pelicula) throws NetPleaseException {
        LocalDateTime fecha = LocalDateTime.now();
        if (listaPeliculasDeUnTema.contains(pelicula)) {
            throw new NetPleaseException("La pelicula ya existe");
        }
        if (pelicula.getAnnoEstreno() > 2024) {
            throw new NetPleaseException("El estreno de la pelicula debe ser inferior a la actual ");
        }
        listaPeliculasDeUnTema.add(pelicula);
    }

    public void borrarLasPeliculasDeUnAnno(int anno) throws NetPleaseException {

        boolean encontrado = false;
        Iterator<Pelicula> it = listaPeliculasDeUnTema.iterator();
        while (it.hasNext()) {
            Pelicula p = it.next();
            if (p.getAnnoEstreno() == anno) {
                encontrado = true;
                listaPeliculasDeUnTema.remove();
            }
        }
        if (!encontrado) {
            throw new NetPleaseException("La pelicula no se ha encontrado");
        }
    }

    public void annadirOpinionAPelicula(String tituloPelicula, Opinion opinion) throws NetPleaseException {
       for (Pelicula pelicula : listaPeliculasDeUnTema) {
           if (!listaPeliculasDeUnTema.contains(tituloPelicula)) {
               throw new NetPleaseException("La pelicula no esta");
           }
       }
        Iterator<Pelicula> it = listaPeliculasDeUnTema.iterator();
        while (it.hasNext()) {
            Pelicula p = it.next();
            if (p.getTitulo().equals(tituloPelicula))
                p.annadirOpinion(opinion);
        }
    }
    public List<Pelicula> listadoDePeliculasOrdenadasPorMediaDeOpiniones() {
        return listaPeliculasDeUnTema.stream().sorted((p1, p2) -> (int) (p1.mediaDeOpiniones() - p2.mediaDeOpiniones())).toList();
    }

    public List<Pelicula> listaPeliculasDondeIntervieneUnActor(String actor) {
        return listaPeliculasDeUnTema.stream().filter(pelicula -> pelicula.getActores().contains(actor)).toList();
    }

    public Pelicula buscarPeliculaPorTitulo(String titulo) {

        return listaPeliculasDeUnTema.stream().filter(pelicula -> pelicula.getTitulo().equals(titulo)).findFirst().orElse(null);
    }

    public boolean borrar(String titulo) {
        return listaPeliculasDeUnTema.removeIf(pelicula -> pelicula.getTitulo().equals(titulo));
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((tema == null) ? 0 : tema.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PeliculasDeUnTema other = (PeliculasDeUnTema) obj;
        if (tema == null) {
            if (other.tema != null)
                return false;
        } else if (!tema.equals(other.tema))
            return false;
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tema " + tema + "\n");
        for (Pelicula pelicula : listaPeliculasDeUnTema) {
            sb.append(pelicula + "\n");
        }
        return sb.toString();
    }

    public LinkedList<Pelicula> getListaPeliculasDeUnTema() {
        return listaPeliculasDeUnTema;
    }
}
