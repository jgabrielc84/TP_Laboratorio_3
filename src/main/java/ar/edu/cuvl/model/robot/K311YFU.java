package ar.edu.cuvl.model.robot;

import ar.edu.cuvl.interfaces.Robot;

import java.util.ArrayList;

public class K311YFU extends Robot {

    public K311YFU() {
        setCostoHora(500);
        setOrdena(false);
        setSuperficies(new ArrayList<>());
        setLustra(true);
    }
}
