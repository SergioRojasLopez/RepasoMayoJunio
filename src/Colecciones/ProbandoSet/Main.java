package Colecciones.ProbandoSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Set<String> conjuntoNombres = new HashSet<>();

        conjuntoNombres.add("Sergio");
        conjuntoNombres.add("Bryan");
        conjuntoNombres.add("Peter");
        conjuntoNombres.add("Samuel");
        conjuntoNombres.add("Zarza");
        conjuntoNombres.add("Zambrota");
        conjuntoNombres.add("Zubimendi");
        conjuntoNombres.add("Raul");
        conjuntoNombres.add("Lamine");

        System.out.println("Nombres ordenados:");

        Set<String> conjuntoNombreOrden = new TreeSet<>(conjuntoNombres);
        for (String s : conjuntoNombreOrden){
          System.out.println(s);
        }

        System.out.println("-----------------------------------------------");

        conjuntoNombreOrden.add("Raul");
        conjuntoNombreOrden.add("Quijote");
        conjuntoNombreOrden.add("Lamine");

        System.out.println("Borrar nombres ordenados que empiezan por Z");

        conjuntoNombreOrden.removeIf(a -> a.startsWith("Z"));
        for (String s : conjuntoNombreOrden){
            System.out.println(s);
        }

        System.out.println("-----------------------------------------------");

        System.out.println("Nombres comunes en conjunto de nombres y conjunto ordenado");

        Set<String> nombresComunes = new TreeSet<>(conjuntoNombreOrden);
        nombresComunes.retainAll(conjuntoNombres);

        for (String s : nombresComunes){
            System.out.println(s);
        }
    }
}
