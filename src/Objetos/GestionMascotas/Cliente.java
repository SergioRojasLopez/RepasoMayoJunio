package Objetos.GestionMascotas;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
