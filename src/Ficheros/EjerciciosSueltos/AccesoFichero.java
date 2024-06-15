package Ficheros.EjerciciosSueltos;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccesoFichero {
    public static void main(String[] args) {

        File ruta = new File("./src/Ficheros/Examen2022_2023");
        File[] nombresArch = ruta.listFiles();

        if (nombresArch == null) {
            System.out.println("El archivo o directorio es nulo");
            return;
        }
        for (File s : nombresArch) {
            if (!s.isFile()) {
                System.out.println("No es un fichero");
                return;
            }
            File archHi = new File(ruta, s.getName());
            File[] archivosHijos = archHi.listFiles(((dir, name) -> name.endsWith(".txt")));
            if (archivosHijos == null) {
                System.out.println("El fichero es nulo");
                return;
            }
            for (File a : archivosHijos) {
                if (!a.isFile() | !a.exists()) {
                    System.out.println(a.getName());
                }
            }
        }
    }
}
