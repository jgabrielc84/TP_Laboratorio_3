package ar.edu.cuvl.model.tipoTarea;


import ar.edu.cuvl.interfaces.TipoComplejidadReparacion;
import ar.edu.cuvl.model.ServicioReparacion;

import java.util.List;


public class ComplejaTipo extends TipoComplejidadReparacion {

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
