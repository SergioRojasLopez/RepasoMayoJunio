package Herencia.JuegoInfantil;

public abstract class JuguetePlastico extends Juguete{

    private TPlastico tPlastico;

    public JuguetePlastico(String nombre, String marca,TPlastico tPlastico) {
        super(nombre, marca);
        this.tPlastico = tPlastico;
    }

    public TPlastico gettPlastico() {
        return tPlastico;
    }
}
