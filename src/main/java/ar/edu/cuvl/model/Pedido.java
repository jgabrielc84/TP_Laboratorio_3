package ar.edu.cuvl.model;

import java.util.ArrayList;

public class Pedido {

    private int numeroPedido;
    private int numeroCliente;
    private String direccion;
    private TipoLimpieza tipoLimpieza;
    private boolean ordenamiento;
    private ArrayList <TipoSuperficie> superficies;


    public int getNumeroPedido() {
        return numeroPedido;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public TipoLimpieza getTipoLimpieza() {
        return tipoLimpieza;
    }

    public boolean isOrdenamiento() {
        return ordenamiento;
    }

    public ArrayList<TipoSuperficie> getSuperficies() {
        return superficies;
    }
}
