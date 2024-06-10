package Colecciones.HashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;


public class ProbandoHashMap {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashMap<String, Usuario> mapa = new HashMap<String, Usuario>();
        Usuario u;


        u = new Usuario("pepe", "pepito");
        mapa.put("pepe", u);

        u = new Usuario("juan", "juanito");
        mapa.put("juan", u);

        u = new Usuario("pepe3", "pepito3");
        mapa.put("pepe3", u);

        // Obtener todos los elementos del HashMap en una colecci�n
        Collection<Usuario> coleccion = mapa.values();
        System.out.println("Listado");
        for (Usuario usu : coleccion) {
            System.out.println(usu);
        }

        // Pasar la colecci�n a ArrayList y ordenarlo
        ArrayList<Usuario> array = new ArrayList<Usuario>(coleccion);
        Collections.sort(array);

        System.out.println("Listado ordenado");
        for (Usuario usu : array) {
            System.out.println(usu);
        }

        // Pasar las claves a un set

        Set<String> conjunto = mapa.keySet();
        System.out.println("Listado de las claves");

        for (String clave : conjunto) {
            System.out.println(clave);
        }
    }

}
