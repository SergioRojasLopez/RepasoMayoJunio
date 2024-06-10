package Colecciones.Examen2022_2023;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Jugador {
    private String nombre;
    private TDemarcacion demarcacion;
    private LocalDate fechaNacimiento;
    private String paisNacimiento;


    public Jugador(String nombre, TDemarcacion demarcacion, LocalDate fechaNacimiento, String paisNacimiento) {
        super();
        this.nombre = nombre;
        this.demarcacion = demarcacion;
        this.fechaNacimiento = fechaNacimiento;
        this.paisNacimiento = paisNacimiento;
    }

    public String getNombre() {
        return nombre;
    }


    public TDemarcacion getDemarcacion() {
        return demarcacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public double getEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento,
                fechaActual);
        int edad = periodo.getYears();
        return edad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(nombre).append(": ");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        sb.append(fechaNacimiento.format(formatter)).append(". ")
                .append(demarcacion).append(" (").append(paisNacimiento).append(")");

        return sb.toString();

    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Jugador jugador = (Jugador) object;
        return Objects.equals(nombre, jugador.nombre) && Objects.equals(fechaNacimiento, jugador.fechaNacimiento);
    }
}
