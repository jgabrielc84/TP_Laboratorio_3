package ar.edu.cuvl;

import ar.edu.cuvl.controller.AdministradorRobots;
import ar.edu.cuvl.interfaces.TipoLimpieza;
import ar.edu.cuvl.interfaces.TipoServicio;
import ar.edu.cuvl.interfaces.TipoSuperficie;
import ar.edu.cuvl.model.*;
import ar.edu.cuvl.model.tipoCliente.Economic;
import ar.edu.cuvl.model.tipoLimpieza.LimpiezaCompleja;
import ar.edu.cuvl.model.tipoSuerficie.Mueble;
import ar.edu.cuvl.model.tipoSuerficie.Piso;

import java.util.ArrayList;

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
        TipoSuperficie piso = new Piso();
        TipoSuperficie mueble = new Mueble();
        tipoSuperficies.add(piso);
        tipoSuperficies.add(mueble);
        String direccion = "Cordoba 1501";
        TipoLimpieza tipoLimpieza = new LimpiezaCompleja();

        //Creo
        //Pedido pedido = new Pedido(1, cliente.getDni(), direccion, tipoLimpieza, ordenamiento, tipoSuperficies);
        //public Pedido(int numeroPedido, int numeroCliente, String direccion, TipoLimpieza tipoLimpieza, boolean ordenamiento, ArrayList<TipoSuperficie> superficies) {
        AdministradorRobots administradorRobots = new AdministradorRobots();

        try {
           // empresa.validarPedido(pedido);
          //  empresa.getAdministradorPedidos().ingresarPedido(pedido, administradorRobots);
        } catch (Exception e) {
            e.printStackTrace();
        }


        

    }
}
