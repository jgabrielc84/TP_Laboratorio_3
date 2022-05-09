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

        //Crear Clientes en AdministradorClientes
        Cliente cliente1 = new Cliente();


        //Prueba Caso 1
        Cliente cliente = this.administradorClientes.getCliente(1);
        boolean ordenamiento = true;
        ArrayList <TipoSuperficie > tipoSuperficies = new Superficie[Superficie.PISO, Superficie.MUEBLE];
        String direccion = "Cordoba 1501";

        Pedido pedido = new Pedido(1, Limpieza.COMPLEJA, ordenamiento, tipoSuperficies, cliente, direccion);

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
