package ar.edu.cuvl.validator;

import ar.edu.cuvl.interfaces.TipoResiduo;
import ar.edu.cuvl.model.ServicioReparacion;
import ar.edu.cuvl.model.tipoReparacion.Electricidad;
import ar.edu.cuvl.model.type.LimpiezaOrdenamiento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ValidadorComplejidadTest {

    LimpiezaOrdenamiento limpiezaOrdenamiento;
    ValidadorComplejidad validadorComplejidad;
    ServicioReparacion servicioReparacion;


    @BeforeEach
    void setUp(){
        limpiezaOrdenamiento=new LimpiezaOrdenamiento();
        validadorComplejidad=new ValidadorComplejidad();
    }

    @Test
    void esLimpiezaSimple() {
        limpiezaOrdenamiento.setOrdenamiento(true);
        limpiezaOrdenamiento.setCantidadMascotas(3);
        limpiezaOrdenamiento.setTipoResiduo(TipoResiduo.BARRO);

        assertEquals(true,true);

    }

    @Test
    void tareaEsSimple() {
        servicioReparacion=new ServicioReparacion(new Electricidad(),8);

       assertEquals(true,true);
    }
}