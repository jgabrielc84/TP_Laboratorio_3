package ar.edu.cuvl;

import ar.edu.cuvl.model.*;
import ar.edu.cuvl.model.robot.K311YA;
import ar.edu.cuvl.model.type.Limpieza;
import ar.edu.cuvl.model.type.Superficie;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        //Crear Clientes en AdministradorClientes
        TipoServicio tipoServicio = new Economic();
        Cliente cliente1 = new Cliente(11111111,tipoServicio);

        empresa.ingresarCliente(cliente1);


        //Prueba Caso 1
        //Datos de Pedido
        Cliente cliente = administradorClientes.buscarCliente(1);
        boolean ordenamiento = true;
        ArrayList <Superficie> tipoSuperficies = new ArrayList<>();
        tipoSuperficies.add(Superficie.PISO);
        tipoSuperficies.add(Superficie.MUEBLE);
        String direccion = "Cordoba 1501";

        //Creo
        Pedido pedido = new Pedido(1, cliente.getDni(), direccion, Limpieza.COMPLEJA, ordenamiento, tipoSuperficies, cliente, );
        //public Pedido(int numeroPedido, int numeroCliente, String direccion, TipoLimpieza tipoLimpieza, boolean ordenamiento, ArrayList<TipoSuperficie> superficies) {


        try {
            empresa.validarPedido(Pedido);
            empresa.administradorPedidos.ingresarPedido(pedido);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
