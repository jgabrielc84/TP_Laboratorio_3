package ar.edu.cuvl.model.robot;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.TipoSuperficie;
import ar.edu.cuvl.model.type.Superficie;

import java.util.ArrayList;

public class K311YFU extends Robot {

    public K311YFU() {
        super(500, false, false, new ArrayList<>(), new ArrayList<>());
        this.getSuperficies().add(new TipoSuperficie(Superficie.MUEBLE));
    }
}
