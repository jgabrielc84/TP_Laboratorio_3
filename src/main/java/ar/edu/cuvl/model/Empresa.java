package ar.edu.cuvl.model;

import ar.edu.cuvl.controller.AdministradorPedidos;
import ar.edu.cuvl.exception.pedidoException.PedidoInvalidoException;
import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.validator.ValidadorPedido;

import java.util.HashSet;
import java.util.List;

public class Empresa {

    private AdministradorPedidos administradorPedidos;
    private ValidadorPedido validadorPedido;

    private HashSet<Cliente> clientes;
    private HashSet<Robot> robotsDisponibles;
    private String mensaje;


    public Empresa() {
        this.administradorPedidos = new AdministradorPedidos();
        this.validadorPedido = new ValidadorPedido();
    }

    public void ingresarPedido(Pedido pedido) throws PedidoInvalidoException {

        try {
            this.administradorPedidos.ingresarPedido(pedido,robotsDisponibles);
        } catch (PedidoInvalidoException e) {
           throw e;
        }

    }


    public AdministradorPedidos getAdministradorPedidos() {
        return administradorPedidos;
    }

    public ValidadorPedido getValidadorPedido() {
        return validadorPedido;
    }
}
