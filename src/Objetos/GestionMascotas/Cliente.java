package Objetos.GestionMascotas;

public class Cliente {

    private String nombre;
    private static int contCliente = 1;
    private int id;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.id = contCliente++;
    }

    public String getNombre() {
        return nombre;
    }
}
