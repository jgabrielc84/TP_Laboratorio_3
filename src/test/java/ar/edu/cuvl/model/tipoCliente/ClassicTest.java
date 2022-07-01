package ar.edu.cuvl.model.tipoCliente;

import ar.edu.cuvl.exception.pedidoException.NoPuedeOrdenarException;
import ar.edu.cuvl.model.Cliente;
import ar.edu.cuvl.model.Pedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClassicTest {

    Cliente cliente;
    Classic classic;
    Pedido pedido;
    Pedido pedido1;
    Cliente cliente1;

    @BeforeEach
    void setUp() {
        cliente=new Cliente();
        cliente.setCantidadOrdenamientos(3);
        classic=new Classic();
        cliente1=new Cliente();
        cliente1.setCantidadOrdenamientos(2);
        pedido=new Pedido(2,cliente,"asas",2,new ArrayList<>(),new ArrayList<>());
        pedido1=new Pedido(3,cliente1,"ñañañ",2,new ArrayList<>(),new ArrayList<>());
    }

    @Test
    void noPuedeOrdenar(){
        assertThrows(NoPuedeOrdenarException.class,()->this.classic.puedeOrdenar(pedido));
    }

    @Test
    void puedeOrdenar(){
        assertDoesNotThrow(()->this.classic.puedeOrdenar(pedido1));
    }

}