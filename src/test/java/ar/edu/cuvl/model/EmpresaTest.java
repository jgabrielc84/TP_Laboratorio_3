package ar.edu.cuvl.model;

import ar.edu.cuvl.controller.AdministradorRobots;
import ar.edu.cuvl.exception.PedidoInvalidoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    Empresa empresa;

    @BeforeEach
    void setUp(){
        empresa = new Empresa();

    }

    @Test
    void testValidarPedidoOk() {

    }

    @Test
    void testValidarPedidoError() {
        TipoServicio tipoServicio = new Economic();
        Cliente cliente1 = new Cliente(11111111,tipoServicio);

        empresa.ingresarCliente(cliente1);

        //Prueba Caso 1
        //Datos de Pedido
        Cliente cliente = empresa.getAdministradorClientes().buscarCliente(1);
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