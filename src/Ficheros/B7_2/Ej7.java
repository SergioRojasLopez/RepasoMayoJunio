package Ficheros.B7_2;

import Objetos.GestionGranja.MiEntradaSalida;

import java.io.*;

public class Ej7 {

    public static void main(String[] args) {

        File file = new File("./src/Ficheros/B7_2/registro.txt");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
            String text = "";
            while (text.isEmpty()){
                text = MiEntradaSalida.solicitarCadena("Introduce el texto");
                if (text.isEmpty()){
                    System.out.println("No puedes introducir cadena vacias");
                }
            }
            bw.write(text);
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
