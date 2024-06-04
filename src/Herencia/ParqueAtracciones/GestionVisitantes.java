package Herencia.ParqueAtracciones;

import Objetos.GestionGranja.MiEntradaSalida;

import java.util.ArrayList;
import java.util.List;

public class GestionVisitantes {
    public static void main(String[] args) {

        List<Atraccion> atracciones = new ArrayList<>();

        try{
            int opcion;
            do {
                menu();
                opcion = MiEntradaSalida.leerEnteroDeRango("Elige una opcion",1,5);
                switch (opcion) {
                    case 1:
                        String nombre = MiEntradaSalida.solicitarCadena("¿Que nombre tiene la montaña rusa?");
                        int precio = MiEntradaSalida.leerEnteroPositivo("¿Que precio tiene la entrada?");
                        int capacidad = MiEntradaSalida.leerEnteroPositivo("¿Cual es la capacidad maxima?");
                        int altura = MiEntradaSalida.leerEnteroPositivo("Altura de la atracción");
                        int velocidad = MiEntradaSalida.leerEnteroPositivo("Velocidad de la atraccion");
                        int personalSeg = MiEntradaSalida.leerEnteroPositivo("¿Cuanto personal de seguridad hay en la atracción");

                        MontannaRusa montannaRusa = new MontannaRusa(nombre,precio,capacidad,altura,velocidad,personalSeg);
                        atracciones.add(montannaRusa);
                        System.out.println("Atraccion añadida con exito");
                        break;
                    case 2:

                        String nombre2 = MiEntradaSalida.solicitarCadena("¿Que nombre tiene el espectáculo de magia?");
                        int precio2 = MiEntradaSalida.leerEnteroPositivo("¿Que precio tiene la entrada?");
                        int capacidad2 = MiEntradaSalida.leerEnteroPositivo("¿Cual es la capacidad maxima?");
                        int duracion = MiEntradaSalida.leerEnteroPositivo("Duracion del espectáculo");
                        String tipoMagia = MiEntradaSalida.solicitarCadena("¿De que es el espectáculo de magia?");

                        EspectaculoMagico espectaculoMagico = new EspectaculoMagico(nombre2,precio2,capacidad2,duracion,tipoMagia);
                        atracciones.add(espectaculoMagico);

                        break;
                    case 3:

                        String nombre3 = MiEntradaSalida.solicitarCadena("¿Que nombre tiene juego mecánico?");
                        int precio3 = MiEntradaSalida.leerEnteroPositivo("¿Que precio tiene la entrada?");
                        int capacidad3 = MiEntradaSalida.leerEnteroPositivo("¿Cual es la capacidad maxima?");
                        TipoJuego tipoJuego = MiEntradaSalida.leerEnum("¿Que tipo de juego mecanico es?",TipoJuego.values());

                        JuegoMecanico juegoMecanico = new JuegoMecanico(nombre3,precio3,capacidad3,tipoJuego);
                        atracciones.add(juegoMecanico);

                        break;
                    case 4:
                        atracciones.forEach(System.out::println);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa, gracias");
                        break;
                }
            } while (opcion != 5);
        } catch (AtraccionException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void menu(){
        System.out.println("1. Crear una montaña rusa");
        System.out.println("2. Crar un espectaculo de magia");
        System.out.println("3. Crar un juego mecánico");
        System.out.println("4. Ver las atracciones que hay");
        System.out.println("5. Salir");
    }
}
