package Objetos.GestionGranja;

import java.time.LocalDateTime;

public class Alimentacion {
    private LocalDateTime fechaYHora;
    private TipoAlimentacion tipoAlimentacion;

    public Alimentacion(TipoAlimentacion tipoAlimentacion) {
        this.fechaYHora = LocalDateTime.now();
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public TipoAlimentacion getTipoAlimentacion() {
        return tipoAlimentacion;
    }
}
