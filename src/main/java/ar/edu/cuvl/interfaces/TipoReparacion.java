package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.type.Reparacion;

public abstract class TipoReparacion {

    private Reparacion tipoServicioReparacion;

    private float precio;

    public TipoReparacion(Reparacion tipoServicioReparacion, float precio) {
        this.tipoServicioReparacion = tipoServicioReparacion;
        this.precio = precio;
    }

    public Reparacion getTipoServicioReparacion() {
        return tipoServicioReparacion;
    }

    public float getPrecio() {
        return precio;
    }
}
