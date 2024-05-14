package Objetos.DiaAndalucia;

public class Main {
    public static void main(String[] args) {

        Instituto instituto = new Instituto();
        Proveedor proveedor = new Proveedor();

        proveedor.calcularPresupuesto(instituto);
        instituto.esFactible(proveedor);

    }
}
