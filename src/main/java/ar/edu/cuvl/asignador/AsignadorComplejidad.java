package ar.edu.cuvl.asignador;

import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.tipoTarea.ComplejaTipo;
import ar.edu.cuvl.model.tipoTarea.SimpleTipo;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;
import ar.edu.cuvl.validator.ValidadorComplejidad;

import java.util.List;

public class AsignadorComplejidad {

    ValidadorComplejidad validadorComplejidad;



    public void asignarComplejidadLimpieza(List<LimpiezaOrdenamiento> limpiezaOrdenamientos){
        for (LimpiezaOrdenamiento l: limpiezaOrdenamientos) {


             if(validadorComplejidad.esLimpiezaSimple(l)) {

              l.setTipoLimpieza(new SimpleTipo());
          } else {
                 l.setTipoLimpieza(new ComplejaTipo());
             }
        }

    }

    public void asignarComplejidadTarea(List<ServicioReparacion> servicioReparacions){

        for (ServicioReparacion s: servicioReparacions) {

              if(validadorComplejidad.tareaEsSimple(s)){
                s.setComplejidadTarea(new SimpleTipo());
            } else {
                s.setComplejidadTarea(new ComplejaTipo());
            }
        }
    }
}
