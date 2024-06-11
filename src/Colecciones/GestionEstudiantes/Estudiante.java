package Colecciones.GestionEstudiantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estudiante {
    private String nombre;
    private int id;
    private List<Integer> listaNotas;

    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.listaNotas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getListaNotas() {
        return listaNotas;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Estudiante that = (Estudiante) object;
        return Objects.equals(nombre, that.nombre) && id == that.id && Objects.equals(listaNotas, that.listaNotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id, listaNotas);
    }
}
