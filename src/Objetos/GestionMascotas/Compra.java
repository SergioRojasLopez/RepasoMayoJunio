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

    public Cliente getCliente() {
        return cliente;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void marcarDevuelta (){
        this.fechaDevolucion = LocalDateTime.now();

    }


    @Override
    public String toString() {
        return "Compra{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", mascota=" + mascota +
                ", fechaHora=" + fechaHora +
                ", fechaDevolucion=" + fechaDevolucion +
                '}';
    }
}
