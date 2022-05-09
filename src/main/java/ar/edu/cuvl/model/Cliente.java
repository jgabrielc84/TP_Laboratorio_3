package ar.edu.cuvl.model;

public class Cliente {

    private int dni;
    private TipoServicio tipoServicio;


    public Cliente(int dni, TipoServicio tipoServicio) {
        this.dni = dni;
        this.tipoServicio = tipoServicio;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
}
