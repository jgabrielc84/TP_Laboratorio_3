package ar.edu.cuvl.validator;

import ar.edu.cuvl.exception.clienteException.ClienteMorosoException;
import ar.edu.cuvl.exception.pedidoException.NoPuedeLimpiarException;
import ar.edu.cuvl.exception.pedidoException.NoPuedeOrdenarException;
import ar.edu.cuvl.exception.pedidoException.PedidoInvalidoException;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.LimpiezaOrdenamiento;

public class ValidadorPedido {

    private ValidadorCliente validadorCliente;

    public ValidadorPedido() {
        this.validadorCliente = new ValidadorCliente();
    }

    public void validarPedido(Pedido pedido) throws PedidoInvalidoException {
        try{
        validadorCliente.esMoroso(pedido.getCliente());
            for (LimpiezaOrdenamiento l: pedido.getLimpiezaOrdenamientos()) {
                if(l.isOrdenamiento()){
                    pedido.getCliente().getTipoServicio().puedeOrdenar(pedido);
                }
                pedido.getCliente().getTipoServicio().puedeLimpiar(pedido);
            }
        } catch ( NoPuedeOrdenarException e ) {
            throw new PedidoInvalidoException("El Cliente no puede Ordenar");
        } catch ( NoPuedeLimpiarException e ){
            throw new PedidoInvalidoException("El Cliente no puede limpiar");
        } catch ( ClienteMorosoException e ){
            throw new PedidoInvalidoException("El Cliente es moroso");
        }

    }



}
