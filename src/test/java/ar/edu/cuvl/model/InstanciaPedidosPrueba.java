package ar.edu.cuvl.model;

import ar.edu.cuvl.model.tipoCliente.Classic;
import ar.edu.cuvl.model.tipoCliente.Economic;
import ar.edu.cuvl.model.tipoCliente.Platinum;
import ar.edu.cuvl.model.tipoReparacion.Electricidad;
import ar.edu.cuvl.model.tipoReparacion.Gas;
import ar.edu.cuvl.model.type.TipoResiduo;
import ar.edu.cuvl.model.type.TipoSuperficie;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class InstanciaPedidosPrueba {

    private static InstanciaPedidosPrueba instanciaPedidosPrueba;
    private static List<Pedido> pedidos;

    public InstanciaPedidosPrueba() {
        crearPedidos();
    }

    public static InstanciaPedidosPrueba getInstance() {

        if(instanciaPedidosPrueba == null) {
            instanciaPedidosPrueba = new InstanciaPedidosPrueba();
        }

        return instanciaPedidosPrueba;
    }

    public static List<Pedido> getPedidos() {
        return pedidos;
    }

    private void crearPedidos(){

        TipoSuperficie tipoSuperficiePiso = TipoSuperficie.PISO;
        TipoSuperficie tipoSuperficieMueble = TipoSuperficie.MUEBLE;

        List<TipoSuperficie> superficies1 = Arrays.asList(tipoSuperficieMueble, tipoSuperficiePiso);
        List<TipoSuperficie> superficies2 = Arrays.asList(tipoSuperficiePiso);
        List<TipoSuperficie> superficies3 = Arrays.asList();

        LimpiezaOrdenamiento limpieza2 = new LimpiezaOrdenamiento(superficies1, TipoResiduo.BARRO, true);
        LimpiezaOrdenamiento limpieza3 = new LimpiezaOrdenamiento(superficies2, TipoResiduo.BARRO, false);
        LimpiezaOrdenamiento limpieza1 = new LimpiezaOrdenamiento(superficies3, TipoResiduo.POLVO, true);

        ServicioReparacion reparacion1 = new ServicioReparacion(1, new Gas(), 1);
        ServicioReparacion reparacion2 = new ServicioReparacion(2, new Electricidad(), 5);
        ServicioReparacion reparacion3 = new ServicioReparacion(3, new Gas(), 8);

        List<LimpiezaOrdenamiento> limpiezas1 = Arrays.asList(limpieza1, limpieza2, limpieza3);
        List<LimpiezaOrdenamiento> limpiezas2 = Arrays.asList(limpieza2, limpieza3);
        List<LimpiezaOrdenamiento> limpiezas3 = Arrays.asList();

        List<ServicioReparacion> reparaciones1 = Arrays.asList(reparacion1, reparacion2, reparacion3);
        List<ServicioReparacion> reparaciones2 = Arrays.asList();
        List<ServicioReparacion> reparaciones3 = Arrays.asList(reparacion3);

        Cliente cliente1 = new Cliente(11111111, new Economic(), LocalDateTime.of(2022, 1, 1, 6,6,30,1000), 1, 1 );
        Cliente cliente2 = new Cliente(22222222, new Classic(), LocalDateTime.of(2022, 3, 10, 6,6,30,1000), 5, 5 );
        Cliente cliente3 = new Cliente(33333333, new Platinum(), LocalDateTime.of(2022, 5, 20, 6,6,30,1000), 10, 10 );

        Pedido pedido1 = new Pedido(1, cliente1, "Argentina 100", 1, reparaciones1, limpiezas1);
        Pedido pedido2 = new Pedido(2, cliente2, "Brasil 220", 0, reparaciones2, limpiezas2);
        Pedido pedido3 = new Pedido(3, cliente3, "Uruguay 1111", 5, reparaciones3, limpiezas3);

        InstanciaPedidosPrueba.pedidos.add(pedido1);
        InstanciaPedidosPrueba.pedidos.add(pedido2);
        InstanciaPedidosPrueba.pedidos.add(pedido3);
    }
}
