package ar.edu.cuvl.model.tipoCliente;

import ar.edu.cuvl.interfaces.TipoServicio;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.type.Servicio;

public class Platinum extends TipoServicio {

    public Platinum( ) {
        super(Servicio.PLATINUM, 20000);
    }


    @Override
    public void puedeLimpiar(Pedido pedido) {

    }

    @Override
    public void puedeOrdenar(Pedido pedido) {

    }

    public void asignar(){

    }


}
