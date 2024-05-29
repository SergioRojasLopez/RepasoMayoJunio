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

    public void annadirEquipo(String pais, String nombreEntrenador) {
        Equipo equipo = new Equipo(pais, nombreEntrenador);
        listaEquipos.add(equipo);
    }

    public Equipo buscarEquipoPorPais(String pais) {
        return listaEquipos.stream().
                filter(equipo -> equipo.getPais().equalsIgnoreCase(pais))
                .findFirst()
                .orElse(null);
    }
    public void eliminarEquipo(Equipo equipo) {
        if (!listaEquipos.isEmpty()){
            listaEquipos.remove(equipo);
        }
    }

    public void mostrarGolesEquipo (){
        listaEquipos.forEach(equipo -> {
            int golesTotales = equipo.golesTotales();
            System.out.println("Equipo: " + equipo.getPais() + " tienes un total de " + golesTotales + " goles");
        });
    }

    public String getNombre() {
        return nombre;
    }

    public List<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mundial{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", listaEquipos=").append(listaEquipos);
        sb.append('}');
        return sb.toString();
    }
}
