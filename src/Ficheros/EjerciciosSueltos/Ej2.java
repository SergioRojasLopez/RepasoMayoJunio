package Ficheros.EjerciciosSueltos;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ej2 {
    public static void main(String[] args) {

        /**
         * Con Java NIO, lectura del contenido de fichero y por cada match de linea valida imprimimos las matriculas validas
         */

        Path fichero = Paths.get("./src/Ficheros/EjerciciosSueltos/Ej2.txt");
        Pattern matriculaValida = Pattern.compile("(\\d{4}[B-Z&&[^EIOU]]{3})");
        Pattern lineaValida = Pattern.compile(".*[;:]$");

        try (Stream<String> flujo = Files.lines(fichero)){
            flujo.map(lineaValida::matcher)
                    .filter(Matcher::matches)
                    .map(m->matriculaValida.matcher(m.group(0)))
                    .forEach(m->{
                        while (m.find()){
                            System.out.println(m.group(0) + " ");
                        }
                    });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main2(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("./src/Ficheros/EjerciciosSueltos/Ej2.txt"))){
            String linea;
            Pattern lineaValida = Pattern.compile(".*[;:]$"); //Patron para buscar lineas que acaben por ; o :
            Pattern matriculaValida = Pattern.compile("(\\d{4}[B-Z&&[^EIOU]]{3})"); //Patron para buscar matriculas correctas

            while ((linea = br.readLine()) != null) {
                Matcher mLineaValida = lineaValida.matcher(linea);

                if (mLineaValida.matches()){
                    Matcher mMatriculaValida = matriculaValida.matcher(linea);

                    while (mMatriculaValida.find()){
                        System.out.print(mMatriculaValida.group() + " ");
                    }
                    System.out.println();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //lecturas de ficheros
        //recorrido directorios
        //Expresiones regulares
        //Creacion de ficheros
    }
}
