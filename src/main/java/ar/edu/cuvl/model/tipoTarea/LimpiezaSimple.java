package ar.edu.cuvl.model.tipoTarea;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.interfaces.TipoComplejidadLimpieza;
import ar.edu.cuvl.model.LimpiezaOrdenamiento;

public class LimpiezaSimple implements TipoComplejidadLimpieza {

    @Override
    public float calcularCostoRobots(LimpiezaOrdenamiento limpiezaOrdenamiento){
        float suma=0;

        for (Robot robot: limpiezaOrdenamiento.getRobots()){
            suma += robot.getCostoHora()*limpiezaOrdenamiento.getHorasLimpiezaOrdenamiento();
        }

        return suma;
    }
}
