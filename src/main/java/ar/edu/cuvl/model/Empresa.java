package ar.edu.cuvl.model;

import ar.edu.cuvl.controller.AdministradorClientes;
import ar.edu.cuvl.controller.AdministradorPedidos;
import ar.edu.cuvl.controller.AdministradorRobots;
import ar.edu.cuvl.model.type.Limpieza;
import ar.edu.cuvl.validator.ValidadorPedido;

import java.security.cert.CertPathValidatorResult;
import java.util.ArrayList;

public class Empresa {

    private final AdministradorRobots administradorRobots = new AdministradorRobots();
    private final AdministradorClientes administradorClientes = new AdministradorClientes();
    private final AdministradorPedidos administradorPedidos = new AdministradorPedidos();
    private final ValidadorPedido validadorPedido = new ValidadorPedido();

    public static void main(String[] args) {

        //Crear Clientes
        Cliente cliente1 = new Cliente();



        //Pruebas
        Cliente cliente = this.administradorClientes.getCliente();
        boolean ordenamiento = true
        ArrayList <TipoSuperficie > tipoSuperficie = { Superficie.PISO, };

        Pedido pedido = new Pedido(1, Limpieza.COMPLEJA,   ordenamiento, Collection < > tipoSuperficie, Cliente, direccion);

        try {
            validarPedido(Pedido);
            this.administradorPedidos.ingresarPedido(pedido);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void validarPedido(Pedido pedido){

        try{
            this.validadorPedido.validarEsPedido(pedido);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
