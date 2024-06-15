package Ficheros.B7_2;

import Objetos.GestionGranja.MiEntradaSalida;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ej4 {

    private static final long TAMANIO_MAX = 1024;

    public static void main(String[] args) {
        File file = new File("./src/Ficheros/B7_2/log.txt");

        if (file.exists() && file.length() > TAMANIO_MAX) {
            rotateFile(file);
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            String text = MiEntradaSalida.solicitarCadena("Escribe una cadena");
            bw.write(text);
            bw.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void rotateFile(File file) {
        LocalDateTime fechaHora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String fechaHoraString = fechaHora.format(formatter);

        File archivoRotado = new File(file.getParent(), "log_" + fechaHoraString + ".txt");

        if (file.renameTo(archivoRotado)) {
            System.out.println("Archivo rotado a:" + archivoRotado.getAbsolutePath());
        } else {
            System.out.println("No ha podido rotarse");
        }
    }
}
