package Objetos.MundialChapas;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String pais;
    private String nombreEntrenador;
    List<Jugador> listaJugadores;
    /*Jugador jugador;
    Jugador jugador1;*/

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Equipo{");
        sb.append("pais='").append(pais).append('\'');
        sb.append(", nombreEntrenador='").append(nombreEntrenador).append('\'');
        sb.append(", listaJugadores=").append(listaJugadores);
        sb.append('}');
        return sb.toString();
    }
}
