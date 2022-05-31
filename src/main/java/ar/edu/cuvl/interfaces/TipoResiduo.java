package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.type.Residuo;

public abstract class TipoResiduo {

    private Residuo tipoResiduo;

    public TipoResiduo(Residuo tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public Residuo getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(Residuo tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }
}
