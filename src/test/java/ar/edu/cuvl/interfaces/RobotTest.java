package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.PedidosPrueba;
import ar.edu.cuvl.model.Pedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


class RobotTest {

    PedidosPrueba pedidosPrueba;
    Pedido pedido;
    List<Pedido> listaPedidos;

    @BeforeEach
    void setUp(){
        pedidosPrueba = PedidosPrueba.getInstance();

        listaPedidos = PedidosPrueba.getPedidos();
        pedido = listaPedidos.get(0);


    }

    @Test
    void procesarPedido(pedido) {



    }
}