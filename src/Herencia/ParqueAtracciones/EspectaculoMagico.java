package Herencia.ParqueAtracciones;

public class EspectaculoMagico extends Atraccion implements IEspectaculo{

    private int duracion;
    private String tipoMagia;

    public EspectaculoMagico(String nombreAtraccion, int precioEntrada, int capacidadMaxima, int duracion,String tipoMagia) {
        super(nombreAtraccion, precioEntrada, capacidadMaxima);
        this.duracion = duracion;
        this.tipoMagia = tipoMagia;
    }

    @Override
    public String calcularCosto() {
        return "El costo total del espectáculo de " + this.getNombreAtraccion() + " es de 10000€";
    }

    @Override
    public void iniciarShow() {
        System.out.println("El show ha empezado");
    }

    @Override
    public void finalizarShow() {
        System.out.println("El show ha terminado");
    }

    @Override
    public String toString() {
        return this.getNombreAtraccion() + " es un espectáculo de " + tipoMagia + ",con una duracion de " + duracion + " hora/s";
    }
}
