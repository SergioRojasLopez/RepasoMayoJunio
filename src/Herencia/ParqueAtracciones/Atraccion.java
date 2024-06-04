package Herencia.ParqueAtracciones;

public abstract class Atraccion {
    private String nombreAtraccion;
    private int precioEntrada;
    private int capacidadMaxima;

    public Atraccion(String nombreAtraccion, int precioEntrada, int capacidadMaxima) {
        this.nombreAtraccion = nombreAtraccion;
        this.precioEntrada = precioEntrada;
        this.capacidadMaxima = capacidadMaxima;
    }

    public abstract String calcularCosto();

    public String getNombreAtraccion() {
        return nombreAtraccion;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
}





