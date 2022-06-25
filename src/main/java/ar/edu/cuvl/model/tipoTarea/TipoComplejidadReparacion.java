package ar.edu.cuvl.model.tipoTarea;

import ar.edu.cuvl.model.ServicioReparacion;

import java.util.List;

public abstract class TipoComplejidadReparacion {
    public int calcularCostoEmpleados(List<ServicioReparacion> servicioReparacions){
        int suma=0;

        for (ServicioReparacion s: servicioReparacions) {
            int complejidadTarea=s.getComplejidad();
            suma += (s.getEmpleado().getSueldoBase() / 160) * complejidadTarea;
        }
        return suma;
    }

}
