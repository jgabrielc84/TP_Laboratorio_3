package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;

import java.util.List;

public abstract class Pedido {

    private int numeroPedido;
    private Cliente cliente;
    private String direccion;
    private List<ServicioReparacion> servicioReparacions;
    private  List<LimpiezaOrdenamiento> limpiezaOrdenamientos;



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


    public List<ServicioReparacion> getServicioReparacions() {
        return servicioReparacions;
    }

    public void setServicioReparacions(List<ServicioReparacion> servicioReparacions) {
        this.servicioReparacions = servicioReparacions;
    }

    public List<LimpiezaOrdenamiento> getLimpiezaOrdenamientos() {
        return limpiezaOrdenamientos;
    }

    public void setLimpiezaOrdenamientos(List<LimpiezaOrdenamiento> limpiezaOrdenamientos) {
        this.limpiezaOrdenamientos = limpiezaOrdenamientos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
