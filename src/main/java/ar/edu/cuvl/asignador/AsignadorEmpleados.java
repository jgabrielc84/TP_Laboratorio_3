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
        int random = 0;
        Empleado[] arrayEmpleados = empleados.toArray(new Empleado[empleados.size()]);

        for(ServicioReparacion reparacion : pedido.getServicioReparaciones()){
            System.out.println(reparacion.getComplejidad());
            random = r.nextInt(empleados.size() - 0) + 0;
            reparacion.setEmpleado(arrayEmpleados[random]);
            arrayEmpleados[random].getPedidos().add(pedido);
        }
    }
}
