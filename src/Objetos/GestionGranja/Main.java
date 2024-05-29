package Objetos.GestionGranja;

import Objetos.GestionMascotas.Especie;
import Objetos.GestionMascotas.Tienda;

import java.util.List;

public class Main {

    private static Granja granja = new Granja("Farming Crossing");

    public static void main(String[] args) {


        int opcion;
        do {
            menu();
            opcion = MiEntradaSalida.leerEnteroDeRango("Elige una opcion",1,9);
            switch (opcion) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    realizarChequeo();
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
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias");
                    break;
            }

        } while (opcion != 9);


    }

    private static void realizarChequeo() {
        Animal animal = MiEntradaSalida.leerEnum("¿Que animal quieres seleccionar?",granja.getListaAnimales().toArray(new Animal[0]));

    }

    public static void addAnimal() {
        EspecieAnimal especie = MiEntradaSalida.leerEnum("¿Que animal es?", EspecieAnimal.values());
        int edad = MiEntradaSalida.leerEnteroPositivo("¿Que edad tiene el animal?");
        try {
            granja.annadirAnimales(especie, edad);
        } catch (ValorNoValidoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void menu() {
        System.out.println("---------MENU---------");
        System.out.println("1. Añadir animal");
        System.out.println("2. Realizar chequeo");
        System.out.println("3. Alimentar animal");
        System.out.println("4. Comprobar estado salud");
        System.out.println("5. Añadir producto");
        System.out.println("6. Reponer producto");
        System.out.println("7. Comprar producto");
        System.out.println("8. Listar productos");
        System.out.println("9. Salir");
    }
}
