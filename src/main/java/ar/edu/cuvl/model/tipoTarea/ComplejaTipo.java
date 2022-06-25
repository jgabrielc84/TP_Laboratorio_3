package ar.edu.cuvl.model.tipoTarea;


import ar.edu.cuvl.interfaces.TipoLimpieza;
import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.type.Limpieza;
import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;

import java.util.List;


public class ComplejaTipo extends TipoComplejidadReparacion {



    @Override
    public int calcularCostoEmpleados(List<ServicioReparacion> servicioReparacions) {
            int suma=0;

        for (ServicioReparacion s: servicioReparacions) {
            int complejidadTarea=s.getComplejidad();
            suma += (s.getEmpleado().getSueldoBase() / 160) * complejidadTarea;
        }
        return suma;
    }

    //@Override
   // public int sumarCostos(Pedido pedido) {

     //   return calcularCostoEmpleados(pedido.getServicioReparacions())+calcularCostoRobots(pedido.getLimpiezaOrdenamientos());

    //}
}
