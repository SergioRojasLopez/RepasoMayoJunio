package Herencia.DibujarAnimable;

public class CirculoMovible extends Forma implements Dibujable,Animable {
    @Override
    public void animar() {
        System.out.println("Animando circulo movible");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo movible");
    }

    @Override
    public void calcualArea() throws FormaExcepcion {

    }
}
