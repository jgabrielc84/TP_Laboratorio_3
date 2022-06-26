package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.LimpiezaOrdenamiento;

import java.util.List;

public abstract class TipoComplejidadLimpieza {

    public abstract int calcularCostoRobots(List<Robot> robots, LimpiezaOrdenamiento tarea);


}