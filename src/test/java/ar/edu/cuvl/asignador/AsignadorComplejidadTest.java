package ar.edu.cuvl.asignador;

import ar.edu.cuvl.model.*;
import ar.edu.cuvl.model.tipoReparacion.Electricidad;
import ar.edu.cuvl.model.tipoReparacion.Gas;
import ar.edu.cuvl.model.tipoTarea.ComplejaTipo;
import ar.edu.cuvl.model.tipoTarea.LimpiezaCompleja;
import ar.edu.cuvl.model.type.Superficie;
import ar.edu.cuvl.model.type.TipoResiduo;
import ar.edu.cuvl.validator.ValidadorComplejidad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AsignadorComplejidadTest {

    ValidadorComplejidad validadorComplejidad;
    List<ServicioReparacion> servicioReparaciones;
    List<LimpiezaOrdenamiento> limpiezaOrdenamientos;
    ServicioReparacion servicioReparacion1;
    ServicioReparacion  servicioReparacion2;
    LimpiezaOrdenamiento limpiezaOrdenamiento1;
    LimpiezaOrdenamiento limpiezaOrdenamiento2;
    Pedido pedido;
    List<TipoSuperficie> superficies;
    AsignadorComplejidad asignadorComplejidad;
    Cliente cliente;

    @BeforeEach
    void setUp(){
        validadorComplejidad=new ValidadorComplejidad();
        servicioReparacion1 =new ServicioReparacion(1, new Gas(),5);
        servicioReparacion2=new ServicioReparacion(2, new Electricidad(),1);
        limpiezaOrdenamiento1=new LimpiezaOrdenamiento(superficies, TipoResiduo.BARRO,true);
        servicioReparaciones =new ArrayList<>();
        limpiezaOrdenamientos =new ArrayList<>();
        limpiezaOrdenamiento2=new LimpiezaOrdenamiento(superficies,TipoResiduo.POLVO,false);
        pedido=new Pedido();
        superficies=new ArrayList<>();
        superficies.add(new TipoSuperficie(Superficie.PISO));
        superficies.add(new TipoSuperficie(Superficie.MUEBLE));
        asignadorComplejidad=new AsignadorComplejidad();
        servicioReparaciones.add(servicioReparacion1);
        servicioReparaciones.add(servicioReparacion2);
        limpiezaOrdenamientos.add(limpiezaOrdenamiento1);
        limpiezaOrdenamientos.add(limpiezaOrdenamiento2);
        pedido.setLimpiezaOrdenamientos(limpiezaOrdenamientos);
        cliente=new Cliente();
        pedido.setCliente(cliente);
        pedido.getCliente().setFechaUltimaLimpieza(LocalDateTime.now());

    }

    @Test
    void asignarComplejidadTarea() {
        asignadorComplejidad.asignarComplejidadTarea(servicioReparaciones);
        assertInstanceOf(ComplejaTipo.class, servicioReparacion1.getTipoComplejidadReparacion());

    }

    @Test
    void asignarComplejidadLimpieza() {
        asignadorComplejidad.asignarComplejidadLimpieza(pedido);
        assertInstanceOf(LimpiezaCompleja.class,limpiezaOrdenamiento1.getTipoComplejidadLimpieza());

    }


}