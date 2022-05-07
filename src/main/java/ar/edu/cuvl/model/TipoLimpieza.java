package ar.edu.cuvl.model;

import ar.edu.cuvl.model.type.Limpieza;

public abstract class TipoLimpieza {

    private Limpieza tipo;

    public Limpieza getTipo() {
        return tipo;
    }

    public void setTipo(Limpieza tipo) {
        this.tipo = tipo;
    }
}
