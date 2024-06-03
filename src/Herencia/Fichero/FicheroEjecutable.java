package Herencia.Fichero;

import java.time.LocalDateTime;
/**
public class FicheroEjecutable extends Fichero implements Analizable{
    private byte [] contenido;
    private int permisos;
    public FicheroEjecutable(String nombre, LocalDateTime fechaYHoraCreacion,byte[] contenido,int permisos) {
        super(nombre, fechaYHoraCreacion);
        this.contenido = contenido;
        this.permisos = permisos;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void analizar() {
        System.out.println("Analizando el fichero");
    }
}
**/