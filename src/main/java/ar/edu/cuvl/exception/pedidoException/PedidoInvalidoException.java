package ar.edu.cuvl.exception.pedidoException;

public class PedidoInvalidoException extends Exception{


    public PedidoInvalidoException(String pedidoInvalidado) {
        super(pedidoInvalidado);
    }

}
