package ar.edu.cuvl.model.tipoTarea;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.interfaces.TipoComplejidadLimpieza;
import ar.edu.cuvl.model.LimpiezaOrdenamiento;

import java.util.List;

public class LimpiezaCompleja extends TipoComplejidadLimpieza {
    private final float factorAjuste=1000;


    @Override
    public int calcularCostoRobots(List<Robot> robots, LimpiezaOrdenamiento tarea) {
        int suma=0;
        for (Robot robot: robots){
            suma+=robot.getCostoHora()*tarea.getHorasTarea()*factorAjuste;
        }


        return suma;
    }
}
