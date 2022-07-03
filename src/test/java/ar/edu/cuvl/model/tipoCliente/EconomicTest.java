package ar.edu.cuvl.model.tipoCliente;

import ar.edu.cuvl.exception.pedidoException.NoPuedeLimpiarException;
import ar.edu.cuvl.exception.pedidoException.NoPuedeOrdenarException;
import ar.edu.cuvl.model.Cliente;
import ar.edu.cuvl.model.LimpiezaOrdenamiento;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.type.TipoResiduo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EconomicTest {

    Cliente cliente;
    Economic economic;
    Pedido pedido;
    List<LimpiezaOrdenamiento> limpiezaOrdenamientos;
    LimpiezaOrdenamiento limpiezaOrdenamiento;
    Cliente cliente1;
    Pedido pedido1;

    @BeforeEach
    void setUp() {
        cliente=new Cliente();
        cliente.setCantidadLimpiezas(2);
        economic=new Economic();
        pedido=new Pedido(2,cliente,"asas",2,new ArrayList<>(),new ArrayList<>());
        limpiezaOrdenamiento=new LimpiezaOrdenamiento(new ArrayList<>(), TipoResiduo.POLVO,true);
        limpiezaOrdenamientos=new ArrayList<>();
        limpiezaOrdenamientos.add(limpiezaOrdenamiento);
        cliente1=new Cliente();
        cliente1.setCantidadLimpiezas(3);
        pedido1=new Pedido(3,cliente1,"ñañañ",1,new ArrayList<>(),new ArrayList<>());
    }

    @Test
    void puedeLimpiar() {
        assertDoesNotThrow(()->this.economic.puedeLimpiar(pedido));
    }

    @Test
    void noPuedeOrdenar() {
        assertThrows(NoPuedeOrdenarException.class,()->this.economic.puedeOrdenar(pedido));
    }

    @Test
    void noPuedeLimpiar() {

    assertThrows(NoPuedeLimpiarException.class,()->this.economic.puedeLimpiar(pedido1));
}
}