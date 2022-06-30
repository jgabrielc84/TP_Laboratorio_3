package ar.edu.cuvl.asignador;

import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.tipoTarea.ReparacionCompleja;
import ar.edu.cuvl.model.tipoTarea.LimpiezaCompleja;
import ar.edu.cuvl.model.tipoTarea.LimpiezaSimple;
import ar.edu.cuvl.model.tipoTarea.ReparacionSimple;
import ar.edu.cuvl.model.LimpiezaOrdenamiento;
import ar.edu.cuvl.validator.ValidadorComplejidad;

import java.util.List;

public class AsignadorComplejidad {

    ValidadorComplejidad validadorComplejidad=new ValidadorComplejidad();


    public void asignarComplejidadLimpieza(Pedido pedido){
        for (LimpiezaOrdenamiento l: pedido.getLimpiezaOrdenamientos()) {

            if(validadorComplejidad.esLimpiezaSimple(l, pedido)) {
                l.setTipoComplejidadLimpieza(new LimpiezaSimple());
                l.setEsSimple(true);
                l.setHorasLimpiezaOrdenamiento(1);
            } else {
                l.setTipoComplejidadLimpieza(new LimpiezaCompleja());
                l.setEsSimple(false);
                l.setHorasLimpiezaOrdenamiento((int) (Math.random() * 4) + 2);
            }
        }
    }

    public void asignarComplejidadTarea(List<ServicioReparacion> servicioReparaciones){

        for (ServicioReparacion s: servicioReparaciones) {

            if(validadorComplejidad.tareaEsSimple(s)){
                s.setTipoComplejidadReparacion(new ReparacionSimple());
            } else {
                s.setTipoComplejidadReparacion(new ReparacionCompleja());
            }
        }
    }

    public void asignarComplejidad(Pedido pedido){
        asignarComplejidadLimpieza(pedido);
        asignarComplejidadTarea(pedido.getServicioReparaciones());
    }
}
