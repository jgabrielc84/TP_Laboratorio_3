package ar.edu.cuvl.validator;

import ar.edu.cuvl.exception.clienteException.ClienteMorosoException;
import ar.edu.cuvl.exception.pedidoException.PedidoInvalidoException;
import ar.edu.cuvl.interfaces.TipoLimpieza;
import ar.edu.cuvl.model.Cliente;
import ar.edu.cuvl.model.ModuloPago;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.interfaces.TipoSuperficie;
import ar.edu.cuvl.model.tipoLimpieza.LimpiezaCompleja;
import ar.edu.cuvl.model.tipoLimpieza.LimpiezaSimple;
import ar.edu.cuvl.model.type.Superficie;

public class ValidadorPedido {

    private String mensaje;

//    public void validarEsPedido(Pedido pedido) throws PedidoInvalidoException {
//
//        try{
//            validarNumeroPedido(pedido);
//            validarNumeroCliente(pedido);
//            validarDireccion(pedido);
//            validarTipoLimpieza(pedido);
//            validarOrdenamiento(pedido);
//            validarSuperficies(pedido);
//        }catch (Exception e){
//           throw new PedidoInvalidoException(mensaje);
//        }
//    }

    public void validarPedido(Pedido pedido) throws PedidoInvalidoException {
        //TODO Validar que el pedido pueda ser llevado a cabo segun cliente
        try{
            ValidadorCliente.esMoroso(pedido.getCliente());
            pedido.getCliente().getTipoServicio().validarServicio(pedido);

        }catch (ClienteMorosoException e){
            throw new PedidoInvalidoException(e.getMessage());
        }catch (Exception e){
            throw new PedidoInvalidoException("Pedido invalidado");
        }
    }

    public void esMoroso(Cliente cliente) throws ClienteMorosoException {
            if(ModuloPago.deuda(cliente) >= cliente.getTipoServicio().getDeudaMaxima()){
                this.mensaje = "Cliente moroso";
                throw new ClienteMorosoException(mensaje);
            }
    }



    public void validarComplejidad(Pedido pedido){
        ValidadorTipoLimpieza validadorTipoLimpieza = new ValidadorTipoLimpieza()

        try{
            validadorTipoLimpieza.esSIMPLE(pedido);
            TipoLimpieza tipoLimpieza = new LimpiezaSimple();
            pedido.setTipoLimpieza(tipoLimpieza);
        } catch (EsComplejaException e) {
            TipoLimpieza tipoLimpieza = new LimpiezaCompleja();
            pedido.setTipoLimpieza(tipoLimpieza);
        } catch (Exception e){
            //Enviar mensaje o un throw
        }


        ValidadorLimpieza.validarLimpieza(pedido){
            try{
                pedido.getCliente().getTipoServicio().validate(pedido.getCliente());
            }catch
        }

    }
}
