package Objetos.Boletin4_2.OrdenadorClases;

public class TarjetaGrafica {

    private String marca;
    private String modelo;
    private int numNucleos;
    private float velocidadGHz;
    private int cantidadMemoriaGB;

    public TarjetaGrafica(String marca, String modelo, int numNucleos, float velocidadGHz, int cantidadMemoriaGB) {
        this.marca = marca;
        this.modelo = modelo;
        this.numNucleos = numNucleos;
        this.velocidadGHz = velocidadGHz;
        this.cantidadMemoriaGB = cantidadMemoriaGB;
    }

    public int getNumNucleos() {
        return numNucleos;
    }

    public int getCantidadMemoriaGB() {
        return cantidadMemoriaGB;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TarjetaGrafica{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", numNucleos=").append(numNucleos);
        sb.append(", velocidadGHz=").append(velocidadGHz);
        sb.append(", cantidadMemoriaGB=").append(cantidadMemoriaGB);
        sb.append('}');
        return sb.toString();
    }
}
