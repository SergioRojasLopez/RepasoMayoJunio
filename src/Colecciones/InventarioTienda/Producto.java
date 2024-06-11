package Colecciones.InventarioTienda;

public class Producto {

    private String nombre;
    private String categoria;
    private int precio;
    private int cantidadStock;

    public Producto(String nombre, String categoria, int precio, int cantidad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidadStock = cantidad;
    }

    public void setCantidadStock(int cantidadStock) {
        if (cantidadStock < 0){
            this.cantidadStock = 0;
        }else {
            this.cantidadStock = cantidadStock;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }
}
