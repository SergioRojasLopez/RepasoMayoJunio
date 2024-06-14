package Ficheros.EjerciciosSueltos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeerCaracterPorCaracter {
    /**
     * Con int, despues hacemos casting con char
     *
     * @param args
     */
    public static void main2(String[] args) {
        String fichero = ("./src/Ficheros/EjerciciosSueltos/Ej1.txt");
        try (FileReader fich = new FileReader(fichero)) {
            int caracter = fich.read();

            while (caracter != -1) {
                if (caracter != ' ' && caracter != '\t' && caracter != '\n' && caracter != '\r' && caracter != '.') {
                    System.out.print((char) caracter);
                }
                caracter = fich.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Con StringBuilder
     *
     * @param args
     */

    public static void main(String[] args) {
        String nombreFichero = ("./src/Ficheros/EjerciciosSueltos/Ej1.txt");
        Path fichero = Paths.get(nombreFichero);

        try (BufferedReader bf = Files.newBufferedReader(fichero)) {
            String linea;

            StringBuilder resultado = new StringBuilder();
            Pattern patron = Pattern.compile("[\\s.,:;]"); // Patron para buscar saltos de linea,espacios, tab y (.,:;).

            while ((linea = bf.readLine()) != null) {
                Matcher matcher = patron.matcher(linea);
                resultado.append(matcher.replaceAll(""));
            }
            System.out.println(resultado);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
