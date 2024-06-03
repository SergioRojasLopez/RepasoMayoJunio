package Herencia.JuegoInfantil;

public class PiezaLego extends JuguetePlastico implements Apilable{
    private int longitud;
    private String color;

    public PiezaLego(String nombre, String marca, int longitud,String color) throws JugueteException {
        super(nombre, marca, TPlastico.ABS);
        setLongitud(longitud);
        this.color = color;
    }

    public void setLongitud(int longitud) throws JugueteException {
        if (longitud < 1){
            throw new JugueteException("La longitud tiene que ser mayor a 0");
        }
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.getNombre() + " de " + longitud + " cm de longitud, color " + color;
    }
}
