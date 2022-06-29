package ar.edu.cuvl.model.robot;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.type.TipoSuperficie;

import java.util.ArrayList;

public class P011H extends Robot {

    public P011H() {
        super(1500, false, true, new ArrayList<>(), new ArrayList<>());
        this.getSuperficies().add(TipoSuperficie.PISO);
    }
}
