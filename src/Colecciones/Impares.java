package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Impares {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(5);
        lista.add(2);
        lista.add(7);
        lista.add(0);
        lista.add(6);
        lista.add(8);
        lista.add(3);
        lista.add(4);

        for (Integer i : lista){

        }



        Iterator<Integer> iterator = lista.iterator();
       while (iterator.hasNext()){
           Integer imp = iterator.next();
               if (imp % 2 == 1){
                   iterator.remove();
           }
       }
    }
}
