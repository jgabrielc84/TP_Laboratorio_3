package ar.edu.cuvl.model.type;

import ar.edu.cuvl.interfaces.TipoLimpieza;
import ar.edu.cuvl.interfaces.Robot;
import ar.edu.cuvl.interfaces.TipoResiduo;
import ar.edu.cuvl.interfaces.TipoSuperficie;

import java.util.List;

public class LimpiezaOrdenamiento {


private List<TipoSuperficie> tipoSuperficies;
private TipoResiduo tipoResiduo;
private TipoLimpieza tipoLimpieza;
private boolean ordenamiento;
private int fecha;
private int cantidadMascotas;
private List<Robot> robot;

private int horasTarea;

    public int getHorasTarea() {
        return horasTarea;
    }

    public void setHorasTarea(int horasTarea) {
        this.horasTarea = horasTarea;
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

    public boolean isOrdenamiento() {
        return ordenamiento;
    }

    public void setOrdenamiento(boolean ordenamiento) {
        this.ordenamiento = ordenamiento;
    }

    public TipoLimpieza getTipoLimpieza() {
        return tipoLimpieza;
    }

    public void setTipoLimpieza(TipoLimpieza tipoLimpieza) {
        this.tipoLimpieza = tipoLimpieza;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getCantidadMascotas() {
        return cantidadMascotas;
    }

    public void setCantidadMascotas(int cantidadMascotas) {
        this.cantidadMascotas = cantidadMascotas;
    }

    public List<Robot> getRobot() {
        return robot;
    }

    public void setRobot(List<Robot> robot) {
        this.robot = robot;
    }
}
