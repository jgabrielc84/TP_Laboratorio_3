package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.Empleado;
import ar.edu.cuvl.model.ServicioReparacion;

public interface Calculable {

    public float calcularPrecioFinal(Empleado empleado, ServicioReparacion servicioReparacion);
}
