package Objetos.GestionGranja;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private int id;
    private Especie especie;
    private int edad;
    private List<Alimentacion> alimentacionAnimal;
    private List<ChequeoSalud> chequeoSalud;

    private static int contAnimal = 1;

    public Animal(Especie especie, int edad) {
        this.id = contAnimal++;
        this.especie = especie;
        this.edad = edad;
        this.alimentacionAnimal = new ArrayList<>();
        this.chequeoSalud = new ArrayList<>();
    }

    public Especie getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public void registroAlimentacion (TipoAlimentacion tipoAlimentacion){
        alimentacionAnimal.add(new Alimentacion(tipoAlimentacion));

    }

    public void registroChequeoSalud (EstadoSalud estadoSalud){
        chequeoSalud.add(new ChequeoSalud(estadoSalud));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("id=").append(id);
        sb.append(", especie=").append(especie);
        sb.append(", edad=").append(edad);
        sb.append(", contAnimal=").append(contAnimal);
        sb.append('}');
        return sb.toString();
    }
}
