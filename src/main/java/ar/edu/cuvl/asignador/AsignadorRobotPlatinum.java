package ar.edu.cuvl.asignador;

import ar.edu.cuvl.interfaces.AsignadorRobot;
import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.TipoSuperficie;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.LimpiezaOrdenamiento;
import ar.edu.cuvl.model.type.Superficie;

import java.util.*;
import java.util.stream.Collectors;

public class AsignadorRobotPlatinum implements AsignadorRobot {

    public void asignarRobots(Pedido pedido, HashSet<Robot> robotsDisponibles){

        for (LimpiezaOrdenamiento limpiezaOrdenamiento : pedido.getLimpiezaOrdenamientos() ) {

            List<Robot> robots = filtrarRobotsQueCumplenConLaTarea(limpiezaOrdenamiento, robotsDisponibles);

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
        Robot robot=robots.stream().min(Comparator.comparing(Robot::pedidosPendientes)).get();
        return robot;

    }

}
