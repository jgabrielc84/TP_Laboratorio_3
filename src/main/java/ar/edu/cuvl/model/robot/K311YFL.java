package ar.edu.cuvl.model.robot;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.TipoSuperficie;
import ar.edu.cuvl.model.type.Superficie;

import java.util.ArrayList;

public class K311YFL extends Robot {
    public K311YFL() {
        super(1000, false, false, new ArrayList<>(), new ArrayList<>());
        this.getSuperficies().add(new TipoSuperficie(Superficie.PISO));
    }
}
