package Objetos.Boletin4_2.OrdenadorClases;

public class MicroProcesador {
    private String marca;
    private String modelo;
    private int numNucleos;
    private float velocidadGHz;
    private String socket;

    public MicroProcesador(String marca, String modelo, int numNucleos, float velocidadGHz, String socket) {
        this.marca = marca;
        this.modelo = modelo;
        this.numNucleos = numNucleos;
        this.velocidadGHz = velocidadGHz;
        this.socket = socket;
    }

    public int getNumNucleos() {
        return numNucleos;
    }

    public float getVelocidadGHz() {
        return velocidadGHz;
    }

    public String getSocket() {
        return socket;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MicroProcesador{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", numNucleos=").append(numNucleos);
        sb.append(", velocidadGHz=").append(velocidadGHz);
        sb.append(", socket='").append(socket).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
