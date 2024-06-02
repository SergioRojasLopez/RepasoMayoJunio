package Herencia.DibujarAnimable;

public class Rectangulo extends Forma implements Dibujable{
    @Override
    public void dibujar() {
        System.out.println("Dibujando rectangulo");
    }

    @Override
    public void calcualArea() {

    }
}
