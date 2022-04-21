package ar.edu.cuvl.validator;

import ar.edu.cuvl.exception.PedidoInvalidoException;
import ar.edu.cuvl.model.Pedido;

public class ValidadorPedido {

    public void validarPedido(Pedido pedido) throws PedidoInvalidoException {

        if(false){
           throw new PedidoInvalidoException();
        }
    }
}
