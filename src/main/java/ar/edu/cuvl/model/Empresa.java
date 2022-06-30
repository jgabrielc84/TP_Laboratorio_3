package ar.edu.cuvl.model;

import ar.edu.cuvl.controller.AdministradorPedidos;
import ar.edu.cuvl.exception.pedidoException.PedidoInvalidoException;
import ar.edu.cuvl.interfaces.Robot;

import java.util.*;

public class Empresa {

    private AdministradorPedidos administradorPedidos;
    private HashSet<Cliente> clientes;
    private HashSet<Robot> robotsDisponibles;
    private HashSet<Empleado> empleados;


    public Empresa() {
        this.administradorPedidos = new AdministradorPedidos();
    }

    public AdministradorPedidos getAdministradorPedidos() {
        return administradorPedidos;
    }

    public HashSet<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashSet<Cliente> clientes) {
        this.clientes = clientes;
    }

    public HashSet<Robot> getRobotsDisponibles() {
        return robotsDisponibles;
    }

    public void setRobotsDisponibles(HashSet<Robot> robotsDisponibles) {
        this.robotsDisponibles = robotsDisponibles;
    }

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void ingresarPedido(Pedido pedido) throws PedidoInvalidoException {

        try {
            this.administradorPedidos.ingresarPedido(pedido, robotsDisponibles, empleados);
        } catch (PedidoInvalidoException e) {
            throw e;
        }

    }

    public HashMap<Integer, Float> solicitarPrecioFinalServicioReparacion(int numeroPedido) {
        return this.administradorPedidos.solicitarPrecioFinalServicioReparacion(numeroPedido);
    }

    public void mostrarCostoReparaciones(HashMap<Integer, Float> costosReparaciones) {

        float totalReparaciones = 0;

        for(Map.Entry<Integer, Float> entry : costosReparaciones.entrySet()) {
            Integer numeroReparacion = entry.getKey();
            Float costoReparacion = entry.getValue();
            totalReparaciones += costoReparacion;

            System.out.println("Reparacion numero: " + numeroReparacion);
            System.out.println("costo Reparacion = $" + costoReparacion + "\n");
        }
        System.out.println("Costo total de reparaciones = $" + totalReparaciones);
    }


}
