package Colecciones.Cajas;

import java.util.LinkedList;


public class Caja {

    private int numeroCaja;
    private boolean estaAbierta;
    private LinkedList<Integer> colaCliente;

    public Caja(int numeroCaja) {

        this.numeroCaja = numeroCaja;
        estaAbierta = false;
        colaCliente = new LinkedList<Integer>();
    }

    public int getNumeroCaja() {
        return numeroCaja;
    }

    public boolean isEstaAbierta() {
        return estaAbierta;
    }

    private void setEstaAbierta(boolean estaAbierta) {
        this.estaAbierta = estaAbierta;
    }

    public void abrirCaja() throws CajaException {

        if (estaAbierta) {
            throw new CajaException("La caja ya esta abierta");
        }
        estaAbierta = true;
    }

    public void cerrarCaja() throws CajaException {
        if (!estaAbierta) {
            throw new CajaException("La caja esta cerrada");
        }

        if (!colaCliente.isEmpty()) {
            throw new CajaException("La caja esta atendida por clientes");
        }
        estaAbierta = false;
    }

    public int tamannoColaCliente() {

        return colaCliente.size();
    }

    public void agregarNuevoClienteCaja(Integer cliente) throws CajaException {

        if (!estaAbierta) {
            throw new CajaException("La caja esta cerrada");
        }
        colaCliente.add(cliente);

    }

    public Integer atenderCliente() throws CajaException {
        Integer cliente;
        if (!estaAbierta) {
            throw new CajaException("La caja esta cerrada");
        }

        if (colaCliente.isEmpty()) {
            throw new CajaException("La cola esta vacia");
        }

        cliente = colaCliente.get(0);
        colaCliente.remove(0);

        return cliente;
    }

    public String toString() {
        return "Caja [numeroCaja=" + numeroCaja + ", estaAbierta=" + estaAbierta + "]";

    }

}
