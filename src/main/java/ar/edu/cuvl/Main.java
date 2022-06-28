package ar.edu.cuvl;

import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.interfaces.TipoServicio;
import ar.edu.cuvl.model.TipoSuperficie;
import ar.edu.cuvl.model.*;
import ar.edu.cuvl.model.robot.K311YFU;
import ar.edu.cuvl.model.robot.P011H;
import ar.edu.cuvl.model.tipoCliente.Economic;
import ar.edu.cuvl.model.type.Superficie;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {


    public static void main(String[] args) {



        Empresa empresa = new Empresa();

        //Crear Clientes en AdministradorClientes
        TipoServicio tipoServicio = new Economic();
//        Cliente cliente1 = new Cliente(11111111,tipoServicio);

//        empresa.ingresarCliente(cliente1);


        //Prueba Caso 1
        //Datos de Pedido
       // Cliente cliente = empresa.getAdministradorClientes().buscarCliente(1);
        boolean ordenamiento = true;
        ArrayList <TipoSuperficie> tipoSuperficies = new ArrayList<>();
       // TipoSuperficie piso = new Piso();
        //TipoSuperficie mueble = new Mueble();
      //  tipoSuperficies.add(piso);
       // tipoSuperficies.add(mueble);
        String direccion = "Cordoba 1501";
//        TipoLimpieza tipoLimpieza = new ComplejaTipo();

        //Creo
       // Pedido pedido = new Pedido(1, cliente.getDni(), direccion, tipoLimpieza, ordenamiento, tipoSuperficies);
        //public Pedido(int numeroPedido, int numeroCliente, String direccion, TipoLimpieza tipoLimpieza, boolean ordenamiento, ArrayList<TipoSuperficie> superficies) {

        try {
           // empresa.validarPedido(pedido);
            //empresa.getAdministradorPedidos().ingresarPedido(pedido, administradorRobots);
        } catch (Exception e) {
            e.printStackTrace();
        }

        K311YFU k311YFU=new K311YFU();
        List<Pedido> pedidos=new ArrayList<>();
        Pedido pedido=new Pedido();
        Pedido pedido1=new Pedido();
        List<Pedido> pedidos1=new ArrayList<>();
        pedidos1.add(pedido);
        pedidos.add(pedido);
        pedidos.add(pedido1);
        k311YFU.setPedidos(pedidos);
        System.out.println(k311YFU.pedidosPendientes());

        P011H p011H=new P011H();
        p011H.setPedidos(pedidos1);


        List<Robot> robots=new ArrayList<>();
        robots.add(p011H);
        robots.add(k311YFU);
        Robot robot=robots.stream().min(Comparator.comparing(Robot::pedidosPendientes)).get();
        System.out.println(robot.getClass());
        TipoSuperficie tipoSuperficie=new TipoSuperficie(Superficie.PISO);


        

    }
}
