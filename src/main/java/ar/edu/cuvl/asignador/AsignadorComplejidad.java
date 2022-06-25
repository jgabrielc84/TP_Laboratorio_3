package ar.edu.cuvl.asignador;

import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.tipoTarea.TareaCompleja;
import ar.edu.cuvl.model.tipoTarea.TareaSimple;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;
import ar.edu.cuvl.validator.ValidadorComplejidad;

import java.util.List;

public class AsignadorComplejidad {

    ValidadorComplejidad validadorComplejidad;



    public void asignarComplejidadLimpieza(List<LimpiezaOrdenamiento> limpiezaOrdenamientos){
        for (LimpiezaOrdenamiento l: limpiezaOrdenamientos) {


             if(validadorComplejidad.esLimpiezaSimple(l)) {

              l.setTipoLimpieza(new TareaSimple());
          } else {
                 l.setTipoLimpieza(new TareaCompleja());
             }
        }

    }

    public void asignarComplejidadTarea(List<ServicioReparacion> servicioReparacions){

        for (ServicioReparacion s: servicioReparacions) {

              if(validadorComplejidad.tareaEsSimple(s)){
                s.setComplejidadTarea(new TareaSimple());
            } else {
                s.setComplejidadTarea(new TareaCompleja());
            }
        }
    }
}
