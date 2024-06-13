package Ficheros.Ej1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ej1 {
    public static void main(String[] args) {
        /*
        File archivoNuevo = new File("./src/Ficheros/Ej1.txt.txt");
        FileReader ar = new FileReader(archivoNuevo);
        try (BufferedReader br = new BufferedReader((archivoNuevo))) {
            StringBuilder cadena = new StringBuilder();
            String linea = null;

            while (linea == br.readLine()) {
                cadena.append(linea);
            }
            String contenido = cadena.toString();
            System.out.println(contenido);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        */


        Path fichero = Paths.get("./src/Ficheros/Ej1.txt.txt");
        try(Stream<String> lineas = Files.lines(fichero)){

            lineas.forEach(l->{
                System.out.printf("%d: %s/n",l.split(" ").length,l);
            });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
