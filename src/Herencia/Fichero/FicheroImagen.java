package Herencia.Fichero;

import java.time.LocalDateTime;
/**
public class FicheroImagen extends Fichero implements Reproducible{

    private byte [] contenido;
    private TFormato tipoFormato;


    public FicheroImagen(String nombre, LocalDateTime fechaYHoraCreacion,byte[]contenido,TFormato tipoFormato) {
        super(nombre, fechaYHoraCreacion);
        this.contenido = contenido;
        this.tipoFormato = tipoFormato;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo");
    }
}
**/