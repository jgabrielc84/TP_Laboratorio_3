package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.type.Reparacion;

public abstract class TipoReparacion {

    private Reparacion tipoServicioReparacion;

    public TipoReparacion(Reparacion tipoServicioReparacion) {
        this.tipoServicioReparacion = tipoServicioReparacion;
    }

    public Reparacion getTipoServicioReparacion() {
        return tipoServicioReparacion;
    }

    public void setTipoServicioReparacion(Reparacion tipoServicioReparacion) {
        this.tipoServicioReparacion = tipoServicioReparacion;
    }
}
