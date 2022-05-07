package ar.edu.cuvl.model;
import ar.edu.cuvl.model.type.Servicio;

public abstract class TipoSuperficie {
    private  Superficie tipo;


    public Superficie getTipo() {
        return tipo;
    }

    public void setTipo(Servicio tipo) {
        this.tipo = tipo;
    }


}
