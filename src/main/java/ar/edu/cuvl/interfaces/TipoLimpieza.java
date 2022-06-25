package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.type.Limpieza;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;

import java.util.List;

public abstract class TipoLimpieza {

    private Limpieza tipoLimpieza;

    public TipoLimpieza(Limpieza tipo) {
        this.tipoLimpieza = tipo;
    }

    public Limpieza getTipo() {
        return tipoLimpieza;
    }

    public Limpieza getTipoLimpieza() {
        return tipoLimpieza;
    }

    public void setTipoLimpieza(Limpieza tipoLimpieza) {
        this.tipoLimpieza = tipoLimpieza;
    }

    public abstract int calcularCostoRobots(List<Robot> robots, LimpiezaOrdenamiento tarea);


}