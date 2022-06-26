package ar.edu.cuvl.model.robot;

import ar.edu.cuvl.interfaces.Robot;

import java.util.ArrayList;

public class P011H extends Robot {

    public P011H() {

        setCostoHora(1500);
        setOrdena(false);
        setSuperficies(new ArrayList<>());
        setLustra(true);
    }
}
