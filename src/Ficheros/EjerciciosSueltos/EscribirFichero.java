package Ficheros.EjerciciosSueltos;

import Objetos.GestionGranja.MiEntradaSalida;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class EscribirFichero {

    public static void main(String[] args) {

        String nombreFichero = MiEntradaSalida.solicitarCadena("Dime el nombre del fichero");
        String texto = MiEntradaSalida.solicitarCadena("Que texto vas a escribir");
        escribirFichero(nombreFichero, texto);
        mostrarFicheroMay(nombreFichero);

    }

    public static void escribirFichero(String nombreFichero, String texto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("./src/Ficheros/EjerciciosSueltos/" + nombreFichero))) {
            bw.write(texto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void mostrarFicheroMay(String nombreFichero) {

        Path ruta = Paths.get("./src/Ficheros/EjerciciosSueltos/" + nombreFichero);

        try (BufferedReader bf = Files.newBufferedReader(ruta)) {
            String linea;
            StringBuilder resultado = new StringBuilder();
            boolean mayuscula = true;

            while ((linea = bf.readLine()) != null) {
                for (int i = 0; i < linea.length(); i++) {
                    char caracter = linea.charAt(i);
                    if (Character.isLetter(caracter)) {
                        if (mayuscula) {
                            resultado.append((char) (caracter - 'a' + 'A'));
                        } else {
                            resultado.append((char) (caracter - 'a' + 'A'));
                        }
                        mayuscula = !mayuscula;
                    } else {
                        resultado.append(caracter);
                    }
                }
                resultado.append("\n");
            }
            System.out.println(resultado);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

