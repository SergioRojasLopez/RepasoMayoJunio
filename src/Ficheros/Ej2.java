package Ficheros;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Ej2 {
    public static void main(String[] args) {

        Path fichero = Paths.get("C:\\Users\\Alumno\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros\\Ej2.txt");
        Pattern patron = Pattern.compile("(\\d{4}[B-Z&&[^EIOU]]{3})");
        Pattern patronDeFin = Pattern.compile("[;:]$");

        try (Stream<String> flujo = Files.lines(fichero)){
            flujo.map(patronDeFin::matcher)
                    .filter(Matcher::matches)
                    .map(m->patron.matcher(m.group(0)))
                    .forEach(m->{
                        while (m.find()){
                            System.out.println(m.group(0) + " ");
                        }
                    });

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
