package ar.edu.cuvl.model;

import ar.edu.cuvl.controller.AdministradorEmpleados;
import ar.edu.cuvl.controller.AdministradorPedidos;
import ar.edu.cuvl.controller.AdministradorRobots;
import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.tipoCliente.Classic;
import ar.edu.cuvl.validator.ValidadorPedido;

import java.util.HashSet;

public class Empresa {

    private AdministradorRobots administradorRobots;
    private AdministradorPedidos administradorPedidos;
    private ValidadorPedido validadorPedido;
    private AdministradorEmpleados administradorEmpleados;

    private HashSet<Robot> robots;


    HashSet<Cliente> clientes;

    public Empresa() {
        this.administradorRobots = new AdministradorRobots();
        this.administradorPedidos = new AdministradorPedidos();
        this.validadorPedido = new ValidadorPedido();
        this.administradorEmpleados = new AdministradorEmpleados();
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
            this.administradorPedidos.ingresarPedido(pedido,robots);
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

    public AdministradorRobots getAdministradorRobots() {
        return administradorRobots;
    }

    public AdministradorPedidos getAdministradorPedidos() {
        return administradorPedidos;
    }

    public ValidadorPedido getValidadorPedido() {
        return validadorPedido;
    }
}
