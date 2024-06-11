package Colecciones.GestionBiblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {

    private List<Libro> biblioteca;

    public Biblioteca() {
        this.biblioteca = new ArrayList<>();
    }

    public void annadirLibro(Libro libro) throws BibliotecaException {
        if (biblioteca.contains(libro)) {
            throw new BibliotecaException("Este libro ya esta en la biblioteca");
        }
        biblioteca.add(libro);
    }

    public void eliminarLibroPorIsbn(int isbn) {
        biblioteca.removeIf(libro -> libro.getIsbn() == isbn);
    }

    public List<Libro> buscarLibroPorAutor(String autor) {
        return biblioteca.stream().filter(a -> a.getAutor().equals(autor)).toList();
    }

    public List<Libro> todosLosLibros() throws BibliotecaException {

        Iterator<Libro> it = biblioteca.iterator();
        List<Libro> allBooks = new ArrayList<>();
        if (biblioteca.isEmpty()) {
            throw new BibliotecaException("La biblioteca está vacia");
        }
        while (it.hasNext()){
            allBooks.add(it.next());
        }
        return allBooks;
    }
}

