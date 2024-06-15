package Ficheros.EjerciciosSueltos;

import Objetos.GestionGranja.MiEntradaSalida;

import java.io.*;


public class SepararParteCadena {
    private static final String PATRON_SEPARACION = "[@. ]+";

    public static void main(String[] args) {
        String cadena = MiEntradaSalida.solicitarCadena("Introduce una cadena");
        String[] partes;

        partes = cadena.split(PATRON_SEPARACION);
        for (String parte : partes) {
            System.out.println("Parte " + parte + " longitud " + parte.length());
        }

        File ruta = new File("./src/Ficheros/EjerciciosSueltos/Ej1.txt");
        File ruta2 = new File("./src/Ficheros/EjerciciosSueltos/EscribirFichero.txt");

        try(BufferedReader bf = new BufferedReader(new FileReader(ruta));
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta2))) {
            String linea;
            while ((linea = bf.readLine())!=null){
                bw.write(linea + " " + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
