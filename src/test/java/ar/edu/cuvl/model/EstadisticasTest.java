package ar.edu.cuvl.model;

import ar.edu.cuvl.model.tipoTarea.LimpiezaSimple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EstadisticasTest {

    Pedido pedido1;
    Pedido pedido2;
    Pedido pedido3;
    Pedido pedido4;

    LimpiezaOrdenamiento limpieza1;
    LimpiezaOrdenamiento limpieza2;
    LimpiezaOrdenamiento limpieza3;
    LimpiezaOrdenamiento limpieza4;

    ArrayList<Pedido> pedidos;

    Cliente cliente1;

    Empresa empresa;

    @BeforeEach
    void setup() {

        empresa = new Empresa();

        cliente1 = new Cliente();
        cliente1.setDni(32456456);

        pedido1 = new Pedido();
        pedido2 = new Pedido();
        pedido3 = new Pedido();
        pedido4 = new Pedido();

        limpieza1 = new LimpiezaOrdenamiento();
        limpieza1.setEsSimple(true);
        limpieza1.setTipoComplejidadLimpieza(new LimpiezaSimple());
        pedido1.getLimpiezaOrdenamientos().add(limpieza1);
        limpieza2 = new LimpiezaOrdenamiento();
        limpieza2.setEsSimple(true);
        pedido2.getLimpiezaOrdenamientos().add(limpieza2);
        limpieza3 = new LimpiezaOrdenamiento();
        limpieza3.setEsSimple(false);
        pedido3.getLimpiezaOrdenamientos().add(limpieza3);
        limpieza4 = new LimpiezaOrdenamiento();
        limpieza4.setEsSimple(true);
        pedido4.getLimpiezaOrdenamientos().add(limpieza4);

        pedido1.setCliente(cliente1);

        empresa.getAdministradorPedidos().getPedidosValidados().add(pedido1);
        empresa.getAdministradorPedidos().getPedidosValidados().add(pedido2);
        empresa.getAdministradorPedidos().getPedidosValidados().add(pedido3);
        empresa.getAdministradorPedidos().getPedidosValidados().add(pedido4);


    }

    @Test
    void mostrarEstadisticaLimpiezas() {
        empresa.mostrarEstadisticaLimpiezas();
    }

    @Test
    void mostrarCostoCliente() {
        empresa.mostrarCostoCliente(cliente1);
    }

    @Test
    void mostrarCostoPedido() {
    }
}