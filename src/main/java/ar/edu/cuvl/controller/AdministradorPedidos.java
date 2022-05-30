package ar.edu.cuvl.controller;

import ar.edu.cuvl.exception.NoPuedeArmarListaRobotException;
import ar.edu.cuvl.exception.NoSePuedeAgregarAListaException;
import ar.edu.cuvl.exception.PedidoInvalidoException;
import ar.edu.cuvl.model.AsignadorRobot;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.Robot;
import ar.edu.cuvl.validator.ValidadorPedido;

import java.util.ArrayList;
import java.util.HashMap;

public class AdministradorPedidos {

    private HashMap<Pedido,ArrayList<Robot>> pedidosValidados;
    private ArrayList<Pedido> pedidosRechazados;
    private ValidadorPedido validadorPedido;
    private AsignadorRobot asignadorRobot;

    public HashMap<Pedido, ArrayList<Robot>> getPedidosValidados() {
        return pedidosValidados;
    }

    public ArrayList<Pedido> getPedidosRechazados() {
        return pedidosRechazados;
    }

    public void ingresarPedido(Pedido pedido, AdministradorRobots administradorRobots){

        try {
            this.validadorPedido.validarPedido(pedido);

            //*esto no va* //ArrayList<Robot> robots = this.asignadorRobot.armameLaListaDeRobotPorFa(pedido, administradorRobots);
            this.pedidosValidados.put(pedido, robots);
        }
        catch (PedidoInvalidoException e){
            //TODO: manejar la respuesta de excepcion
            this.pedidosRechazados.add(pedido);
        }
//        catch (NoPuedeArmarListaRobotException e){
//            this.pedidosRechazados.add(pedido);
//            //se guarda el error
//        }
//        catch (NoSePuedeAgregarAListaException e){
//            this.pedidosRechazados.add(pedido);
//            //se guarda el error
//        }
        catch (Exception e){
        }
    }

}
