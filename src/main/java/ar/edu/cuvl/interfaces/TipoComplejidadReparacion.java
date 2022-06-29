package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.Empleado;
import ar.edu.cuvl.model.ServicioReparacion;

import java.util.List;

public interface TipoComplejidadReparacion {

    public float calcularCostoEmpleado(ServicioReparacion servicioReparacion);

}
