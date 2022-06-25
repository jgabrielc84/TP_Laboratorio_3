package ar.edu.cuvl.validator;

import ar.edu.cuvl.exception.clienteException.ClienteMorosoException;
import ar.edu.cuvl.model.Cliente;
import ar.edu.cuvl.model.ModuloPago;

public class ValidadorCliente {
    private String mensaje;

    public void esMoroso(Cliente cliente) throws ClienteMorosoException {
        if(ModuloPago.deuda(cliente) >= cliente.getTipoServicio().getDeudaMaxima()){
            this.mensaje = "Cliente moroso";
            throw new ClienteMorosoException(mensaje);
        }
    }

}
