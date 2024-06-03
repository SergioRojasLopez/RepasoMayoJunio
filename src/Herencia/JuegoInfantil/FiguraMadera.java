package Herencia.JuegoInfantil;

public class FiguraMadera extends JugueteMadera implements Apilable{

    private String color;
    private int numLados;

    public FiguraMadera(String nombre, String marca, String origenMadera, int annoTala,String color,int numLados) throws JugueteException {
        super(nombre, marca, origenMadera, annoTala);
        this.color = color;
        setNumLados(numLados);

    }

    public void setNumLados(int numLados)throws JugueteException {
        if (numLados < 2){
            throw new JugueteException("El juguete tiene que tener mas de 1 lado");
        }
        this.numLados = numLados;
    }

    @Override
    public String toString() {
        return this.getNombre() + " color " + color + " con " + numLados + " lados";
    }
}
