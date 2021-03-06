package ar.edu.cuvl.validator;

import ar.edu.cuvl.asignador.AsignadorRobotEconomic;
import ar.edu.cuvl.exception.clienteException.ClienteMorosoException;
import ar.edu.cuvl.model.Cliente;
import ar.edu.cuvl.model.ModuloPago;
import ar.edu.cuvl.model.tipoCliente.Classic;
import ar.edu.cuvl.model.tipoCliente.Economic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorClienteTest {

    Cliente cliente;
    ValidadorCliente validadorCliente;


    @BeforeEach
    void setUp() {
        cliente=new Cliente(23232,new Classic(), LocalDateTime.now(),0,1);
        validadorCliente=new ValidadorCliente();
    }

    @Test
    void esMoroso() {
        ModuloPago.setMontoDeuda(3000);
        assertThrows(ClienteMorosoException.class,()->this.validadorCliente.esMoroso(cliente));
    }

    @Test
    void noEsMoroso() {
        ModuloPago.setMontoDeuda(0);
        assertDoesNotThrow(()->this.validadorCliente.esMoroso(cliente));
    }
}