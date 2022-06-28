package ar.edu.cuvl.model.robot;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.TipoSuperficie;
import ar.edu.cuvl.model.type.Superficie;

import java.util.ArrayList;

public class P011H extends Robot {

    public P011H() {
        super(1500, false, true, new ArrayList<>(), new ArrayList<>());
        this.getSuperficies().add(new TipoSuperficie(Superficie.PISO));
    }
}
