package ar.edu.cuvl.asignador;

import ar.edu.cuvl.model.Empleado;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.ServicioReparacion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class AsignadorEmpleados {

    public void asignarEmpleado(Pedido pedido, HashSet<Empleado> empleados){
        Random r = new Random();
        int random;
        Empleado[] arrayEmpleados = empleados.toArray(new Empleado[empleados.size()]);

        for(ServicioReparacion reparacion : pedido.getServicioReparaciones()){
            random = r.nextInt(empleados.size());
            reparacion.setEmpleado(arrayEmpleados[random]);
            arrayEmpleados[random].getPedidos().add(pedido);
        }
    }
}
