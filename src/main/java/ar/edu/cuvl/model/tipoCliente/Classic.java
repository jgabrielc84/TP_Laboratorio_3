package ar.edu.cuvl.model.tipoCliente;

import ar.edu.cuvl.interfaces.TipoServicio;
import ar.edu.cuvl.model.type.Servicio;

public class Classic extends TipoServicio {

    public Classic() {
        super(Servicio.CLASSIC, 2000);
    }
}
