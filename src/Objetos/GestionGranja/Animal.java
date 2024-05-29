package Objetos.GestionGranja;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private int id;
    private EspecieAnimal especie;
    private int edad;
    private List<Alimentacion> alimentacionAnimal;
    private List<ChequeoSalud> chequeoSalud;

    private static int contAnimal = 1;

    public Animal(EspecieAnimal especie, int edad) throws ValorNoValidoException {
        this.id = contAnimal++;
        this.especie = especie;
        setEdad(edad);
        this.alimentacionAnimal = new ArrayList<>();
        this.chequeoSalud = new ArrayList<>();
    }

    public void setEdad (int edad) throws ValorNoValidoException {
        if (edad < 0){
            throw new ValorNoValidoException("La edad no puede ser negativa");
        }
        this.edad = edad;
    }

    public EspecieAnimal getEspecie() {
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

    public EstadoSalud saludAnimal (){
        if (chequeoSalud.isEmpty()) return null;
        return chequeoSalud.get(chequeoSalud.size()-1).getEstadoSalud();
    }

    public TipoAlimentacion alimentacionAni (){
        if (alimentacionAnimal.isEmpty()) return null;
        return alimentacionAnimal.get(alimentacionAnimal.size() - 1).getTipoAlimentacion();
     }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("id=").append(id);
        sb.append(", especie=").append(especie);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }
}
