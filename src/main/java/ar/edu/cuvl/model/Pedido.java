package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.TipoLimpieza;
import ar.edu.cuvl.interfaces.TipoResiduo;
import ar.edu.cuvl.interfaces.TipoSuperficie;

import java.util.ArrayList;

public abstract class Pedido {

    private int numeroPedido;
    private Cliente cliente;
    private Domicilio domicilio;
    private boolean ordenamiento;
    private TipoResiduo tipoResiduo;
    private ArrayList <TipoSuperficie> superficies;



    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public boolean isOrdenamiento() {
        return ordenamiento;
    }

    public void setOrdenamiento(boolean ordenamiento) {
        this.ordenamiento = ordenamiento;
    }

    public ArrayList<TipoSuperficie> getSuperficies() {
        return superficies;
    }

    public void setSuperficies(ArrayList<TipoSuperficie> superficies) {
        this.superficies = superficies;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public TipoResiduo getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(TipoResiduo tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }
}
