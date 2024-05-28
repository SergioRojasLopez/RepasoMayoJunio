package Objetos.MundialChapas;

import Herencia.MiEntradaSalida;

import java.util.List;

public class Main {

    private static Mundial mundial = new Mundial("Isla Cristina Chapas World");


    public static void main(String[] args) {


        int opcion;
        do {
            menu();
            opcion = MiEntradaSalida.leerEnteroDeRango("Elije una opcion", 1, 7);
            switch (opcion) {
                case 1:
                    annadirEquipo();
                    break;
                case 2:
                    annadirJugador();

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    System.out.println("Saliendo del programa, gracias");
                    break;
            }
        } while (opcion != 6);

    }

    public static void menu() {

        System.out.println("1. Crear nuevo equipo");
        System.out.println("2. Añadir un nuevo jugador a un equipo existente");
        System.out.println("3. Ver el número total de goles marcados por un equipo existente");
        System.out.println("4. Ver el número total de goles marcados por un jugador existente");
        System.out.println("5. Ver el equipo con más goles marcados en el mundial");
        System.out.println("6. Ver el jugador con más goles marcados en el mundial");
        System.out.println("7. Salir");

    }


    public static void annadirEquipo() {
        String pais = MiEntradaSalida.solicitarCadena("De que pais es el equipo");
        String nombreEntrenador = MiEntradaSalida.solicitarCadena("Cual es el nombre del entrenador");
        mundial.annadirEquipo(pais,nombreEntrenador);
        System.out.println("Equipo añadido con exito");
    }

    public static void annadirJugador (){
        mundial.getListaEquipos().forEach(System.out::println);
        String equipoBuscar = MiEntradaSalida.solicitarCadena("Elige el pais que quieres añadir el jugador");
        System.out.println(equipoBuscar);
        Equipo equipo = mundial.buscarEquipoPorPais(equipoBuscar);

        if (equipo != null){
            String nombre = MiEntradaSalida.solicitarCadena("¿Cual es el nombre del jugador?");
            int edad = MiEntradaSalida.leerEnteroPositivo("¿Cual es la edad del jugador?");
            Jugador jugador = new Jugador(nombre,edad);
            equipo.annadirJugador(jugador);
            System.out.println("El jugador " + jugador.getNombre() + " se ha añadido con exito");
        }else {
            System.out.println("El pais introducido no se ha encontrado");
        }

    }
}
