package ar.edu.cuvl.model;

import ar.edu.cuvl.controller.AdministradorPedidos;
import ar.edu.cuvl.validator.ValidadorPedido;

import java.util.ArrayList;
import java.util.Collection;

public class Empresa {

    private ArrayList<Cliente> clientes;
    private ArrayList<Robot> robots;
    private AdministradorPedidos administradorPedidos;
    private ValidadorPedido validadorPedido = new ValidadorPedido();


    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Robot> getRobots() {
        return robots;
    }

    public void setRobots(ArrayList<Robot> robots) {
        this.robots = robots;
    }

    public AdministradorPedidos getAdministradorPedidos() {
        return administradorPedidos;
    }

    public void setAdministradorPedidos(AdministradorPedidos administradorPedidos) {
        this.administradorPedidos = administradorPedidos;
    }

    public Cliente crearCliente(){

    }

    public ValidadorPedido getValidadorPedido() {
        return validadorPedido;
    }

    public void setValidadorPedido(ValidadorPedido validadorPedido) {
        this.validadorPedido = validadorPedido;
    }

    private void validarPedido(Pedido pedido){
        this.validadorPedido(pedido);
    }



    Pedido pedido = new Pedido(numeroPedido, ripoLimpieza, ordenamiento, Collection<> tipoSuperficie, Cliente, direccion);

    try{
        validaroPedido(Pedido);
        administradorPedido.evaluarPedido();
    }















}
