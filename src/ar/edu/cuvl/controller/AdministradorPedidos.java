package ar.edu.cuvl.controller;

import ar.edu.cuvl.exception.PedidoInvalidoException;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.validator.ValidadorPedido;

import java.util.ArrayList;
import java.util.HashMap;

public class AdministradorPedidos {

    private HashMap<Pedido,ArrayList<Robot>> pedidosValidados;
    private ArrayList<Pedido> pedidosRechazados;

    public HashMap<Pedido, ArrayList<Robot>> getPedidosValidados() {
        return pedidosValidados;
    }

    public void setPedidosValidados(HashMap<Pedido, ArrayList<Robot>> pedidosValidados) {
        this.pedidosValidados = pedidosValidados;
    }

    public ArrayList<Pedido> getPedidosRechazados() {
        return pedidosRechazados;
    }

    public void setPedidosRechazados(ArrayList<Pedido> pedidosRechazados) {
        this.pedidosRechazados = pedidosRechazados;
    }

    public void ingresarPedido(Pedido pedido){

        try {
            validarPedido(pedido);
            this.pedidosValidados.add(pedido);
        }
        catch (PedidoInvalidoException e){
            //TODO: manejar la respuesta de excepcion
            this.pedidosRechazados.add(pedido);
        }
        catch (NoSePuedeAgregarAListaException e){
            //se guarda el error
        }
        catch (Exception e){
        }
    }

}
