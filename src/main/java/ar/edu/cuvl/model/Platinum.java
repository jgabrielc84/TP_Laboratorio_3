package ar.edu.cuvl.model;

import ar.edu.cuvl.model.type.Servicio;

public class Platinum extends TipoServicio{

    public Platinum(int deudaMaxima) {
        super(Servicio.PLATINUM, deudaMaxima);
    }

}
