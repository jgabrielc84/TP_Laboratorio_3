package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.type.Limpieza;

public abstract class TipoLimpieza {

    private Limpieza tipoLimpieza;

    private int horasTarea;

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

    public int getHorasTarea() {
        return horasTarea;
    }

    public void setHorasTarea(int horasTarea) {
        this.horasTarea = horasTarea;
    }
}
