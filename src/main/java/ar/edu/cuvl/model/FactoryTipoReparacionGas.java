package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.TipoReparacion;
import ar.edu.cuvl.model.tipoReparacion.Gas;

public class FactoryTipoReparacionGas {

    public TipoReparacion crearSimple(){
        return new Gas(1000);
    }

    public TipoReparacion crearMedia(){
        return new Gas(3530);
    }

    public TipoReparacion crearCompleja(){
        return new Gas(6389);
    }

}
