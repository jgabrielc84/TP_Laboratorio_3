package ar.edu.cuvl.model;
import ar.edu.cuvl.model.type.Superficie;

public class TipoSuperficie {
    private Superficie tipoSuperficie;

    public TipoSuperficie(Superficie tipoSuperficie) {
        this.tipoSuperficie = tipoSuperficie;
    }

    public Superficie getTipo() {
        return tipoSuperficie;
    }

    public void setTipo(Superficie tipo) {
        this.tipoSuperficie = tipo;
    }

}
