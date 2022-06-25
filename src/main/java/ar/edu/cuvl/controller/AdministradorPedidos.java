package ar.edu.cuvl.controller;

import ar.edu.cuvl.exception.pedidoException.PedidoInvalidoException;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.interfaces.ComplejidadTarea;
import ar.edu.cuvl.validator.ValidadorPedido;

import java.util.ArrayList;

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
}

