package Colecciones.EquipoConAlumnos;

import Colecciones.EquipoConAlumnos.Alumno;
import Colecciones.EquipoConAlumnos.AlumnoException;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Equipo {
    private String nombre;
    private Set<Alumno> conjuntoAlumnos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.conjuntoAlumnos = new HashSet<>();
    }

    public void addAlumno(Alumno alumno) throws AlumnoException {
        if (!conjuntoAlumnos.add(alumno)) throw new AlumnoException("El alumno ya esta");

    }

    public void removeAlumno(Alumno alumno) throws AlumnoException {

        if (!conjuntoAlumnos.remove(alumno)) throw new AlumnoException("El alumno no se encuentra en el equipo");

    }

    public Alumno contieneAlumno(Alumno alumno) {
        if (!conjuntoAlumnos.contains(alumno)) return null;

        return alumno;
    }

    public Equipo unirEquipos(Equipo equipo2) throws AlumnoException {
        Equipo unionEquipo = new Equipo(nombre + " + " + equipo2.nombre);
        unionEquipo.conjuntoAlumnos.addAll(conjuntoAlumnos);
        unionEquipo.conjuntoAlumnos.addAll(equipo2.conjuntoAlumnos);
        return unionEquipo;
    }

    public Equipo interseccionEquipos(Equipo equipo2) throws AlumnoException {
        Equipo interseccionEquipo = new Equipo("repetidos del " + nombre + " + repetidos del " + equipo2.nombre);
        /**
         interseccionEquipo.conjuntoAlumnos.addAll(conjuntoAlumnos);
         interseccionEquipo.conjuntoAlumnos.retainAll(equipo2.conjuntoAlumnos);
         return interseccionEquipo;
         **/
        for (Alumno alu : this.conjuntoAlumnos) {
            if (equipo2.conjuntoAlumnos.contains(alu)) {
                interseccionEquipo.conjuntoAlumnos.add(alu);
            }
        }
        return interseccionEquipo;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Equipo equipo = (Equipo) object;
        return Objects.equals(nombre, equipo.nombre) && Objects.equals(conjuntoAlumnos, equipo.conjuntoAlumnos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, conjuntoAlumnos);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Equipo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", conjuntoAlumnos=").append(conjuntoAlumnos);
        sb.append('}');
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Alumno> getConjuntoAlumnos() {
        return conjuntoAlumnos;
    }
}
