package ar.edu.cuvl.model.tipoCliente;

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

    @BeforeEach
    void setUp() {
        cliente=new Cliente();
        cliente.setCantidadLimpiezas(2);
        economic=new Economic();
        pedido=new Pedido(2,cliente,"asas",2,new ArrayList<>(),new ArrayList<>());
        limpiezaOrdenamiento=new LimpiezaOrdenamiento(new ArrayList<>(), TipoResiduo.POLVO,true);
        limpiezaOrdenamientos=new ArrayList<>();
        limpiezaOrdenamientos.add(limpiezaOrdenamiento);
    }

    @Test
    void puedeLimpiar() {
        assertDoesNotThrow(()->this.economic.puedeLimpiar(pedido));
    }

    @Test
    void puedeOrdenar() {
        assertThrows(NoPuedeOrdenarException.class,()->this.economic.puedeOrdenar(pedido));
    }
}