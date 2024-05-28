package Objetos.Boletin4_2.OrdenadorClases;

public class PlacaBase {
    private String marca;
    private String chipset;
    private String socket;

    public PlacaBase(String marca, String chipset, String socket) {
        this.marca = marca;
        this.chipset = chipset;
        this.socket = socket;
    }

    public String getMarca() {
        return marca;
    }

    public String getChipset() {
        return chipset;
    }

    public String getSocket() {
        return socket;
    }

    public boolean esCompatible (MicroProcesador microProcesador) throws CompatibilidadException {
        return this.socket.equals(microProcesador.getSocket());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlacaBase{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", chipset='").append(chipset).append('\'');
        sb.append(", socket='").append(socket).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
