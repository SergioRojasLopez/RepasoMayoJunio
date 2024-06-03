package Herencia.Fichero;

import java.time.LocalDateTime;
/**
public class FicheroVideo extends Fichero implements Reproducible{
    private byte [] contenido;
    private int duracion;

    public FicheroVideo(String nombre, LocalDateTime fechaYHoraCreacion,byte [] contenido,int duracion) {
        super(nombre,  fechaYHoraCreacion);
        this.contenido = contenido;
        this.duracion = duracion;

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo " );
    }
}
**/