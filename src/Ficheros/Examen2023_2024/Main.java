package Ficheros.Examen2023_2024;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    /**
     * Puedes utilizar indistintamente java.io o java.nio para resolver los ejercicios.
     *
     * @param args
     */
    public static void main2(String[] args) {

        Path path = Path.of("C:\\Users\\sergi\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros\\Examen2023_2024\\quijote.txt");
        System.out.println("Ejercicio 1");
        ejercicio1(path);
        System.out.println("Ejercicio 2");
        ejercicio2(path);
        System.out.println("Ejercicio 3");
        ejercicio3(path);

    }

    /**
     * Para este y los demás apartados puedes cambiar Path por File si lo prefieres.
     *
     * @param path
     */

    public static void ejercicio1(Path path) {

        if (!Files.isRegularFile(path)) {
            System.out.println("La ruta no es un fichero ");
            return;
        }

        Path rutaSalida = Path.of("C:\\Users\\sergi\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros\\Examen2023_2024\\palabrasVocales.txt");

        try {
            AyudasNIO.crearFichero(rutaSalida, true);

        } catch (NioException e) {
            System.out.println(e.getMessage());
            return;
        }

        Pattern patron = Pattern.compile("\\b([aáeéiíoóuú](?:\\p{L}*[aáeéiíoóuú])?)\\b");

        try (Stream<String> lineas = Files.lines(rutaSalida)) {
            lineas.map(patron::matcher)
                    .forEach(matcher -> {
                        List<String> palabras = matcher.results()
                                .map(MatchResult::group)
                                .toList();
                        try {
                            AyudasNIO.escribirFichero(rutaSalida, palabras, StandardOpenOption.APPEND);

                        } catch (NioException e) {
                            System.out.println(e.getMessage());
                        }
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ejercicio2(Path path) {
        if (!Files.isRegularFile(path)) {
            System.out.println("La ruta no es un fichero ");
            return;
        }

        Path rutaSalida = Path.of("C:\\Users\\sergi\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros\\Examen2023_2024\\puntuacion.txt");

        try {
            AyudasNIO.crearFichero(rutaSalida, true);

        } catch (NioException e) {
            System.out.println(e.getMessage());
            return;
        }

        Pattern patron = Pattern.compile("");

        try (Stream<String> lineas = Files.lines(rutaSalida)) {
            lineas.map(patron::matcher)
                    .forEach(matcher -> {
                                List<String> palabras = matcher.results()
                                        .map(MatchResult::group)
                                        .toList();
                                try {
                                    AyudasNIO.escribirFichero(rutaSalida, palabras, StandardOpenOption.APPEND);
                                } catch (NioException e) {
                                    System.out.println(e.getMessage());
                                }
                            }
                    );

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void ejercicio3(Path path) {

        if (!Files.isRegularFile(path)) {
            System.out.println("No es un fichero");
            return;
        }

        Path rutaSalida = Path.of("C:\\Users\\sergi\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros\\Examen2023_2024");

        Pattern patron = Pattern.compile("(\\p{L}+)", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

        try (Stream<String> lineas = Files.lines(rutaSalida)) {
            lineas.map(patron::matcher)
                    .forEach(matcher -> {
                        matcher.results()
                                .map(MatchResult::group)
                                .forEach(palabras -> {
                                    Path rutaSalidaF = rutaSalida.resolve(
                                            String.valueOf(Character.toUpperCase(0)));
                                    try {
                                        AyudasNIO.crearFichero(rutaSalidaF, false);
                                    } catch (NioException e) {
                                        System.out.println(e.getMessage());
                                    }
                                    try {
                                        AyudasNIO.crearFichero(rutaSalidaF.resolve(palabras.toLowerCase() + ".txt"), false);
                                    } catch (NioException e) {
                                        System.out.println(e.getMessage());
                                    }
                                });
                    });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\sergi\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros\\Examen2023_2024\\quijote.txt");
        ejercicio1(file);
        ejercicio2(file);
        ejercicio3_2(file);

    }

    public static void ejercicio1(File file) {

        if (!file.exists() || !file.isFile()) {
            System.out.println("No es un fichero o no existe");
            return;
        }
        File rutaSalida = new File("C:\\Users\\sergi\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros\\Examen2023_2024\\palabrasVocales.txt");
        try {
            if (!rutaSalida.exists()) {
                if (!rutaSalida.createNewFile()) {
                    System.out.println("El fichero ya existe o no puede ser creado");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Pattern patron = Pattern.compile("\\b([aáeéiíoóuú](?:\\p{L}*[aáeéiíoóuú])?)\\b");

        try (BufferedReader bf = new BufferedReader(new FileReader(file));
             BufferedWriter bw = new BufferedWriter(new FileWriter(rutaSalida))) {
            String linea;
            while ((linea = bf.readLine()) != null) {
                Matcher matcherCorrecto = patron.matcher(linea);
                while (matcherCorrecto.find()) {
                    bw.write(matcherCorrecto.group() + " ");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ejercicio2(File file) {
        if (!file.exists() || !file.isFile()) {
            System.out.println("No es un fichero o no existe");
            return;
        }
        File rutaSalida = new File("C:\\Users\\sergi\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros\\Examen2023_2024\\puntuacion.txt");
        try {
            if (!rutaSalida.exists()) {
                if (!rutaSalida.createNewFile()) {
                    System.out.println("El fichero ya existe o no puede ser creado");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        Pattern patron = Pattern.compile("[-!»\"#$%&'()*+,./:;<=>?¿@\\]^_`{|}~]");

        try (BufferedReader bf = new BufferedReader(new FileReader(file));
             BufferedWriter bw = new BufferedWriter(new FileWriter(rutaSalida))) {
            String linea;
            while ((linea = bf.readLine()) != null) {
                Matcher matcherCorrecto = patron.matcher(linea);
                while (matcherCorrecto.find()) {
                    bw.write(matcherCorrecto.group() + " ");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ejercicio3(File file) {
        if (!file.exists() || !file.isFile()) {
            System.out.println("No es un fichero o no existe");
            return;
        }
        File rutaSalida = new File("C:\\Users\\sergi\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros\\Examen2023_2024");

        if (!rutaSalida.exists()) {
            if (!rutaSalida.mkdirs()) {
                System.out.println("No es un directorio");
                return;
            }
        } else if (!rutaSalida.isDirectory()) {
            System.out.println("La ruta de salida no es un directorio");
            return;
        }

        Pattern patron = Pattern.compile("([\\p{L}])");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            Map<String, List<String>> palabrasPorLetras = new HashMap<>();
            while ((linea = br.readLine()) != null) {
                Matcher matcher = patron.matcher(linea);
                while (matcher.find()) {
                    String palabra = matcher.group().toLowerCase();
                    String letraInicial = palabra.substring(0, 1);
                    palabrasPorLetras.computeIfAbsent(letraInicial, k -> new ArrayList<>()).add(palabra);
                }
            }
            for (Map.Entry<String, List<String>> entry : palabrasPorLetras.entrySet()) {
                String letra = entry.getKey();
                File directorioLetra = new File(rutaSalida, letra);
                if (!directorioLetra.mkdir()) {
                    System.out.println("No se pudo crear directorio para la letra" + letra);
                    continue;
                }

                for (String palabra : entry.getValue()) {
                    File ficheroPalabras = new File(directorioLetra, palabra + ".txt");
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroPalabras))) {
                        bw.write(palabra);
                    }
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void ejercicio3_2(File file) {
        // Verificar si el archivo existe y es válido
        if (!file.exists() || !file.isFile()) {
            System.out.println("No es un fichero o no existe");
            return;
        }

        // Directorio base donde se crearán los directorios por cada letra
        File rutaSalida = new File("C:\\Users\\sergi\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros\\Examen2023_2024");

        // Verificar si el directorio base existe, si no existe, crearlo
        if (!rutaSalida.exists()) {
            if (!rutaSalida.mkdirs()) {
                System.out.println("No se pudo crear el directorio base");
                return;
            }
        } else if (!rutaSalida.isDirectory()) {
            System.out.println("La ruta de salida no es un directorio");
            return;
        }
        // Patrón para capturar palabras que comienzan con una letra, con o sin tilde
        Pattern patron = Pattern.compile("\\b([a-zA-ZÀ-ÿ])[a-zA-ZÀ-ÿ]*\\b");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            Map<String, Set<String>> palabrasPorLetra = new HashMap<>(); // Mapa para almacenar palabras por letra

            // Leer el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                Matcher matcher = patron.matcher(linea);
                while (matcher.find()) {
                    String palabra = matcher.group();
                    String letraInicial = palabra.substring(0, 1).toLowerCase();
                    palabrasPorLetra.computeIfAbsent(letraInicial, k -> new HashSet<>()).add(palabra);
                }
            }
            // Procesar cada letra y crear directorio con ficheros correspondientes
            for (Map.Entry<String, Set<String>> entry : palabrasPorLetra.entrySet()) {
                String letra = entry.getKey();
                File directorioLetra = new File(rutaSalida, letra);
                if (!directorioLetra.exists()) {
                    if (!directorioLetra.mkdir()) {
                        System.out.println("No se pudo crear el directorio para la letra " + letra);
                        continue; // Saltar a la siguiente iteración si no se puede crear el directorio
                    }
                }
                // Crear ficheros dentro del directorio para cada palabra
                for (String palabra : entry.getValue()) {
                    File ficheroPalabra = new File(directorioLetra, palabra + ".txt");
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroPalabra))) {
                        bw.write(palabra); // Escribir la palabra en el fichero
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

