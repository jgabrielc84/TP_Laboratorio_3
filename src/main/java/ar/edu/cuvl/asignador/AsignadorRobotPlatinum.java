package ar.edu.cuvl.asignador;

import ar.edu.cuvl.interfaces.AsignadorRobot;
import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.interfaces.TipoSuperficie;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;

import java.util.ArrayList;
import java.util.HashSet;

public class AsignadorRobotPlatinum implements AsignadorRobot {

    public void asignarRobots(Pedido pedido, HashSet<Robot> robotsDisponibles){

        //TODO: filtrar de la lista de pedidos las tareas de limpiezaOrdenamiento
        for (LimpiezaOrdenamiento limpiezaOrdenamiento : pedido.getLimpiezaOrdenamientos() ) {
            //TODO: por cada tarea limpiezaOrdenamiento voy a armar una lista de robots que cumple con la tarea
            ArrayList<Robot> robots = new ArrayList<>();
            filtrarRobotsQueCumplenConLaTarea(limpiezaOrdenamiento, robotsDisponibles);
            //TODO: Segun tipo asigna los robots correspondientes a limpiezaOrdenamiento
            limpiezaOrdenamiento.setRobot(robots);
        }

        //asigno robots de acuerdo al enunciado
    }

    private HashSet<Robot> filtrarRobotsQueCumplenConLaTarea(LimpiezaOrdenamiento limpiezaOrdenamiento, HashSet<Robot> robotsDisponibles){
        HashSet<Robot> listaRobotsQueCumplenConLaTarea = new HashSet<>();

        //TODO: recorrer las superficies de limpiezaOrdenamiento
        //TODO: Por cada superficie armar una lista de robots que cumplan con el tipo de superficie
        for (TipoSuperficie tipoSuperficie : limpiezaOrdenamiento.getTipoSuperficies()){

        }



        return listaRobotsQueCumplenConLaTarea;
    }

}
