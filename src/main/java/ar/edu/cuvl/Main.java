package ar.edu.cuvl;

import ar.edu.cuvl.exception.pedidoException.PedidoInvalidoException;
import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.type.TipoSuperficie;
import ar.edu.cuvl.model.*;
import ar.edu.cuvl.model.robot.*;
import ar.edu.cuvl.model.tipoCliente.Classic;
import ar.edu.cuvl.model.tipoCliente.Economic;
import ar.edu.cuvl.model.tipoCliente.Platinum;
import ar.edu.cuvl.model.tipoReparacion.Electricidad;
import ar.edu.cuvl.model.tipoReparacion.Gas;
import ar.edu.cuvl.model.type.TipoResiduo;


import java.time.LocalDateTime;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        //Crear Clientes
//        TipoServicio tipoServicio = new Economic();
//        Cliente cliente1 = new Cliente(11111111,tipoServicio);

//        empresa.ingresarCliente(cliente1);


        //Prueba Caso 1
//        Datos de Pedido
//        Cliente cliente = empresa.getAdministradorClientes().buscarCliente(1);
//        boolean ordenamiento = true;
//        ArrayList <TipoSuperficie> tipoSuperficies = new ArrayList<>();
//        TipoSuperficie piso = new Piso();
//        TipoSuperficie mueble = new Mueble();
//        tipoSuperficies.add(piso);
//        tipoSuperficies.add(mueble);
//        String direccion = "Cordoba 1501";
//        TipoLimpieza tipoLimpieza = new ComplejaTipo();

        //Creo Pedido
//        Pedido pedido = new Pedido(1, cliente.getDni(), direccion, tipoLimpieza, ordenamiento, tipoSuperficies);
//        public Pedido(int numeroPedido, int numeroCliente, String direccion, TipoLimpieza tipoLimpieza, boolean ordenamiento, ArrayList<TipoSuperficie> superficies) {

//        try {
//           empresa.validarPedido(pedido);
//           empresa.getAdministradorPedidos().ingresarPedido(pedido, administradorRobots);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        TipoSuperficie tipoSuperficiePiso = TipoSuperficie.PISO;
        TipoSuperficie tipoSuperficieMueble = TipoSuperficie.MUEBLE;

        List<TipoSuperficie> superficies1 = Arrays.asList(tipoSuperficieMueble, tipoSuperficiePiso);
        List<TipoSuperficie> superficies2 = Arrays.asList(tipoSuperficiePiso);
        List<TipoSuperficie> superficies3 = Arrays.asList();

        LimpiezaOrdenamiento limpieza1 = new LimpiezaOrdenamiento(superficies3, TipoResiduo.POLVO, false);
        LimpiezaOrdenamiento limpieza2 = new LimpiezaOrdenamiento(superficies1, TipoResiduo.BARRO, true);
        LimpiezaOrdenamiento limpieza3 = new LimpiezaOrdenamiento(superficies2, TipoResiduo.BARRO, false);


        List<LimpiezaOrdenamiento> limpiezas1 = Arrays.asList(limpieza1, limpieza3);
        List<LimpiezaOrdenamiento> limpiezas2 = Arrays.asList(limpieza2, limpieza3);
        List<LimpiezaOrdenamiento> limpiezas3 = Arrays.asList();

        ServicioReparacion reparacion1 = new ServicioReparacion(1, new Gas(), 1);
        ServicioReparacion reparacion2 = new ServicioReparacion(2, new Electricidad(), 5);
        ServicioReparacion reparacion3 = new ServicioReparacion(3, new Gas(), 8);

        List<ServicioReparacion> reparaciones1 = Arrays.asList(reparacion1, reparacion2);
        List<ServicioReparacion> reparaciones2 = Arrays.asList();
        List<ServicioReparacion> reparaciones3 = Arrays.asList(reparacion1, reparacion2, reparacion3);

        Cliente cliente1 = new Cliente(11111111, new Economic(), LocalDateTime.of(2022, 1, 1, 6,6,30,1000), 1, 1 );
        Cliente cliente2 = new Cliente(22222222, new Classic(), LocalDateTime.of(2022, 3, 10, 6,6,30,1000), 5, 5 );
        Cliente cliente3 = new Cliente(33333333, new Platinum(), LocalDateTime.of(2022, 5, 20, 6,6,30,1000), 10, 10 );

        Pedido pedido1 = new Pedido(1, cliente1, "Argentina 100", 1, reparaciones1, limpiezas1);
        Pedido pedido2 = new Pedido(2, cliente2, "Brasil 220", 0, reparaciones2, limpiezas2);
        Pedido pedido3 = new Pedido(3, cliente3, "Uruguay 1111", 5, reparaciones3, limpiezas3);

        HashSet<Cliente> clientes = new HashSet<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        Robot k311YA = new K311YA();
        Robot k311YFL = new K311YFL();
        Robot k311YFU = new K311YFU();
        Robot s031RTY = new S031RTY();
        Robot p011H = new P011H();

        HashSet<Robot> robotsDisponibles = new HashSet<>();
        robotsDisponibles.add(p011H);
        robotsDisponibles.add(k311YA);
        robotsDisponibles.add(k311YFL);
        robotsDisponibles.add(s031RTY);
        robotsDisponibles.add(k311YFU);

        Empleado empleado1 = new Empleado(50000);

        HashSet<Empleado> empleados = new HashSet<>();
        empleados.add(empleado1);

        empresa.setClientes(clientes);
        empresa.setRobotsDisponibles(robotsDisponibles);
        empresa.setEmpleados(empleados);

        Pedido pedido = pedido1;

        try{
            empresa.ingresarPedido(pedido);
            System.out.println("Pedido: " + pedido.getNumeroPedido() + "\n");
            empresa.mostrarCostoReparaciones(empresa.solicitarPrecioFinalServicioReparacion(pedido.getNumeroPedido()));
        } catch (PedidoInvalidoException e){
            System.out.println("JE JE " + e.getMessage());
        }

    }


}
