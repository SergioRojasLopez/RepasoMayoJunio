package Objetos.MundialChapas;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String pais;
    private String nombreEntrenador;
    List<Jugador> listaJugadores;

    public Equipo(String pais, String nombreEntrenador) {
        this.pais = pais;
        this.nombreEntrenador = nombreEntrenador;
        listaJugadores = new ArrayList<>();
    }

    public String getPais() {
        return pais;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void annadirJugador (Jugador jugador){
        listaJugadores.add(jugador);
    }
    public void eliminarJugador (Jugador jugador) throws MundialException {
        if (!listaJugadores.isEmpty()){
            listaJugadores.remove(jugador);
        }else {
            throw new MundialException("La lista de jugadores esta vacia");
        }

    }

}