package Objetos.Boletin4_2.OrdenadorClases;

public class Main {
    public static void main(String[] args) {

        PlacaBase placaBase = new PlacaBase("Intel", "Core", "Tipo 2");
        MicroProcesador microProcesador = new MicroProcesador("Ryzen", "modelo 1", 12, 5600, "Tipo 2");
        DiscoDuro discoDuro = new DiscoDuro("Corsair", "SSD", 500);
        TarjetaGrafica tarjetaGrafica = new TarjetaGrafica("Nvidia", "3060", 8, 12, 1000);

        try {
            Ordenador ordenador = new Ordenador(placaBase, microProcesador, discoDuro, tarjetaGrafica);
            System.out.println(ordenador);
        } catch (CompatibilidadException e) {
            System.out.println(e.getMessage());
        }
    }
}
