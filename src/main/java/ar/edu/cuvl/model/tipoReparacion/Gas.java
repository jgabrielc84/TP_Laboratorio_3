package ar.edu.cuvl.model.tipoReparacion;

import ar.edu.cuvl.interfaces.TipoReparacion;
import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.type.Reparacion;

public class Gas extends TipoReparacion {

    @Override
    public float costoSegunComplejidad(int complejidad) {
        float precio=0;

        if (complejidad<3){
            precio=1000;
        }
        if (complejidad>=3  && complejidad<=6){

            precio=3530;
        }
        if (complejidad>6 && complejidad<9){
            precio=6389;
        }

        return precio;
    }

}
