package ar.edu.cuvl.controller;

import ar.edu.cuvl.exception.existeClienteException;
import ar.edu.cuvl.model.Cliente;

import java.util.HashSet;

public class AdministradorClientes {

    private HashSet<Cliente> clientes;


    public void ingresarCliente(Cliente cliente){

        try {
            agrearCLiente(cliente);
        }catch (existeClienteException e)

        }
    }

    private void agrearCLiente(Cliente cliente) throws existeClienteException {

        if(this.clientes.add(cliente)){
           throw existeClienteException("Ya es Cliente");
        }
    }

    public Cliente buscarCliente(int dniCliente) {
        Cliente clienteResultado = new Cliente();

        for(Cliente c: this.clientes){
            if( c.getDni() == dniCliente ){
                clienteResultado = c;
            }
        }

        return clienteResultado;
    }

}
