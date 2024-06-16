package Ficheros.B7_2;

import Objetos.GestionGranja.MiEntradaSalida;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej8 {
    private static final long TAMANIO_MAX = 256;
    private static final long TAMANIO_MIN = 16;
    public static void main(String[] args) {

        File file = new File("./src/Ficheros/B7_2/bitacora.txt");

        Pattern pattern = Pattern.compile("\\b(bitacora|mates|limite|lineal)\\b");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
            while (true) {
                String text = MiEntradaSalida.solicitarCadena("Introduce la cadena");
                Matcher matcher = pattern.matcher(text);
                if (matcher.find() && text.length() < TAMANIO_MAX && text.length() > TAMANIO_MIN) {
                    bw.write(text);
                    bw.newLine();
                    break;
                } else {
                    System.out.println("Ningun coincidencia o tamaño insuficiente");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
