package Herencia.DibujarAnimable;

public class Linea extends Forma{
    @Override
    public void calcualArea() throws FormaExcepcion {
        throw new FormaExcepcion("No puede representar su area");
    }
}
