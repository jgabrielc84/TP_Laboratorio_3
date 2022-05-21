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

    public static void main(String[] args) {

        AdministradorRobots administradorRobots = new AdministradorRobots();
        AdministradorClientes administradorClientes = new AdministradorClientes();
        AdministradorPedidos administradorPedidos = new AdministradorPedidos();
        ValidadorPedido validadorPedido = new ValidadorPedido();

        //Crear Clientes en AdministradorClientes
        TipoServicio tipoServicio = new Economic();
        Cliente cliente1 = new Cliente(11111111,tipoServicio);
        administradorClientes.ingresarCliente(cliente1);


        //Prueba Caso 1
        //Datos de Pedido
        Cliente cliente = administradorClientes.buscarCliente(1);
        boolean ordenamiento = true;
        ArrayList <Superficie > tipoSuperficies = new ArrayList<>();
        tipoSuperficies.add(Superficie.PISO);
        tipoSuperficies.add(Superficie.MUEBLE);
        String direccion = "Cordoba 1501";

        //Creo
        Pedido pedido = new Pedido(1, cliente.getDni(), direccion, Limpieza.COMPLEJA, ordenamiento, tipoSuperficies, cliente, );
        //public Pedido(int numeroPedido, int numeroCliente, String direccion, TipoLimpieza tipoLimpieza, boolean ordenamiento, ArrayList<TipoSuperficie> superficies) {


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
