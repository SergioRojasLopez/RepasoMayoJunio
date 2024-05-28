package Objetos.MundialChapas;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    private String nombre;
    private int edad;
    private int golesMarcados = 0;

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public int annadirGol(){
       return this.golesMarcados ++;
    }
    public int getGolesMarcados() {
        return golesMarcados;
    }
}
