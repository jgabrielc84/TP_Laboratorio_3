package ar.edu.cuvl.model;

public final class ModuloPago {
    private float montoDeuda;


    public float getMontoDeuda() {
        return montoDeuda;
    }

    public void setMontoDeuda(float montoDeuda) {
        this.montoDeuda = montoDeuda;
    }
    public float deuda(Cliente cliente){
        return this.getMontoDeuda();
    }
}
