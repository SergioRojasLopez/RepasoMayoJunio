package Objetos.GestionGranja;

import Objetos.GestionMascotas.Tienda;

public class Main {

    public static Granja granja = new Granja("Romero Pancho",500);

    public static void main(String[] args) {
        annadirAnimal();
        annadirAnimal();
        annadirProductoAgricola();


    }

    public static void annadirAnimal (){
       Especie especie = MiEntradaSalida.leerEnum("¿Que tipo de animal vas a añadir?",Especie.values());
       int edad = MiEntradaSalida.leerEnteroPositivo("¿Que edad tiene el animal?");
       EstadoSalud estadoSalud = MiEntradaSalida.leerEnum("¿Cuál es el estado de salud del animal?",EstadoSalud.values());
       String alimentacion = MiEntradaSalida.solicitarCadena("¿Que alimentación consume el animal?");
       granja.annadirAnimales(especie,edad,estadoSalud,alimentacion);
    }
    public static void annadirProductoAgricola (){
        if (granja.getCantidadProductos() > 0) {
            String nombre = MiEntradaSalida.solicitarCadena("¿Cual es el nombre del producto?");
            TProcuctoAgri tProcuctoAgri = MiEntradaSalida.leerEnum("¿Que tipo de producto agricola es?", TProcuctoAgri.values());
            double precio = MiEntradaSalida.leerDouble("¿Que precio tiene el producto?");
            granja.annadirProcuctosAgric(nombre, tProcuctoAgri, precio);
            granja.setCantidadProductos(granja.getCantidadProductos() - 1);
        }else {
            System.out.println("No hay mas productos disponibles");
        }
    }
}
