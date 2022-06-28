package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.Calculable;
import ar.edu.cuvl.interfaces.TipoReparacion;
import ar.edu.cuvl.interfaces.TipoComplejidadReparacion;

public class ServicioReparacion implements Calculable {

    private int idReparacion;
    private TipoReparacion tipoReparacion;
    private int complejidad;
    private TipoComplejidadReparacion tipoComplejidadReparacion;
    private Empleado empleado;


    public ServicioReparacion(int idReparacion, TipoReparacion tipoReparacion, int complejidad) {
        this.idReparacion = idReparacion;
        this.tipoReparacion = tipoReparacion;
        this.complejidad = complejidad;
    }

    public int getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(int idReparacion) {
        this.idReparacion = idReparacion;
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
    public TipoComplejidadReparacion getTipoComplejidadReparacion() {
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
    public float calcularPrecioFinal() {
     float costoReparacion=this.getTipoReparacion().costoSegunComplejidad(this.complejidad);
     float complejidad=this.complejidad;
     float horas = this.getEmpleado().getSueldoBase()/160;
     return costoReparacion+horas*complejidad;
    }

}
