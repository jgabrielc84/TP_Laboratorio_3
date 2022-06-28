package ar.edu.cuvl.model.tipoCliente;

import ar.edu.cuvl.asignador.AsignadorRobotPlatinum;
import ar.edu.cuvl.interfaces.TipoServicio;
import ar.edu.cuvl.model.Pedido;

public class Platinum extends TipoServicio {


    public Platinum( ) {

        super(20000,  new AsignadorRobotPlatinum());
    }


    @Override
    public void puedeLimpiar(Pedido pedido) {

    }

    @Override
    public void puedeOrdenar(Pedido pedido) {

    }

}
