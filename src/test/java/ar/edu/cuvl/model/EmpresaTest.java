package ar.edu.cuvl.model;

import ar.edu.cuvl.exception.pedidoException.PedidoInvalidoException;
import ar.edu.cuvl.interfaces.TipoServicio;
import ar.edu.cuvl.model.tipoCliente.Classic;
import ar.edu.cuvl.model.tipoCliente.Economic;
import ar.edu.cuvl.model.tipoTarea.ComplejaTipo;
import ar.edu.cuvl.model.type.Servicio;
import ar.edu.cuvl.validator.ValidadorCliente;
import ar.edu.cuvl.validator.ValidadorPedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    Empresa empresa;
    Cliente cliente;
    Pedido pedido;
    ComplejaTipo limpiezaCompleja;
    ArrayList<TipoSuperficie> tipoSuperficies;
    ValidadorCliente validadorCliente;
    ValidadorPedido validadorPedido;
    Classic classic;

    @BeforeEach
    void setUp(){
        empresa = new Empresa();
        TipoServicio tipoServicio = new Economic();
        cliente = new Cliente(12345678,tipoServicio, 200F, LocalDate.now().minusDays(2));
        ComplejaTipo limpiezaCompleja=new ComplejaTipo();
        ArrayList<TipoSuperficie> tipoSuperficies=new ArrayList<>();
//        pedido=new Pedido(5,6655,"asas",limpiezaCompleja,true,tipoSuperficies);
        validadorPedido=new ValidadorPedido();
    }
    @Test
    void economicNoPuedeOrdenar() {
        assertThrows(PedidoInvalidoException.class , ()->this.validadorPedido.validarPedido(pedido));
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
    @Test
    void getFecha(){
        System.out.println(LocalDateTime.now().compareTo(LocalDateTime.now().minusDays(15)));
    }
}