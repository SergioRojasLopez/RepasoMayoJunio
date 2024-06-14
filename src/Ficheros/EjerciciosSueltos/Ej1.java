package Ficheros.EjerciciosSueltos;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ej1 {
    public static void main(String[] args) {

        /**
         * Contar el numero de palabras de cada linea.
         */

        Path fichero = Paths.get("./src/Ficheros/EjerciciosSueltos/Ej1.txt");
        try (Stream<String> lineas = Files.lines(fichero)) {
            lineas.forEach(l -> System.out.printf("Total de palabras %d: %s\n", l.split(" ").length, l));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
