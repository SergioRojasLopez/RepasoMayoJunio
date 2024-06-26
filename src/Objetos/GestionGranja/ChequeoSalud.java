package Objetos.GestionGranja;

import java.time.LocalDateTime;

public class ChequeoSalud {
    private LocalDateTime fechaYHora;
    private EstadoSalud estadoSalud;

    public ChequeoSalud(EstadoSalud estadoSalud) {
        this.fechaYHora =  LocalDateTime.now();
        this.estadoSalud = estadoSalud;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public EstadoSalud getEstadoSalud() {
        return estadoSalud;
    }
}
