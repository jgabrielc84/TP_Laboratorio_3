package ar.edu.cuvl.asignador;

import ar.edu.cuvl.interfaces.AsignadorRobot;
import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.interfaces.TipoSuperficie;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;
import ar.edu.cuvl.model.type.Superficie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class AsignadorRobotEconomic implements AsignadorRobot {

    public void asignarRobots(Pedido pedido, HashSet<Robot> robotsDisponibles){

        //TODO: filtrar de la lista de pedidos las tareas de limpiezaOrdenamiento
        for (LimpiezaOrdenamiento limpiezaOrdenamiento : pedido.getLimpiezaOrdenamientos() ) {
            //TODO: por cada tarea limpiezaOrdenamiento voy a armar una lista de robots que cumple con la tarea
            List<Robot> robots = new ArrayList<>();
            robots=filtrarRobotsQueCumplenConLaTarea(limpiezaOrdenamiento, robotsDisponibles);
            //TODO: Segun tipo asigna los robots correspondientes a limpiezaOrdenamiento
            limpiezaOrdenamiento.setRobot(robots);

        }

    }

    private List<Robot> filtrarRobotsQueCumplenConLaTarea(LimpiezaOrdenamiento limpiezaOrdenamiento, HashSet<Robot> robotsDisponibles){
        List<Robot> listaRobotsQueCumplenConLaTarea = new ArrayList<>();
        for (TipoSuperficie tipoSuperficie : limpiezaOrdenamiento.getTipoSuperficies()){
            listaRobotsQueCumplenConLaTarea.add(robotSuperficie(robotsDisponibles,tipoSuperficie.getTipo()));

        }
        if (limpiezaOrdenamiento.isOrdenamiento()){
            listaRobotsQueCumplenConLaTarea.add(robotOrdena(robotsDisponibles,limpiezaOrdenamiento.isOrdenamiento()));
        }

        return listaRobotsQueCumplenConLaTarea;
    }

    private  Robot robotSuperficie( HashSet<Robot> robotsDisponibles, Superficie superficie){
        Robot robot;

        List<Robot> robots= robotsDisponibles.stream().filter(x->x.getSuperficies().contains(superficie)).collect(Collectors.toList());
        robot=robots.stream().min(Comparator.comparing(Robot::pedidosPendientes)).get();

        return robot;
    }

    private Robot robotOrdena( HashSet<Robot> robotsDisponibles,boolean ordena){
        List<Robot> robots=new ArrayList<>();

        robots= robotsDisponibles.stream().filter(x->x.isOrdena()==ordena).collect(Collectors.toList());
        Robot robot=robots.stream().min(Comparator.comparing(Robot::getCostoHora)).get();
        return robot;

    }

}
