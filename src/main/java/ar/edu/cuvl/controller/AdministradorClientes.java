package ar.edu.cuvl.controller;

import ar.edu.cuvl.exception.ExisteClienteException;
import ar.edu.cuvl.model.Cliente;

import java.util.HashSet;

public class AdministradorClientes {

    private HashSet<Cliente> clientes;

    public AdministradorClientes() {
        this.clientes = new HashSet<>();
    }

    public void ingresarCliente(Cliente cliente){

        try {
            agrearCLiente(cliente);
        }catch (ExisteClienteException e){
            e.printStackTrace();
        }
    }

    private void agrearCLiente(Cliente cliente) throws ExisteClienteException {

        if(!this.clientes.add(cliente)){
           throw new ExisteClienteException("Ya es Cliente");
        }
    }

    public Cliente buscarCliente(int dniCliente) {
        Cliente clienteResultado = new Cliente();

        for(Cliente cliente : this.clientes){
            if( cliente.getDni() == dniCliente ){
                clienteResultado = cliente;
            }
        }

        return clienteResultado;
    }

}
