package ar.edu.cuvl.controller;

import ar.edu.cuvl.asignador.AsignadorComplejidad;
import ar.edu.cuvl.asignador.AsignadorEmpleados;
import ar.edu.cuvl.exception.pedidoException.PedidoInvalidoException;
import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.*;
import ar.edu.cuvl.model.tipoTarea.LimpiezaCompleja;
import ar.edu.cuvl.model.tipoTarea.LimpiezaSimple;
import ar.edu.cuvl.validator.ValidadorPedido;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

public class AdministradorPedidos {

    private ArrayList<Pedido> pedidosValidados;
    private ValidadorPedido validadorPedido;


    public AdministradorPedidos() {
        this.validadorPedido = new ValidadorPedido();
        this.pedidosValidados = new ArrayList<>();
    }

    public void setPedidosValidados(ArrayList<Pedido> pedidosValidados) {
        this.pedidosValidados = pedidosValidados;
    }

    public ValidadorPedido getValidadorPedido() {
        return validadorPedido;
    }

    public void setValidadorPedido(ValidadorPedido validadorPedido) {
        this.validadorPedido = validadorPedido;
    }

    public void ingresarPedido(Pedido pedido, HashSet<Robot> robotsDisponibles, HashSet<Empleado> empleadosDisponibles) throws PedidoInvalidoException {
        AsignadorComplejidad asignadorComplejidad = new AsignadorComplejidad();
        AsignadorEmpleados asignadorEmpleados = new AsignadorEmpleados();

        try {

            this.validadorPedido.validarPedido(pedido);
            asignadorComplejidad.asignarComplejidad(pedido);
            pedido.getCliente().getTipoServicio().getAsignadorRobot().asignarRobots(pedido, robotsDisponibles);
            asignadorEmpleados.asignarEmpleado(pedido, empleadosDisponibles);
            this.pedidosValidados.add(pedido);

        } catch (PedidoInvalidoException e) {
            throw  e;
        }

    }

    public int cantidadLimpiezaSimple(){
        int total = 0;
        for(Pedido pedido : pedidosValidados){
            for(LimpiezaOrdenamiento limpiezaOrdenamiento : pedido.getLimpiezaOrdenamientos()){
                if(limpiezaOrdenamiento.getTipoComplejidadLimpieza() instanceof LimpiezaSimple){
                    total ++;
                }
            }
        }
        return total;
    }

    public int cantidadLimpiezaCompleja(){
        int total = 0;
        for(Pedido pedido : pedidosValidados){
            for (LimpiezaOrdenamiento limpiezaOrdenamiento : pedido.getLimpiezaOrdenamientos()){
                if(limpiezaOrdenamiento.getTipoComplejidadLimpieza() instanceof LimpiezaCompleja){
                    total ++;
                }
            }
        }
        return total;
    }

    public float costoTotalCliente(Cliente cliente){
        float total=0;
        ArrayList<Pedido> ArrayCliente = this.pedidosValidados.stream().filter(e->e.getCliente().getDni()==cliente.getDni()).collect(Collectors.toCollection(ArrayList::new));
        for(Pedido pedido : ArrayCliente){
            total += pedido.costoTotal();
        }
        return total;
    }

    public HashMap<Integer, Float> solicitarPrecioFinalServicioReparacion(int numeroPedido){
        HashMap<Integer, Float> listaPrecioReparaciones = new HashMap<Integer, Float>();

        Pedido pedidoResultado = buscarPedido(numeroPedido);

        return pedidoResultado.solicitarPrecioFinalServicioReparacion();
    }



    private Pedido buscarPedido(int numeroPedido){
        Pedido pedidoResultado = new Pedido();

        for ( Pedido pedido : this.pedidosValidados ){
            if(pedido.getNumeroPedido() == numeroPedido){
                pedidoResultado = pedido;
            }
        }

        return pedidoResultado;
    }

}

