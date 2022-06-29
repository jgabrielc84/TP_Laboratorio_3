package ar.edu.cuvl.model;

import java.util.HashMap;
import java.util.List;

public class Pedido {

    private int numeroPedido;
    private Cliente cliente;
    private String direccion;
    private int cantidadMascotas;
    private List<LimpiezaOrdenamiento> limpiezaOrdenamientos;
    private List<ServicioReparacion> servicioReparaciones;


    public Pedido() {

    }

    public Pedido(int numeroPedido, Cliente cliente, String direccion, int cantidadMascotas, List<ServicioReparacion> servicioReparaciones, List<LimpiezaOrdenamiento> limpiezaOrdenamientos) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.direccion = direccion;
        this.cantidadMascotas = cantidadMascotas;
        this.servicioReparaciones = servicioReparaciones;
        this.limpiezaOrdenamientos = limpiezaOrdenamientos;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidadMascotas() {
        return cantidadMascotas;
    }

    public void setCantidadMascotas(int cantidadMascotas) {
        this.cantidadMascotas = cantidadMascotas;
    }

    public List<LimpiezaOrdenamiento> getLimpiezaOrdenamientos() {
        return limpiezaOrdenamientos;
    }

    public void setLimpiezaOrdenamientos(List<LimpiezaOrdenamiento> limpiezaOrdenamientos) {
        this.limpiezaOrdenamientos = limpiezaOrdenamientos;
    }

    public List<ServicioReparacion> getServicioReparaciones() {
        return servicioReparaciones;
    }

    public void setServicioReparaciones(List<ServicioReparacion> servicioReparaciones) {
        this.servicioReparaciones = servicioReparaciones;
    }

    public float costoTotal() {
        return sumarServicioReparacion(this.servicioReparaciones) + sumarLimpiezaOrdenamientos(this.limpiezaOrdenamientos);
    }

    private float sumarServicioReparacion(List<ServicioReparacion> servicioReparaciones) {
        float total = 0;

        for (ServicioReparacion servicioReparacion : servicioReparaciones) {
            total = total + servicioReparacion.obtenerCostoEmpleado();
        }

        return total;
    }

    private float sumarLimpiezaOrdenamientos(List<LimpiezaOrdenamiento> limpiezaOrdenamientos){
        float total = 0;

        for(LimpiezaOrdenamiento limpiezaOrdenamiento : limpiezaOrdenamientos){
            total = total + limpiezaOrdenamiento.obtenerCostoRobots();
        }

        return total;
    }

    public HashMap<Integer, Float> solicitarPrecioFinalServicioReparacion() {
        HashMap<Integer, Float> listaPrecioReparaciones = new HashMap<Integer, Float>();

        for (ServicioReparacion servicioReparacion : this.getServicioReparaciones()) {

            listaPrecioReparaciones.put(servicioReparacion.getIdReparacion(), servicioReparacion.calcularPrecioFinal());
        }

        return listaPrecioReparaciones;
    }

    @Override
    public boolean equals(Object obj) {
        // hay que asegurar que obj es de la clase Cliente
        if (obj != null && obj instanceof Pedido) {
            // se comparan los números de identificación
            Pedido another = (Pedido) obj;
            return this.numeroPedido == another.numeroPedido;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.numeroPedido;
    }
}
