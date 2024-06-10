package Colecciones.Diccionario;

import java.util.*;

public class Diccionario {

    //Atributos
    private HashMap<String, List<String>> diccionario;

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }

    public void annadirPalabra(String palabra, String significado) {

        if (diccionario.containsKey(palabra)){
            diccionario.get(palabra).add(significado);
        }else {
            List<String> significados = new ArrayList<>();
            significados.add(significado);
            diccionario.put(palabra,significados);
        }


    }

    public String buscarPalabra(String palabraABuscar) throws DiccionarioException {
        List<String> entradaEncontrada;
        entradaEncontrada = diccionario.get(palabraABuscar);
        if (entradaEncontrada == null) {
            throw new DiccionarioException("La palabra no existe");
        }
        return entradaEncontrada.toString();
    }

    public void borrarPalabra(String palabraABorrar) throws DiccionarioException {

        if (diccionario.remove(palabraABorrar) == null){
            throw new DiccionarioException("La palabra no esta");
        }
    }

    public String listadoDePalabrasQueEmpiezanPor(String comienzo) throws DiccionarioException {
        return diccionario.keySet().stream().filter(p->p.startsWith(comienzo)).toString();

    }
}
