package ar.edu.cuvl.validator;

import ar.edu.cuvl.interfaces.TipoResiduo;
import ar.edu.cuvl.model.Cliente;
import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;

import java.time.LocalDateTime;

import static ar.edu.cuvl.interfaces.TipoResiduo.BARRO;
import static java.time.temporal.ChronoUnit.DAYS;

public class ValidadorComplejidad {


    public boolean esLimpiezaSimple(LimpiezaOrdenamiento limpiezaOrdenamiento, Cliente cliente) {
        return verificarResiduo(limpiezaOrdenamiento.getTipoResiduo())
                && verificarMascotas(limpiezaOrdenamiento.getCantidadMascotas())
                && verificarFecha(cliente.getFechaUltimaLimpieza());
    }

    private boolean verificarMascotas(int cantidadMascotas){
        return cantidadMascotas <= 1;
    }

    private boolean verificarResiduo(TipoResiduo tipoResiduo){
        return !tipoResiduo.equals(BARRO);
    }

    private boolean verificarFecha(LocalDateTime fecha){
        LocalDateTime fechaComparar = LocalDateTime.now();
        return DAYS.between(fecha, fechaComparar) < 15;
    }


    public boolean tareaEsSimple(ServicioReparacion servicioReparacion)  {
        return (servicioReparacion.getComplejidad()>=1 && servicioReparacion.getComplejidad()<5);
    }

}
