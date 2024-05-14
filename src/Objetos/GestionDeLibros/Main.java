package Objetos.GestionDeLibros;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("ChakakiChakoko","Flambo",2021,1);
        Libro libro1 = new Libro("ChakakiChakoko","Rupert",2022,2);
        Libro libro2 = new Libro("Bimbamcuco","Solomon",2010,3);
        Libro libro3 = new Libro("JiulineJortuio","Solomon",2009,3);
        Libro libro4 = new Libro("JiulineJortuio","Solomon",2009,3);

        libro1.imprimirDetalles();
        libro2.imprimirDetalles();
        libro.esPublicacionReciente();
        libro3.esPublicacionReciente();

        System.out.println(libro1.hashCode());
        System.out.println(libro2.hashCode());
        System.out.println(libro3.hashCode());
        System.out.println(libro4.hashCode());


        comprobarEqualsObject(libro3,libro2);

        System.out.println("Nombre de libro 2 es:" + libro2.getNombre());

        System.out.println(libro1.getAutor());
        libro1.setAutor("Flambo22");
        System.out.println(libro1.getAutor());
    }

    public static void comprobarEqualsObject (Object object, Object object2){
        if (object.equals(object2)){
            System.out.println("Los objetos son iguales");
        }else {
            System.out.println("Los objetos no son iguales");
        }
    }
}
