package ar.edu.cuvl.model.tipoReparacion;

import ar.edu.cuvl.interfaces.TipoReparacion;
import ar.edu.cuvl.model.type.Reparacion;

public class Gas extends TipoReparacion {

    public Gas(float precio) {
        super(Reparacion.GAS, precio);
    }
}
