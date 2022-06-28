package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.exception.pedidoException.NoPuedeLimpiarException;
import ar.edu.cuvl.exception.pedidoException.NoPuedeOrdenarException;
import ar.edu.cuvl.model.Pedido;

public abstract class TipoServicio {

    private int deudaMaxima;
    private AsignadorRobot asignadorRobot;


    public TipoServicio(int deudaMaxima, AsignadorRobot asignadorRobot) {
        this.deudaMaxima = deudaMaxima;
        this.asignadorRobot = asignadorRobot;
    }

    public int getDeudaMaxima() {
        return deudaMaxima;
    }

    public AsignadorRobot getAsignadorRobot() {
        return asignadorRobot;
    }

    abstract public void puedeLimpiar(Pedido pedido) throws NoPuedeLimpiarException;

    abstract public void puedeOrdenar(Pedido pedido) throws NoPuedeOrdenarException;

}
