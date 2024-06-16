package Ficheros.MenuFich;

import Ficheros.AyudasNIO;
import Ficheros.NioException;
import Objetos.GestionGranja.MiEntradaSalida;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

public class Ej7Fich {
    public static void main(String[] args) {

        File file = new File("./src/Ficheros/Examen2022_2023/prueba1");

        int opcion;
        do {
            menu();
            opcion = MiEntradaSalida.leerEnteroDeRango("Elige una opcion", 1, 5);
            switch (opcion) {

                case 1:
                    listarDirectorio(file);


                    break;
                case 2:
                    String nombreF = MiEntradaSalida.solicitarCadena("Palabra para buscar fichero");
                    listarDirectorioBuscandoFichero(file, nombreF);
                    break;
                case 3:
                    String extension = MiEntradaSalida.solicitarCadena("Extension a buscar");
                    listarArchivosExtension(file, extension);

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Adios");
                    break;
            }

        } while (opcion != 5);
    }

    public static void menu() {
        System.out.println("1. Listar directorio");
        System.out.println("2. Listar directorio y buscar ficheros que coincidan con una palabra");
        System.out.println("3. Listar archivos con cierta extension de un directorio");
        System.out.println("4. Buscar un archivo en un directorio");
        System.out.println("5. Salir");
    }

    /**
     * @param file La ruta del directorio
     */

    public static void listarDirectorio(File file) {
        try {
            List<String> directorios = AyudasNIO.mostrarDirectorio(file.toPath(), true);
            for (String archivos : directorios) {
                System.out.println(archivos + " - " + archivos.length() / 1024 + "Kb");
            }
        } catch (NioException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Con este método, listamos los ficheros que comiencen por una cadena que nosotros declararemos.
     *
     * @param file La ruta del directorio
     */

    public static void listarDirectorioBuscandoFichero(File file, String nombreFich) {

        File[] directorios = file.listFiles();

        if (directorios == null || directorios.length == 0) {
            System.out.println("Archivos nulos");
        } else {
            for (File archivo : directorios) {
                if (archivo.getName().startsWith(nombreFich)) {
                    System.out.println(archivo.getName());
                } else {
                    System.out.println("Nombre no encontrado");
                    return;
                }
            }
        }
    }

    public static void listarArchivosExtension(File file, String extension) {
        File[] directorios = file.listFiles();
        if (directorios == null || directorios.length == 0) {
            System.out.println("Archivos nulos");
        } else {
            for (File archivo : directorios) {
                if (archivo.getName().endsWith(extension)) {
                    System.out.println(archivo.getName());
                }else {
                    return;
                }
            }
        }
    }
}
