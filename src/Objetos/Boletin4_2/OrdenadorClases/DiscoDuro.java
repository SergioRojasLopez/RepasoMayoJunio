package Objetos.Boletin4_2.OrdenadorClases;

public class DiscoDuro {
    private String marca;
    private String tipoDisco;
    private int capacidadGB;

    public DiscoDuro(String marca, String tipoDisco, int capacidadGB) {
        this.marca = marca;
        this.tipoDisco = tipoDisco;
        this.capacidadGB = capacidadGB;
    }

    public int getCapacidadGB() {
        return capacidadGB;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DiscoDuro{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", tipoDisco='").append(tipoDisco).append('\'');
        sb.append(", capacidadGB=").append(capacidadGB);
        sb.append('}');
        return sb.toString();
    }
}
