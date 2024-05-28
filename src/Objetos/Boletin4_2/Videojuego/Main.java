package Objetos.Boletin4_2.Videojuego;
import Objetos.Boletin4_2.OrdenadorClases.*;

public class Main {
    public static void main(String[] args) {

            Ordenador ordenador = new Ordenador(70,8000,1000,8,1000);
            Ordenador ordenador1 = new Ordenador(6,4,500,4,2);
            VideoJuego videoJuego = new VideoJuego("Pokemon 22","Nintendo",2025,50,5500,100,4,200);
            VideoJuego videoJuego1 = new VideoJuego("Kathivipi","Bugisoft",2020,4,2,50,1,1);

            try {
                System.out.println("¿El juego " + videoJuego.getNombre() + " se puede ejecutar? " + videoJuego.compatibilidadTotal(ordenador));
                System.out.println("¿El juego " + videoJuego1.getNombre() + " se puede ejecutar? " + videoJuego.compatibilidadTotal(ordenador1));
                System.out.println("¿El juego " + videoJuego.getNombre() + " se puede ejecutar? " + videoJuego.compatibilidadTotal(ordenador1));
                System.out.println("¿El juego " + videoJuego1.getNombre() + " se puede ejecutar? " + videoJuego.compatibilidadTotal(ordenador));
            } catch (CompatibilidadException e) {
                throw new RuntimeException(e);
            }
    }
}
