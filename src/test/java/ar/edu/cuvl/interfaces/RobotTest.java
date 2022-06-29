package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.InstanciaPedidosPrueba;
import ar.edu.cuvl.model.Pedido;
import org.junit.jupiter.api.BeforeEach;

import java.util.List;


class RobotTest {

    InstanciaPedidosPrueba instanciaPedidosPrueba;
    Pedido pedido;
    List<Pedido> listaPedidos;

    @BeforeEach
    void setUp(){
        instanciaPedidosPrueba = InstanciaPedidosPrueba.getInstance();

        listaPedidos = InstanciaPedidosPrueba.getPedidos();
        pedido = listaPedidos.get(0);


    }

}