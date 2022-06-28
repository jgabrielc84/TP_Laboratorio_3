package ar.edu.cuvl.asignador;

import ar.edu.cuvl.model.*;
import ar.edu.cuvl.model.tipoReparacion.Electricidad;
import ar.edu.cuvl.model.tipoReparacion.Gas;
import ar.edu.cuvl.model.tipoTarea.ComplejaTipo;
import ar.edu.cuvl.model.tipoTarea.LimpiezaCompleja;
import ar.edu.cuvl.model.tipoTarea.SimpleTipo;
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
    List<ServicioReparacion>servicioReparacions;
    List<LimpiezaOrdenamiento> limpiezaOrdenamientos;
    ServicioReparacion servicioReparacion;
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
        servicioReparacion=new ServicioReparacion(new Gas(),5);
        limpiezaOrdenamiento1=new LimpiezaOrdenamiento(superficies, TipoResiduo.BARRO,true);
        servicioReparacions=new ArrayList<>();
        limpiezaOrdenamientos =new ArrayList<>();
        servicioReparacion2=new ServicioReparacion(new Electricidad(),1);
        limpiezaOrdenamiento2=new LimpiezaOrdenamiento(superficies,TipoResiduo.POLVO,false);
        pedido=new Pedido();
        superficies=new ArrayList<>();
        superficies.add(new TipoSuperficie(Superficie.PISO));
        superficies.add(new TipoSuperficie(Superficie.MUEBLE));
        asignadorComplejidad=new AsignadorComplejidad();
        servicioReparacions.add(servicioReparacion);
        servicioReparacions.add(servicioReparacion2);
        limpiezaOrdenamientos.add(limpiezaOrdenamiento1);
        limpiezaOrdenamientos.add(limpiezaOrdenamiento2);
        pedido.setLimpiezaOrdenamientos(limpiezaOrdenamientos);
        cliente=new Cliente();
        pedido.setCliente(cliente);
        pedido.getCliente().setFechaUltimaLimpieza(LocalDateTime.now());

    }

    @Test
    void asignarComplejidadTarea() {
        asignadorComplejidad.asignarComplejidadTarea(servicioReparacions);
        assertInstanceOf(ComplejaTipo.class,servicioReparacion.getTipoComplejidadReparacion());

    }

    @Test
    void asignarComplejidadLimpieza() {
        asignadorComplejidad.asignarComplejidadLimpieza(pedido);
        assertInstanceOf(LimpiezaCompleja.class,limpiezaOrdenamiento1.getTipoComplejidadLimpieza());

    }


}