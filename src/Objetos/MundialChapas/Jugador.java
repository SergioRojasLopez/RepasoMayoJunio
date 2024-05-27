package Objetos.MundialChapas;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    private String nombre;
    private int edad;
    List<Jugador> golesMarcados;

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        golesMarcados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void annadirGol(Jugador jugador){
        golesMarcados.add(jugador);
    }
}
