package ar.edu.cuvl.controller;

import ar.edu.cuvl.exception.pedidoException.PedidoInvalidoException;
import ar.edu.cuvl.model.AsignadorRobot;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.Robot;
import ar.edu.cuvl.model.TipoLimpieza;
import ar.edu.cuvl.validator.ValidadorPedido;

import java.util.ArrayList;
import java.util.HashMap;

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

    public void ingresarPedido(Pedido pedido, AdministradorRobots administradorRobots) throws PedidoInvalidoException {

        try {
            this.validadorPedido.validarPedido(pedido);
            this.pedidosValidados.add(pedido);
        } catch (PedidoInvalidoException e) {
            throw new PedidoInvalidoException(e.getMessage());
        }
//        catch (NoSePuedeAgregarAListaException e){
//            this.pedidosRechazados.add(pedido);
//            //se guarda el error
//        }
        catch (Exception e) {
        }
    }

    public void asignarTipoLimpieza(Pedido pedido, TipoLimpieza tipoLimpieza){

    }

    public float calcularCostoPedido(Pedido pedido){
        return 1.0F;
    }

}
