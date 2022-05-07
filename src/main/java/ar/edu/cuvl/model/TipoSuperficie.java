package ar.edu.cuvl.model;
import ar.edu.cuvl.model.type.Servicio;

public abstract class TipoSuperficie {
    private Superficie tipoSuperficie;


    public Superficie getTipo() {
        return tipoSuperficie;
    }

    public void setTipo(Superficie tipo) {
        this.tipoSuperficie = tipo;
    }

}
