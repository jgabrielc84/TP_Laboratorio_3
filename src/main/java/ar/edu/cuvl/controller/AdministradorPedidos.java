package ar.edu.cuvl.controller;

import ar.edu.cuvl.exception.pedidoException.PedidoInvalidoException;
import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.Cliente;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.tipoTarea.LimpiezaCompleja;
import ar.edu.cuvl.model.tipoTarea.LimpiezaSimple;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;
import ar.edu.cuvl.validator.ValidadorPedido;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class AdministradorPedidos {

    private ArrayList<Pedido> pedidosValidados;
    private ValidadorPedido validadorPedido;

    public void setPedidosValidados(ArrayList<Pedido> pedidosValidados) {
        this.pedidosValidados = pedidosValidados;
    }

    public ValidadorPedido getValidadorPedido() {
        return validadorPedido;
    }

    public void setValidadorPedido(ValidadorPedido validadorPedido) {
        this.validadorPedido = validadorPedido;
    }

    public void ingresarPedido(Pedido pedido, HashSet<Robot> robotsDisponibles) throws PedidoInvalidoException {

        try {
            this.validadorPedido.validarPedido(pedido);
            this.pedidosValidados.add(pedido);
            pedido.getCliente().getTipoServicio().getAsignadorRobot().asignarRobots(pedido, robotsDisponibles);
        } catch (PedidoInvalidoException e) {
            throw new PedidoInvalidoException(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
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
    public float costoTotal(Cliente cliente){
        float total=0;
        ArrayList<Pedido> ArrayCliente = this.pedidosValidados.stream().filter(e->e.getCliente().getDni()==cliente.getDni()).collect(Collectors.toCollection(ArrayList::new));
        for(Pedido pedido : ArrayCliente){
            total += pedido.costoTotal();
        }
        return total;
    }
}

