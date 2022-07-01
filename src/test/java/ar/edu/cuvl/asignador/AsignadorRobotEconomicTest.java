package ar.edu.cuvl.asignador;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.Cliente;
import ar.edu.cuvl.model.LimpiezaOrdenamiento;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.robot.*;
import ar.edu.cuvl.model.type.TipoResiduo;
import ar.edu.cuvl.model.type.TipoSuperficie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AsignadorRobotEconomicTest {

    HashSet<Robot> robotsDisponibles;
    K311YA k311YA;
    K311YFL k311YFL;
    K311YFU k311YFU;
    P011H p011H;
    S031RTY s031RTY;
    Pedido pedido;
    AsignadorRobotEconomic asignadorRobotEconomic;
    Cliente cliente;


    @BeforeEach
    void setUp() {
        robotsDisponibles = new HashSet<>();
        k311YA = new K311YA();
        k311YFL = new K311YFL();
        k311YFU = new K311YFU();
        s031RTY = new S031RTY();
        p011H = new P011H();
        cliente = new Cliente();
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        Pedido pedido3 = new Pedido();

        robotsDisponibles.add(p011H);
        robotsDisponibles.add(k311YA);
        robotsDisponibles.add(k311YFL);
        robotsDisponibles.add(s031RTY);
        robotsDisponibles.add(k311YFU);

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        Pedido pedido11 = new Pedido();
        Pedido pedido22 = new Pedido();
        Pedido pedido33 = new Pedido();

        List<Pedido> pedidos1 = new ArrayList<>();
        pedidos1.add(pedido11);
        pedidos1.add(pedido22);
        pedidos1.add(pedido3);
        pedidos1.add(pedido33);

        List<Pedido> pedidos2 = new ArrayList<>();
        pedidos2.add(pedido1);

        k311YA.setPedidos(pedidos1);
        k311YFU.setPedidos(pedidos);
        k311YFL.setPedidos(pedidos);
        p011H.setPedidos(pedidos2);
        s031RTY.setPedidos(pedidos);
        asignadorRobotEconomic=new AsignadorRobotEconomic();

        List<TipoSuperficie> tipoSuperficies = new ArrayList<>();
        tipoSuperficies.add(TipoSuperficie.MUEBLE);
        tipoSuperficies.add(TipoSuperficie.PISO);
        List<TipoSuperficie> tipoSuperficies1 = new ArrayList<>();
        tipoSuperficies1.add(TipoSuperficie.PISO);

        List<LimpiezaOrdenamiento> limpiezaOrdenamientos = new ArrayList<>();
        LimpiezaOrdenamiento limpiezaOrdenamiento = new LimpiezaOrdenamiento(tipoSuperficies, TipoResiduo.BARRO, true);
        LimpiezaOrdenamiento limpiezaOrdenamiento1 = new LimpiezaOrdenamiento(tipoSuperficies1, TipoResiduo.POLVO, false);
        limpiezaOrdenamientos.add(limpiezaOrdenamiento);
        limpiezaOrdenamientos.add(limpiezaOrdenamiento1);
        pedido = new Pedido(3, cliente, "calle falsa123", 3, new ArrayList<>(), limpiezaOrdenamientos);
    }

    @Test
    void asignarRobotsEconomic() {

        asignadorRobotEconomic.asignarRobots(pedido, robotsDisponibles);
        assertInstanceOf(P011H.class,pedido.getLimpiezaOrdenamientos().get(0).getRobots().get(1));

    }
}