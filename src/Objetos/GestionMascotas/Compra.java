package Objetos.GestionMascotas;

import java.time.LocalDateTime;

public class Compra {

    private int id;
    private Cliente cliente;
    private Mascota mascota;
    private LocalDateTime fechaHora;
    private LocalDateTime fechaDevolucion;

    private static int contCompras = 1;

    public Compra(Cliente cliente, Mascota mascota) {
        this.id = contCompras++;
        this.cliente = cliente;
        this.mascota = mascota;
        this.fechaHora = LocalDateTime.now();
    }

    public LocalDateTime getFechaDevolucion() {
        return fechaDevolucion;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}
