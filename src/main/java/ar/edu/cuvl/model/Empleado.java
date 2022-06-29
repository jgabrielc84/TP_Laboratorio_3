package ar.edu.cuvl.model;

import java.util.ArrayList;
import java.util.HashSet;

public class Empleado {

    private float sueldoBase;
    private HashSet<Pedido> pedidos;


    public Empleado(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public Empleado(float sueldoBase, HashSet<Pedido> pedidos) {
        this.sueldoBase = sueldoBase;
        this.pedidos = pedidos;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public HashSet<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(HashSet<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
