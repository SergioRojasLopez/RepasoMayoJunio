package Ficheros.Examen2022_2023;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        File file = new File("./src/Ficheros/Examen2022_2023/prueba1");
        File file2 = new File("./src/Ficheros/Examen2022_2023/prueba2");


        if (!file.isDirectory()) {
            System.out.println("La ruta " + file.getName() + " no es un directorio");
            return;

        }
        if (!file.canRead()) {
            System.out.println("El directorio " + file.getName() + " no se puede leer");
        }

        if (!file2.isDirectory()) {
            System.out.println("La ruta " + file2.getName() + " no es un directorio");
            return;

        }
        if (!file2.canWrite()) {
            System.out.println("El directorio " + file2.getName() + " no se puede leer");
        }

        Pattern patron = Pattern.compile("^(copiar)", Pattern.CASE_INSENSITIVE);

        File[] archivos = file.listFiles(((dir, name) -> name.endsWith(".txt")));

        if (archivos != null) {
            for (File files : archivos) {
                if (files.isFile() && files.length() > 1024) {
                    try (BufferedReader bf = new BufferedReader(new FileReader(files))) {
                        String linea;
                        if ((linea = bf.readLine()) != null) {
                            Matcher matcher = patron.matcher(linea);
                            if (matcher.find()) {
                                Path destino = Paths.get(file2.getAbsolutePath(), files.getName());
                                Files.copy(files.toPath(), destino);
                                System.out.println("Archivo " + files.getName() + " copiado con exito");
                            }
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

            }
        }

    }
}
