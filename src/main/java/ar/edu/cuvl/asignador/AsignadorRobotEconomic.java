package ar.edu.cuvl.asignador;

import ar.edu.cuvl.interfaces.AsignadorRobot;
import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.type.TipoSuperficie;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.LimpiezaOrdenamiento;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class AsignadorRobotEconomic implements AsignadorRobot {

    public void asignarRobots(Pedido pedido, HashSet<Robot> robotsDisponibles){

        for (LimpiezaOrdenamiento limpiezaOrdenamiento : pedido.getLimpiezaOrdenamientos() ) {

            List<Robot> robots = filtrarRobotsQueCumplenConLaTarea(limpiezaOrdenamiento, robotsDisponibles);

            limpiezaOrdenamiento.setRobots(robots);
        }
    }

    private List<Robot> filtrarRobotsQueCumplenConLaTarea(LimpiezaOrdenamiento limpiezaOrdenamiento, HashSet<Robot> robotsDisponibles){
        List<Robot> listaRobotsQueCumplenConLaTarea = new ArrayList<>();

        for (TipoSuperficie tipoSuperficie : limpiezaOrdenamiento.getTipoSuperficies()){
            listaRobotsQueCumplenConLaTarea.add( obtenerRobotSegunSuperficie( robotsDisponibles, tipoSuperficie ) );

        }

        if (limpiezaOrdenamiento.isOrdenamiento()){
            listaRobotsQueCumplenConLaTarea.add(obtenerRobotSegunOrdena(robotsDisponibles,limpiezaOrdenamiento.isOrdenamiento()));
        }

        return listaRobotsQueCumplenConLaTarea;
    }

    private Robot obtenerRobotSegunSuperficie( HashSet<Robot> robotsDisponibles, TipoSuperficie superficie) {
        HashSet<Robot> robots = new HashSet<>();

        for (Robot robot : robotsDisponibles) {
            for (TipoSuperficie tipoSuperficie : robot.getSuperficies()) {
                if (tipoSuperficie == superficie) {
                    robots.add(robot);
                }
            }
        }
        Robot robot = robots.stream().min(Comparator.comparing(Robot::pedidosPendientes)).get();

        return robot;
    }

    private Robot obtenerRobotSegunOrdena( HashSet<Robot> robotsDisponibles, boolean ordena){
        List<Robot> robots = robotsDisponibles.stream().filter(x->x.isOrdena()==ordena).collect(Collectors.toList());

        Robot robot = robots.stream().min( Comparator.comparing( Robot :: getCostoHora ) ).get();

        return robot;
    }

}
