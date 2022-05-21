package ar.edu.cuvl.model;

import ar.edu.cuvl.controller.AdministradorRobots;

import java.util.ArrayList;

public class AsignadorRobot {



    public ArrayList<Robot> armameLaListaDeRobotPorFa(Pedido pedido, ArrayList<Robot> robots){

        ArrayList<Robot> robotsAsignados = new ArrayList<>();
        ArrayList<Robot> robotsLimpieza = new ArrayList<>();
        ArrayList<Robot> robotsOrdenamiento = new ArrayList<>();

        //TODO lo que necesite hacer para crear la lista correspondiente al pedido
        for (Robot r: robots ) {
            if( pedido.getTipoLimpieza().equals(r.getTipoLimpieza())){
                robotsLimpieza.add(r);
            }
        }

        for (Robot r: robots ) {
            if( pedido.isOrdenamiento() && r.isOrdena()){
                robotsOrdenamiento.add(r);
            }
        }

        //TODO analizar las 2 listas para ver cuales son los robots mas economicos que cumplan con el pedido




        return robotsAsignados;
    }

}
