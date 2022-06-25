package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.Calculable;
import ar.edu.cuvl.interfaces.ComplejidadTarea;
import ar.edu.cuvl.interfaces.TipoReparacion;

public class ServicioReparacion implements Calculable {

    private TipoReparacion tipoReparacion;

    private int complejidad;
    private ComplejidadTarea complejidadTarea;
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

    public ComplejidadTarea getComplejidadTarea() {
        return complejidadTarea;
    }

    public void setComplejidadTarea(ComplejidadTarea complejidadTarea) {
        this.complejidadTarea = complejidadTarea;
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
