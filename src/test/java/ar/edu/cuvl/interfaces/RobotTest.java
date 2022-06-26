package ar.edu.cuvl.interfaces;

import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.tipoReparacion.Electricidad;
import ar.edu.cuvl.model.tipoReparacion.Gas;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static ar.edu.cuvl.model.type.Reparacion.ELECTRICIDAD;
import static ar.edu.cuvl.model.type.Reparacion.GAS;
import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    List<Pedido> pedidos;
    Pedido pedido1;
    Pedido pedido2;
    Pedido pedido3;
    ServicioReparacion reparacion1;
    LimpiezaOrdenamiento limpieza1;
    ServicioReparacion reparacion2;
    LimpiezaOrdenamiento limpieza2;
    ServicioReparacion reparacion3;
    LimpiezaOrdenamiento limpieza3;

    List<ServicioReparacion> reparaciones;
    List<LimpiezaOrdenamiento> limpiezas;

    TipoReparacion tipoRepa1;
    TipoReparacion tipoRepa2;
    TipoReparacion tipoRepa3;

    TipoComplejidadLimpieza tipoL



    @BeforeEach
    void setUp(){
        pedidos = new ArrayList<Pedido>();

        tipoRepa1 = new Gas();
        tipoRepa2 = new Electricidad();
        tipoRepa3 = new Gas();

        reparacion1 = new ServicioReparacion(tipoRepa1, 1);
        reparacion2 = new ServicioReparacion(tipoRepa2, 5);
        reparacion3 = new ServicioReparacion(tipoRepa3, 8);



        pedido1 = new Pedido();
        pedido2 = new Pedido();
        pedido3 = new Pedido();

    }

    @Test
    void procesarPedido() {

    }
}