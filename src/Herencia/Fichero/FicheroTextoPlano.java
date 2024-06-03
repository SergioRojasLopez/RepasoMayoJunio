package Herencia.Fichero;

import java.time.LocalDateTime;

public class FicheroTextoPlano extends FicheroTexto implements Representable{


    public FicheroTextoPlano(String nombre, LocalDateTime fechaYHoraCreacion, String[][] contenido) {
        super(nombre, fechaYHoraCreacion, contenido);
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void representar() {

    }

    @Override
    public void convertirTextoAAudio() {

    }
}
