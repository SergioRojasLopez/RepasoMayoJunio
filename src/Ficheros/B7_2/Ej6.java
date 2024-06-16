package Ficheros.B7_2;

import Objetos.GestionGranja.MiEntradaSalida;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ej6 {
    private static final long TAMANIO_MAX = 128;

    public static void main(String[] args) {

        File file = new File("./src/Ficheros/B7_2/bitacora.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String texto = MiEntradaSalida.solicitarCadena("Introduce el texto");
            String linea;
            List<String> lineas = new ArrayList<>();
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
            if (file.length() > TAMANIO_MAX){
                lineas.remove(0);
            }
            lineas.add(texto);

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
                for (String line : lineas){
                    bw.write(line);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
