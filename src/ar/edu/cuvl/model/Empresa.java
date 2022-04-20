package ar.edu.cuvl.model;

import ar.edu.cuvl.controller.AdministradorPedidos;
import java.util.ArrayList;

public class Empresa {

    private ArrayList<Cliente> clientes;
    private ArrayList<Robot> robots;
    private AdministradorPedidos administradorPedidos;


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
}
