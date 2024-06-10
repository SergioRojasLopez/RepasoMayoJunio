package Colecciones.Examen2023_2024.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Producto {
    private String marca;
    private String modelo;
    private String descripcion;
    private double precio;
    private LocalDate fechaIncorporacion;
    private int stock;

    public Producto(String marca, String modelo, String descripcion, double precio, int stock) {
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaIncorporacion = LocalDate.now();
        setStock(stock);
    }

    public void setStock(int stock) {
        if (stock < 0){
            this.stock = 0;
        }else {
            this.stock = stock;
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Producto producto = (Producto) object;
        return Objects.equals(marca, producto.marca) && Objects.equals(modelo, producto.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, descripcion, precio, fechaIncorporacion, stock);
    }
}
