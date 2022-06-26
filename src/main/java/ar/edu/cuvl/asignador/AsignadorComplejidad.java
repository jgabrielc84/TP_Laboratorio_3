package ar.edu.cuvl.asignador;

import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.tipoTarea.ComplejaTipo;
import ar.edu.cuvl.model.tipoTarea.LimpiezaCompleja;
import ar.edu.cuvl.model.tipoTarea.LimpiezaSimple;
import ar.edu.cuvl.model.tipoTarea.SimpleTipo;
import ar.edu.cuvl.model.LimpiezaOrdenamiento;
import ar.edu.cuvl.validator.ValidadorComplejidad;
import org.junit.jupiter.api.MethodOrderer;

import java.util.List;

public class AsignadorComplejidad {

    ValidadorComplejidad validadorComplejidad;


    public void asignarComplejidad(Pedido pedido){
        asignarComplejidadLimpieza(pedido);
        asignarComplejidadTarea(pedido.getServicioReparaciones());
    }


    public void asignarComplejidadLimpieza(Pedido pedido){
        for (LimpiezaOrdenamiento l: pedido.getLimpiezaOrdenamientos()) {

             if(validadorComplejidad.esLimpiezaSimple(l, pedido)) {

              l.setTipoComplejidadLimpieza(new LimpiezaSimple());
              l.setHorasTarea(1);
          } else {
                 l.setTipoComplejidadLimpieza(new LimpiezaCompleja());
                 l.setHorasTarea((int) (Math.random()*5+2));
             }
        }

    }

    public void asignarComplejidadTarea(List<ServicioReparacion> servicioReparacions){

        for (ServicioReparacion s: servicioReparacions) {

              if(validadorComplejidad.tareaEsSimple(s)){
                s.setTipoComplejidadReparacion(new SimpleTipo());
            } else {
                s.setTipoComplejidadReparacion(new ComplejaTipo());
            }
        }
    }
}
