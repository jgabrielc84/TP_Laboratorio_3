package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.Empleado;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.type.Limpieza;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;

import java.util.List;

public abstract class ComplejidadTarea {

    private Limpieza tipoLimpieza;


    public ComplejidadTarea(Limpieza tipo) {
        this.tipoLimpieza = tipo;
    }

    public Limpieza getTipo() {
        return tipoLimpieza;
    }

    public Limpieza getTipoLimpieza() {
        return tipoLimpieza;
    }

    public void setTipoLimpieza(Limpieza tipoLimpieza) {
        this.tipoLimpieza = tipoLimpieza;
    }


    public abstract int calcularCostoRobots(List<Robot> robots);

    public abstract int calcularCostoEmpleados(List<ServicioReparacion> servicioReparacions);
    //public abstract int sumarCostos(Pedido pedido);}
}