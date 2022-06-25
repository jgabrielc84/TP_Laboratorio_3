package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.type.Reparacion;

public abstract class TipoReparacion {

    private Reparacion tipoServicioReparacion;

    private float precio;


    public Reparacion getTipoServicioReparacion() {
        return tipoServicioReparacion;
    }

    public float getPrecio() {
        return precio;
    }

    public abstract float costoSegunComplejidad(int complejidad);
}
