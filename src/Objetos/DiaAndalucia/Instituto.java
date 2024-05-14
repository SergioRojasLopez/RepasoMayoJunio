package Objetos.DiaAndalucia;

public class Instituto {

    private static final int NUMERO_ALUMNOS = 500;
    private static final float PRESUPUESTO_COMPRA = 5000f;
    private static final double ACEITE_POR_HOYO = 30;
    private static final int CANTIDAD_ONZAS_CHOCO = 6;

    private int numeroAlu;
    private float presupuestoCompra;
    private double aceitePorHoyo;
    private int cantidadOnzasChoco;

    public Instituto() {
        this.numeroAlu = NUMERO_ALUMNOS;
        this.presupuestoCompra = PRESUPUESTO_COMPRA;
        this.aceitePorHoyo = ACEITE_POR_HOYO;
        this.cantidadOnzasChoco = CANTIDAD_ONZAS_CHOCO;
    }

    public int getNumeroAlu() {
        return numeroAlu;
    }

    public float getPresupuestoCompra() {
        return presupuestoCompra;
    }

    public double getAceitePorHoyo() {
        return aceitePorHoyo;
    }

    public int getCantidadOnzasChoco() {
        return cantidadOnzasChoco;
    }
    public boolean esFactible (Proveedor proveedor){
        if (proveedor.calcularPresupuesto(this) < getPresupuestoCompra()){
            System.out.println("Es factible el presupuesto");
        }else {
            System.out.println("El presupuesto se sale de los limites");
        }
        return false;
    }
}
