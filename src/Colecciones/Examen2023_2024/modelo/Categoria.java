package Colecciones.Examen2023_2024.modelo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Categoria {
    private String nombre;
    private Set<Producto> productos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productos = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

    public void addProducto (Producto p){
        productos.add(p);
    }
    public boolean borrarProducto (Producto p){
      return productos.remove(p);
    }
    public boolean tenerProductos(Producto p){
        for (Producto producto : productos){
            if (producto.equals(p)) return true;
        }
        return false;
    }
    public boolean tenerProductosSinStock (){
        for (Producto p : productos){
            if (p.getStock()==0) return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Categoria categoria = (Categoria) object;
        return Objects.equals(nombre, categoria.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, productos);
    }
}
