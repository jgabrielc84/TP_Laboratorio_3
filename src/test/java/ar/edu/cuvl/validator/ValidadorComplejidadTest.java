package ar.edu.cuvl.validator;

import ar.edu.cuvl.model.Pedido;
import ar.edu.cuvl.model.type.TipoResiduo;
import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.tipoReparacion.Electricidad;
import ar.edu.cuvl.model.LimpiezaOrdenamiento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.DAYS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ValidadorComplejidadTest {

    LimpiezaOrdenamiento limpiezaOrdenamiento;
    ValidadorComplejidad validadorComplejidad;
    ServicioReparacion servicioReparacion;
    Pedido pedido;


    @BeforeEach
    void setUp(){
        limpiezaOrdenamiento=new LimpiezaOrdenamiento();
        validadorComplejidad=new ValidadorComplejidad();
        pedido=new Pedido();
    }

    @Test
    void esLimpiezaSimple() {
        limpiezaOrdenamiento.setOrdenamiento(true);

        limpiezaOrdenamiento.setTipoResiduo(TipoResiduo.BARRO);
        pedido.setCantidadMascotas(3);

        assertEquals(false,validadorComplejidad.esLimpiezaSimple(limpiezaOrdenamiento,pedido));

    }

    @Test
    void tareaEsSimple() {
        servicioReparacion=new ServicioReparacion(new Electricidad(),8);

       assertEquals(false,validadorComplejidad.tareaEsSimple(servicioReparacion));
    }

}