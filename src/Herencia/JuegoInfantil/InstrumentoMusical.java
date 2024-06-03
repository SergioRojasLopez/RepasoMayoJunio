package Herencia.JuegoInfantil;

public class InstrumentoMusical extends JugueteMadera{

    private int edadMin;

    public InstrumentoMusical(String nombre, String marca, String origenMadera, int annoTala,int edadMin) throws JugueteException {
        super(nombre, marca, origenMadera, annoTala);
        setEdadMin(edadMin);
    }

    public void setEdadMin(int edadMin)throws JugueteException {
        if (edadMin < 0){
            throw new JugueteException("La edad minima debe ser mayor que 0");
        }
        this.edadMin = edadMin;
    }

    public int getEdadMin() {
        return edadMin;
    }

    @Override
    public String toString() {
        return this.getNombre() + " con una antiguedad de " + edadMin + " años";
    }
}
