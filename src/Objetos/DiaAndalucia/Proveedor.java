package Objetos.DiaAndalucia;

public class Proveedor {

    private static final float PRECIO_LITRO_ACEITE = 8.5f;
    private static final float PRECIO_HOYO = 1.5f;
    private static final float PRECIO_TABLETA_CHOCO = 3f;
    private static final int NUMERO_ONZAS_TABLETA = 24;

    private float precioLitroAceite;
    private float precioHoyo;
    private float precioTabletaChoco;
    private int numOnzasTableta;

    public Proveedor() {
        this.precioLitroAceite = PRECIO_LITRO_ACEITE;
        this.precioHoyo = PRECIO_HOYO;
        this.precioTabletaChoco = PRECIO_TABLETA_CHOCO;
        this.numOnzasTableta = NUMERO_ONZAS_TABLETA;
    }

    public float getPrecioLitroAceite() {
        return precioLitroAceite;
    }

    public float getPrecioHoyo() {
        return precioHoyo;
    }

    public float getPrecioTabletaChoco() {
        return precioTabletaChoco;
    }

    public int getNumOnzasTableta() {
        return numOnzasTableta;
    }

    public void calcularPresupuesto (Instituto instituto){
       float presupHoyo = instituto.getNumeroAlu() * getPrecioHoyo();
       float presupAceite = instituto.getNumeroAlu() * getPrecioLitroAceite();
       float presupChoco = instituto.getNumeroAlu() * getPrecioTabletaChoco();

       System.out.println(presupAceite + presupChoco + presupHoyo);
    }
    public int calcularNumeroTabletas (Instituto instituto){
        return (instituto.getNumeroAlu() * instituto.getCantidadOnzasChoco()) / getNumOnzasTableta();
    }
    public double calcularLitrosAceite (Instituto instituto){
        return (instituto.getAceitePorHoyo() * instituto.getNumeroAlu()) / 1000;
    }
}
