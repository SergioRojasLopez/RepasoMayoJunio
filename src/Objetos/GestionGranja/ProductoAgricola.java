package Objetos.GestionGranja;

public class ProductoAgricola {
    private String nombre;
    private TProcuctoAgri tipoProducto;
    private double precio;


    public ProductoAgricola(String nombre, TProcuctoAgri tipoProducto,double precio) {
            this.nombre = nombre;
            this.tipoProducto = tipoProducto;
            this.precio = precio;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductoAgricola{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipoProducto=").append(tipoProducto);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
