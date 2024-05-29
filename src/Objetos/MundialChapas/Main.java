package Objetos.MundialChapas;

import Herencia.MiEntradaSalida;

import java.util.List;

public class Main {

    private static Mundial mundial = new Mundial("Isla Cristina Chapas World");


    public static void main(String[] args) {


        int opcion;
        do {
            menu();
            opcion = MiEntradaSalida.leerEnteroDeRango("Elije una opcion", 1, 9);
            switch (opcion) {
                case 1:
                    annadirEquipo();
                    break;
                case 2:
                    annadirJugador();

                    break;
                case 3:
                    verGolesTotalesEquipoExistente();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    eliminarEquipo();

                    break;
                case 8:
                    eliminarJugador();
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias");
                    break;

            }
        } while (opcion != 9);

    }

    public static void menu() {

        System.out.println("1. Crear nuevo equipo");
        System.out.println("2. Añadir un nuevo jugador a un equipo existente");
        System.out.println("3. Ver el número total de goles marcados por un equipo existente");
        System.out.println("4. Ver el número total de goles marcados por un jugador existente");
        System.out.println("5. Ver el equipo con más goles marcados en el mundial");
        System.out.println("6. Ver el jugador con más goles marcados en el mundial");
        System.out.println("7. Eliminar equipo");
        System.out.println("8. Eliminar jugador");
        System.out.println("9. Salir");

    }


    public static void annadirEquipo() {
        String pais = MiEntradaSalida.solicitarCadena("De que pais es el equipo");
        String nombreEntrenador = MiEntradaSalida.solicitarCadena("Cual es el nombre del entrenador");
        mundial.annadirEquipo(pais, nombreEntrenador);
        System.out.println("Equipo añadido con exito");
    }

    public static void annadirJugador() {
        mundial.getListaEquipos().forEach(System.out::println);
        String equipoBuscar = MiEntradaSalida.solicitarCadena("Elige el pais que quieres añadir el jugador");
        System.out.println(equipoBuscar);
        Equipo equipo = mundial.buscarEquipoPorPais(equipoBuscar);
        if (equipo != null) {
            String nombre = MiEntradaSalida.solicitarCadena("¿Cual es el nombre del jugador?");
            int edad = MiEntradaSalida.leerEnteroPositivo("¿Cual es la edad del jugador?");
            Jugador jugador = new Jugador(nombre, edad);
            equipo.annadirJugador(jugador);
            System.out.println("El jugador " + jugador.getNombre() + " se ha añadido con exito");
        } else {
            System.out.println("El pais introducido no se ha encontrado");
        }

    }

    public static void verGolesTotalesEquipoExistente() {
        if (mundial.getListaEquipos().isEmpty()) {
            System.out.println("No hay equipos disponibles");
            return;
        }
        mundial.getListaEquipos().forEach(System.out::println);
        String equipoGol = MiEntradaSalida.solicitarCadena("De que selección quieres saber los goles?");
        Equipo equipo = mundial.buscarEquipoPorPais(equipoGol);
        if (equipo != null){
            mundial.mostrarGolesEquipo();
        }
        equipo.golesTotales();
    }

    public static void verGolesTotalesJugador (){

        if (mundial.getListaEquipos().isEmpty()) {
            System.out.println("No hay equipos disponibles");
            return;
        }

        mundial.getListaEquipos().forEach(System.out::println);
        String equipoGol = MiEntradaSalida.solicitarCadena("De que selección quieres saber los goles?");
        Equipo equipo = mundial.buscarEquipoPorPais(equipoGol);

        if (equipo != null){
            equipo.listaJugadores.forEach(System.out::println);
            String nombreJugador = MiEntradaSalida.solicitarCadena("De que jugador quieres saber los goles?");
            Jugador jugadorGol = equipo.listaJugadores.stream()
                    .filter(jugador -> jugador.getNombre().equalsIgnoreCase(nombreJugador))
                    .findFirst()
                    .orElse(null);
            if (jugadorGol != null){
                jugadorGol.getGolesMarcados();
            }else {
                System.out.println("No existe este jugador");
            }
        }
    }

    public static void eliminarJugador() {

        if (mundial.getListaEquipos().isEmpty()) {
            System.out.println("No hay jugadores en los equipo para eliminar");
            return;
        }
        mundial.getListaEquipos().forEach(System.out::println);
        String equipoBuscar = MiEntradaSalida.solicitarCadena("De que selección quieres borrar al jugador?");
        Equipo equipo = mundial.buscarEquipoPorPais(equipoBuscar);
        if (equipo != null) {
            equipo.listaJugadores.forEach(System.out::println);
            String nombreJugador = MiEntradaSalida.solicitarCadena("Que jugador quieres eliminar?");
            Jugador jugadorAElimina = equipo.listaJugadores.stream()
                    .filter(jugador -> jugador.getNombre().equalsIgnoreCase(nombreJugador))
                    .findFirst()
                    .orElse(null);
            if (jugadorAElimina != null) {
                try {
                    equipo.eliminarJugador(jugadorAElimina);
                    System.out.println("El jugador " + jugadorAElimina + " se ha eliminado con exito");
                } catch (MundialException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("El jugador no se ha encontrado");
            }
        } else {
            System.out.println("El pais introducido no se ha encontrado");
        }
    }

    public static void eliminarEquipo() {
        if (mundial.getListaEquipos().isEmpty()) {
            System.out.println("No hay equipos disponibles");
            return;
        }
        mundial.getListaEquipos().forEach(System.out::println);
        String equipoEliminar = MiEntradaSalida.solicitarCadena("Que selección quieres eliminar?");
        Equipo equipo = mundial.buscarEquipoPorPais(equipoEliminar);
        if (equipo != null) {
            mundial.eliminarEquipo(equipo);
            System.out.println("La selección " + equipoEliminar + " se ha eliminado con exito");
        } else {
            System.out.println("El pais no existe");
        }
    }
}
