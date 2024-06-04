package Herencia.ParqueAtracciones;

public class JuegoMecanico extends Atraccion{

    private TipoJuego tipoJuego;

    public JuegoMecanico(String nombreAtraccion, int precioEntrada, int capacidadMaxima, TipoJuego tipoJuego) {
        super(nombreAtraccion, precioEntrada, capacidadMaxima);
        this.tipoJuego = tipoJuego;
    }

    @Override
    public String calcularCosto() {
        return this.getNombreAtraccion() + " tiene un costo total de 5000€";
    }

    public TipoJuego getTipoJuego() {
        return tipoJuego;
    }

    @Override
    public String toString() {
        return this.getNombreAtraccion() + " es un juego mecanico estilo " + tipoJuego;
    }
}
