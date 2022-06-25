package ar.edu.cuvl.model.tipoReparacion;

import ar.edu.cuvl.interfaces.TipoReparacion;
import ar.edu.cuvl.model.type.Reparacion;

public class Electricidad extends TipoReparacion {

    public Electricidad(float precio) {
        super(Reparacion.ELECTRICIDAD, precio);
    }
}
