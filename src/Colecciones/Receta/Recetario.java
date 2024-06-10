package Colecciones.Receta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Recetario {

    private HashMap<String, Receta> listaRecetas;

    public Recetario() {
        listaRecetas = new HashMap<>();
    }

    public void annadirReceta(Receta nuevaReceta) throws RecetaException {

        String nombreReceta = nuevaReceta.getNombreReceta();
        if (listaRecetas.containsValue(nuevaReceta))
            throw new RecetaException("Ya existe esta receta");
        listaRecetas.put(nombreReceta, nuevaReceta);
    }

    public String listadoRecetasOrdenadasAlfabeticamente() throws RecetaException {

        if (listaRecetas.isEmpty()) throw new RecetaException("El recetario esta vacio");
        return listaRecetas.values().stream().sorted(Comparator.comparing(Receta::getNombreReceta)).toString();

    }

    public String listadoRecetasConIngredienteOrdenadasPorTiempoPreparacion(String ingrediente) throws RecetaException {

        if (listaRecetas.isEmpty()) throw new RecetaException("El recetario esta vacio");
        return listaRecetas.values().stream().sorted(Comparator.comparing(Receta::getMinutosDePreparacion)).toString();

    }
}
