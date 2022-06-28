package ar.edu.cuvl.asignador;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.Cliente;
import ar.edu.cuvl.model.LimpiezaOrdenamiento;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.TipoSuperficie;
import ar.edu.cuvl.model.robot.*;
import ar.edu.cuvl.model.type.Superficie;
import ar.edu.cuvl.model.type.TipoResiduo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AsignadorRobotPlatinumTest {

    HashSet<Robot> robotsDisponibles;
    K311YA k311YA;
    K311YFL k311YFL;
    K311YFU k311YFU;
    P011H p011H;
    S031RTY s031RTY;
    Pedido pedido;
    AsignadorRobotPlatinum asignadorRobotPlatinum;
    Cliente cliente;



    @BeforeEach
    void setUp() {
        robotsDisponibles=new HashSet<>();
        k311YA=new K311YA();
        k311YFL=new K311YFL();
        k311YFU=new K311YFU();
        s031RTY=new S031RTY();
        p011H=new P011H();
        cliente=new Cliente();
        Pedido pedido1=new Pedido();
        Pedido pedido2=new Pedido();
        Pedido pedido3=new Pedido();

        robotsDisponibles.add(k311YA);
        robotsDisponibles.add(k311YFL);
        robotsDisponibles.add(s031RTY);
        robotsDisponibles.add(p011H);
        robotsDisponibles.add(k311YFU);

        List<Pedido> pedidos=new ArrayList<>();
        pedidos.add(pedido1);
        pedidos.add(pedido2);

        Pedido pedido11=new Pedido();
        Pedido pedido22=new Pedido();
        Pedido pedido33=new Pedido();

        List<Pedido> pedidos1=new ArrayList<>();
        pedidos.add(pedido11);
        pedidos.add(pedido22);
        pedidos.add(pedido3);
        pedidos.add(pedido33);

        List<Pedido> pedidos2=new ArrayList<>();
        pedidos2.add(pedido1);

        k311YFU.setPedidos(pedidos);
        k311YA.setPedidos(pedidos1);
        k311YFL.setPedidos(pedidos);
        p011H.setPedidos(pedidos2);
        s031RTY.setPedidos(pedidos);

        asignadorRobotPlatinum=new AsignadorRobotPlatinum();
        List<TipoSuperficie> tipoSuperficies=new ArrayList<>();
        tipoSuperficies.add(new TipoSuperficie(Superficie.MUEBLE));
        tipoSuperficies.add(new TipoSuperficie(Superficie.PISO));
        List<TipoSuperficie> tipoSuperficies1=new ArrayList<>();
        tipoSuperficies1.add(new TipoSuperficie(Superficie.PISO));
        k311YFL.setSuperficies(tipoSuperficies);
        k311YA.setSuperficies(tipoSuperficies1);
        k311YFU.setSuperficies(tipoSuperficies);
        p011H.setSuperficies(tipoSuperficies);
        s031RTY.setSuperficies(tipoSuperficies);

        List<LimpiezaOrdenamiento> limpiezaOrdenamientos=new ArrayList<>();
        LimpiezaOrdenamiento limpiezaOrdenamiento=new LimpiezaOrdenamiento(tipoSuperficies, TipoResiduo.BARRO,true);
        LimpiezaOrdenamiento limpiezaOrdenamiento1=new LimpiezaOrdenamiento(tipoSuperficies,TipoResiduo.POLVO,false);
        limpiezaOrdenamientos.add(limpiezaOrdenamiento1);
        limpiezaOrdenamientos.add(limpiezaOrdenamiento);
        pedido=new Pedido(3,cliente,"calle falsa123",3,new ArrayList<>(),limpiezaOrdenamientos);


    }

    @Test
    void asignarRobots() {

        asignadorRobotPlatinum.asignarRobots(pedido,robotsDisponibles);
        for (LimpiezaOrdenamiento limpiezaOrdenamiento: pedido.getLimpiezaOrdenamientos()){
            for (Robot robot: limpiezaOrdenamiento.getRobot()){
                System.out.println(robot.getClass());
            }
        }

    }
}