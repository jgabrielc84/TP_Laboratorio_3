package ar.edu.cuvl.model;

import ar.edu.cuvl.controller.AdministradorRobots;
import ar.edu.cuvl.exception.PedidoInvalidoException;
import ar.edu.cuvl.validator.ValidadorPedido;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    Empresa empresa;
    Cliente cliente;
    Pedido pedido;
    LimpiezaCompleja limpiezaCompleja=new LimpiezaCompleja();
    ArrayList<TipoSuperficie> tipoSuperficies;
    ValidadorPedido validadorPedido=new ValidadorPedido();

    @BeforeEach
    void setUp(){
        empresa = new Empresa();
        TipoServicio tipoServicio = new Economic();
        Cliente cliente1 = new Cliente(12345678,tipoServicio);

        empresa.ingresarCliente(cliente1);
        tipoSuperficies=new ArrayList<>();




        //Datos de Pedido
        this.cliente = empresa.getAdministradorClientes().buscarCliente(12345678);


    }

    @Test
    void testValidarPedidoOk() {

    }

    @Test
    void economicNoPuedeOrdenar() {
        pedido=new Pedido(5,6655,"asas",limpiezaCompleja,true,tipoSuperficies);
        assertThrows(PedidoInvalidoException.class , ()->this.validadorPedido.validarPedido(pedido));


    }

    @Test
    void ingresarPedido() {
    }

    @Test
    void ingresarCliente() {
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