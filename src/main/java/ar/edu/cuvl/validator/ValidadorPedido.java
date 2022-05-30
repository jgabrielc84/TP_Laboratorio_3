package ar.edu.cuvl.validator;

import ar.edu.cuvl.exception.pedidoException.PedidoInvalidoException;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.TipoSuperficie;
import ar.edu.cuvl.model.type.Limpieza;
import ar.edu.cuvl.model.type.Superficie;

public class ValidadorPedido {

    private String mensaje;

    public void validarEsPedido(Pedido pedido) throws PedidoInvalidoException {

        try{
            validarNumeroPedido(pedido);
            validarNumeroCliente(pedido);
            validarDireccion(pedido);
            validarTipoLimpieza(pedido);
            validarOrdenamiento(pedido);
            validarSuperficies(pedido);
        }catch (Exception e){
           throw new PedidoInvalidoException(mensaje);
        }
    }

    public void validarPedido(Pedido pedido) throws PedidoInvalidoException {
        //TODO Validar que el pedido pueda ser llevado a cabo segun cliente
        if(true) {
            throw new PedidoInvalidoException("Pedido invalidado");
        }

    }

    private void validarNumeroPedido(Pedido pedido) throws Exception {

        if(pedido.getNumeroPedido() <= 0){
            this.mensaje = "Numero de pedido invalido";
            throw new Exception();
        }
    }

    private void validarNumeroCliente(Pedido pedido) throws Exception{

        if(pedido.getNumeroCliente() <= 0){
            this.mensaje = "Numero de cliente invalido";
            throw new Exception();
        }
    }

    private void validarDireccion(Pedido pedido) throws Exception{

        if(pedido.getDireccion().length() == 0){
            this.mensaje = "Direccion Invalida";
            throw new Exception();
        }
    }

    private void validarTipoLimpieza(Pedido pedido) throws Exception{
        //TODO decidir si TIPOLIMPEZA tiene sentido de existir
        if(pedido.getTipoLimpieza().equals(Limpieza.SIMPLE) || pedido.getTipoLimpieza().equals(Limpieza.COMPLEJA)){
            this.mensaje = "Tipo de limplieza invalido";
            throw new Exception();
        }
    }

    private void validarOrdenamiento(Pedido pedido) throws Exception{

        if(pedido.isOrdenamiento() != true || pedido.isOrdenamiento() != false){
            this.mensaje = "Ordenamiento invalido";
            throw new Exception();
        }
    }

    private void validarSuperficies(Pedido pedido) throws Exception{

        for (TipoSuperficie tipoSuperficie: pedido.getSuperficies()) {
            if(!tipoSuperficie.getTipo().equals(Superficie.PISO) ||
               !tipoSuperficie.getTipo().equals(Superficie.MUEBLE) ||
               !tipoSuperficie.getTipo().equals(null)){
                this.mensaje = "Superficie invalida";
                throw new Exception();
            }
        }
    }

}
