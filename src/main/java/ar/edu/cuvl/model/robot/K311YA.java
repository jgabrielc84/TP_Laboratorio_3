package ar.edu.cuvl.model.robot;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.TipoSuperficie;
import ar.edu.cuvl.model.type.Superficie;

import java.util.ArrayList;

public class K311YA extends Robot {
    public K311YA() {
        super(5000, true, true, new ArrayList<>(), new ArrayList<>());
        this.getSuperficies().add(new TipoSuperficie(Superficie.PISO));
        this.getSuperficies().add(new TipoSuperficie(Superficie.MUEBLE));
    }
}
