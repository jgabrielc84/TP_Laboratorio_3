package ar.edu.cuvl.controller;

import ar.edu.cuvl.model.Robot;

import java.util.ArrayList;

public class AdministradorRobots {

    private ArrayList<Robot> robots = new ArrayList<>();

    private ArrayList<Robot> robotsOcupados = new ArrayList<>();

    public ArrayList<Robot> getRobots() {
        return robots;
    }

    public ArrayList<Robot> getRobotsOcupados() {
        return robotsOcupados;
    }
}
