package ar.edu.cuvl.validator;

import ar.edu.cuvl.exception.clienteException.ClienteMorosoException;
import ar.edu.cuvl.model.Cliente;
import ar.edu.cuvl.model.ModuloPago;

public class ValidadorCliente {

    public void esMoroso(Cliente cliente) throws ClienteMorosoException {
        //ModuloPago moduloPago=new ModuloPago();
        if(ModuloPago.deuda(cliente) > cliente.getTipoServicio().getDeudaMaxima()){
            throw new ClienteMorosoException("Cliente moroso");
        }
    }

}
