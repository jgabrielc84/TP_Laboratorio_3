package ar.edu.cuvl.model.tipoTarea;

import ar.edu.cuvl.interfaces.ComplejidadTarea;
import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.Empleado;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.type.Limpieza;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;

import java.util.List;

public class TareaSimple extends ComplejidadTarea {

    public TareaSimple() {
        super(Limpieza.SIMPLE);
    }


    @Override
    public int calcularCostoRobots(List<Robot> robots){
        int suma=0;
        for (Robot robot: robots){
            suma+=robot.getCostoHora()*robot.getHorasTarea();
        }

        return suma;
    }
    public int calcularCostoEmpleados(List<ServicioReparacion> servicioReparacions){
        int suma=0;

        for (ServicioReparacion s: servicioReparacions) {
            int complejidadTarea=s.getComplejidad();
            suma += (s.getEmpleado().getSueldoBase() / 160) * complejidadTarea;
        }
        return suma;
    }


    //
    // @Override
   // public int sumarCostos(Pedido pedido) {

      //  return calcularCostoEmpleados(pedido.getServicioReparacions())+calcularCostoRobots(pedido.getLimpiezaOrdenamientos());
   // }

}
