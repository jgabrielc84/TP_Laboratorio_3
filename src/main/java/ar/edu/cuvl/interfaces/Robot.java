package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.LimpiezaOrdenamiento;
import ar.edu.cuvl.model.type.TipoSuperficie;

import java.util.List;

public abstract class Robot {

    private int id;
    private float costoHora;
    private boolean ordena;
    private boolean lustra;
    private List<TipoSuperficie> superficies;
    private List<Pedido> pedidos;


    public Robot(){

    }

    public Robot( float costoHora, boolean ordena, boolean lustra, List<TipoSuperficie> superficies, List<Pedido> pedidos) {
        this.costoHora = costoHora;
        this.ordena = ordena;
        this.lustra = lustra;
        this.superficies = superficies;
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

    public boolean isLustra() {
        return lustra;
    }

    public void setLustra(boolean lustra) {
        this.lustra = lustra;
    }

    public List<TipoSuperficie> getSuperficies() {
        return superficies;
    }

    public void setSuperficies(List<TipoSuperficie> superficies) {
        this.superficies = superficies;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public int pedidosPendientes() {
        return this.pedidos.size();
    }

    public void procesarPedido(int numeroPedido) {
        Pedido pedido = buscarPedido(numeroPedido);

        for (LimpiezaOrdenamiento tarea : pedido.getLimpiezaOrdenamientos()) {
            if (tarea.getRobots().contains(this)) {

                pedido.getLimpiezaOrdenamientos().remove(tarea);

                System.out.println("TAREA TERMINADA");
            }
        }

        this.pedidos.remove(pedido);

    }

   private Pedido buscarPedido(int numeroPedido){
        Pedido pedidoResultado = new Pedido();

        for ( Pedido pedido : this.pedidos ){
            if(pedido.getNumeroPedido() == numeroPedido){
                pedidoResultado = pedido;
            }
        }

        return pedidoResultado;
    }

}
