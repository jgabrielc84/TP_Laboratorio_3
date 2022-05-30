package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.TipoReparacion;

public class ServicioReparacion {

    private TipoReparacion tipoReparacion;

    private int complejidad;

    private float precio;

    public ServicioReparacion(TipoReparacion tipoReparacion, int complejidad, float precio) {
        this.tipoReparacion = tipoReparacion;
        this.complejidad = complejidad;
        this.precio = precio;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
