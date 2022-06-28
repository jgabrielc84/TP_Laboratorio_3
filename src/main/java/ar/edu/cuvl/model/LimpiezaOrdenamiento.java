package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.TipoComplejidadLimpieza;
import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.model.type.TipoResiduo;

import java.time.LocalDateTime;
import java.util.List;

public class LimpiezaOrdenamiento {


private List<TipoSuperficie> tipoSuperficies;
private TipoResiduo tipoResiduo;
private TipoComplejidadLimpieza tipoComplejidadLimpieza;
private boolean ordenamiento;
private LocalDateTime fecha;
private List<Robot> robot;

private int horasTarea;

    public LimpiezaOrdenamiento(List<TipoSuperficie> tipoSuperficies, TipoResiduo tipoResiduo, boolean ordenamiento) {
        this.tipoSuperficies = tipoSuperficies;
        this.tipoResiduo = tipoResiduo;
        this.ordenamiento = ordenamiento;
    }

    public LimpiezaOrdenamiento() {
    }

    public List<TipoSuperficie> getTipoSuperficies() {
        return tipoSuperficies;
    }

    public void setTipoSuperficies(List<TipoSuperficie> tipoSuperficies) {
        this.tipoSuperficies = tipoSuperficies;
    }

    public TipoResiduo getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(TipoResiduo tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }

    public TipoComplejidadLimpieza getTipoComplejidadLimpieza() {
        return tipoComplejidadLimpieza;
    }

    public void setTipoComplejidadLimpieza(TipoComplejidadLimpieza tipoComplejidadLimpieza) {
        this.tipoComplejidadLimpieza = tipoComplejidadLimpieza;
    }

    public boolean isOrdenamiento() {
        return ordenamiento;
    }

    public void setOrdenamiento(boolean ordenamiento) {
        this.ordenamiento = ordenamiento;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public List<Robot> getRobot() {
        return robot;
    }

    public void setRobot(List<Robot> robot) {
        this.robot = robot;
    }

    public int getHorasTarea() {
        return horasTarea;
    }

    public void setHorasTarea(int horasTarea) {
        this.horasTarea = horasTarea;
    }
}
