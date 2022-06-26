package ar.edu.cuvl.model.robot;

import ar.edu.cuvl.interfaces.Robot;

import java.util.ArrayList;

public class K311YA extends Robot {
    public K311YA() {
        setCostoHora(5000);
        setOrdena(true);
        setSuperficies(new ArrayList<>());
        setLustra(true);
    }
}
