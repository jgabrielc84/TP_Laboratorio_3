package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.TipoReparacion;
import ar.edu.cuvl.model.tipoReparacion.Electricidad;

public class FactoryTipoReparacionElectricidad {

    public TipoReparacion crearSimple(){
        return new Electricidad(2000);
    }

    public TipoReparacion crearMedia(){
        return new Electricidad(4573);
    }

    public TipoReparacion crearCompleja(){
        return new Electricidad(7359);
    }
}
