package ar.edu.cuvl.model.robot;

import ar.edu.cuvl.interfaces.Robot;

import java.util.ArrayList;

public class K311YFL extends Robot {
    public K311YFL() {
        setCostoHora(1000);
        setOrdena(false);
        setSuperficies(new ArrayList<>());
        setLustra(false);
    }
}
