package Objetos.GestionGranja;

public class Animal {
    private int id;
    private Especie especie;
    private int edad;
    private EstadoSalud estadoSalud;
    private String alimentacion;

    private int contAnimal = 1;

    public Animal(Especie especie, int edad, EstadoSalud estadoSalud,String alimentacion) {
        this.id = contAnimal++;
        this.especie = especie;
        this.edad = edad;
        this.estadoSalud = estadoSalud;
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("id=").append(id);
        sb.append(", especie=").append(especie);
        sb.append(", edad=").append(edad);
        sb.append(", estadoSalud=").append(estadoSalud);
        sb.append(", alimentacion='").append(alimentacion).append('\'');
        sb.append(", contAnimal=").append(contAnimal);
        sb.append('}');
        return sb.toString();
    }
}
