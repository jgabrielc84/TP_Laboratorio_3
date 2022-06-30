package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.interfaces.TipoComplejidadReparacion;
import ar.edu.cuvl.model.robot.P011H;
import ar.edu.cuvl.model.tipoTarea.LimpiezaCompleja;
import ar.edu.cuvl.model.tipoTarea.LimpiezaSimple;
import ar.edu.cuvl.model.tipoTarea.ReparacionCompleja;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EstadisticasTest {

    Pedido pedido1;
    Pedido pedido2;
    Pedido pedido3;
    Pedido pedido4;

    LimpiezaOrdenamiento limpieza1;
    LimpiezaOrdenamiento limpieza2;
    LimpiezaOrdenamiento limpieza3;
    LimpiezaOrdenamiento limpieza4;


    Cliente cliente1;

    Empresa empresa;
    List<Robot> robots;
    P011H p011H;
    Empleado empleado;
    LimpiezaSimple limpiezaSimple;

    @BeforeEach
    void setup() {

        empresa = new Empresa();

        cliente1 = new Cliente();
        cliente1.setDni(32456456);


        pedido1 = new Pedido();
        pedido2 = new Pedido();
        pedido3 = new Pedido();
        pedido4 = new Pedido();

        limpieza1 = new LimpiezaOrdenamiento();
        limpieza1.setEsSimple(true);
        limpiezaSimple=new LimpiezaSimple();
        limpieza1.setTipoComplejidadLimpieza(limpiezaSimple);
        limpieza1.setHorasLimpiezaOrdenamiento(1);
        pedido1.getLimpiezaOrdenamientos().add(limpieza1);

        limpieza2 = new LimpiezaOrdenamiento();
        limpieza2.setTipoComplejidadLimpieza(new LimpiezaCompleja());
        limpieza2.setEsSimple(true);
        pedido2.getLimpiezaOrdenamientos().add(limpieza2);
        limpieza3 = new LimpiezaOrdenamiento();
        limpieza3.setTipoComplejidadLimpieza(new LimpiezaCompleja());
        limpieza3.setEsSimple(false);
        pedido3.getLimpiezaOrdenamientos().add(limpieza3);
        limpieza4 = new LimpiezaOrdenamiento();
        limpieza4.setTipoComplejidadLimpieza(new LimpiezaSimple());
        limpieza4.setEsSimple(true);
        pedido4.getLimpiezaOrdenamientos().add(limpieza4);

        pedido1.setCliente(cliente1);
        pedido2.setCliente(cliente1);
        pedido3.setCliente(cliente1);
        pedido4.setCliente(cliente1);
        ServicioReparacion servicioReparacion=new ServicioReparacion();
        p011H=new P011H();

        empresa.getAdministradorPedidos().getPedidosValidados().add(pedido1);
        empresa.getAdministradorPedidos().getPedidosValidados().add(pedido2);
        empresa.getAdministradorPedidos().getPedidosValidados().add(pedido3);
        empresa.getAdministradorPedidos().getPedidosValidados().add(pedido4);
        robots=new ArrayList<>();
        robots.add(p011H);
        empleado=new Empleado(4000);
        ReparacionCompleja tipoComplejidadReparacion=new ReparacionCompleja();

        pedido1.getServicioReparaciones().add(servicioReparacion);
        pedido1.getLimpiezaOrdenamientos().get(0).setRobots(robots);
        pedido1.getServicioReparaciones().get(0).setEmpleado(empleado);
        pedido1.getServicioReparaciones().get(0).setTipoComplejidadReparacion(tipoComplejidadReparacion);
        pedido1.getServicioReparaciones().get(0).setComplejidad(3);



    }

    @Test
    void mostrarEstadisticaLimpiezas() {
        empresa.mostrarEstadisticaLimpiezas();
    }

    @Test
    void mostrarCostoCliente() {

            empresa.mostrarCostoCliente(cliente1);

    }

    @Test
    void mostrarCostoPedido() {

        empresa.mostrarCostoPedido(pedido1);
    }
}