package Herencia.DibujarAnimable;

public class Canvas {

    public void dibujarYAnimaFormas(Forma[] formas) {

        for (Forma forma : formas) {
            if (forma instanceof Dibujable) {
                ((Dibujable) forma).dibujar();
            }
            if (forma instanceof Animable) {
                ((Animable) forma).animar();
            }

        }
    }
}
