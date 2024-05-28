package Objetos.Boletin4_2.Videojuego;

public class Ordenador {


    private int minNucleosProcesador;
    private int minVelocidadCPU;
    private int minEspacioDisco;
    private int minNucleosGPU;
    private int minMemoriaGPU;

    public Ordenador(int minNucleosProcesador, int minVelocidadCPU, int minEspacioDisco, int minNucleosGPU, int minMemoriaGPU) {
        this.minNucleosProcesador = minNucleosProcesador;
        this.minVelocidadCPU = minVelocidadCPU;
        this.minEspacioDisco = minEspacioDisco;
        this.minNucleosGPU = minNucleosGPU;
        this.minMemoriaGPU = minMemoriaGPU;
    }

    public int getMinNucleosProcesador() {
        return minNucleosProcesador;
    }

    public int getMinVelocidadCPU() {
        return minVelocidadCPU;
    }

    public int getMinEspacioDisco() {
        return minEspacioDisco;
    }

    public int getMinNucleosGPU() {
        return minNucleosGPU;
    }

    public int getMinMemoriaGPU() {
        return minMemoriaGPU;
    }
}
