package ar.edu.cuvl.model;

import ar.edu.cuvl.exception.clienteException.ClienteMorosoException;
import ar.edu.cuvl.interfaces.TipoServicio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente {

    private int dni;
    private TipoServicio tipoServicio;
    private LocalDateTime fechaUltimaLimpieza;
    private int cantidadOrdenamientos;
    private int cantidadLimpiezas;

    public Cliente() {

    }

    public Cliente(int dni, TipoServicio tipoServicio, LocalDateTime fechaUltimaLimpieza, int cantidadOrdenamientos, int cantidadLimpiezas) {
        this.dni = dni;
        this.tipoServicio = tipoServicio;
        this.fechaUltimaLimpieza = fechaUltimaLimpieza;
        this.cantidadOrdenamientos = cantidadOrdenamientos;
        this.cantidadLimpiezas = cantidadLimpiezas;
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

    public LocalDateTime getFechaUltimaLimpieza() {
        return fechaUltimaLimpieza;
    }

    public void setFechaUltimaLimpieza(LocalDateTime fechaUltimaLimpieza) {
        this.fechaUltimaLimpieza = fechaUltimaLimpieza;
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

    public void actualizarLimpiezasOrdenamientos(Pedido pedido){
        int limpiezas = 0;
        int ordenamientos = 0;

        for(LimpiezaOrdenamiento tarea : pedido.getLimpiezaOrdenamientos()){
            if(tarea.isOrdenamiento()){
                ordenamientos += 1;
            }
            limpiezas += 1;
        }

        this.cantidadLimpiezas += limpiezas;
        this.cantidadOrdenamientos += ordenamientos;
    }

}
