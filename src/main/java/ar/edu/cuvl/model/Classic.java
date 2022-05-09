package ar.edu.cuvl.model;

import ar.edu.cuvl.model.type.Servicio;

public class Classic extends TipoServicio{

    public Classic(int deudaMaxima) {
        super(Servicio.CLASSIC, deudaMaxima);
    }
}
