package Herencia.Fichero;

import java.time.LocalDateTime;

public class FicheroTexto extends Fichero implements Convertible {

    private String[][] contenido;

    public FicheroTexto(String nombre, LocalDateTime fechaYHoraCreacion, String[][] contenido) {
        super(nombre, fechaYHoraCreacion);
        setContenido(contenido);
    }

    public void setContenido(String[][] contenido) {
        this.contenido = new String[contenido.length][0];
    }

    @Override
    public int getTamano() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void convertirTextoAAudio() {

    }


}