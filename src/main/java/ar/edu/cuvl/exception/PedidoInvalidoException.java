package ar.edu.cuvl.exception;

public class PedidoInvalidoException extends Exception{


    public PedidoInvalidoException(String pedidoInvalidado) {
        super(pedidoInvalidado);
    }

}
