package ar.edu.cuvl.validator;

import ar.edu.cuvl.exception.clienteException.ClienteMorosoException;
import ar.edu.cuvl.model.Cliente;
import ar.edu.cuvl.model.tipoCliente.Economic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorClienteTest {

    Cliente cliente;
    ValidadorCliente validadorCliente


    @BeforeEach
    void setUp() {
        cliente=new Cliente(39999,new Economic(),600, LocalDate.now());
        validadorCliente=new ValidadorCliente();
    }

    @Test
    void esMoroso() {
        assertThrows(ClienteMorosoException.class,()->this.validadorCliente.esMoroso(cliente));
    }
}