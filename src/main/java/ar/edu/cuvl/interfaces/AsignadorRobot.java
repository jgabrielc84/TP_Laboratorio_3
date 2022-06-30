package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.Pedido;
import java.util.HashSet;

public interface AsignadorRobot {

    void asignarRobots(Pedido pedido, HashSet<Robot> robotsDisponibles);

}
