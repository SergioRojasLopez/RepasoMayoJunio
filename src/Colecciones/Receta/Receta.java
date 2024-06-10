package Colecciones.Receta;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Receta {
    private String nombreReceta;
    private int minutosDePreparacion;
    private HashSet<Ingrediente> listaIngredientes;
    private LinkedList<String> pasosReceta;

    public Receta(String nombreReceta, int minutosPreparacion) throws RecetaException {
        this.nombreReceta = nombreReceta.toUpperCase();
        setMinutosDePreparacion(minutosPreparacion);
        listaIngredientes = new HashSet<>();
        pasosReceta = new LinkedList<>();
    }

    public int getMinutosDePreparacion() {
        return minutosDePreparacion;
    }

    public void setMinutosDePreparacion(int minutosDePreparacion) throws RecetaException {
        if (minutosDePreparacion <= 0) {
            throw new RecetaException("Minutos incorrectos");
        }
        this.minutosDePreparacion = minutosDePreparacion;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void annadirPasoAlFinal(String paso) {
        pasosReceta.add(paso.toUpperCase());
    }

    public void annadirIngrediente(Ingrediente ingredienteNuevo) {
        boolean encontrado = false;

        for (Ingrediente ingrediente : listaIngredientes){
            if (ingrediente.getNombreIngrediente().equals(ingredienteNuevo.getNombreIngrediente())){
                ingrediente.setCantidad(ingrediente.getCantidad() + ingredienteNuevo.getCantidad());
                encontrado = true;
            }
        }
        if (!encontrado){
            listaIngredientes.add(ingredienteNuevo);
        }
    }

    public boolean necesitaIngrediente(String nombreIngrediente) {
        for (Ingrediente ingrediente : listaIngredientes){
            if (ingrediente.getNombreIngrediente().equals(nombreIngrediente)){
                if (ingrediente.getCantidad() > 0){
                    return true;
                }

            }
        }
        return false;
    }

    public void borrarIngrediente(Ingrediente ingredienteABorrar) throws RecetaException {

        pasosReceta = pasosReceta.stream().filter(paso -> !paso.contains(ingredienteABorrar.getNombreIngrediente())).collect(Collectors.toCollection(LinkedList::new));
        listaIngredientes.removeIf(ingrediente -> false);

    }

    public void annadirPasoDetrasDe(String pasoNuevo, String pasoExistente) throws RecetaException {

        LinkedList<String> nuevosPasos = new LinkedList<>();

        for (String paso : pasosReceta){
            nuevosPasos.add(paso);
            if (paso.equals(pasoExistente)){
                nuevosPasos.add(pasoNuevo);
            }
        }
        pasosReceta = nuevosPasos;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombreReceta == null) ? 0 : nombreReceta.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Receta other = (Receta) obj;
        if (nombreReceta == null) {
            if (other.nombreReceta != null)
                return false;
        } else if (!nombreReceta.equals(other.nombreReceta))
            return false;
        return true;
    }


}
