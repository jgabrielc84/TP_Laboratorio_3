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

    public Pedido(int i, Limpieza compleja, boolean ordenamiento, ArrayList<TipoSuperficie> tipoSuperficies, Cliente cliente, String direccion) {
        this.
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
