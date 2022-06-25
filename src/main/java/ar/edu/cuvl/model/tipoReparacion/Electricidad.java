package ar.edu.cuvl.model.tipoReparacion;

import ar.edu.cuvl.interfaces.TipoReparacion;
import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.type.Reparacion;

public class Electricidad extends TipoReparacion {




    @Override
    public float costoSegunComplejidad(int complejidad) {
        float precio=0;

        if (complejidad<3){
            precio=2000;
        }
        if (complejidad>=3  && complejidad<=6){

            precio=4573;
        }
        if (complejidad>6 && complejidad<9){
            precio=7359;
        }

        return precio;
    }
}
