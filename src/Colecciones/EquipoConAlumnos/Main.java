package Colecciones.EquipoConAlumnos;

import Objetos.GestionGranja.MiEntradaSalida;
import com.sun.source.tree.TryTree;

import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Alumno alumno = new Alumno("Sergio", "220A");
        Equipo equipo = new Equipo("Sevilla FC");


        try {
            equipo.addAlumno(alumno);
            System.out.println(alumno.getNombre() + " se ha añadido a la lista de alumnos");
            mostrarJugadores(equipo.getConjuntoAlumnos());
            System.out.println("----------------------------------------------------------");
        } catch (AlumnoException e) {
            System.out.println(e.getMessage());
        }

        Alumno alumno1 = new Alumno("Pedro","184E");
        try {
            equipo.addAlumno(alumno1);
            mostrarJugadores(equipo.getConjuntoAlumnos());
            equipo.removeAlumno(alumno1);
            System.out.println(alumno1.getNombre() + " se ha eliminado");
            mostrarJugadores(equipo.getConjuntoAlumnos());
            System.out.println("-----------------------------------------------------------");
        } catch (AlumnoException e) {
            System.out.println(e.getMessage());
        }

        Alumno alumno2 = new Alumno("Danie","450R");
        Alumno alumno3 = new Alumno("Fonseca","733P");
        try {
            equipo.addAlumno(alumno2);

            if (equipo.contieneAlumno(alumno3) == null){
                System.out.println("El alumno " + alumno3.getNombre() + " no esta en el equipo");
            }else {
                System.out.println("El alumno " + alumno3.getNombre() + " si esta en el equipo");
            }
            if (equipo.contieneAlumno(alumno2) == null){
                System.out.println("El alumno " + alumno2.getNombre() + " no esta en el equipo");
            }
            else {
                System.out.println("El alumno " + alumno2.getNombre() + " si esta en el equipo");
            }

            mostrarJugadores(equipo.getConjuntoAlumnos());
            System.out.println("-----------------------------------------------------------");
        } catch (AlumnoException e) {
            System.out.println(e.getMessage());
        }

        Equipo equipo2 = new Equipo("Betis FC");
        Equipo equipo3;

        try {
            equipo2.addAlumno(new Alumno("Roberto","674B"));
            equipo2.addAlumno(new Alumno("Marta","851N"));
            equipo3 = equipo2.unirEquipos(equipo);
            System.out.println(equipo3);
        } catch (AlumnoException e) {
            System.out.println(e.getMessage());
        }
        Equipo equipo4;
        try {
            equipo.addAlumno(new Alumno("Marta","851N"));
            equipo.addAlumno(new Alumno("Roberto","674B"));
            equipo4 = equipo2.interseccionEquipos(equipo);
            System.out.println(equipo4);
        } catch (AlumnoException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void mostrarJugadores (Set<Alumno> conjuntosAlumnos){
        for (Alumno conjuntosAlumno : conjuntosAlumnos) {
            System.out.println(conjuntosAlumno);
        }
    }
}
