package Objetos.GestionGranja;

import java.time.LocalDateTime;

public class Transaccion {
    private ProductoAgricola producto;
    private int numUnidades;
    private double precio;
    private LocalDateTime fechaTransaccion;

    public Transaccion(ProductoAgricola producto, int numUnidades) {
        this.producto = producto;
        this.numUnidades = numUnidades;
        this.fechaTransaccion = LocalDateTime.now();
        this.precio = producto.getPrecio();
    }

    public double getTotal (){
        return precio * numUnidades;
    }
}
