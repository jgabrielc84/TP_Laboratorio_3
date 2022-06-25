package ar.edu.cuvl.validator;

import ar.edu.cuvl.exception.clienteException.ClienteMorosoException;
import ar.edu.cuvl.exception.pedidoException.NoPuedeLimpiarException;
import ar.edu.cuvl.exception.pedidoException.NoPuedeOrdenarException;
import ar.edu.cuvl.exception.pedidoException.PedidoInvalidoException;
import ar.edu.cuvl.model.Cliente;
import ar.edu.cuvl.model.ModuloPago;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.interfaces.TipoSuperficie;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;
import ar.edu.cuvl.model.type.Superficie;

public class ValidadorPedido {

    private String mensaje;
    private ValidadorCliente validadorCliente;


    public void validarPedido(Pedido pedido) throws PedidoInvalidoException {
        //TODO Validar que el pedido pueda ser llevado a cabo segun cliente
        try{
        validadorCliente.esMoroso(pedido.getCliente());
            for (LimpiezaOrdenamiento l: pedido.getLimpiezaOrdenamientos()) {
                if(l.isOrdenamiento()){
                    pedido.getCliente().getTipoServicio().puedeOrdenar(pedido);
                }
                pedido.getCliente().getTipoServicio().puedeLimpiar(pedido);
                //asignar robots
                //asignar tipo de limpieza
            }


        } catch (NoPuedeOrdenarException e) {
            mensaje=e.getMessage();
        } catch (NoPuedeLimpiarException e) {
            mensaje=e.getMessage();
        } catch (ClienteMorosoException e) {
            mensaje=e.getMessage();
        }

    }





}
