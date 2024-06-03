package Herencia.JuegoInfantil;

public class JugueteMadera extends Juguete{

    private String origenMadera;
    private int annoTala;

    public JugueteMadera(String nombre, String marca, String origenMadera, int annoTala) {
        super(nombre, marca);
        this.origenMadera = origenMadera;
        this.annoTala = annoTala;
    }

    public int getAnnoTala() {
        return annoTala;
    }

    public String getOrigenMadera() {
        return origenMadera;
    }
}
