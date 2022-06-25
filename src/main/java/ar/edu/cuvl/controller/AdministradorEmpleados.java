package ar.edu.cuvl.controller;

import ar.edu.cuvl.model.Empleado;

import java.util.HashSet;

public class AdministradorEmpleados {

    private HashSet<Empleado> empleados;

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }
}
