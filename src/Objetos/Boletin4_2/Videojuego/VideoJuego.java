package Objetos.Boletin4_2.Videojuego;

import Objetos.Boletin4_2.OrdenadorClases.CompatibilidadException;


public class VideoJuego {

    private String nombre;
    private String companiaCreadora;
    private int annoCreacion;
    private int minNucleosProcesador;
    private int minVelocidadCPU;
    private int minEspacioDisco;
    private int minNucleosGPU;
    private int minMemoriaGPU;


    public VideoJuego(String nombre, String companiaCreadora, int annoCreacion, int minNucleosProcesador, int minVelocidadCPU, int minEspacioDisco, int minNucleosGPU, int minMemoriaGPU) {
        this.nombre = nombre;
        this.companiaCreadora = companiaCreadora;
        this.annoCreacion = annoCreacion;
        this.minNucleosProcesador = minNucleosProcesador;
        this.minVelocidadCPU = minVelocidadCPU;
        this.minEspacioDisco = minEspacioDisco;
        this.minNucleosGPU = minNucleosGPU;
        this.minMemoriaGPU = minMemoriaGPU;
    }

    public String getNombre() {
        return nombre;
    }

    public String compatibilidadTotal(Ordenador ordenador) throws CompatibilidadException {
        if (this.minNucleosProcesador <= ordenador.getMinNucleosProcesador() &&
                this.minVelocidadCPU <= ordenador.getMinVelocidadCPU() &&
                this.minEspacioDisco <= ordenador.getMinEspacioDisco()&&
                this.minNucleosGPU <= ordenador.getMinNucleosGPU() &&
                this.minMemoriaGPU <= ordenador.getMinMemoriaGPU()){
            return "Se puede ejecutar";
        }else {
            return "No se puede ejecutar";
        }

    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VideoJuego{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", companiaCreadora='").append(companiaCreadora).append('\'');
        sb.append(", annoCreacion=").append(annoCreacion);
        sb.append(", minNucleosProcesador=").append(minNucleosProcesador);
        sb.append(", minVelocidadCPU=").append(minVelocidadCPU);
        sb.append(", minEspacioDisco=").append(minEspacioDisco);
        sb.append(", minNucleosGPU=").append(minNucleosGPU);
        sb.append(", minMemoriaGPU=").append(minMemoriaGPU);
        sb.append('}');
        return sb.toString();
    }
}
