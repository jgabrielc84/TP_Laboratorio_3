package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.exception.pedidoException.NoPuedeLimpiarException;
import ar.edu.cuvl.exception.pedidoException.NoPuedeOrdenarException;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.type.Servicio;

public abstract class TipoServicio {
    private Servicio tipo;
    private int deudaMaxima;

    public TipoServicio(Servicio tipo, int deudaMaxima) {
        this.tipo = tipo;
        this.deudaMaxima = deudaMaxima;
    }

    public Servicio getTipo() {
        return tipo;
    }

    public void setTipo(Servicio tipo) {
        this.tipo = tipo;
    }

    public int getDeudaMaxima() {
        return deudaMaxima;
    }

    public void setDeudaMaxima(int deudaMaxima) {
        this.deudaMaxima = deudaMaxima;
    }


   abstract public void puedeLimpiar(Pedido pedido) throws NoPuedeLimpiarException;
    abstract public void puedeOrdenar(Pedido pedido) throws NoPuedeOrdenarException;

}
