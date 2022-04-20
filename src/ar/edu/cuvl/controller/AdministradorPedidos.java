package ar.edu.cuvl.controller;

import java.util.ArrayList;

public class AdministradorPedidos {

    private ArrayList<Pedido> pedidosValidados;
    private ArrayList<Pedido> pedidosRechazados;


    public ArrayList<Pedido> getPedidosValidados() {
        return pedidosValidados;
    }

    public void setPedidosValidados(ArrayList<Pedido> pedidosValidados) {
        this.pedidosValidados = pedidosValidados;
    }

    public ArrayList<Pedido> getPedidosRechazados() {
        return pedidosRechazados;
    }

    public void setPedidosRechazados(ArrayList<Pedido> pedidosRechazados) {
        this.pedidosRechazados = pedidosRechazados;
    }

    private void validarPedido(){

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
    }

}
