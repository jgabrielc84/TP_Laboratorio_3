package ar.edu.cuvl.model;

import ar.edu.cuvl.exception.clienteException.ClienteMorosoException;
import ar.edu.cuvl.exception.pedidoException.PedidoInvalidoException;
import ar.edu.cuvl.interfaces.TipoServicio;
import ar.edu.cuvl.interfaces.TipoSuperficie;
import ar.edu.cuvl.model.tipoCliente.Classic;
import ar.edu.cuvl.model.tipoCliente.Economic;
import ar.edu.cuvl.model.tipoLimpieza.LimpiezaCompleja;
import ar.edu.cuvl.validator.ValidadorPedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    Empresa empresa;
    Cliente cliente;
    Pedido pedido;
    LimpiezaCompleja limpiezaCompleja;
    ArrayList<TipoSuperficie> tipoSuperficies;
    ValidadorPedido validadorPedido;
    Classic classic;

    @BeforeEach
    void setUp(){
        empresa = new Empresa();
        TipoServicio tipoServicio = new Economic();
        cliente = new Cliente(12345678,tipoServicio, 200F, LocalDate.now().minusDays(2));
        LimpiezaCompleja limpiezaCompleja=new LimpiezaCompleja();
        ArrayList<TipoSuperficie> tipoSuperficies=new ArrayList<>();
//        pedido=new Pedido(5,6655,"asas",limpiezaCompleja,true,tipoSuperficies);
        validadorPedido=new ValidadorPedido();
    }
    @Test
    void economicNoPuedeOrdenar() {
        assertThrows(PedidoInvalidoException.class , ()->this.validadorPedido.validarPedido(pedido));
    }

    @Test
    void ClienteEsMoroso() {
        classic = new Classic();
        cliente.setTipoServicio(classic);
        assertThrows(ClienteMorosoException.class,()->this.validadorPedido.esMoroso(cliente));
    }

    @Test
    void ingresarCliente(){

    }

    @Test
    void getAdministradorRobots() {
    }

    @Test
    void getAdministradorClientes() {
    }

    @Test
    void getAdministradorPedidos() {
    }

    @Test
    void getValidadorPedido() {
    }
}