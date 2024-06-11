package Colecciones.InventarioTienda;

import java.util.HashMap;
import java.util.Map;

public class InventarioTienda {

    private Map<String, Producto> inventario;

    public InventarioTienda() {
        this.inventario = new HashMap<>();
    }

    public void addProducto(String nombre, double precio, int cantidad) throws InventarioException {
        if (inventario.containsKey(nombre))
            throw new InventarioException("El producto ya está en el inventario");


    }
}
