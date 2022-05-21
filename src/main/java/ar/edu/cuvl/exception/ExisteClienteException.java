package ar.edu.cuvl.exception;

public class ExisteClienteException extends Exception {

    public ExisteClienteException(String yaExisteCliente) {
        super(yaExisteCliente);
    }

}
