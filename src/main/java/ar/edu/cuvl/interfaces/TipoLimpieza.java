package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.type.Limpieza;

import java.time.LocalDateTime;

public abstract class TipoLimpieza {

    private Limpieza tipo;

    public TipoLimpieza(Limpieza tipo) {
        this.tipo = tipo;
    }

    public Limpieza getTipo() {
        return tipo;
    }

}
