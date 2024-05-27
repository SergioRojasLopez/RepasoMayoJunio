package Objetos.MundialChapas;

import java.util.ArrayList;
import java.util.List;

public class Mundial {

    private String nombre;
    List<Equipo> listaEquipos;

    public Mundial(String nombre) {
        this.nombre = nombre;
        listaEquipos = new ArrayList<>();
    }
}
