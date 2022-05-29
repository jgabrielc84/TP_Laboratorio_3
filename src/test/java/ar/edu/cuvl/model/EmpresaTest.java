package ar.edu.cuvl.model;

import ar.edu.cuvl.controller.AdministradorRobots;
import ar.edu.cuvl.exception.PedidoInvalidoException;
import ar.edu.cuvl.model.type.Limpieza;
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
    LimpiezaCompleja limpiezaCompleja;
    ArrayList<TipoSuperficie> tipoSuperficies;
    ValidadorPedido validadorPedido;

    @BeforeEach
    void setUp(){
        empresa = new Empresa();
        TipoServicio tipoServicio = new Economic();
        Cliente cliente1 = new Cliente(12345678,tipoServicio);


        empresa.ingresarCliente(cliente1);

        //Datos de Pedido
        this.cliente = empresa.getAdministradorClientes().buscarCliente(12345678);


    }

    @Test
    void testValidarPedidoOk() {

    }

    @Test
    void testNumeroPedidoError() {
        boolean ordenamiento = true;
        ArrayList<TipoSuperficie> tipoSuperficies = new ArrayList<>();
        TipoSuperficie piso = new Piso();
        TipoSuperficie mueble = new Mueble();
        tipoSuperficies.add(piso);
        tipoSuperficies.add(mueble);
        String direccion = "Cordoba 1501";
        TipoLimpieza tipoLimpieza = new LimpiezaCompleja();

        //Creo
        Pedido pedido = new Pedido(0, cliente.getDni(), direccion, tipoLimpieza, ordenamiento, tipoSuperficies);
        //public Pedido(int numeroPedido, int numeroCliente, String direccion, TipoLimpieza tipoLimpieza, boolean ordenamiento, ArrayList<TipoSuperficie> superficies) {

        assertThrows(PedidoInvalidoException.class, () -> empresa.validarPedido(pedido));


    }

    @Test
    void EconomicNoPuedeOrdenar() {
        validadorPedido=new ValidadorPedido();
        pedido=new Pedido(4,44,"asas",limpiezaCompleja,true,tipoSuperficies);
        assertThrows(PedidoInvalidoException.class,()->this.validadorPedido.validarPedido(pedido));

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