package Ficheros.MenuFich;

import Objetos.GestionGranja.MiEntradaSalida;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ej5Fich {
    public static void main(String[] args) {

        int opcion;
        do {
            menu();
            opcion = MiEntradaSalida.leerEnteroDeRango("Elige una opcion", 1, 5);
            switch (opcion) {

                case 1:
                    crearDirectorio();
                    break;
                case 2:
                    crearFichero();
                    break;
                case 3:
                    borrarFichero();

                    break;
                case 4:
                    mostrarFicherosEnCarpeta();
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
            }

        } while (opcion != 5);
    }

    public static void menu() {
        System.out.println("1. Crear directorio");
        System.out.println("2. Crear fichero de texto");
        System.out.println("3. Borrar fichero de texto");
        System.out.println("4. Mostrar los ficheros de una carpeta");
        System.out.println("5. Salir");
    }

    public static void crearDirectorio() {
        String nombreDirec = MiEntradaSalida.solicitarCadena("Elige el nombre del directorio");
        File directorio = new File("C:\\Users\\sergi\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros " + nombreDirec);

        if (directorio.exists()) {
            System.out.println("El directorio ya existe");
        }
        if (directorio.mkdir()) {
            System.out.println("directorio creado");
        } else {
            System.out.println("No ha podido crearse");
        }
    }

    public static void crearFichero() {
        String nombreFichero = MiEntradaSalida.solicitarCadena("Elija el nombre del fichero");
        File ficheroTexto = new File("C:\\Users\\sergi\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros " + nombreFichero);
        System.out.println(ficheroTexto);

        if (!ficheroTexto.exists()) {
            try {
                if (ficheroTexto.createNewFile()) {
                    String texto = MiEntradaSalida.solicitarCadena("Elige el texto a escribir");
                    try (PrintWriter pw = new PrintWriter(ficheroTexto)) {
                        pw.println(texto);
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero ya estaba creado");
        }
    }

    public static void borrarFichero() {
        String nombreFichero = MiEntradaSalida.solicitarCadena("Introduzca el nombre del fichero a borrar");
        File ficheroTexto = new File("C:\\Users\\sergi\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros " + nombreFichero);

        if (ficheroTexto.delete()) {
            System.out.println("El fichero se ha borrado con exito");
        } else {
            System.out.println("El fichero no ha podido borrarse");
        }
    }

    public static void mostrarFicherosEnCarpeta() {
        String nombreDirectorio = MiEntradaSalida.solicitarCadena("Nombre del directorio a enseñar");
        Path ruta = Paths.get("C:\\Users\\sergi\\IdeaProjects\\RepasoMayoJunio\\src\\Ficheros " + nombreDirectorio);
        if (Files.exists(ruta)) {
            try(Stream<Path> ficheros = Files.list(ruta)) {
                ficheros.filter(Files::isRegularFile).forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
