package Ficheros.B7_2;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej1 {
    public static void main(String[] args) {
        File file = new File("./src/Ficheros/B7_2/Ej1.txt");

        if (!file.exists()){
            System.out.println("El fichero no existe");
            return;
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String linea;
            Pattern patron = Pattern.compile("[\\p{L}]+");
            int count = 0;
            while ((linea = bufferedReader.readLine()) != null) {
                Matcher matcher = patron.matcher(linea);
                while (matcher.find()) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
