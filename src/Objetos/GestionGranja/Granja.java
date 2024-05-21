package Objetos.GestionGranja;

import Objetos.GestionMascotas.Mascota;

import java.util.ArrayList;
import java.util.List;

public class Granja {

    private String nombre;
    private List<Animal> listaAnimales;
    private List<ProductoAgricola> inventarioProductos;
    private List<Transaccion> listaTransacciones;

    private int cantidadProductos;

    public Granja(String nombre, int cantidadProductos) {
        this.nombre = nombre;
        this.cantidadProductos = cantidadProductos;
        this.listaAnimales = new ArrayList<>();
        this.inventarioProductos = new ArrayList<>();
        this.listaTransacciones = new ArrayList<>();
    }

    public void annadirAnimales (Especie especie,int edad,EstadoSalud estadoSalud,String alimentacion){
        Animal animal = new Animal(especie,edad,estadoSalud,alimentacion);
        listaAnimales.add(animal);
    }
    public void annadirProcuctosAgric (String nombre,TProcuctoAgri tipoProcuctoAgri,double precio){
        if (cantidadProductos > 0) {
            ProductoAgricola productoAgricola = new ProductoAgricola(nombre, tipoProcuctoAgri, precio);
            inventarioProductos.add(productoAgricola);
        }else {
            System.out.println("No se pueden annadir prodcutos al inventario, cantidad insuficiente");
        }
    }
    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
}
