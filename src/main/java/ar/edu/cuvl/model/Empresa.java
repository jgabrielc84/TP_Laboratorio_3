package ar.edu.cuvl.model;

import ar.edu.cuvl.controller.AdministradorPedidos;
import ar.edu.cuvl.validator.ValidadorPedido;

import java.util.HashSet;

public class Empresa {

    private AdministradorPedidos administradorPedidos;
    private ValidadorPedido validadorPedido;


    HashSet<Cliente> clientes;

    public Empresa() {
        this.administradorPedidos = new AdministradorPedidos();
        this.validadorPedido = new ValidadorPedido();
    }

//    public void validarPedido(Pedido pedido) throws PedidoInvalidoException{
//
//        try {
//            this.validadorPedido.validarEsPedido(pedido);
//            System.out.println("Validacion Pedido: OK");
//        } catch (PedidoInvalidoException e) {
//            //administradorPedidos.getPedidosRechazados().add(pedido);
//            throw new PedidoInvalidoException(e.getMessage());
//        } catch (Exception e) {
//            //e.printStackTrace();
//            //throw new PedidoInvalidoException(e.getMessage());
//        }
//    }


    public void ingresarPedido(Pedido pedido) {

        try {
           // this.administradorPedidos.ingresarPedido(pedido,administradorRobots);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    TODO revisar a que clase corresponde el ingreso de cliente
//    public void ingresarCliente(Cliente cliente) {
//        try {
//            administradorClientes.ingresarCliente(cliente);
//        } catch (Exception e) { //TODO atrapar cualquier error que tire el administrador de cliente al crear Cliente
//            e.printStackTrace();
//        }
//    }



    public AdministradorPedidos getAdministradorPedidos() {
        return administradorPedidos;
    }

    public ValidadorPedido getValidadorPedido() {
        return validadorPedido;
    }
}
