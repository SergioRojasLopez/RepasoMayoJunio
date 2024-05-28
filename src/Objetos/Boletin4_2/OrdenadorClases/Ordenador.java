package Objetos.Boletin4_2.OrdenadorClases;

public class Ordenador {

    private PlacaBase placaBase;
    private MicroProcesador microProcesador;
    private DiscoDuro discoDuro;
    private TarjetaGrafica tarjetaGrafica;

    public Ordenador(PlacaBase placaBase, MicroProcesador microProcesador, DiscoDuro discoDuro, TarjetaGrafica tarjetaGrafica) throws CompatibilidadException {
        if (placaBase.esCompatible(microProcesador)){
            this.placaBase = placaBase;
            this.microProcesador = microProcesador;
            this.discoDuro = discoDuro;
            this.tarjetaGrafica = tarjetaGrafica;
        }
        else {
            throw new CompatibilidadException("Los sockets no son compatibles");
        }
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ordenador{");
        sb.append("placaBase=").append(placaBase);
        sb.append(", microProcesador=").append(microProcesador);
        sb.append(", discoDuro=").append(discoDuro);
        sb.append(", tarjetaGrafica=").append(tarjetaGrafica);
        sb.append('}');
        return sb.toString();
    }
}
