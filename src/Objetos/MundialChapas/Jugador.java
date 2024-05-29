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

    public void annadirGol(){
       golesMarcados += 1;
        System.out.println("El jugador " + nombre + " marca un gol");
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", edad=").append(edad);
        sb.append(", golesMarcados=").append(golesMarcados);
        sb.append('}');
        return sb.toString();
    }
}
