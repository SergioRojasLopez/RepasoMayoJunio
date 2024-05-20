package Objetos.GestionMascotas;

public class Mascota {

    private String nombre;
    private Especie especie;
    private int edad;
    private double precio;
    private boolean disponible;

    public Mascota(String nombre, Especie especie, int edad, double precio,boolean disponible) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.precio = precio;
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public Especie getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", especie=" + especie +
                ", edad=" + edad +
                ", precio=" + precio +
                ", disponible=" + disponible +
                '}';
    }
}
