package ar.edu.cuvl.model;

import java.util.ArrayList;

public class Empleado {

    private float sueldoBase;

    private ArrayList<Pedido> pedidos;

    public Empleado(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Empleado(float sueldoBase, ArrayList<Pedido> pedidos) {
        this.sueldoBase = sueldoBase;
        this.pedidos = pedidos;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }


}
