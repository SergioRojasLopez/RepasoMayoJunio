package Objetos.GestionGranja;

public class ProductoAgricola {
    private String nombre;
    private TProcuctoAgri tipoProducto;
    private double precio;
    private int numUnidades;

    public ProductoAgricola(String nombre, TProcuctoAgri tipoProducto,double precio,int numUnidades) {
            this.nombre = nombre;
            this.tipoProducto = tipoProducto;
            this.precio = precio;
            this.numUnidades = numUnidades;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public String getNombre() {
        return nombre;
    }

    public TProcuctoAgri getTipoProducto() {
        return tipoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible (){
        return numUnidades > 0;
    }

    public void reponerUnidades (int cantidadAReponer)throws ValorNoValidoException {
        if (cantidadAReponer < 0){
            throw new ValorNoValidoException("No se pueden añadir valores negativos");
        }
        this.numUnidades += cantidadAReponer;
    }

    public void compraUnidades (int cantidadAComprar) throws ValorNoValidoException {
        if (cantidadAComprar < 0){
            throw new ValorNoValidoException("No puedes comprar unidades negativas");
        }if (cantidadAComprar > numUnidades){
            throw new ValorNoValidoException("No hay suficiente stock");
        }
        this.numUnidades -= cantidadAComprar;

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
