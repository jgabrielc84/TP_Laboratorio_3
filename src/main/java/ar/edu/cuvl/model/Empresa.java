package ar.edu.cuvl.model;

import ar.edu.cuvl.controller.AdministradorClientes;
import ar.edu.cuvl.controller.AdministradorPedidos;
import ar.edu.cuvl.controller.AdministradorRobots;
import ar.edu.cuvl.model.type.Limpieza;
import ar.edu.cuvl.model.type.Servicio;
import ar.edu.cuvl.model.type.Superficie;
import ar.edu.cuvl.validator.ValidadorPedido;

import java.util.ArrayList;

public class Empresa {

    private final AdministradorRobots administradorRobots = new AdministradorRobots();
    private final AdministradorClientes administradorClientes = new AdministradorClientes();
    private final AdministradorPedidos administradorPedidos = new AdministradorPedidos();
    private final ValidadorPedido validadorPedido = new ValidadorPedido();

    public static void main(String[] args) {

        //Crear Clientes en AdministradorClientes
        Cliente cliente1 = new Cliente(11111111, Servicio.ECONOMIC);


        //Prueba Caso 1
        //Datos de Pedido
        Cliente cliente = this.administradorClientes.getCliente(1);
        boolean ordenamiento = true;
        ArrayList <Superficie > tipoSuperficies = new ArrayList<>();
        tipoSuperficies.add(Superficie.PISO);
        tipoSuperficies.add(Superficie.MUEBLE);
        String direccion = "Cordoba 1501";

        //Creo
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
