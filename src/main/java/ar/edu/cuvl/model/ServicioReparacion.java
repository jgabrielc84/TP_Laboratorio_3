package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.TipoReparacion;

public class ServicioReparacion {

    private TipoReparacion tipoReparacion;

    private int complejidad;

    public ServicioReparacion(TipoReparacion tipoReparacion, int complejidad) {
        this.tipoReparacion = tipoReparacion;
        this.complejidad = complejidad;
    }

    public TipoReparacion getTipoReparacion() {
        return tipoReparacion;
    }

    public void setTipoReparacion(TipoReparacion tipoReparacion) {
        this.tipoReparacion = tipoReparacion;
    }

    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

}
