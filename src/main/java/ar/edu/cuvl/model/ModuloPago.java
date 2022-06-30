package ar.edu.cuvl.model;

public final class ModuloPago {
    private static float montoDeuda;

    public ModuloPago() {

    }

    public static float getMontoDeuda() {
        return montoDeuda;
    }

    public static void setMontoDeuda(float montoDeuda) {
        ModuloPago.montoDeuda = montoDeuda;
    }

    public static float deuda(Cliente cliente){
        return ModuloPago.getMontoDeuda();
    }
}
