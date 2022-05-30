package ar.edu.cuvl.model;

import java.util.ArrayList;
import java.util.HashSet;

public abstract class Robot {

    private int id;
    private float costoHora;
    private boolean ordena;
    private ArrayList<TipoSuperficie> superficies;

    HashSet<Pedido> pedidos;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(float costoHora) {
        this.costoHora = costoHora;
    }

    public boolean isOrdena() {
        return ordena;
    }

    public void setOrdena(boolean ordena) {
        this.ordena = ordena;
    }

    public ArrayList<TipoSuperficie> getSuperficies() {
        return superficies;
    }

    public void setSuperficies(ArrayList<TipoSuperficie> superficies) {
        this.superficies = superficies;
    }

}
