package ar.edu.cuvl.model.tipoCliente;

import ar.edu.cuvl.asignador.AsignadorRobotEconomic;
import ar.edu.cuvl.exception.pedidoException.NoPuedeLimpiarException;
import ar.edu.cuvl.exception.pedidoException.NoPuedeOrdenarException;
import ar.edu.cuvl.interfaces.TipoServicio;
import ar.edu.cuvl.model.Pedido;

public class Economic extends TipoServicio {


    public Economic() {

        super(0,new AsignadorRobotEconomic());
    }


    @Override
    public void puedeLimpiar(Pedido pedido) throws NoPuedeLimpiarException {
                if(pedido.getCliente().getCantidadLimpiezas()>=3){
                    throw new NoPuedeLimpiarException("No hay mas limpiezas este mes");
                }
    }

    @Override
    public void puedeOrdenar(Pedido pedido) throws NoPuedeOrdenarException {
           throw new NoPuedeOrdenarException("Este tipo de servicio no admite ordenamiento");
    }

}
