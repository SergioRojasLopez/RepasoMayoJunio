package Objetos.GestionDeLibros;

import java.util.Objects;

public class Libro {

    private String nombre;
    private String autor;
    private int anioPublicacion;
    private int id;

    public Libro(String nombre, String autor, int anioPublicacion, int id) {
        this.nombre = nombre;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }


    public int getId() {
        return id;
    }

    public void imprimirDetalles (){
        System.out.println(nombre);
        System.out.println(autor);
        System.out.println(anioPublicacion);
        System.out.println(id);
    }

    public void esPublicacionReciente (){

        if (anioPublicacion >= 2012 && anioPublicacion <= 2024){
            System.out.println("El libro tiene menos de 10 años");
        }
        else {
            System.out.println("El libro tiene mas de 10 años");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return anioPublicacion == libro.anioPublicacion && id == libro.id && Objects.equals(nombre, libro.nombre) && Objects.equals(autor, libro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor, anioPublicacion, id);
    }
}
