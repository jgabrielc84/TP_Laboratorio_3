package ar.edu.cuvl.model;

import ar.edu.cuvl.model.type.Limpieza;

import java.util.ArrayList;

public class Pedido {

    private int numeroPedido;
    private int numeroCliente;
    private String direccion;
    private TipoLimpieza tipoLimpieza;
    private boolean ordenamiento;
    private ArrayList <TipoSuperficie> superficies;

    public Pedido(int numeroPedido, int numeroCliente, String direccion, TipoLimpieza tipoLimpieza, boolean ordenamiento, ArrayList<TipoSuperficie> superficies) {
        this.numeroPedido = numeroPedido;
        this.numeroCliente = numeroCliente;
        this.direccion = direccion;
        this.tipoLimpieza = tipoLimpieza;
        this.ordenamiento = ordenamiento;
        this.superficies = superficies;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoLimpieza getTipoLimpieza() {
        return tipoLimpieza;
    }

    public void setTipoLimpieza(TipoLimpieza tipoLimpieza) {
        this.tipoLimpieza = tipoLimpieza;
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
}
