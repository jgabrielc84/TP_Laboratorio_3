package ar.edu.cuvl.model;

import ar.edu.cuvl.model.type.Servicio;

public class Economic extends TipoServicio{

    public Economic(int deudaMaxima) {
        super(Servicio.ECONOMIC, deudaMaxima);
    }
}
