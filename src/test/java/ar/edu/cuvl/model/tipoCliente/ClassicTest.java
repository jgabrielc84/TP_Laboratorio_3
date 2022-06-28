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

    @BeforeEach
    void setUp() {
        cliente=new Cliente();
        cliente.setCantidadOrdenamientos(3);
        classic=new Classic();
        pedido=new Pedido(2,cliente,"asas",2,new ArrayList<>(),new ArrayList<>());
    }

    @Test
    void puedeOrdenar(){
        assertThrows(NoPuedeOrdenarException.class,()->this.classic.puedeOrdenar(pedido));
    }
}