package ar.edu.cuvl.model.tipoCliente;

import ar.edu.cuvl.asignador.AsignadorRobotPlatinum;
import ar.edu.cuvl.interfaces.AsignadorRobot;
import ar.edu.cuvl.interfaces.TipoServicio;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.type.Servicio;

public class Platinum extends TipoServicio {

    public Platinum( ) {
        AsignadorRobot asignadorRobot = new AsignadorRobotPlatinum();
        super(Servicio.PLATINUM, 20000, asignadorRobot);
    }


    @Override
    public void puedeLimpiar(Pedido pedido) {

    }

    @Override
    public void puedeOrdenar(Pedido pedido) {

    }
}
