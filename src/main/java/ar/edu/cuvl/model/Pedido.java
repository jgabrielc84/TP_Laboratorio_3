package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int numeroPedido;
    private Cliente cliente;
    private String direccion;
    private ArrayList<ServicioReparacion> servicioReparacions;
    private ArrayList<LimpiezaOrdenamiento> limpiezaOrdenamientos;

    public Pedido(int numeroPedido, Cliente cliente, String direccion, ArrayList<ServicioReparacion> servicioReparacions, ArrayList<LimpiezaOrdenamiento> limpiezaOrdenamientos) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.direccion = direccion;
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


    public ArrayList<ServicioReparacion> getServicioReparacions() {
        return servicioReparacions;
    }

    public void setServicioReparacions(ArrayList<ServicioReparacion> servicioReparacions) {
        this.servicioReparacions = servicioReparacions;
    }

    public ArrayList<LimpiezaOrdenamiento> getLimpiezaOrdenamientos() {
        return limpiezaOrdenamientos;
    }

    public void setLimpiezaOrdenamientos(ArrayList<LimpiezaOrdenamiento> limpiezaOrdenamientos) {
        this.limpiezaOrdenamientos = limpiezaOrdenamientos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float costoTotal() {
        return sumarServicioReparacion(this.servicioReparacions) + sumarLimpiezaOrdenamientos(this.limpiezaOrdenamientos);
    }

    private float sumarServicioReparacion(ArrayList<ServicioReparacion> servicioReparacion) {
        float total = 0;
        for (ServicioReparacion tarea : servicioReparacion) {
            total = total + tarea.getTipoComplejidadReparacion().calcularCostoEmpleados(tarea.getEmpleado(),tarea.getComplejidad());
        }
        return total;
    }

    private float sumarLimpiezaOrdenamientos(ArrayList<LimpiezaOrdenamiento> limpiezaOrdenamientos){
        float total = 0;
        for(LimpiezaOrdenamiento tarea : limpiezaOrdenamientos){
            total = total + tarea.getTipoComplejidadLimpieza().calcularCostoRobots(tarea.getRobot(),tarea);
        }
        return total;
    }

}
