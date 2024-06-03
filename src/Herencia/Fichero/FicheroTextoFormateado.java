package Herencia.Fichero;

import java.time.LocalDateTime;

public class FicheroTextoFormateado extends FicheroTexto implements Analizable {

    private String tipoFuente;
    private int tamFuente;
    private String colorFuente;

    public FicheroTextoFormateado(String nombre, LocalDateTime fechaYHoraCreacion, String[][] contenido, String tipoFuente, int tamFuente, String colorFuente) {
        super(nombre,fechaYHoraCreacion, contenido);
        this.tipoFuente = tipoFuente;
        this.tamFuente = tamFuente;
        this.colorFuente = colorFuente;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void analizar() {
        System.out.println("Analizando el fichero " );
    }
}



