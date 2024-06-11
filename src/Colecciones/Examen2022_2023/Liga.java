package Colecciones.Examen2022_2023;

import java.util.*;

public class Liga {
    private List<Equipo> listaEquipo;
    private String nombre;

    public Liga(String nombre) {
        super();
        this.listaEquipo = new ArrayList<>();
        this.nombre = nombre;
    }

    public void addEquipo(Equipo e) throws LigaException {
        if (listaEquipo.isEmpty() || listaEquipo.contains(e)) {
            throw new LigaException("El equipo esta vacio o ya contiene el jugador");
        }
        listaEquipo.add(e);
    }

    public void eliminaEquipo(Equipo e) throws LigaException {
        if (listaEquipo.isEmpty()){
            throw new LigaException("La lista esta vacia");
        }
        listaEquipo.removeIf(equipo -> equipo.equals(e));
    }


    public void unirEquipos(Equipo e1, Equipo e2) throws LigaException {

        if (!listaEquipo.contains(e1)|| !listaEquipo.contains(e2)){
            throw new LigaException("Los equipos no estan en la liga");

        }else {
            for (Jugador jugador : e2.getJugadores()) {
                e1.addJugador(jugador);
            }
        }
    }

    public List<Jugador> jugadoresEnComun(Equipo e1, Equipo e2) throws LigaException {
        if (!listaEquipo.contains(e1)|| !listaEquipo.contains(e2)) {
            throw new LigaException("Los equipos no estan en la liga");
        }
       /* List<Jugador> jugadoresComunes = new LinkedList<Jugador>(e2.getJugadores());
        jugadoresComunes.retainAll(e1.getJugadores());
        return jugadoresComunes;
        */

        Set<Jugador> jugadorsComunes = new HashSet<>(e2.getJugadores());
        jugadorsComunes.retainAll(e1.getJugadores());
        return jugadorsComunes.stream().toList();
    }

    public double mediaEdad() throws LigaException {

    return todosLosJugadores().stream().mapToDouble(Jugador::getEdad).average()
            .orElseThrow(LigaException::new);

    }

    public List<Jugador> jugadoresOrdenadosEdad() {
        return todosLosJugadores().stream().sorted((j1,j2)-> j2.getFechaNacimiento().compareTo(j1.getFechaNacimiento()))
                .toList();
    }

    public List<Jugador> jugadoresOrdenadosNombre() {
        return todosLosJugadores().stream().sorted().toList();

    }

    private Set<Jugador> todosLosJugadores() {

        HashSet<Jugador> jugadoresAll = new HashSet<>();
        Iterator<Equipo> it = listaEquipo.iterator();

        while (it.hasNext()){
            jugadoresAll.addAll(it.next().getJugadores());
        }
        return jugadoresAll;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bienvenidos a " + nombre).append(System.lineSeparator());
        sb.append("Equipos: ").append(System.lineSeparator());
        for (Equipo e : listaEquipo) {
            sb.append(e).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
