package Ficheros.B7_2;

import Objetos.GestionGranja.MiEntradaSalida;

import java.io.*;
import java.util.*;

public class Ej9 {

    public static void main(String[] args) {

        File file = new File("./src/Ficheros/B7_2/notas.txt");

        try {
            List<String> lineas = leerLineas(file);
            String nuevaLinea = MiEntradaSalida.solicitarCadena("Introduce el texto");
            lineas.add(nuevaLinea);
            Collections.sort(lineas);
            escribirLineasOrdenadas(file, lineas);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribirLineasOrdenadas(File file, List<String> lineas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<String> leerLineas(File file) throws IOException {
        List<String> lineas = new ArrayList<>();
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    lineas.add(linea);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return lineas;
    }
}
