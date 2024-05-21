package Objetos.GestionMascotas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Tienda {
    private String nombre;
    private List<Mascota> listaMascotas;
    private List<Cliente> listaClientes;
    private List<Compra> listaCompras;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.listaMascotas = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.listaCompras = new ArrayList<>();
    }

    public void annadirCliente(String nombre) {
        Cliente cliente = new Cliente(nombre);
        listaClientes.add(cliente);
    }

    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public List<Mascota> getListaMascotasDisponibles() {
        return listaMascotas.stream().filter(Mascota::isDisponible).toList();
    }

    public void annadirMascota(String nombre, Especie especie, int edad, double precio, boolean disponible) {
        Mascota mascota = new Mascota(nombre, especie, edad, precio, disponible);
        listaMascotas.add(mascota);
    }

    public void comprarMascota(Cliente cliente, Mascota mascota) {
        Compra compra = new Compra(cliente, mascota);
        listaCompras.add(compra);
        mascota.setDisponible(false);

    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Compra> listarCompraDeCliente(Cliente cliente) {

        return listaCompras.stream().filter(compra -> {
            return compra.getCliente().equals(cliente) && compra.getFechaDevolucion() == null;
        }).toList();
    }

    public void verificarDevolucion (Compra compra){
        compra.marcarDevuelta();
        compra.getMascota().setDisponible(true);

    }
}
