package ar.edu.cuvl.model;

import ar.edu.cuvl.controller.AdministradorClientes;
import ar.edu.cuvl.controller.AdministradorPedidos;
import ar.edu.cuvl.controller.AdministradorRobots;
import ar.edu.cuvl.exception.PedidoInvalidoException;
import ar.edu.cuvl.model.type.Limpieza;
import ar.edu.cuvl.model.type.Servicio;
import ar.edu.cuvl.model.type.Superficie;
import ar.edu.cuvl.validator.ValidadorPedido;

import java.util.ArrayList;

public class Empresa {

    private AdministradorRobots administradorRobots;
    private AdministradorClientes administradorClientes;
    private AdministradorPedidos administradorPedidos;
    private ValidadorPedido validadorPedido;

    public Empresa() {
        this.administradorRobots = new AdministradorRobots();
        this.administradorClientes = new AdministradorClientes();
        this.administradorPedidos = new AdministradorPedidos();
        this.validadorPedido = new ValidadorPedido();
    }

    public void validarPedido(Pedido pedido) throws PedidoInvalidoException{

        try {
            this.validadorPedido.validarEsPedido(pedido);
            System.out.println("Validacion Pedido OK");
        } catch (PedidoInvalidoException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            throw new PedidoInvalidoException(e.getMessage());
        }
    }

    public void ingresarPedido(Pedido pedido) {

        try {
            this.administradorPedidos.ingresarPedido(pedido,administradorRobots);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ingresarCliente(Cliente cliente) {
        try {
            administradorClientes.ingresarCliente(cliente);
        } catch (Exception e) { //TODO atrapar cualquier error que tire el administrador de cliente al crear Cliente
            e.printStackTrace();
        }
    }

    public AdministradorRobots getAdministradorRobots() {
        return administradorRobots;
    }

    public AdministradorClientes getAdministradorClientes() {
        return administradorClientes;
    }

    public AdministradorPedidos getAdministradorPedidos() {
        return administradorPedidos;
    }

    public ValidadorPedido getValidadorPedido() {
        return validadorPedido;
    }
}
