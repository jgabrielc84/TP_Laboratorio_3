package ar.edu.cuvl.model.tipoReparacion;

import ar.edu.cuvl.interfaces.TipoReparacion;

public class Gas implements TipoReparacion {

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
