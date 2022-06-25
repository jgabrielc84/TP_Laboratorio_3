package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.Empleado;
import ar.edu.cuvl.model.ServicioReparacion;

import java.util.List;

public abstract class TipoComplejidadReparacion {
    public int calcularCostoEmpleados(Empleado empleado, int complejidadTarea) {

        int suma = 0;
        suma += (empleado.getSueldoBase() / 160) * complejidadTarea;

        return suma;
    }

}
