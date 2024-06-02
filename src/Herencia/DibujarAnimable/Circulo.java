package Herencia.DibujarAnimable;

public class Circulo extends Forma implements Dibujable{
    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo");
    }

    @Override
    public void calcualArea() {

    }
}
