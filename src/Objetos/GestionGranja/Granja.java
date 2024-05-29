package Objetos.GestionGranja;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Granja {

    private String nombre;
    private List<Animal> listaAnimales;
    private List<ProductoAgricola> listaProductos;
    private List<Transaccion> listaTransacciones;

    public Granja(String nombre) {
        this.nombre = nombre;
        this.listaAnimales = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
        this.listaTransacciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public List<ProductoAgricola> getListaProductos() {
        return listaProductos;
    }

    public List<ProductoAgricola> getProductosDisponibles (){
        return listaProductos.stream().filter(ProductoAgricola::isDisponible).toList();
    }

    public void annadirAnimales(EspecieAnimal especie, int edad) throws ValorNoValidoException {
        Animal animal = new Animal(especie, edad);
        listaAnimales.add(animal);
    }

    public void chequearEstadoAnimal (EstadoSalud estadoSalud,int idAnimal){
        listaAnimales.get(--idAnimal).registroChequeoSalud(estadoSalud);
    }

    public void alimentarAnimal (TipoAlimentacion tipoAlimentacion,int idAnimal){
        listaAnimales.get(--idAnimal).registroAlimentacion(tipoAlimentacion);
    }



    public void annadirProcuctosAgric() {

    }
}
