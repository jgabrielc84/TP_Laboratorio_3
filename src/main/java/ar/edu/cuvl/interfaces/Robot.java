package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public abstract class Robot {

    private int id;
    private float costoHora;
    private boolean ordena;
    private boolean lustra;
    private List<TipoSuperficie> superficies;
    private List<Pedido> pedidos;



    public boolean isLustra() {
        return lustra;
    }

    public void setLustra(boolean lustra) {
        this.lustra = lustra;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

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

    public List<TipoSuperficie> getSuperficies() {
        return superficies;
    }

    public void setSuperficies(List<TipoSuperficie> superficies) {
        this.superficies = superficies;
    }

    public int pedidosPendientes(){
        return this.pedidos.size();
    }

    public void procesarPedido(Pedido pedido){
        for(LimpiezaOrdenamiento tarea : pedido.getLimpiezaOrdenamientos()){
            if(tarea.getRobot().equals(this)){
                pedido.getLimpiezaOrdenamientos().remove(tarea);
                System.out.println("TAREA TERMINADA");
            }
            finalizarPedido(pedido);
        }
    }

    private void finalizarPedido(Pedido pedido){
        if(pedido.getLimpiezaOrdenamientos().isEmpty()){
            System.out.println("PEDIDO COMPLETO");
        }
    }



}
