package Ficheros.B7_2;

import Objetos.GestionGranja.MiEntradaSalida;

import java.io.*;
import java.nio.file.Files;

public class Ej5 {
    public static void main(String[] args) {

        File file = new File("./src/Ficheros/B7_2/datos.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            String texto = MiEntradaSalida.solicitarCadena("Introduzca el texto que quiere en el fichero");
            bw.write(texto);
            bw.newLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
