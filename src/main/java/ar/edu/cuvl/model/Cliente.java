package ar.edu.cuvl.model;

import ar.edu.cuvl.interfaces.TipoServicio;

import java.time.LocalDate;

public class Cliente {

    private int dni;
    private TipoServicio tipoServicio;

    private float saldo;

    private LocalDate fechaUltimaLimpieza;

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaUltimaLimpieza() {
        return fechaUltimaLimpieza;
    }

    public void setFechaUltimaLimpieza(LocalDate fechaUltimaLimpieza) {
        this.fechaUltimaLimpieza = fechaUltimaLimpieza;
    }

    public Cliente() {
    }

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

    @Override
    public boolean equals(Object obj) {
        // hay que asegurar que obj es de la clase Cliente
        if (obj != null && obj instanceof Cliente) {
            // se comparan los números de identificación
            Cliente another = (Cliente) obj;
            return this.dni == another.dni;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.dni;
    }
}
