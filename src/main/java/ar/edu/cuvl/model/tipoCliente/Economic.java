package ar.edu.cuvl.model.tipoCliente;

import ar.edu.cuvl.exception.pedidoException.NoPuedeLimpiarException;
import ar.edu.cuvl.exception.pedidoException.NoPuedeOrdenarException;
import ar.edu.cuvl.interfaces.TipoServicio;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.type.Servicio;

public class Economic extends TipoServicio {

    public Economic() {
        super(Servicio.ECONOMIC, 0);
    }


    @Override
    public void puedeLimpiar(Pedido pedido) throws NoPuedeLimpiarException {
                if(pedido.getCliente().getCantidadLimpiezas()>3){
                    throw new NoPuedeLimpiarException("No hay mas limpiezas este mes");
                }
    }

    @Override
    public void puedeOrdenar(Pedido pedido) throws NoPuedeOrdenarException {
           throw new NoPuedeOrdenarException("Este tipo de servicio no admite ordenamiento");
    }
}
