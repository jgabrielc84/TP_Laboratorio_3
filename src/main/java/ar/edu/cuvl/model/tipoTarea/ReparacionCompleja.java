package ar.edu.cuvl.model.tipoTarea;


import ar.edu.cuvl.interfaces.TipoComplejidadReparacion;
import ar.edu.cuvl.model.ServicioReparacion;

import java.util.List;


public class ReparacionCompleja implements TipoComplejidadReparacion {

    public float calcularCostoEmpleado(ServicioReparacion servicioReparacion) {

        int complejidadTarea = servicioReparacion.getComplejidad();

        float resultado = (servicioReparacion.getEmpleado().getSueldoBase() / 160) * complejidadTarea;

        return resultado;
    }

}
