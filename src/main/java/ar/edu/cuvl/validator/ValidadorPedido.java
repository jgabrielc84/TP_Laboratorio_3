package ar.edu.cuvl.validator;

import ar.edu.cuvl.exception.PedidoInvalidoException;
import ar.edu.cuvl.model.Pedido;

public class ValidadorPedido {

    public void validarEsPedido(Pedido pedido) throws PedidoInvalidoException {

        if(true){ //TODO Validar que sea un pedido
           throw new PedidoInvalidoException("Pedido invalidado");
        }
    }

    public void validarPedido(Pedido pedido) throws PedidoInvalidoException {

        if(true){ //TODO Validar que el pedido se puede procesar
            throw new PedidoInvalidoException("Pedido invalidado");
        }

    }
}
