package Herencia.DibujarAnimable;

public class Main {
    public static void main(String[] args) {

       Forma circulo = new Circulo();
       Forma rectangulo = new Rectangulo();
       Forma circuloMovible = new CirculoMovible();
       Forma linea = new Linea();

       Forma [] formas = {circulo,rectangulo,circuloMovible,linea};

       Canvas canvas = new Canvas();
       canvas.dibujarYAnimaFormas(formas);


    }
}
