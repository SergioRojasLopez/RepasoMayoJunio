package Objetos.GestionGranja;

import Objetos.GestionMascotas.Tienda;

public class Main {



    public static void main(String[] args) {

        int opcion;
        opcion = MiEntradaSalida.leerEnteroPositivo("Elige una opcion");

        do {
            menu();

            switch (opcion){
                case 1:
                    break;
                case 2:
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
                    System.out.println("Gracias por usar el programa");
                    break;
            }

        }while (opcion != 4);



    }

    public static void annadirAnimal (){
       Especie especie = MiEntradaSalida.leerEnum("¿Que tipo de animal vas a añadir?",Especie.values());
       int edad = MiEntradaSalida.leerEnteroPositivo("¿Que edad tiene el animal?");
       granja.annadirAnimales(especie,edad);
    }

    public static void menu(){
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
