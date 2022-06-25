package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.Calculable;
import ar.edu.cuvl.interfaces.TipoLimpieza;
import ar.edu.cuvl.interfaces.TipoReparacion;
import ar.edu.cuvl.model.tipoTarea.TipoComplejidadReparacion;

public class ServicioReparacion implements Calculable {

    private TipoReparacion tipoReparacion;

    private int complejidad;
    private TipoComplejidadReparacion tipoComplejidadReparacion;
    private Empleado empleado;

    public ServicioReparacion(TipoReparacion tipoReparacion, int complejidad) {
        this.tipoReparacion = tipoReparacion;
        this.complejidad = complejidad;
    }

    public TipoReparacion getTipoReparacion() {
        return tipoReparacion;
    }

    public void setTipoReparacion(TipoReparacion tipoReparacion) {
        this.tipoReparacion = tipoReparacion;
    }

    public int getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(int complejidad) {
        this.complejidad = complejidad;
    }

    public TipoComplejidadReparacion getComplejidadTarea() {
        return tipoComplejidadReparacion;
    }

    public void setTipoComplejidadReparacion(TipoComplejidadReparacion tipoComplejidadReparacion) {
        this.tipoComplejidadReparacion = tipoComplejidadReparacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public float calcularPrecioFinal(Empleado empleado,ServicioReparacion servicioReparacion) {
     float costoReparacion=servicioReparacion.getTipoReparacion().costoSegunComplejidad(servicioReparacion.complejidad);
     float complejidad=servicioReparacion.complejidad;
     float horas = empleado.getSueldoBase()/160;
     float precioTotal=costoReparacion+horas*complejidad;
     return precioTotal ;

    }
}
