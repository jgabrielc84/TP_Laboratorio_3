package ar.edu.cuvl.validator;

import ar.edu.cuvl.interfaces.TipoResiduo;
import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;

import static ar.edu.cuvl.interfaces.TipoResiduo.BARRO;

public class ValidadorComplejidad {

    public boolean esLimpiezaSimple(LimpiezaOrdenamiento limpiezaOrdenamiento) {
        boolean sucess=false;
        if (!verificarResiduo(limpiezaOrdenamiento.getTipoResiduo())
                && !verificarMascotas(limpiezaOrdenamiento.getCantidadMascotas())
                && verificarFecha(limpiezaOrdenamiento.getFecha())){
            sucess=true;
        }
        return sucess;

    }

    private boolean verificarMascotas(int cantidadMascotas){
        if(cantidadMascotas>1){
            return false;
        }
        return true;
    }

    private boolean verificarResiduo(TipoResiduo tipoResiduo){
        if(tipoResiduo.equals(BARRO)){
            return false;
        }
        return true;}

    private boolean verificarFecha(int fecha){
        //verficar fecha
        return false;
    }


    public boolean tareaEsSimple(ServicioReparacion servicioReparacion)  {
        return (servicioReparacion.getComplejidad()>=1 && servicioReparacion.getComplejidad()<5);
    }

}
