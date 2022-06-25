package ar.edu.cuvl.model.tipoTarea;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.interfaces.TipoComplejidadLimpieza;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;

import java.util.List;

public class LimpiezaSimple extends TipoComplejidadLimpieza {

    @Override
    public int calcularCostoRobots(List<Robot> robots, LimpiezaOrdenamiento tarea){
        int suma=0;
        for (Robot robot: robots){
            suma+=robot.getCostoHora()*tarea.getHorasTarea();
        }

        return suma;
    }
}
