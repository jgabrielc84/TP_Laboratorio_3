package ar.edu.cuvl.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numeroPedido;
    private Cliente cliente;
    private String direccion;
    private int cantidadMascotas;
    private List<LimpiezaOrdenamiento> limpiezaOrdenamientos;
    private List<ServicioReparacion> servicioReparacions;

    public Pedido(int numeroPedido, Cliente cliente, String direccion, int cantidadMascotas, List<ServicioReparacion> servicioReparacions, List<LimpiezaOrdenamiento> limpiezaOrdenamientos) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.direccion = direccion;
        this.cantidadMascotas = cantidadMascotas;
        this.servicioReparacions = servicioReparacions;
        this.limpiezaOrdenamientos = limpiezaOrdenamientos;
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

    public List<LimpiezaOrdenamiento> getLimpiezaOrdenamientos() {
        return limpiezaOrdenamientos;
    }

    public void setLimpiezaOrdenamientos(List<LimpiezaOrdenamiento> limpiezaOrdenamientos) {
        this.limpiezaOrdenamientos = limpiezaOrdenamientos;
    }

    public List<ServicioReparacion> getServicioReparaciones() {
        return servicioReparacions;
    }

    public void setServicioReparacions(List<ServicioReparacion> servicioReparacions) {
        this.servicioReparacions = servicioReparacions;
    }

    public float costoTotal() {
        return sumarServicioReparacion(this.servicioReparacions) + sumarLimpiezaOrdenamientos(this.limpiezaOrdenamientos);
    }

    private float sumarServicioReparacion(List<ServicioReparacion> servicioReparacion) {
        float total = 0;
        for (ServicioReparacion tarea : servicioReparacion) {
            total = total + tarea.getTipoComplejidadReparacion().calcularCostoEmpleados(tarea.getEmpleado(),tarea.getComplejidad());
        }
        return total;
    }

    private float sumarLimpiezaOrdenamientos(List<LimpiezaOrdenamiento> limpiezaOrdenamientos){
        float total = 0;
        for(LimpiezaOrdenamiento tarea : limpiezaOrdenamientos){
            total = total + tarea.getTipoComplejidadLimpieza().calcularCostoRobots(tarea.getRobot(),tarea);
        }
        return total;
    }

}
