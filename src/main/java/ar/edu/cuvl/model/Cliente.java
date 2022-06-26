package ar.edu.cuvl.model;

import ar.edu.cuvl.exception.clienteException.ClienteMorosoException;
import ar.edu.cuvl.interfaces.TipoServicio;

import java.time.LocalDate;

public class Cliente {

    private int dni;
    private TipoServicio tipoServicio;
    private float saldo;
    private LocalDate fechaUltimaLimpieza;
    private int cantidadOrdenamientos;
    private int cantidadLimpiezas;

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

    public Cliente(int dni, TipoServicio tipoServicio, float saldo, LocalDate fechaUltimaLimpieza) {
        this.dni = dni;
        this.tipoServicio = tipoServicio;
        this.saldo = saldo;
        this.fechaUltimaLimpieza = fechaUltimaLimpieza;
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

    public int getCantidadOrdenamientos() {
        return cantidadOrdenamientos;
    }

    public void setCantidadOrdenamientos(int cantidadOrdenamientos) {
        this.cantidadOrdenamientos = cantidadOrdenamientos;
    }

    public int getCantidadLimpiezas() {
        return cantidadLimpiezas;
    }

    public void setCantidadLimpiezas(int cantidadLimpiezas) {
        this.cantidadLimpiezas = cantidadLimpiezas;
    }
}
