package Colecciones.EquipoConAlumnos;

import java.util.Objects;

public class Alumno {

    private String nombre;
    private String Dni;

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        Dni = dni;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Alumno alumno = (Alumno) object;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(Dni, alumno.Dni);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alumno{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", Dni='").append(Dni).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return Dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, Dni);
    }
}
