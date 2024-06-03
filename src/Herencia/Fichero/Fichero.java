package Herencia.Fichero;

import java.time.LocalDateTime;


public abstract class Fichero {

    private String nombre;
    private LocalDateTime fechaYHoraCreacion;

    public Fichero(String nombre, LocalDateTime fechaYHoraCreacion) {
        this.nombre = nombre;
        this.fechaYHoraCreacion = fechaYHoraCreacion;
    }

    abstract int getTamano ();

    public String getNombre() {
        return nombre;
    }
}
