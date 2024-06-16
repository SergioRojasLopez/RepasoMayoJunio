package Ficheros.B3;

import Objetos.GestionGranja.MiEntradaSalida;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej3 {

    public static void main(String[] args) {

        String nombreFich = MiEntradaSalida.solicitarCadena("Introduzca el nombre del fichero");
        File file = new File("./src/Ficheros/B7_2/"+nombreFich);
        Pattern patron = Pattern.compile("(\\p{L}{2,})\\s(\\p{L}{2,})\\s(\\p{L}{2,})\\s([0-9]{2})");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = br.readLine()) != null){
                Matcher matcher = patron.matcher(linea);
                while (matcher.find()){
                    System.out.println(matcher.group(0));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
