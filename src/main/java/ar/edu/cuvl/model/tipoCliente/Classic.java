package ar.edu.cuvl.model.tipoCliente;

import ar.edu.cuvl.asignador.AsignadorRobotClassic;
import ar.edu.cuvl.exception.pedidoException.NoPuedeOrdenarException;
import ar.edu.cuvl.interfaces.TipoServicio;
import ar.edu.cuvl.model.Pedido;

public class Classic extends TipoServicio {


    public Classic() {

            super(2000, new AsignadorRobotClassic());
    }


    @Override
    public void puedeLimpiar(Pedido pedido) {

    }

    @Override
    public void puedeOrdenar(Pedido pedido) throws NoPuedeOrdenarException {
                if(pedido.getCliente().getCantidadOrdenamientos()>=3){
                    throw new NoPuedeOrdenarException("No hay mas ordenamiento disponibles este mes");
                }
    }

}
